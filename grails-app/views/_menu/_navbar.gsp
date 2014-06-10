<g:if test="${ session['usuarioLogado'] != null }">	
	<nav id="Navbar" class="navbar navbar-fixed-top navbar-inverse" role="navigation">
		<div class="container">	
				<g:if test="${ session['usuarioLogado'].tipoUsuario == tidweb.Usuario.Tipo.ADMIN }">
					<g:render template="/_menu/navbarAdmin"/>
				</g:if>
				<g:if test="${ session['usuarioLogado'].tipoUsuario == tidweb.Usuario.Tipo.PORTARIA }">
					<g:render template="/_menu/navbarPortaria"/>
				</g:if>
				<g:if test="${ session['usuarioLogado'].tipoUsuario == tidweb.Usuario.Tipo.MORADOR }">
					<g:render template="/_menu/navbarMorador"/>
				</g:if>
		</div>
	</nav>
</g:if>
