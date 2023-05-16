package beans;

import java.io.Serializable;
import java.util.Date;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import daos.LoginDao;
import entities.Usuario;


@ManagedBean(name = "LoginMB")
@ViewScoped
public class LoginManagedBean implements Serializable{
	private static final long serialVersionUID = 1L;

	
	private LoginDao LoginDAO = new LoginDao();
	
	private Usuario usuario = new Usuario();
		
	private Date UltimoAcesso = new Date();
	
	
	public String envia() {

		usuario = LoginDAO.getUsuario(usuario.getNomeUsuario(), usuario.getSenha());
		
		if (usuario != null) {
			
			return "/itens_enviados";
			
		} else {
			usuario = new Usuario();
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Usuario ou senha inválido!", "Erro no Login!"));
			return null;
		}
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public LoginDao getLoginDAO() {
		return LoginDAO;
	}

	public void setLoginDAO(LoginDao loginDAO) {
		LoginDAO = loginDAO;
	}

	public Date getUltimoAcesso() {
		return UltimoAcesso;
	}

	public void setUltimoAcesso(Date ultimoAcesso) {
		UltimoAcesso = ultimoAcesso;
	}
}