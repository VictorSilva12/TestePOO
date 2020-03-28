public class Pato extends Ave implements Animal_Aereo{

	public Pato(int idade, double tamanho, String corPena) {
		
		super(idade, tamanho, corPena);
		
	}
	
	@Override
	public String Voar() {
		
		return "O pato pode voar a ate 6.8 metros de altura";
		
	}
	
	@Override
	public String EmitirSom() {
		
		return "O pato emite Grasnidos";
		
	}

}
