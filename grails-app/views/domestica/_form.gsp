<%@ page import="tidweb.Domestica" %>



			<div class="${hasErrors(bean: domesticaInstance, field: 'nome', 'error')} required">
				<label for="nome" class="control-label"><g:message code="domestica.nome.label" default="Nome" /><span class="required-indicator">*</span></label>
				<div>
					<g:textField class="form-control" name="nome" maxlength="50" required="" value="${domesticaInstance?.nome}"/>
					<span class="help-inline">${hasErrors(bean: domesticaInstance, field: 'nome', 'error')}</span>
				</div>
			</div>

			<div class="${hasErrors(bean: domesticaInstance, field: 'numeroDocumento', 'error')} required">
				<label for="numeroDocumento" class="control-label"><g:message code="domestica.numeroDocumento.label" default="Numero Documento" /><span class="required-indicator">*</span></label>
				<div>
					<g:textField class="form-control" name="numeroDocumento" maxlength="50" required="" value="${domesticaInstance?.numeroDocumento}"/>
					<span class="help-inline">${hasErrors(bean: domesticaInstance, field: 'numeroDocumento', 'error')}</span>
				</div>
			</div>

			<div class="${hasErrors(bean: domesticaInstance, field: 'tipoDocumento', 'error')} required">
				<label for="tipoDocumento" class="control-label"><g:message code="domestica.tipoDocumento.label" default="Tipo Documento" /><span class="required-indicator">*</span></label>
				<div>
					<g:textField class="form-control" name="tipoDocumento" maxlength="24" required="" value="${domesticaInstance?.tipoDocumento}"/>
					<span class="help-inline">${hasErrors(bean: domesticaInstance, field: 'tipoDocumento', 'error')}</span>
				</div>
			</div>

			<div class="${hasErrors(bean: domesticaInstance, field: 'foto', 'error')} ">
				<label for="foto" class="control-label"><g:message code="domestica.foto.label" default="Foto" /></label>
				<div>
					<input type="file" id="foto" name="foto"  class="form-control"/>
					<span class="help-inline">${hasErrors(bean: domesticaInstance, field: 'foto', 'error')}</span>
				</div>
			</div>

			<div class="${hasErrors(bean: domesticaInstance, field: 'autorizado', 'error')} ">
				<label for="autorizado" class="control-label"><g:message code="domestica.autorizado.label" default="Autorizado" /></label>
				<div>
					<bs:checkBox name="autorizado" value="${domesticaInstance?.autorizado}" class="form-control"/>
					<span class="help-inline">${hasErrors(bean: domesticaInstance, field: 'autorizado', 'error')}</span>
				</div>
			</div>

			<div class="${hasErrors(bean: domesticaInstance, field: 'diasAutorizados', 'error')} ">
				<label for="diasAutorizados" class="control-label"><g:message code="domestica.diasAutorizados.label" default="Dias Autorizados" /></label>
				<div>
					<g:select name="diasAutorizados" from="${tidweb.Domestica.DiaSemana.values()}" size="7" multiple="yes" value="${domesticaInstance?.diasAutorizados}"  class="form-control" />
					<span class="help-inline">${hasErrors(bean: domesticaInstance, field: 'diasAutorizados', 'error')}</span>
				</div>
			</div>

			<div class="${hasErrors(bean: domesticaInstance, field: 'periodosAutorizados', 'error')} ">
				<label for="periodosAutorizados" class="control-label"><g:message code="domestica.periodosAutorizados.label" default="Periodos Autorizados" /></label>
				<div>
					<g:select name="periodosAutorizados" from="${tidweb.Domestica.Periodo.values()}" size="4" multiple="yes" value="${domesticaInstance?.periodosAutorizados}"  class="form-control" />
					<span class="help-inline">${hasErrors(bean: domesticaInstance, field: 'periodosAutorizados', 'error')}</span>
				</div>
			</div>			

			<div class="${hasErrors(bean: domesticaInstance, field: 'condominio', 'error')} required">
				<label for="condominio" class="control-label"><g:message code="domestica.condominio.label" default="Condominio" /><span class="required-indicator">*</span></label>
				<div>
					<g:select class="form-control" id="condominio" name="condominio.id" from="${tidweb.Condominio.list()}" optionKey="id" required="" value="${domesticaInstance?.condominio?.id}"/>
					<span class="help-inline">${hasErrors(bean: domesticaInstance, field: 'condominio', 'error')}</span>
				</div>
			</div>

			<div class="${hasErrors(bean: domesticaInstance, field: 'morador', 'error')} required">
				<label for="morador" class="control-label"><g:message code="domestica.morador.label" default="Morador" /><span class="required-indicator">*</span></label>
				<div>
					<g:select class="form-control" id="morador" name="morador.id" from="${tidweb.Morador.list()}" optionKey="id" required="" value="${domesticaInstance?.morador?.id}"/>
					<span class="help-inline">${hasErrors(bean: domesticaInstance, field: 'morador', 'error')}</span>
				</div>
			</div>

