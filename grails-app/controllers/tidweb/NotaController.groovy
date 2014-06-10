package tidweb

/**
 * NotaController
 * A controller class handles incoming web requests and performs actions such as redirects, rendering views and so on.
 */
class NotaController {

	def scaffold = Nota 
	def save() {
		
		params["dataCadastro"] = Date.parse( 'dd/MM/yyyy', params["dataCadastro"] )
		
		def notaInstance = new Nota(params)

		if (!notaInstance.save(flush: true)) {
			render(view: "create", model: [notaInstance: notaInstance])
			return
		}
		redirect(action: "show", id: notaInstance.id)
	}

}
