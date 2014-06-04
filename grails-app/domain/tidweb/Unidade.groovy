package tidweb

/**
 * Unidade
 * A domain class describes the data object and it's mapping to the database
 */
class Unidade {

	String numero
	String bloco
	String nomeEdificio
	
	static	belongsTo	= [condominio:Condominio]
	static	hasMany		= [morardor:Morador]
	static  hasOne		= [usuario:Usuario]
	
	static	constraints = {
		numero(nullable:false,blank:false,maxSize:4)
		bloco(nullable:false,blank:true,maxSize:4)
		nomeEdificio(nullable:false,blank:true,maxSize:20)
	}
	
	/*
	 * Methods of the Domain Class
	 */
	@Override	// Override toString for a nicer / more descriptive UI 
	public String toString() {
		return "${numero} ${bloco}";
	}
}
