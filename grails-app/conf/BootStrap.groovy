
import java.util.Date;

import tidweb.Condominio
import tidweb.Unidade
import tidweb.Morador
import tidweb.Portaria
import tidweb.Usuario
import tidweb.Visitante
import tidweb.Prestador
import tidweb.Domestica
import tidweb.Reserva
import tidweb.Correspondencia

class BootStrap {

    def init = { servletContext ->
		
		environments {

		        development {
					
					Condominio c1 = new Condominio(nome: 'StartLife', endereco: 'Rua Padre Jeronimo Vermin, 204', cidade: 'Sao Paulo', estado: 'SP' )
					Condominio c2 = new Condominio(nome: 'Vila Di Treviso', endereco: 'Rua Afonso Garzuio, 100', cidade: 'Vinhedo', estado: 'SP' )
					
					c1.save()
					c2.save()
					
					if(c1.hasErrors()){ println c1.errors }
					if(c2.hasErrors()){ println c2.errors }
					
					Unidade c1_u1 = new Unidade(numero: '35', bloco: 'B', tipoUnidade: Unidade.Tipo.APARTAMENTO, nomeEdificio: 'Better', condominio: c1 )
					Unidade c1_u2 = new Unidade(numero: '43', bloco: 'B', tipoUnidade: Unidade.Tipo.APARTAMENTO, nomeEdificio: 'Better', condominio: c1 )
					Unidade c2_u1 = new Unidade(numero: '100', tipoUnidade: Unidade.Tipo.CASA, condominio: c2 )
					
					c1_u1.save()
					c1_u2.save()
					c2_u1.save()
					
					if(c1_u1.hasErrors()){ println c1_u1.errors }
					if(c1_u2.hasErrors()){ println c1_u2.errors }
					if(c2_u1.hasErrors()){ println c2_u1.errors }
					
					
					Morador c1_u1_m1 = new Morador(nome: 'Bruno Tinoco',  email: 'brunocr@yahoo.com', unidade: c1_u1 )
					Morador c1_u1_m2 = new Morador(nome: 'Moura Lima',  email: 'brunocr@yahoo.com', unidade: c1_u2 )
					Morador c1_u2_m1 = new Morador(nome: 'Wagner Hasegaua',  email: 'whasegawa@hotmail.com', unidade: c2_u1 )
					Morador c1_u2_m2 = new Morador(nome: 'Samia Hasegaua',  email: 'samiadila@hotmail.com', unidade: c2_u1 )
					
					c1_u1_m1.save()
					c1_u1_m2.save()
					c1_u2_m1.save()
					c1_u2_m2.save()

					if(c1_u1_m1.hasErrors()){ println c1_u1_m1.errors }
					if(c1_u1_m2.hasErrors()){ println c1_u1_m2.errors }
					if(c1_u2_m1.hasErrors()){ println c1_u2_m1.errors }
					if(c1_u2_m2.hasErrors()){ println c1_u2_m2.errors }
					
					Usuario c1_u1_m1_u1 = new Usuario(nome: 'brunocrt', senha: '010779', tipoUsuario: Usuario.Tipo.MORADOR, unidade:c1_u1 )
					
					c1_u1_m1_u1.save()
					
					if(c1_u1_m1_u1.hasErrors()){ println c1_u1_m1_u1.errors }
					
					Visitante c1_u1_m1_v1 = new Visitante(nome: 'Anderson Cardia', dataVisita: new Date().parse("dd/MM/yyyy", "10/06/2014"), autorizado: true, morador: c1_u1_m1, condominio: c1)
					Visitante c1_u1_m1_v2 = new Visitante(nome: 'Nadia Cardia', dataVisita: new Date().parse("dd/MM/yyyy", "18/06/2014"), autorizado: true, morador: c1_u1_m1, condominio: c1)
					
					c1_u1_m1_v1.save()
					c1_u1_m1_v2.save()
					
					if(c1_u1_m1_v1.hasErrors()){ println c1_u1_m1_v1.errors }
					if(c1_u1_m1_v2.hasErrors()){ println c1_u1_m1_v2.errors }

					Prestador c1_u1_m1_p1 = new Prestador(nome: 'Joao Trabalhador', empresa: 'Empresa X', dataServico: new Date(), autorizado: true, morador: c1_u1_m1, condominio: c1)
					
					c1_u1_m1_p1.save()
					
					if(c1_u1_m1_p1.hasErrors()){ println c1_u1_m1_p1.errors }
					
														
		        }
		    }		
    }
    def destroy = {
    }
}
