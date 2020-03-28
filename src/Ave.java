
public abstract class Ave extends Animal {
	//construtor classe ave, utiliza o construtor da classe animal para criar o objeto
	private String corPena;

	public Ave(int idade, double tamanho, String corPena) {
		super(idade, tamanho);
		this.corPena = corPena;
	}
	//a ave pode botar ovos
	public String BotarOvo() {
		
		return "Botar ovo";
		
	}
	//aves possuem pena
	public String getCorPena() {
		return corPena;
	}

	
}
