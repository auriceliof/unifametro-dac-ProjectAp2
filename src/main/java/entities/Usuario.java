//https://www.devmedia.com.br/java-web-criando-uma-tela-de-login-com-jpa-jsf-primefaces-e-mysql/32456

package entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Usuario {

      @Id
      @GeneratedValue
      @Column(name="id", nullable=false, unique=true)
      private int id;

      @Column(name="nome", nullable=false, unique=true)
      private String nomeUsuario;
      
      @Column(name="login", nullable=false, unique=true)
      private String login;
      
      @Column(name="senha", nullable=false, unique=false)
      private String senha;
      
      @Column(name="data_criacao")
      @Temporal(TemporalType.DATE)
      private Date dataCriacao;
     
      public int getId() {
		return id;
      }
	
      public void setId(int id) {
			this.id = id;
      }
	
      public String getNomeUsuario() {
	       return nomeUsuario;
      }

      public void setNomeUsuario(String nomeUsuario) {
            this.nomeUsuario = nomeUsuario;
      }

      public String getLogin() {
		return login;
      }

      public void setLogin(String login) {
		this.login = login;
      }

      public String getSenha() {
            return senha;
      }

      public void setSenha(String senha) {
            this.senha = senha;
      }
            
      public Date getDataCriacao() {
    	  	return dataCriacao;
      }	

      public void setDataCriacao(Date dataCriacao) {
    	  	this.dataCriacao = dataCriacao;
      }
 }