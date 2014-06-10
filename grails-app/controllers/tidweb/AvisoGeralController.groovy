package tidweb

/**
 * AvisoGeralController
 * A controller class handles incoming web requests and performs actions such as redirects, rendering views and so on.
 */
class AvisoGeralController {

	def scaffold = AvisoGeral 
	def save() {
		
		params["dataAviso"] = Date.parse( 'dd/MM/yyyy', params["dataAviso"] )
		
		def avisoGeralInstance = new AvisoGeral(params)

		if (!avisoGeralInstance.save(flush: true)) {
			render(view: "create", model: [avisoGeralInstance: avisoGeralInstance])
			return
		}
		redirect(action: "show", id: avisoGeralInstance.id)
	}

}
