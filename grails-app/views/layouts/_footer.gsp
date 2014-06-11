<footer class="footer">
	<div class="container">
		<div class="row">
			<div class="col-lg-2">
				<h4>Empresa</h4>
				<ul class="unstyled">
					<li>
			    		<i class="glyphicon glyphicon-info-sign"></i>
						<a href="${createLink(uri: '/about')}">
							<g:message code="default.about.label"/>
						</a>
					</li>
					<li>
			    		<i class="glyphicon glyphicon-envelope"></i>
						<a href="${createLink(uri: '/contact')}">
							<g:message code="default.contact.label"/>
						</a>
					</li>
				</ul>
			</div>
			<div class="col-lg-8">
				<h4> Informação </h4>
				<p>${ meta(name:'app.name') } v${ meta(name:'app.version') } - Sistema de gestão de informação e segurança de condomínios residenciais</p>
			</div>
		</div>
		<h4>Disclaimer</h4>
		<p>This Web site may contain other proprietary notices and copyright information, the terms of which must be observed and followed. 
		Information on this Web site may contain technical inaccuracies or typographical errors. 
		Information may be changed or updated without notice. 
		</p>
		<p>The operator and author may also make improvements and/or changes in the products and/or the programs described in this information
		at any time without notice. For documents and software available from this server, the operator and author does not warrant or 
		assume any legal liability or responsibility for the accuracy, completeness, or usefulness of any information,
		apparatus, product, or process disclosed.
		</p>
	
		<p class="pull-right"><a href="#">Topo</a></p>
	</div>
</footer>
