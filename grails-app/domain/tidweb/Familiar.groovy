package tidweb

/**
 * Familiar
 * A domain class describes the data object and it's mapping to the database
 */
class Familiar {

	String nome
	String grauParentesco
			
	static	belongsTo = [morador:Morador, condominio:Condominio]
	    
	static	constraints = {
		nome(nullable:false,blank:false,maxSize:50)
		grauParentesco(nullable:false,blank:false,maxSize:50)
    }
	
	/*
	 * Methods of the Domain Class
	 */
	@Override	// Override toString for a nicer / more descriptive UI 
	public String toString() {
		return "${nome}";
	}
}
