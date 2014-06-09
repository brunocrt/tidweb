package tidweb

/**
 * CorrespondenciaController
 * A controller class handles incoming web requests and performs actions such as redirects, rendering views and so on.
 */
class CorrespondenciaController {

	def scaffold = Correspondencia
	def save() {
		
		params["dataChegada"] = Date.parse( 'dd/MM/yyyy', params["dataChegada"] )
		
		def correspondenciaInstance = new Correspondencia(params)

		if (!correspondenciaInstance.save(flush: true)) {
			render(view: "create", model: [correspondenciaInstance: correspondenciaInstance])
			return
		}
		redirect(action: "show", id: correspondenciaInstance.id)
	}
}
