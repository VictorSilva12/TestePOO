public abstract class Animal {
	//todo animal tem incomum esses atributos
	private int Idade;
	private double Tamanho;
	
	public Animal(int idade, double tamanho) {
		this.Idade = idade;
		this.Tamanho = tamanho;
		
	}
	
	protected int getIdade() {
		return Idade;
	}

	protected double getTamanho() {
		return Tamanho;
	}
	
	protected String EmitirSom() {
		return "";
	}
		
}
