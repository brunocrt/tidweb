<html>
<head>
	<title>${session["condominio"].nome}</title>
	<meta name="layout" content="kickstart" />
	<g:set var="layout_nomainmenu"		value="${true}" scope="request"/>
	<g:set var="layout_nosecondarymenu"	value="${true}" scope="request"/>
</head>

<body>

	<section id="intro" class="first">
		<div class="row">
		    	<div class="center">
				<h3>Acesso Morador</h3>
				<p>Selecione uma opção abaixo clicando sob o quadro desejado. Em caso de dúvidas entre em contato com o suporte técnico.
				</p>
			</div>
		</div>

		<div class="row">
			<ul class="breadcrumb">
			  <li class="active">Bem-vindo <b>${ session["morador"].nome }</b>, seu último acesso foi em <g:formatDate format="dd/MM/yyyy HH:mm:ss" date="${ session["usuarioLogado"].ultimoAcesso }"/></li>
			</ul>		
		</div>
		
		<ul class="nav nav-tabs" style="margin-bottom: 15px;">
		  <li class="active"><a href="#visitantes" data-toggle="tab" style="color: #468847 !important;">Visitantes <span class="badge">${ visitantesList != null ? visitantesList.size() : "" }</span></a></li>
		  <li class=""><a href="#correspondencias" data-toggle="tab" style="color: #DD5600 !important;">Correspondências <span class="badge">${ correspondenciasList != null ? correspondenciasList.size() : "" }</span></a></li>
		  <li class=""><a href="#avisos" data-toggle="tab" style="color: #C71C22 !important;">Avisos <span class="badge">${ avisosList != null ? avisosList.size() : "" }</span></a></li>
		  <li class=""><a href="#reservas" data-toggle="tab" style="color: #033C73 !important;">Reservas <span class="badge">${ reservasList != null ? reservasList.size() : "" }</span></a></li>
		  <li class=""><a href="#mural" data-toggle="tab" style="color: #C71C73 !important;">Mural <span class="badge">${ muralList != null ? muralList.size() : "" }</span></a></li>
		</ul>

		<div id="myTabContent" class="tab-content">
		
		  <div class="tab-pane fade active in" id="visitantes">
			  	<div class="panel-body">
					<p>Lista de visitantes e prestadores de serviço autorizados a visitar sua unidade</p>
			  	</div>
				<ul class="list-group">
					<g:if test="${ visitantesList != null }">
						<g:each var="v" in="${ visitantesList }" status="i">
							  <li class="list-group-item">
						    	<g:if test="${ v instanceof tidweb.Visitante }">
									<span class="badge">Visitante</span>
						    		${v.nome} - <g:formatDate format="dd/MM/yyyy" date="${v.dataVisita}"/>
						    	</g:if>
								<g:if test="${ v instanceof tidweb.Prestador }">
									<span class="badge">Prestador</span>
									${v.nome} - <g:formatDate format="dd/MM/yyyy" date="${v.dataServico}"/>
								</g:if>
							  </li>
						</g:each>
					</g:if>
				</ul>
	 	  </div>
	 	  
		  <div class="tab-pane fade" id="correspondencias">
			  	<div class="panel-body">
					<p>Lista de correspondências disponíveis para retirada na portaria</p>
			  	</div>
				<ul class="list-group">
					<g:if test="${ correspondenciasList != null }">
						<g:each var="c" in="${ correspondenciasList }" status="i">
							  <li class="list-group-item">
							    <b>${c.titulo}</b> - <g:formatDate format="dd/MM/yyyy" date="${c.dataChegada}"/>
							    ${c.descricao} 
							  </li>
						</g:each>
					</g:if>
				</ul>
	 	  </div>
	 	  
		  <div class="tab-pane fade" id="avisos">
			  	<div class="panel-body">
					<p>Aviso geral para todos os moradores do condomínio</p>
			  	</div>
				<ul class="list-group">
					<g:if test="${ avisosList != null }">
						<g:each var="a" in="${ avisosList }" status="i">
							  <li class="list-group-item">
							    ${a.nome}
							  </li>
						</g:each>
					</g:if>
				</ul>
	 	  </div>
	 	  
		  <div class="tab-pane fade" id="reservas">
			  	<div class="panel-body">
					<p>Reserva de áreas comuns do condomínio</p>
			  	</div>
				<ul class="list-group">
					<g:if test="${ reservasList != null }">
						<g:each var="r" in="${ reservasList }" status="i">
							  <li class="list-group-item">
							    ${r.nome}
							  </li>
						</g:each>
					</g:if>
				</ul>
	 	  </div>
	 	  
		  <div class="tab-pane fade" id="mural">
			  	<div class="panel-body">
					<p>Mural para anuncios do condomínio</p>
			  	</div>
				<ul class="list-group">
					<g:if test="${ muralList != null }">
						<g:each var="m" in="${ muralList }" status="i">
							  <li class="list-group-item">
							    ${m.nome}
							  </li>
						</g:each>
					</g:if>
				</ul>
	 	  </div>	 	  	 	  	 	  
	 	   	  
		</div>

	</section>

</body>

</html>
