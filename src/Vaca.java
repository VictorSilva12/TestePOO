public class Vaca extends Mamifero{

	public Vaca (int idade, double tamanho, String corPelo) {
		
		super(idade, tamanho, corPelo);
		
	}
	
	@Override
	public String EmitirSom() {
		
		return "A vaca emite Mugidos";
		
	}
	
}
