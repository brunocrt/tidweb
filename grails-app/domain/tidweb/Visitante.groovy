package tidweb

/**
 * Visitante
 * A domain class describes the data object and it's mapping to the database
 */
class Visitante {

	String nome
	Date dataVisita
			
	static	belongsTo = [morador:Morador]
	    
	static	constraints = {
		nome(nullable:false,blank:false,maxSize:50)
		dataVisita(nullable:false,blank:false)
    	}
	
	/*
	 * Methods of the Domain Class
	 */
	@Override	// Override toString for a nicer / more descriptive UI 
	public String toString() {
		return "${nome}";
	}
}
