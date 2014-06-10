
<%@ page import="tidweb.Domestica" %>
<!DOCTYPE html>
<html>

<head>
	<meta name="layout" content="kickstart" />
	<g:set var="entityName" value="${message(code: 'domestica.label', default: 'Domestica')}" />
	<title><g:message code="default.show.label" args="[entityName]" /></title>
</head>

<body>

<section id="show-domestica" class="first">

	<table class="table">
		<tbody>
		
			<tr class="prop">
				<td valign="top" class="name"><g:message code="domestica.nome.label" default="Nome" /></td>
				
				<td valign="top" class="value">${fieldValue(bean: domesticaInstance, field: "nome")}</td>
				
			</tr>
		
			<tr class="prop">
				<td valign="top" class="name"><g:message code="domestica.numeroDocumento.label" default="Numero Documento" /></td>
				
				<td valign="top" class="value">${fieldValue(bean: domesticaInstance, field: "numeroDocumento")}</td>
				
			</tr>
		
			<tr class="prop">
				<td valign="top" class="name"><g:message code="domestica.tipoDocumento.label" default="Tipo Documento" /></td>
				
				<td valign="top" class="value">${fieldValue(bean: domesticaInstance, field: "tipoDocumento")}</td>
				
			</tr>
		
			<tr class="prop">
				<td valign="top" class="name"><g:message code="domestica.foto.label" default="Foto" /></td>
				
			</tr>
		
			<tr class="prop">
				<td valign="top" class="name"><g:message code="domestica.formatoFoto.label" default="Formato Foto" /></td>
				
				<td valign="top" class="value">${fieldValue(bean: domesticaInstance, field: "formatoFoto")}</td>
				
			</tr>
		
			<tr class="prop">
				<td valign="top" class="name"><g:message code="domestica.autorizado.label" default="Autorizado" /></td>
				
				<td valign="top" class="value"><g:formatBoolean boolean="${domesticaInstance?.autorizado}" /></td>
				
			</tr>
		
			<tr class="prop">
				<td valign="top" class="name"><g:message code="domestica.condominio.label" default="Condominio" /></td>
				
				<td valign="top" class="value"><g:link controller="condominio" action="show" id="${domesticaInstance?.condominio?.id}">${domesticaInstance?.condominio?.encodeAsHTML()}</g:link></td>
				
			</tr>
		
			<tr class="prop">
				<td valign="top" class="name"><g:message code="domestica.diasAutorizados.label" default="Dias Autorizados" /></td>
				
				<td valign="top" class="value">${fieldValue(bean: domesticaInstance, field: "diasAutorizados")}</td>
				
			</tr>
		
			<tr class="prop">
				<td valign="top" class="name"><g:message code="domestica.morador.label" default="Morador" /></td>
				
				<td valign="top" class="value"><g:link controller="morador" action="show" id="${domesticaInstance?.morador?.id}">${domesticaInstance?.morador?.encodeAsHTML()}</g:link></td>
				
			</tr>
		
			<tr class="prop">
				<td valign="top" class="name"><g:message code="domestica.periodosAutorizados.label" default="Periodos Autorizados" /></td>
				
				<td valign="top" class="value">${fieldValue(bean: domesticaInstance, field: "periodosAutorizados")}</td>
				
			</tr>
		
		</tbody>
	</table>
</section>

</body>

</html>
