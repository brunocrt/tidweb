package tidweb

/**
 * Unidade
 * A domain class describes the data object and it's mapping to the database
 */
class Unidade {

	enum Tipo { CASA, APARTAMENTO }
	
	String numero
	String bloco
	String nomeEdificio
	Tipo   tipoUnidade
	
	static	belongsTo	= [condominio:Condominio]
	static	hasMany		= [morador:Morador]
	
	static	constraints = {	
		numero(nullable:false,blank:false,maxSize:4)
		bloco(nullable:true,blank:true,maxSize:4)
		nomeEdificio(nullable:true,blank:true,maxSize:20)
		tipoUnidade(nullable:false,blank:false)
		morador(nullable:true)
	}
	
	/*
	 * Methods of the Domain Class
	 */
	@Override	// Override toString for a nicer / more descriptive UI 
	public String toString() {
		return "${condominio.nome} ${numero} ${bloco}";
	}
}
