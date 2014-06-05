<html>

<head>
	<title>Startlife</title>
	<meta name="layout" content="kickstart" />
	<g:set var="layout_nomainmenu"		value="${true}" scope="request"/>
	<g:set var="layout_nosecondarymenu"	value="${true}" scope="request"/>
</head>

<body>

	<section id="intro" class="first">
		<div class="row">
		    	<div class="center">
				<h3>Acesso Portaria</h3>
				<p>Painel administrativo de controle de acesso e informação do condomínio. 
				   Selecione uma opção abaixo clicando sob o quadro desejado.<br>
				   Em caso de dúvidas entre em contato com o suporte técnico.
				</p>
			</div>
		</div>

		<div class="row">
		    <div class="col-md-4">
			<div class="bs-component">
				<div class="panel panel-primary">			
				  	<div class="panel-heading">
					    <g:link controller="morador" action="list" style="color: #ffffff">
				   		 <h4 class="panel-title">
							<h4><i class="glyphicon glyphicon-home"></i>
							 Moradores
							</h4>
						 </h4>
					    </g:link>
				  	</div>
				  	<div class="panel-body">
						<p>Lista de moradores do condomínio</p>
				  	</div>
					
				</div>
				<div class="panel panel-primary">
				  	<div class="panel-heading" style="background-color: #468847 !important;">
					    <g:link controller="visitante" action="list" style="color: #ffffff">
				   		 <h4 class="panel-title">
							<h4><i class="glyphicon glyphicon-user"></i> Visitantes</h4>
						</h4>
					    </g:link>
				  	</div>
				  	<div class="panel-body">
						<p>Lista de visitantes e prestadores de serviço</p>
				  	</div>
				</div>
			</div>
		    </div>
		    <div class="col-md-4">
			<div class="bs-component">
				<div class="panel panel-primary">
				  	<div class="panel-heading" style="background-color: #DD5600 !important;">
					    <g:link controller="correspondencia" action="list" style="color: #ffffff">
				   		 <h4 class="panel-title">
							<h4><i class="glyphicon glyphicon-envelope"></i> Correspondencia</h4>
						</h4>
					    </g:link>
				  	</div>
				  	<div class="panel-body">
						<p>Envio de notificação de correspondência</p>
				  	</div>
				</div>
				<div class="panel panel-primary">
				  	<div class="panel-heading" style="background-color: #C71C22 !important;">
					    <g:link controller="avisoGeral" action="list" style="color: #ffffff">
				   		 <h4 class="panel-title">
							<h4><i class="glyphicon glyphicon-info-sign"></i> Aviso Geral</h4>
						</h4>
					    </g:link>
				  	</div>
				  	<div class="panel-body">
						<p>Envio de aviso geral para todos os moradores</p>
				  	</div>
				</div>
			</div>
		    </div>
		    <div class="col-md-4">
			<div class="bs-component">
				<div class="panel panel-primary">
				  	<div class="panel-heading" style="background-color: #033C73 !important;">
					    <g:link controller="reserva" action="list" style="color: #ffffff">
				   		 <h4 class="panel-title">
							<h4><i class="glyphicon glyphicon-calendar"></i> Reserva</h4>
						</h4>
					    </g:link>
				  	</div>
				  	<div class="panel-body">
						<p>Criar reserva para áreas comuns do condomínio</p>
				  	</div>
				</div>
				<div class="panel panel-primary">
				  	<div class="panel-heading" style="background-color: #C71C73 !important;">
					    <g:link controller="mural" action="list" style="color: #ffffff">
				   		 <h4 class="panel-title">
							<h4><i class="glyphicon glyphicon-list-alt"></i> Mural</h4>
						</h4>
					    </g:link>
				  	</div>
				  	<div class="panel-body">
						<p>Mural de notas e avisos do condomínio</p>
				  	</div>
				</div>
			</div>
		    </div>
		</div>

	</section>

</body>

</html>
