package tidweb

/**
 * Prestador
 * A domain class describes the data object and it's mapping to the database
 */
class Prestador {

	String nome
	String empresa
	Date dataServico = new Date()
	Boolean autorizado = true
			
	static	belongsTo = [morador:Morador, condominio:Condominio]
	    
	static	constraints = {
		nome(nullable:false,blank:false,maxSize:50)
		empresa(nullable:false,blank:false,maxSize:50)
		dataServico(nullable:false,blank:false)
    }
	
	/*
	 * Methods of the Domain Class
	 */
	@Override	// Override toString for a nicer / more descriptive UI 
	public String toString() {
		return "${nome} (${empresa})";
	}
}
