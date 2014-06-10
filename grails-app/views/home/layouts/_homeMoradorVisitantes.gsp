<ul class="list-group">
	<g:if test="${ visitantesList != null }">
		<g:each var="visitante" in="${ visitantesList }" status="i">
			  <li class="list-group-item">
			    <span class="badge">Visitante</span>
			    ${visitante.nome} - ${visitante.dataVisita}
			  </li>
		</g:each>
	</g:if>
</ul>