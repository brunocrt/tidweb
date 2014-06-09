package tidweb

/**
 * VisitanteController
 * A controller class handles incoming web requests and performs actions such as redirects, rendering views and so on.
 */
class VisitanteController {

	def scaffold = Visitante
//	def index = { }
	
	def save() {
		
		params["dataVisita"] = Date.parse( 'dd/MM/yyyy', params["dataVisita"] )
		
		def visitanteInstance = new Visitante(params)

		if (!visitanteInstance.save(flush: true)) {
			render(view: "create", model: [visitanteInstance: visitanteInstance])
			return
		}
		redirect(action: "show", id: visitanteInstance.id)
	}

}
