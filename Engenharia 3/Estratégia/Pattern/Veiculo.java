package strategypattern;


public class Veiculo {
	private Combustivel combustivel = new Diesel();
	private Combustivel combustivel2 = new Etanol();
	private Combustivel combustivel3 = new Gasolina();

	public Veiculo(Gasolina gasolina) {
		// TODO Auto-generated constructor stub
	}

	public Veiculo(Etanol etanol) {
		// TODO Auto-generated constructor stub
	}

	public Veiculo(Diesel diesel) {
		// TODO Auto-generated constructor stub
	}

	public void combustivel(){
		
		this.combustivel.Tipo();
		this.combustivel2.Tipo();
		this.combustivel3.Tipo();
	}
}
