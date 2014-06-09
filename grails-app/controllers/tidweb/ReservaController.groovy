package tidweb

/**
 * ReservaController
 * A controller class handles incoming web requests and performs actions such as redirects, rendering views and so on.
 */
class ReservaController {

	def scaffold = Reserva 
	
	def save() {
		
		params["dataReserva"] = Date.parse( 'dd/MM/yyyy', params["dataReserva"] )
		params["dataEvento"] = Date.parse( 'dd/MM/yyyy', params["dataEvento"] )
		
		def reservaInstance = new Reserva(params)

		if (!reservaInstance.save(flush: true)) {
			render(view: "create", model: [reservaInstance: reservaInstance])
			return
		}
		redirect(action: "show", id: reservaInstance.id)
	}

}
