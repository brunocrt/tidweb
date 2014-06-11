package tidweb

/**
 * AvisoGeral
 * A domain class describes the data object and it's mapping to the database
 */
class AvisoGeral {

	String assunto
	String descricao
	Date dataAviso = new Date()
	Boolean ativo = true
	
	static	belongsTo	= [condominio:Condominio]

	static	constraints = {
		assunto(nullable:false,blank:false,maxSize:50)
		descricao(nullable:false,blank:false,maxSize:255)
		dataAviso(nullable:false)
		ativo(nullable:false)
	}
	
	/*
	 * Methods of the Domain Class
	 */
	@Override	// Override toString for a nicer / more descriptive UI 
	public String toString() {
		return "${assunto} - ${dataAviso}";
	}

}
