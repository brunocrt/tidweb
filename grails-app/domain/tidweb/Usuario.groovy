package tidweb

import java.util.Date;

import tidweb.Unidade.Tipo;

/**
 * Usuario
 * A domain class describes the data object and it's mapping to the database
 */
class Usuario {
	
	enum Tipo { MORADOR, PORTARIA, ADMIN }
	
	String nome
	String senha
	Tipo   tipoUsuario
	Date ultimoAcesso = new Date()
	
	static	belongsTo	= [unidade:Unidade]
	
	static	constraints = {
		nome(nullable:false,blank:false,maxSize:50)
		senha(nullable:true,blank:false,maxSize:50)
		tipoUsuario(nullable:false,blank:false)
		ultimoAcesso(nullable:false,blank:false)
	}
	
	/*
	 * Methods of the Domain Class
	 */
	@Override	// Override toString for a nicer / more descriptive UI 
	public String toString() {
		return "${nome} ${tipoUsuario}";
	}
}
