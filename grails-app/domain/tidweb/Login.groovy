package tidweb

import java.sql.Timestamp

/**
 * Login
 * A domain class describes the data object and it's mapping to the database
 */
class Login {
	
	String usuario = ""
	String senha = ""
	    
	static mapWith = "none" // do not persist this domain class
	
	static	constraints = {
		usuario(nullable:false,blank:false,maxSize:50)
		senha(nullable:false,blank:false,maxSize:50)
	}
	
	/*
	 * Methods of the Domain Class
	 */
	@Override
	public String toString() {
		return "${usuario}";
	}
}
