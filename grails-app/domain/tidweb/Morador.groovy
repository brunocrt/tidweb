package tidweb


/**
 * Morador
 * A domain class describes the data object and it's mapping to the database
 */
class Morador {

	String nome
	String email

	static	belongsTo 	= [condominio: Condominio]
	static	hasOne		= [unidade: Unidade]
	static	hasMany		= [veiculo: Veiculo, familiar:Familiar, domestica:Domestica, prestador:Prestador, visitante:Visitante, reserva:Reserva]
	
	static	constraints = {
		nome(nullable:false,blank:false,maxSize:50)
		email(email:true,nullable:false,blank:true,maxSize:100)
	}
	
	static mapping = {
		sort "nome"
	}
	
	/*
	 * Methods of the Domain Class
	 */
	@Override	// Override toString for a nicer / more descriptive UI 
	public String toString() {
		return "${nome}";
	}
}
