package tidweb

/**
 * Convidado
 * A domain class describes the data object and it's mapping to the database
 */
class Convidado {

	String nome	
	static	belongsTo	= [reserva:Reserva]
	
	static	constraints = {
		nome(nullable:false,blank:false,maxSize:24)
	}
	
	@Override	// Override toString for a nicer / more descriptive UI 
	public String toString() {
		return "${nome}";
	}
}
