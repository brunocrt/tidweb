	    <div class="navbar-header">
			<button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-ex1-collapse">
        		<span class="sr-only">Toggle navigation</span>
        		<span class="icon-bar"></span>
	           	<span class="icon-bar"></span>
	           	<span class="icon-bar"></span>
			</button>
	
			<g:if test="${ session['usuarioLogado'] != null }">	
				<a class="navbar-brand" href="${createLink(uri: '/home/' + session['usuarioLogado'].tipoUsuario.toString().toLowerCase() )}">
					<img class="logo" src="${resource(plugin: 'kickstart', dir:'images', file:'brand_logo.png')}" alt="${meta(name:'app.name')}" width="16px" height="16px"/> 
					Home
				</a>
			</g:if>
			<g:else>
				<a class="navbar-brand" href="${createLink(uri: '/')}">
					<img class="logo" src="${resource(plugin: 'kickstart', dir:'images', file:'brand_logo.png')}" alt="${meta(name:'app.name')}" width="16px" height="16px"/> 
					${meta(name:'app.name')}
					<small> v${meta(name:'app.version')}</small>
				</a>			
			</g:else>
		</div>
		    
		<div class="collapse navbar-collapse navbar-ex1-collapse" role="navigation">
	    	<ul class="nav navbar-nav navbar-right">
				<g:render template="/_menu/user"/>
		    </ul>
		</div>
