package tidweb

/**
 * Condominio
 * A domain class describes the data object and it's mapping to the database
 */
class Condominio {

	String nome
	String endereco
	String cidade
	String estado
	String empresaAdministradora

	static hasMany	= [portaria:Portaria, avisoGeral:AvisoGeral, usuario:Usuario]

	static	constraints = {
		nome(nullable:false,blank:false,maxSize:50)
		endereco(nullable:false,blank:false,maxSize:255)
		cidade(nullable:false,blank:false,maxSize:50)
		estado(nullable:false,blank:false,maxSize:2)
		empresaAdministradora(nullable:true,blank:true,maxSize:50)
		usuario(nullable:true)
    }
	
	/*
	 * Methods of the Domain Class
	 */
	@Override
	public String toString() {
		return "${nome}";
	}
}
