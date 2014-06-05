<html>

<head>
	<title><g:message code="default.welcome.title" args="[meta(name:'app.name')]"/> </title>
	<meta name="layout" content="kickstart" />
	<g:set var="layout_nomainmenu" value="${true}" scope="request"/>
	<g:set var="layout_nosecondarymenu" value="${true}" scope="request"/>
</head>

<body>
	<content tag="header">
		<!-- Empty Header -->
	</content>

	<section id="intro" class="first">
		<div class="row">
		    	<div class="center">
				<img src="${resource(dir: 'images', file: 'logo.jpg')}" alt="TIDWEB"/>
				<h3>Tidweb - Sistema de gestão de condomínios</h3>
				<p>Contate o administrador do seu condomínio.</p>
			</div>
		</div>
	</section>

</body>

</html>
