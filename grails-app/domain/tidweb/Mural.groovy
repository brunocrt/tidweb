package tidweb

/**
 * Mural
 * A domain class describes the data object and it's mapping to the database
 */
class Mural {
	
	static belongsTo = [condominio:Condominio]
	static hasMany	= [nota:Nota]

	static	constraints = {
	}
	
}
