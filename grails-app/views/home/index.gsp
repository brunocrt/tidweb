<html>

<head>
<title><g:message code="default.welcome.title" args="[meta(name:'app.name')]" /> v${ meta(name:'app.version') }</title>
<meta name="layout" content="kickstart" />
<g:set var="layout_nomainmenu" value="${true}" scope="request" />
<g:set var="layout_nosecondarymenu" value="${true}" scope="request" />
</head>
<body>
	<content tag="header"> <!-- Empty Header --> </content>

	<section id="intro" class="first">
		<div class="masterhead">
			<div class="center">
				<div class="page-header">
					<img src="${resource(dir: 'images', file: 'logo.jpg')}" alt="${ meta(name:'app.name') }" />
					<h1 id="navbar">
						<font color="#ff9200" style="font-weight: bold;" size="55">${meta(name:'app.name')}</font>
					</h1>
				</div>

				<h2>Sistema de gestão de condomínios</h2>
				<p>Sistema de controle de informação e comunicação para
					condomínios</p>
			</div>
		</div>
	</section>

</body>

</html>
