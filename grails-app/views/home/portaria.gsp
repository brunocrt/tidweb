<html>
<head>
	<meta name="layout" content="kickstart_portaria" />
	<link rel="stylesheet" href="${resource(dir: 'css', file: 'portaria_theme.css')}" type="text/css">
	<link rel="stylesheet" href="${resource(dir: 'css', file: 'portaria.css')}" type="text/css">
</head>

<body>
	<section id="intro" class="first">
		<div class="row">
		
			<div class="navbar navbar-inverse navbar-fixed-top" role="navigation">
				<div class="container-fluid">
					<div class="navbar-header">
						<button type="button" class="navbar-toggle" data-toggle="collapse"
							data-target=".navbar-collapse">
							<span class="sr-only">Toggle navigation</span> <span
								class="icon-bar"></span> <span class="icon-bar"></span> <span
								class="icon-bar"></span>
						</button>
						<a class="navbar-brand" href="#">${ session['condominio'].nome}: ${ session['portaria'].identificacao }</a>
					</div>
					<div class="navbar-collapse collapse">
						<form class="navbar-form navbar-left">
							<input type="text" id="searchfield" class="form-control" placeholder="Morador ou Unidade...">
						</form>
						<div class="btn-group navbar-left" style="padding-top:5px;">
						    <button type="button" class="btn btn-default" onclick="getMoradoresPorLetra('A')">A</button>
						    <button type="button" class="btn btn-default" onclick="getMoradoresPorLetra('B')">B</button>
						    <button type="button" class="btn btn-default" onclick="getMoradoresPorLetra('C')">C</button>
						    <button type="button" class="btn btn-default" onclick="getMoradoresPorLetra('D')">D</button>
						    <button type="button" class="btn btn-default" onclick="getMoradoresPorLetra('E')">E</button>
						    <button type="button" class="btn btn-default" onclick="getMoradoresPorLetra('F')">F</button>
						    <button type="button" class="btn btn-default" onclick="getMoradoresPorLetra('G')">G</button>
						    <button type="button" class="btn btn-default" onclick="getMoradoresPorLetra('H')">H</button>
						    <button type="button" class="btn btn-default" onclick="getMoradoresPorLetra('I')">I</button>
						    <button type="button" class="btn btn-default" onclick="getMoradoresPorLetra('J')">J</button>
						    <button type="button" class="btn btn-default" onclick="getMoradoresPorLetra('K')">K</button>
						    <button type="button" class="btn btn-default" onclick="getMoradoresPorLetra('L')">L</button>
						    <button type="button" class="btn btn-default" onclick="getMoradoresPorLetra('M')">M</button>
						    <button type="button" class="btn btn-default" onclick="getMoradoresPorLetra('N')">N</button>
						    <button type="button" class="btn btn-default" onclick="getMoradoresPorLetra('O')">O</button>
						    <button type="button" class="btn btn-default" onclick="getMoradoresPorLetra('P')">P</button>
						    <button type="button" class="btn btn-default" onclick="getMoradoresPorLetra('Q')">Q</button>
						    <button type="button" class="btn btn-default" onclick="getMoradoresPorLetra('R')">R</button>
						    <button type="button" class="btn btn-default" onclick="getMoradoresPorLetra('S')">S</button>
						    <button type="button" class="btn btn-default" onclick="getMoradoresPorLetra('T')">T</button>
						    <button type="button" class="btn btn-default" onclick="getMoradoresPorLetra('U')">U</button>
						    <button type="button" class="btn btn-default" onclick="getMoradoresPorLetra('V')">V</button>
						    <button type="button" class="btn btn-default" onclick="getMoradoresPorLetra('X')">X</button>
						    <button type="button" class="btn btn-default" onclick="getMoradoresPorLetra('Z')">Z</button>
						    <button type="button" class="btn btn-default" onclick="getMoradoresPorLetra('W')">W</button>
						    <button type="button" class="btn btn-default" onclick="getTodosMoradores()">TODOS</button>
						  </div>							
						<div class="nav navbar-nav navbar-right" style="padding-top:5px; padding-right:15px;">
								<g:link controller="login" action="logout">
									<input class="btn btn-primary" type="button" id="logout" value="Sair">
								</g:link>
						</div>
							
					</div>
				</div>
			</div>

			<div class="container-fluid">
				<div class="row">

					<div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-1 main">
					
						<!-- Lista Moradores -->
						<div id="panelListaMoradores">
							<div id="letraId"></div>						
							<div style="overflow: auto: height: 10">
								<table class="table table-striped">
									<thead>
										<tr>
											<th>Nome</th>
											<th>Unidade</th>
										</tr>
									</thead>
									<tbody id="moradoresTable">
									</tbody>
								</table>
							</div>
						</div>
												
						<!-- Dados Morador -->
						
						<div id="panelMorador" class="bs-component">
							<div class="panel panel-default">
							  	<div id="panelMoradorNome" class="panel-heading">
							  	</div>
							  	<div class="panel-body">
							  		<h4>Unidade</h4>
							  		<p id="panelMoradorUnidade"></p>
									<hr>									
									<h4>Veículos</h4>
									<p id="panelMoradorVeiculos"></p>
									<hr>									
									<h4>Familiares</h4>
									<p id="panelMoradorFamiliares"></p>
									<hr>									
									<h4>Domésticas</h4>
									<p id="panelMoradorDomésticas"></p>
									<hr>									
									<h4>Visitantes</h4>
									<p id="panelMoradorVisitantes"></p>
									<hr>									
									<h4>Prestadores</h4>
									<p id="panelMoradorPrestadores"></p>
							  	</div>
							</div>
						</div>						
						
						<!-- End Dados Morador -->
					</div>
				</div>
			</div>


		</div> <!-- first -->
	</section>
	
</body>
</html>