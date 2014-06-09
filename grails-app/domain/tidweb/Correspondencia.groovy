package tidweb

/**
 * Correspondencia
 * A domain class describes the data object and it's mapping to the database
 */
class Correspondencia {

	String titulo
	String descricao
	Date dataChegada = new Date()
	Boolean entregue = false
	
	static	belongsTo	= [unidade:Unidade, condominio:Condominio]

	static	constraints = {
		titulo(nullable:false,blank:false,maxSize:50)
		descricao(nullable:false,blank:false,maxSize:255)
		dataChegada(nullable:false)
		entregue(nullable:false)
	}
	
	/*
	 * Methods of the Domain Class
	 */
	@Override	// Override toString for a nicer / more descriptive UI 
	public String toString() {
		return "${titulo} - ${dataChegada}";
	}
}
