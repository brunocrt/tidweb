package tidweb

/**
 * LoginController
 * A controller class handles incoming web requests and performs actions such as redirects, rendering views and so on.
 */
class LoginController {
	
	def scaffold = true
	static allowedMethods = [loginAdmin: "POST", loginPortaria: "POST", loginMorador: "POST"]
	
	def index() {
		render(view: "morador", model: [login:new Login()])
	}
	
	def admin() {
		render(view: "admin", model: [login:new Login()])
	}
	
	def portaria() {
		render(view: "portaria", model: [login:new Login()])
	}
	
	def morador() {
		render(view: "morador", model: [login:new Login()])
	}

	def loginAdmin() {

		// capture os parametros de entrada
		def loginAdmin = new Login(params)
		
		// busca o usuario
		def usuario = Usuario.findWhere(nome: "${loginAdmin.usuario}", senha: "${loginAdmin.senha}", tipoUsuario: Usuario.Tipo.ADMIN)
				
		// valida o usuario
		if (usuario != null) {
		
			// coloca usuario na sessao
			session["usuarioLogado"] = usuario

			// coloca o ultimo acesso na sessao
			session["ultimoAcesso"] = usuario.ultimoAcesso

			// atualiza o ultimo acesso
			usuario.ultimoAcesso = new Date()
			usuario.save()

			// exibe pagina
			redirect(controller: "home", action: "admin")
			
		} else {
		
			// login invalido
			flash.message = "Usuário e/ou senha inválido(s) ${loginAdmin.usuario}!"
			render(view: "admin", model: [login:new Login()])
		}

	}

	def loginPortaria() {
		
		// capture os parametros de entrada
		def loginAdmin = new Login(params)
		
		// busca o usuario
		def usuario = Usuario.findWhere(nome: "${loginAdmin.usuario}", senha: "${loginAdmin.senha}", tipoUsuario: Usuario.Tipo.PORTARIA)
		
		// valida o usuario
		if (usuario != null) {
		
			// coloca usuario na sessao
			session["usuarioLogado"] = usuario			

			// coloca o ultimo acesso na sessao
			session["ultimoAcesso"] = usuario.ultimoAcesso
			
			// coloca condominio na sessao
			session["condominio"] = usuario.condominio

			// coloca informacao da portaria na sessao
			session["portaria"] = usuario.portaria

			// atualiza o ultimo acesso
			usuario.ultimoAcesso = new Date()
			usuario.save()

			
			// exibe pagina
			redirect(controller: "home", action: "portaria")
				
		} else {
		
			// login invalido
			flash.message = "Usuário e/ou senha inválido(s) ${loginAdmin.usuario}!"
			render(view: "portaria", model: [login:new Login()])
		}

	}
	
	def loginMorador() {
		
		// capture os parametros de entrada
		def loginAdmin = new Login(params)
		
		// busca o usuario
		def usuario = Usuario.findWhere(nome: "${loginAdmin.usuario}", senha: "${loginAdmin.senha}", tipoUsuario: Usuario.Tipo.MORADOR)
		
		// valida o usuario
		if (usuario != null) {
					
			// coloca usuario na sessao
			session["usuarioLogado"] = usuario
			
			// coloca o ultimo acesso na sessao
			session["ultimoAcesso"] = usuario.ultimoAcesso
			
			// coloca condominio na sessao
			session["condominio"] = usuario.morador.unidade.condominio
					
			// coloca morador na sessao
			if(usuario.morador != null ) {
				session["morador"] = usuario.morador
			}
			
			// atualiza o ultimo acesso
			usuario.ultimoAcesso = new Date()
			usuario.save()
			
			// exibe pagina
			redirect(controller: "home", action: "morador")
				
		} else {

			// login invalido
			flash.message = "Usuário e/ou senha inválido(s) ${loginAdmin.usuario}!"
			render(view: "morador", model: [login:new Login()])
		}
	}

	def changePassword() {

	}
	
	def logout() {
		session["usuarioLogado"] = null
		session["condominio"] = null
		session["morador"] = null
		session.invalidate()
		redirect(uri: "/")
	}
}
