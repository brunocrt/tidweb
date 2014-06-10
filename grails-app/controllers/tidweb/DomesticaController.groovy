package tidweb

/**
 * DomesticaController
 * A controller class handles incoming web requests and performs actions such as redirects, rendering views and so on.
 */
class DomesticaController {

	static scaffold = Domestica
		
	def save() {
		
		def domesticaInstance = new Domestica(params)

		if (!domesticaInstance.save(flush: true)) {
			render(view: "create", model: [domesticaInstance: domesticaInstance])
			return
		}
		redirect(action: "show", id: domesticaInstance.id)
	}
}
