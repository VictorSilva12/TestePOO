public class Morcego extends Mamifero implements Animal_Aereo{

	public Morcego(int idade, double tamanho, String corPelo) {
		
		super(idade, tamanho, corPelo);
		
	}
	
	@Override
	public String Voar() {
		
		return "O voo do morcego pode ser realizado a uma altura de 0,5 m a 10 m de altura";
		
	}
	
	@Override
	public String EmitirSom() {
		
		return "O morcego emite Farfalhos";
		
	}

}
