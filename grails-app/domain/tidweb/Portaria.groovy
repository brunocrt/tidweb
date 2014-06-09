package tidweb

/**
 * Portaria
 * A domain class describes the data object and it's mapping to the database
 */
class Portaria {
	
	String identificacao = "Portaria A"
	String telefone
	
	static	belongsTo	= [condominio:Condominio]
	static	hasMany		= [usuario:Usuario]

	static	constraints = {
		identificacao(nullable:false,blank:false,maxSize:50)
		telefone(nullable:true,blank:true,maxSize:50)
		usuario(nullable:true)
	}
	
	/*
	 * Methods of the Domain Class
	 */
	@Override	// Override toString for a nicer / more descriptive UI 
	public String toString() {
		return "${identificacao}";
	}
}
