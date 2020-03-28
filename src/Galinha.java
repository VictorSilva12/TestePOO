public class Galinha extends Ave {

	public Galinha (int idade, double tamanho, String corPena) {

		super(idade, tamanho, corPena);

	}
	
	@Override
	public String EmitirSom() {
		
		return "A galinha emite Cacarejos";
		
	}

}
