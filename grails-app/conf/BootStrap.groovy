
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
					
					Condominio c1 = new Condominio(nome: 'Condominio 1', endereco: 'Rua Tal, 204', cidade: 'Sao Paulo', estado: 'SP' )
					Condominio c2 = new Condominio(nome: 'Condominio 2', endereco: 'Rua Dali, 100', cidade: 'Vinhedo', estado: 'SP' )
					
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
					
					
					Morador c1_u1_m1 = new Morador(nome: 'Morador 1',  email: 'morador1@email.com', unidade: c1_u1, condominio: c1 )
					Morador c1_u1_m2 = new Morador(nome: 'Morador 2',  email: 'morador2@email.com', unidade: c1_u2, condominio: c1 )
					Morador c1_u2_m1 = new Morador(nome: 'Morador 3',  email: 'morador3@email.com', unidade: c2_u1, condominio: c1 )
					Morador c1_u2_m2 = new Morador(nome: 'Morador 4',  email: 'morador4@email.com', unidade: c2_u1, condominio: c1 )
					
					c1_u1_m1.save()
					c1_u1_m2.save()
					c1_u2_m1.save()
					c1_u2_m2.save()

					if(c1_u1_m1.hasErrors()){ println c1_u1_m1.errors }
					if(c1_u1_m2.hasErrors()){ println c1_u1_m2.errors }
					if(c1_u2_m1.hasErrors()){ println c1_u2_m1.errors }
					if(c1_u2_m2.hasErrors()){ println c1_u2_m2.errors }
					
					Portaria c1_p1 = new Portaria(identificacao: 'Portaria 1', condominio: c1)
					
					c1_p1.save()
					
					if(c1_p1.hasErrors()){ println c1_p1.errors }
					
					Usuario c1_u1_m1_u0 = new Usuario(nome: 'admin', senha: '123', tipoUsuario: Usuario.Tipo.ADMIN )
					Usuario c1_u1_m1_u1 = new Usuario(nome: 'morador', senha: '123', tipoUsuario: Usuario.Tipo.MORADOR, morador: c1_u1_m1 )
					Usuario c1_u1_m1_u2 = new Usuario(nome: 'portaria', senha: '123', tipoUsuario: Usuario.Tipo.PORTARIA, portaria: c1_p1)
					
					c1_u1_m1_u0.save()
					c1_u1_m1_u1.save()
					c1_u1_m1_u2.save()
					
					if(c1_u1_m1_u0.hasErrors()){ println c1_u1_m1_u0.errors }
					if(c1_u1_m1_u1.hasErrors()){ println c1_u1_m1_u1.errors }
					if(c1_u1_m1_u2.hasErrors()){ println c1_u1_m1_u2.errors }
					
					Visitante c1_u1_m1_v1 = new Visitante(nome: 'Visitante 1', dataVisita: new Date().parse("dd/MM/yyyy", "10/06/2014"), autorizado: true, morador: c1_u1_m1, condominio: c1)
					Visitante c1_u1_m1_v2 = new Visitante(nome: 'Visitante 2', dataVisita: new Date().parse("dd/MM/yyyy", "18/06/2014"), autorizado: true, morador: c1_u1_m1, condominio: c1)
					
					c1_u1_m1_v1.save()
					c1_u1_m1_v2.save()
					
					if(c1_u1_m1_v1.hasErrors()){ println c1_u1_m1_v1.errors }
					if(c1_u1_m1_v2.hasErrors()){ println c1_u1_m1_v2.errors }

					Prestador c1_u1_m1_p1 = new Prestador(nome: 'Prestador 1', empresa: 'Empresa X', dataServico: new Date(), autorizado: true, morador: c1_u1_m1, condominio: c1)
					
					c1_u1_m1_p1.save()
					
					if(c1_u1_m1_p1.hasErrors()){ println c1_u1_m1_p1.errors }
					
														
		        }
		    }		
    }
    def destroy = {
    }
}
