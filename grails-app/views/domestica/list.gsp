
<%@ page import="tidweb.Domestica" %>
<!DOCTYPE html>
<html>

<head>
	<meta name="layout" content="kickstart" />
	<g:set var="entityName" value="${message(code: 'domestica.label', default: 'Domestica')}" />
	<title><g:message code="default.list.label" args="[entityName]" /></title>
</head>

<body>

<section id="list-domestica" class="first">

	<table class="table table-bordered margin-top-medium">
		<thead>
			<tr>
			
				<g:sortableColumn property="nome" title="${message(code: 'domestica.nome.label', default: 'Nome')}" />
			
				<g:sortableColumn property="numeroDocumento" title="${message(code: 'domestica.numeroDocumento.label', default: 'Numero Documento')}" />
			
				<g:sortableColumn property="tipoDocumento" title="${message(code: 'domestica.tipoDocumento.label', default: 'Tipo Documento')}" />
			
				<g:sortableColumn property="foto" title="${message(code: 'domestica.foto.label', default: 'Foto')}" />
			
				<g:sortableColumn property="formatoFoto" title="${message(code: 'domestica.formatoFoto.label', default: 'Formato Foto')}" />
			
				<g:sortableColumn property="autorizado" title="${message(code: 'domestica.autorizado.label', default: 'Autorizado')}" />
			
			</tr>
		</thead>
		<tbody>
		<g:each in="${domesticaInstanceList}" status="i" var="domesticaInstance">
			<tr class="${(i % 2) == 0 ? 'odd' : 'even'}">
			
				<td><g:link action="show" id="${domesticaInstance.id}">${fieldValue(bean: domesticaInstance, field: "nome")}</g:link></td>
			
				<td>${fieldValue(bean: domesticaInstance, field: "numeroDocumento")}</td>
			
				<td>${fieldValue(bean: domesticaInstance, field: "tipoDocumento")}</td>
			
				<td>${fieldValue(bean: domesticaInstance, field: "foto")}</td>
			
				<td>${fieldValue(bean: domesticaInstance, field: "formatoFoto")}</td>
			
				<td><g:formatBoolean boolean="${domesticaInstance.autorizado}" /></td>
			
			</tr>
		</g:each>
		</tbody>
	</table>
	<div>
		<bs:paginate total="${domesticaInstanceCount}" />
	</div>
</section>

</body>

</html>
