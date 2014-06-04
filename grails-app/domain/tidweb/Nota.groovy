package tidweb

/**
 * Nota
 * A domain class describes the data object and it's mapping to the database
 */
class Nota {

	String titulo
	String descricao
	Date dataCadastro = new Date()
	
	static	belongsTo	= [mural:Mural]

	static	constraints = {
		titulo(nullable:false,blank:false,maxSize:50)
		descricao(nullable:false,blank:false,maxSize:255)
		dataCadastro(nullable:false)
	}
	
	/*
	 * Methods of the Domain Class	
	 */
	@Override	// Override toString for a nicer / more descriptive UI 
	public String toString() {
		return "${titulo} - ${dataCadastro}";
	}
}
