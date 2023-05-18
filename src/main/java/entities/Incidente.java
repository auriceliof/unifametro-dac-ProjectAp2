package entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Incidente implements Serializable {
	private static final long serialVersionUID = 1L;
	
    @Id
    @GeneratedValue
    @Column(name="id", nullable=false, unique=true)
    private int id;
    
    @Column(name="nome_vitima")
	private String nomeVitima;
    @Column(name="sexo_vitima")
	private String sexoVitima;
    @Column(name="idade_vitima")
	private int idadeVitima;
    @Column(name="escolar_vitima")
	private String EscolarVitima;
    @Column(name="endereco_vitima")
	private String EnderecoVitima;
	
    @Column(name="nome_agressor")
	private String nomeAgressor;
    @Column(name="sexo_agressor")
	private String sexoAgressor;
    @Column(name="idade_agressor")
	private int idadeAgressor;
    @Column(name="parente_agressor")
	private String parenteAgressor;
    @Column(name="ocupacao_agressor")
	private String ocupacaoAgressor;
    @Column(name="reca_agressor")
	private String racaAgressor;
    @Column(name="genero_agressor")
	private String generoAgressor;
    @Column(name="sexual_agressor")
	private String sexualAgressor;
    @Column(name="escolar_agressor")
	private String escolarAgressor;
	
    @Column(name="relato_vitima")
	private String relatoVitima;
    @Column(name="violacao_vitima")
	private String violacaoVitima;
    
	private String providencias;
	
	@Column(name="data_cadastro")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataCadastro;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNomeVitima() {
		return nomeVitima;
	}

	public void setNomeVitima(String nomeVitima) {
		this.nomeVitima = nomeVitima;
	}

	public String getSexoVitima() {
		return sexoVitima;
	}

	public void setSexoVitima(String sexoVitima) {
		this.sexoVitima = sexoVitima;
	}

	public int getIdadeVitima() {
		return idadeVitima;
	}

	public void setIdadeVitima(int idadeVitima) {
		this.idadeVitima = idadeVitima;
	}

	public String getEscolarVitima() {
		return EscolarVitima;
	}

	public void setEscolarVitima(String escolarVitima) {
		EscolarVitima = escolarVitima;
	}

	public String getEnderecoVitima() {
		return EnderecoVitima;
	}

	public void setEnderecoVitima(String enderecoVitima) {
		EnderecoVitima = enderecoVitima;
	}

	public String getNomeAgressor() {
		return nomeAgressor;
	}

	public void setNomeAgressor(String nomeAgressor) {
		this.nomeAgressor = nomeAgressor;
	}

	public String getSexoAgressor() {
		return sexoAgressor;
	}

	public void setSexoAgressor(String sexoAgressor) {
		this.sexoAgressor = sexoAgressor;
	}

	public int getIdadeAgressor() {
		return idadeAgressor;
	}

	public void setIdadeAgressor(int idadeAgressor) {
		this.idadeAgressor = idadeAgressor;
	}

	public String getParenteAgressor() {
		return parenteAgressor;
	}

	public void setParenteAgressor(String parenteAgressor) {
		this.parenteAgressor = parenteAgressor;
	}

	public String getOcupacaoAgressor() {
		return ocupacaoAgressor;
	}

	public void setOcupacaoAgressor(String ocupacaoAgressor) {
		this.ocupacaoAgressor = ocupacaoAgressor;
	}

	public String getRacaAgressor() {
		return racaAgressor;
	}

	public void setRacaAgressor(String racaAgressor) {
		this.racaAgressor = racaAgressor;
	}

	public String getGeneroAgressor() {
		return generoAgressor;
	}

	public void setGeneroAgressor(String generoAgressor) {
		this.generoAgressor = generoAgressor;
	}

	public String getSexualAgressor() {
		return sexualAgressor;
	}

	public void setSexualAgressor(String sexualAgressor) {
		this.sexualAgressor = sexualAgressor;
	}

	public String getEscolarAgressor() {
		return escolarAgressor;
	}

	public void setEscolarAgressor(String escolarAgressor) {
		this.escolarAgressor = escolarAgressor;
	}

	public String getRelatoVitima() {
		return relatoVitima;
	}

	public void setRelatoVitima(String relatoVitima) {
		this.relatoVitima = relatoVitima;
	}

	public String getViolacaoVitima() {
		return violacaoVitima;
	}

	public void setViolacaoVitima(String violacaoVitima) {
		this.violacaoVitima = violacaoVitima;
	}

	public String getProvidencias() {
		return providencias;
	}

	public void setProvidencias(String providencias) {
		this.providencias = providencias;
	}

	public Date getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}	
}
