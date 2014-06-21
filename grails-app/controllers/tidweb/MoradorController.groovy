package tidweb

import grails.converters.*

/**
 * MoradorController
 * A controller class handles incoming web requests and performs actions such as redirects, rendering views and so on.
 */
class MoradorController {

	def scaffold = Morador 
//	def index = { }
	
	def buscaPorNomeJSON() {

		def moradores = Morador.findByNomeIlike("%" + params['nome'] +  "%")
		def nomes = []
		
		moradores.each {
			nomes.add( it.nome )
		}		
		render nomes as JSON
	}
	
	def buscaPorLetraJSON() {
		
		def moradores = Morador.findByNomeIlike(params['letra'] + "%")
		def jsonObject = []
		
		moradores.each {
			jsonObject = JSON.parse((it as JSON).toString())
			jsonObject.put("unidade", Unidade.get(it.unidade.id))
		}
		
		log.debug(jsonObject as JSON)
		
		render jsonObject as JSON
	}
	
	def getMoradorPorNomeJSON() {
		
		def morador = Morador.findByNome(params['nome'])
		
		def jsonObject = JSON.parse((morador as JSON).toString())
		
		jsonObject.put("unidade", Unidade.get(morador.unidade.id))
		jsonObject.put("veiculo", Veiculo.get(morador.veiculo*.id))
		jsonObject.put("familiar", Familiar.get(morador.familiar*.id))
		jsonObject.put("domestica", Domestica.get(morador.domestica*.id))
		jsonObject.put("visitante", Visitante.get(morador.visitante*.id))
		jsonObject.put("prestador", Prestador.getAll(morador.prestador*.id))
		jsonObject.put("reserva", Reserva.get(morador.reserva*.id))
		
		log.debug(jsonObject as JSON)
		
		render jsonObject as JSON	
	}
	
}
