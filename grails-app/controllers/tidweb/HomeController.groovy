package tidweb

class HomeController {

	def admin() {
		render(view: "admin")
	}
	
	def morador() {
		
		// busca o visitante
		def visitantesList = Visitante.createCriteria().list {
			def now = new Date()
			between('dataVisita', now, now+7)
			eq('morador', session["morador"])
		}
		def prestadorList = Prestador.createCriteria().list {
			def now = new Date()
			between('dataServico', now, now+7)
			eq('morador', session["morador"])
		}
		
		// agregue a lista de visistantes (prestadores + domesticas)
		visitantesList.addAll(prestadorList)
		
		def correspondenciasList = Correspondencia.findAllWhere(unidade: session["morador"].unidade)
		def avisosList = AvisoGeral.findAllWhere(condominio: session["condominio"])
		def reservasList = Reserva.findAllWhere(morador: session["morador"])
		def muralList = Mural.findAllWhere(condominio: session["condominio"])
		
		// abre view e disponibiliza dados
		render(view:"morador", model:[
				visitantesList:visitantesList,
				correspondenciasList:correspondenciasList,
				avisosList:avisosList,
				reservasList:reservasList,
				muralList:muralList] )
	}
	
	def portaria() {
		render(view: "portaria")
	}
}
