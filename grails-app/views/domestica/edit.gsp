<%@ page import="tidweb.Domestica" %>
<!DOCTYPE html>
<html>

<head>
	<meta name="layout" content="kickstart" />
	<g:set var="entityName" value="${message(code: 'domestica.label', default: 'Domestica')}" />
	<title><g:message code="default.edit.label" args="[entityName]" /></title>
</head>

<body>

	<section id="edit-domestica" class="first">

		<g:hasErrors bean="${domesticaInstance}">
		<div class="alert alert-danger">
			<g:renderErrors bean="${domesticaInstance}" as="list" />
		</div>
		</g:hasErrors>

		<g:form method="post" class="form-horizontal" role="form"  enctype="multipart/form-data">
			<g:hiddenField name="id" value="${domesticaInstance?.id}" />
			<g:hiddenField name="version" value="${domesticaInstance?.version}" />
			<g:hiddenField name="_method" value="PUT" />
			
			<g:render template="form"/>
			
			<div class="form-actions margin-top-medium">
				<g:actionSubmit class="btn btn-primary" action="update" value="${message(code: 'default.button.update.label', default: 'Update')}" />
	            <button class="btn" type="reset"><g:message code="default.button.reset.label" default="Reset" /></button>
			</div>
		</g:form>

	</section>

</body>

</html>
