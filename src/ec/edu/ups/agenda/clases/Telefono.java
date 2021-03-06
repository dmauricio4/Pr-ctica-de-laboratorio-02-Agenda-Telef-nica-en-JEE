package ec.edu.ups.agenda.clases;

import java.io.Serializable;

public class Telefono implements Serializable {

	private static final long serialVersionUID = 1L;
 
	private String numero;
	private String tipo;
	private String operadora;
	private Usuario usuario;

	public Telefono() {

	}

	public Telefono( String numero, String tipo, String operadora, Usuario usuario) {
		super(); 
		this.numero = numero;
		this.tipo = tipo;
		this.operadora = operadora;
		this.usuario = usuario;
	}

	 
	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getOperadora() {
		return operadora;
	}

	public void setOperadora(String operadora) {
		this.operadora = operadora;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	@Override
	public String toString() {
		return "Telefono [numero=" + numero + ", tipo=" + tipo + ", operadora=" + operadora + ", usuario=" + usuario
				+ "]";
	}

	
	 
}
