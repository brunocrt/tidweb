package tidweb

/**
 * PrestadorController
 * A controller class handles incoming web requests and performs actions such as redirects, rendering views and so on.
 */
class PrestadorController {

	def scaffold = Prestador 
	
	def save() {
		
		params["dataServico"] = Date.parse( 'dd/MM/yyyy', params["dataServico"] )
		
		def prestadorInstance = new Prestador(params)

		if (!prestadorInstance.save(flush: true)) {
			render(view: "create", model: [prestadorInstance: prestadorInstance])
			return
		}
		redirect(action: "show", id: prestadorInstance.id)
	}
}
