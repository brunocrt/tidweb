class BootstrapTagLib {

	static namespace = "bs"

	def panel = { attrs ->
                out << "<div class='panel panel-primary'>"
                out << "<div class='panel-heading'>"
                out << "<h4 class='panel-title'>"
                out << "<h4><i class='glyphicon glyphicon-${attrs.icon}'></i>"
                out << " ${attrs.title}"
                out << "</h4>"
                out << "</h4>"
                out << "</div>"
                out << "<div class='panel-body'>"
                out << "<p>${attrs.text}</p>"
                out << "</div>"
                out << "</div>"
	}
}
