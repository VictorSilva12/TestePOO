
public abstract class Mamifero extends Animal {
	//construtor classe mamifero, utiliza o construtor da classe animal para criar o objeto
	private String corPelo;
	public Mamifero(int idade, double tamanho, String corPelo) {
		
		super(idade, tamanho);
		this.corPelo = corPelo;
	}
	//o mamifero pode amamentar
	public String Amamentar() {
		
		return "Amamentar";
		
	}
	
	public String getCorPelo() {
		return corPelo;
	}

}
