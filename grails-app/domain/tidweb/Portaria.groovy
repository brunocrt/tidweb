package tidweb

/**
 * Portaria
 * A domain class describes the data object and it's mapping to the database
 */
class Portaria {
	
	String identificacao
	String telefone
	
	static	belongsTo	= [condominio:Condominio]
	static	hasMany		= [usuario:Usuario]

	static	constraints = {
		identificacao(nullable:false,blank:false,maxSize:10)
		telefone(nullable:false,blank:true,maxSize:50)
	}
	
	/*
	 * Methods of the Domain Class
	 */
	@Override	// Override toString for a nicer / more descriptive UI 
	public String toString() {
		return "${identificacao}";
	}
}
