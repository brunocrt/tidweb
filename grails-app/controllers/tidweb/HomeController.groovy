package tidweb

class HomeController {
	
	def index() {
		if( session["usuarioLogado"] != null ) {
			if( session["usuarioLogado"].tipoUsuario == tidweb.Usuario.Tipo.MORADOR ) {
				morador()
			}	
			if( session["usuarioLogado"].tipoUsuario == tidweb.Usuario.Tipo.PORTARIA ) {
				render(view: "portaria")
			}
			if( session["usuarioLogado"].tipoUsuario == tidweb.Usuario.Tipo.ADMIN ) {
				render(view: "admin")
			}
		}
	}

	def admin() {
		render(view: "admin")
	}
	
	def morador() {
		
		// busca o visitante
		def visitantesList = Visitante.createCriteria().list {
			def now = new Date()
			between('dataVisita', now, now+7)
			eq('morador', session["morador"])
			eq('autorizado', true)
		}
		def prestadoresList = Prestador.createCriteria().list {
			def now = new Date()
			between('dataServico', now, now+7)
			eq('morador', session["morador"])
			eq('autorizado', true)
		}
		def domesticasList = Domestica.createCriteria().list {
			eq('morador', session["morador"])
			eq('autorizado', true)
		}
		
		// agregue a lista de visistantes (prestadores + domesticas)
		visitantesList.addAll(prestadoresList)
		visitantesList.addAll(domesticasList)
		
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
	
	def portaria2() {
		render(view: "portaria")
	}
}
