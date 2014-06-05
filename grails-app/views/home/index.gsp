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
		<div class="masterhead" style="background-color: #ffffff !important;">
		    	<div class="center">
				<img src="${resource(dir: 'images', file: 'logo.jpg')}" alt="TIDWEB"/>
				<font color="#317eac" style="font-weight: bold;" size="55">TIDWEB</font>
				<h2>Sistema de gestão de condomínios</h2>
				<p>Sistema de controle de informação e comunicação para condomínios</p>
			</div>
		</div>
	</section>

</body>

</html>
