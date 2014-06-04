package tidweb

/**
 * Domestica
 * A domain class describes the data object and it's mapping to the database
 */
class Domestica {

	String nome
	String numeroDocumento
	String tipoDocumento
	byte[] foto
	String formatoFoto
			
	static	belongsTo = [morador:Morador]
	    
	static	constraints = {
		nome(nullable:false,blank:false,maxSize:50)
		numeroDocumento(nullable:false,blank:false,maxSize:50)
		tipoDocumento(nullable:false,blank:false,maxSize:24)
		foto(nullable:true,maxSize:1024000)
		formatoFoto(nullable:true)
    	}
	
	/*
	 * Methods of the Domain Class
	 */
	@Override	// Override toString for a nicer / more descriptive UI 
	public String toString() {
		return "${nome}";
	}
}
