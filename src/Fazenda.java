import java.lang.reflect.Array;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Fazenda {
	//verifica se a opção digitada pelo usuario é null(usuario não digitou nada)
	public static boolean isNull(String opcao) {
		
		if(opcao == null) {
			return true;
		}
		
		else {
			return false;
		}		
	}

	//menu principal com todos as opcoes que o usuario pode escolher
	public static int menuPrincipal() {

		String opcao;
		String menu = ""
				+ "-------------------------------------------------------------"
				+ "\n 1- Para utilizar o menu de criacao do Pato"
				+ "\n 2- Para utilizar o menu de criacao da Galinha"
				+ "\n 3- Para utilizar o menu de criacao do Morcego"
				+ "\n 4- Para utilizar o menu de criacao da Vaca"
				+ "\n 5- Para exibir o menu de informacoes do Pato"
				+ "\n 6- Para exibir o menu de informacoes da Galinha"
				+ "\n 7- Para exibir o menu de informacoes do Morcego"
				+ "\n 8- Para exibir o menu de informacoes da Vaca"
				+ "\n 9- Para fechar o programa"
				+ "\n-------------------------------------------------------------";
		//armazena a opção que o usuario digitou na janela de dialogo do JOptionPane
		opcao = JOptionPane.showInputDialog(null, menu);

		/*caso o usuario clique no botão de cancelar ou de fechar do JOptionPane
		  o retorno é nulo, dessa forma verificando se a opcao é nula, o
		  a caixa de dialogo é fechada sem dar erro de NullException*/
		if(isNull(opcao)) {
			
			System.exit(0);
			
		}
		//verifica se o usuario escolheu alguma das opções disponiveis para
		//retornar a opção digitada convertida em inteiro
		else if(opcao.equals("1") || opcao.equals("2") || opcao.equals("3") || opcao.equals("4") || opcao.equals("5") || opcao.equals("6") || opcao.equals("7") || opcao.equals("8") || opcao.equals("9")) {
			
			return Integer.parseInt(opcao);
				
		}
		else {
			
			JOptionPane.showMessageDialog(null, "Opcao invalida");

		}
		
		return 0;

		
	}

	//meu de criacao dos animais
	public static String menuCriarAnimal(String tipoAnimal) {
		
		String menu = ""
				+ "\n Qual a idade e o tamanho do(a) "+ tipoAnimal+" ?"
				+ "\n Obs: digite os valores separados por , exemplo: a,b";
		
		String infoAnimal = JOptionPane.showInputDialog(null, menu);

		if(isNull(infoAnimal)) {
			
			menuPrincipal();
			//System.exit(0);
			
		}
		return infoAnimal;
	}
	
	public static void main(String[] args) {

		Pato pato = null;
		Galinha galinha = null;
		Morcego morcego = null;
		Vaca vaca = null;
		
		int opcao1, opcao2;
		do{
			
			opcao1 = menuPrincipal();
			
			try {
				//dependendo da opcao, será criado 1 animal, o animal é determinado pelo parametro passado para
				//o metodo menuCriarAnimal. O retorno é dividido em 2 strings e armazenado em 1 vetor
				switch (opcao1) {
				
				case 1:
					String [] nomepato = menuCriarAnimal("Pato").split(",");
					pato = new Pato(Integer.parseInt(nomepato[0]), Double.parseDouble(nomepato[1]), "Branco");
					break;
				case 2:
					String [] nomegalinha = menuCriarAnimal("Galinha").split(",");
					galinha = new Galinha(Integer.parseInt(nomegalinha[0]), Double.parseDouble(nomegalinha[1]), "Marrom");
					break;
				
				case 3:
					String [] nomemorcego = menuCriarAnimal("Morcego").split(",");
					morcego = new Morcego(Integer.parseInt(nomemorcego[0]), Double.parseDouble(nomemorcego[1]), "Preto");
					break;
				
				case 4:
					String [] nomevaca = menuCriarAnimal("Vaca").split(",");
					vaca = new Vaca(Integer.parseInt(nomevaca[0]), Double.parseDouble(nomevaca[1]), "Marrom");
					vaca.EmitirSom();
					break;
				
				case 5:
					//exibir info pato
					if(pato == null) {
						JOptionPane.showMessageDialog(null, "O Pato ainda nao existe");
					}
					
					else {
						JOptionPane.showMessageDialog(null,
								"Informacoes do Pato"+
								"\n Idade: "+pato.getIdade()+
								"\n Tamanho: "+pato.getTamanho()+
								"\n Cor: "+pato.getCorPena()+
								"\n Som Emitido: "+pato.EmitirSom()+
								"\n Altura Voo: "+pato.Voar()+
								"\n O pato pode: "+pato.BotarOvo()
						);
					}
					
					break;
				case 6:
					//exibir info galinha
					if(galinha == null) {
						JOptionPane.showMessageDialog(null, "A Galinha ainda nao existe");
					}
					
					else {
						JOptionPane.showMessageDialog(null,
								"Informacoes da Galinha"+
								"\n Idade: "+galinha.getIdade()+
								"\n Tamanho: "+galinha.getTamanho()+
								"\n Cor: "+galinha.getCorPena()+
								"\n Som Emitido: "+galinha.EmitirSom()+
								"\n A galinha pode: "+galinha.BotarOvo()
						);
					}
					
					break;
				case 7:
					//exibir info morcego
					if(morcego == null) {
						JOptionPane.showMessageDialog(null, "O Morcego ainda nao existe");
					}
					
					else {
						JOptionPane.showMessageDialog(null,
								"Informacoes do Morcego"+
								"\n Idade: "+morcego.getIdade()+
								"\n Tamanho: "+morcego.getTamanho()+
								"\n Cor: "+morcego.getCorPelo()+
								"\n Som Emitido: "+morcego.EmitirSom()+
								"\n Altura Voo: "+morcego.Voar()+
								"\n O morcego pode: "+morcego.Amamentar()
						);
					}
					
					break;
				case 8:
					//exibir info vaca
					if(vaca == null) {
						JOptionPane.showMessageDialog(null, "A Vaca ainda nao existe");
					}
					
					else {
						JOptionPane.showMessageDialog(null,
								"Informacoes da Vaca"+
								"\n Idade: "+vaca.getIdade()+
								"\n Tamanho: "+vaca.getTamanho()+
								"\n Cor: "+vaca.getCorPelo()+
								"\n Som Emitido: "+vaca.EmitirSom()+
								"\n A vaca pode: "+vaca.Amamentar()
						);
					}
					
					break;
				case 9:
					System.exit(0);
					break;
				}
				
				
			}
			catch(Exception e) {

				JOptionPane.showMessageDialog(null, "Formato Invalido, insira a idade do pato e o tamanho separados por , ");

			}
			finally {
				opcao1 = 0;
			}
		
		}while(opcao1 != 6);

	}

}
