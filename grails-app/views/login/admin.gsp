<html>
<head>
	<title>Acesso Admin</title>
	<meta name="layout" content="kickstart" />

	<g:set var="layout_nomainmenu"		value="${true}" scope="request"/>
	<g:set var="layout_nosecondarymenu"	value="${true}" scope="request"/>
</head>

<body>

<section id="login" class="first">
<div class="row">
	<div class="col-md-3"></div>
	<div class="col-md-6">
		<g:form action="loginAdmin">
				<div class="form-group ${hasErrors(bean: LoginInstance, field: 'name', 'error')} ">
					<h3> Acesso Admin </h3>
				</div>
				
				<div class="form-group ${hasErrors(bean: LoginInstance, field: 'name', 'error')} ">
					<label for='username' class="control-label">Usuario:</label>
					<div class="controls">
						<g:textField name="usuario" value="${login.usuario}" class="form-control col-md-4"/>
					</div>
				</div>
	
				<div class="form-group ${hasErrors(bean: LoginInstance, field: 'name', 'error')} ">
					<label for='password' class="control-label">Senha:</label>
					<div class="controls">
						<g:passwordField name="senha" value="${login.senha}" class="form-control col-md-4" type="password"/>
					</div>
				</div>				
				<div class="form-group">
					<g:submitButton name="login" value="Entrar" class="btn btn-success"/>
				</div>
		</g:form>
	</div>
	<div class="col-md-3"></div>
</div>
</section>

<script type='text/javascript'>
	<!--
	(function() {
		document.forms['loginForm'].elements['j_username'].focus();
	})();
	// -->
</script>

</body>
</html>
