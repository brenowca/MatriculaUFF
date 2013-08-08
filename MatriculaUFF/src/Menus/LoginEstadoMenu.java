package Menus;

import Dominio.SistemaFachada;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Breno W. Carvalho, C. Bruno Garcia, Ian Villar, Rafael Grillo
 */

public class LoginEstadoMenu extends EstadoMenuAbstrato {

    public LoginEstadoMenu(){
	this.setMsg("--------------------------------\n" +
	"Bem-vindo ao MatrículaUFF:\n" +
	"Digite a opção desejada:\n" +
	"[1]: Realizar Login\n" +
	"[2]: Encerrar.\n" +
	"--------------------------------");
    }

    public boolean selecionaOpcao(int opt){
		switch(opt){
		    case 1:
				//pergunta login
				//pergunta senha
				//se der certo temos que guardar o usuario e ir para o proximo estado proximoEstadoMenu(proximo)
				// se não der certo proximoEstadoMenu(this)
				System.out.println("Digite o login: ");
				String login = in.nextLine();
				System.out.println("Digite a senha: ");
				String senha = in.nextLine();
				sistema.usuarioLogado = sistema.logarSistema(login, senha);
				if(sistema.usuarioLogado != null){
					proximoEstadoMenu(new VisualizaEstadoMenu());
				}
				break;
		    case 2:
		        proximoEstadoMenu(new FinalizaEstadoMenu());
		    default:
				return false
        }
		return true;
	}


}
