package control;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import org.primefaces.event.CloseEvent;
import org.primefaces.event.MoveEvent;

import dao.ClienteDao;
import entity.Cliente;



@ManagedBean
@SessionScoped
public class ClienteMBean {

	private static final long serialVersionUID = 1L;
	private Cliente cliente;
	private ClienteDao ad;
	private List<Cliente> ClienteList;

	@PostConstruct
	public void init() {
		this.cliente = new Cliente();
		this.ad = new ClienteDao();
		this.ClienteList = ad.list();
	}

	public String newCliente() {
		return "manageCliente";
	}

	public String delete(Cliente cliente) {
		ad.delete(cliente);
		return "cliente";
	}

	public String edit(Cliente cliente) {
		this.cliente = cliente;
		return "manageCliente";
	}

	public String gravar() {
	
		
		ad.saveOrUpdate(cliente);
		this.cliente = new Cliente();
		return "cliente";
		
	}	
		
	

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public ClienteDao getAd() {
		return ad;
	}

	public void setAd(ClienteDao ad) {
		this.ad = ad;
	}

	public List<Cliente> getClienteList() {
		this.ClienteList = ad.list();
		return ClienteList;
	}

	public void setClienteList(List<Cliente> clienteList) {
		ClienteList = clienteList;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public void handleClose(CloseEvent event) {
		addMessage(event.getComponent().getId() + " closed", "So you don't like nature?");
	}

	public void handleMove(MoveEvent event) {
		addMessage(event.getComponent().getId() + " moved", "Left: " + event.getLeft() + ", Top: " + event.getTop());
	}

	public void destroyWorld() {
		addMessage("System Error", "Please try again later.");
	}

	public void addMessage(String summary, String detail) {
		FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, summary, detail);
		FacesContext.getCurrentInstance().addMessage(null, message);
	}

}
