package tidweb


/**
 * Morador
 * A domain class describes the data object and it's mapping to the database
 */
class Morador {

	String nome
	String email
	String placaCarro
	String modeloCarro

	static	belongsTo 	= [condominio: Condominio]
	static	hasOne		= [unidade: Unidade]
	static	hasMany		= [familiar:Familiar, domestica:Domestica, prestador:Prestador, visitante:Visitante, reserva:Reserva]
	
	static	constraints = {
		nome(nullable:false,blank:false,maxSize:50)
		email(email:true,nullable:false,blank:true,maxSize:100)
		placaCarro(nullable:true,blank:true,maxSize:9)
		modeloCarro(nullable:true,blank:true,maxSize:24)
	}
	
	/*
	 * Methods of the Domain Class
	 */
	@Override	// Override toString for a nicer / more descriptive UI 
	public String toString() {
		return "${nome}";
	}
}
