package tidweb

/**
 * Reserva
 * A domain class describes the data object and it's mapping to the database
 */
class Reserva {

	String area
	Date   dataReserva = new Date()
	Date   dataEvento = new Date()

	static	belongsTo	= [unidade:Unidade, condominio:Condominio]
	static  hasOne		= [morador:Morador]
	static	hasMany		= [visitante:Visitante]
	
	static	constraints = {
		area(nullable:false,blank:false,maxSize:50)
		dataReserva(nullable:false)
		dataEvento(nullable:false)
	}
	
	/*
	 * Methods of the Domain Class
	 */
	@Override	// Override toString for a nicer / more descriptive UI 
	public String toString() {
		return "${area} (${dataEvento})";
	}
}
