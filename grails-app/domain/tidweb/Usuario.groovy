package tidweb

/**
 * Usuario
 * A domain class describes the data object and it's mapping to the database
 */
class Usuario {

	String nome
	String senha
	String tipo
	
	static	belongsTo	= [unidade:Unidade]
	
	static	constraints = {
		nome(nullable:false,blank:false,maxSize:50)
		senha(nullable:true,blank:false,maxSize:50)
		tipo(nullable:false,blank:false,inList:["unidade","portaria","admin"])
	}
	
	/*
	 * Methods of the Domain Class
	 */
	@Override	// Override toString for a nicer / more descriptive UI 
	public String toString() {
		return "${nome}";
	}
}
