package strategypattern;

public class app {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Veiculo carro = new Veiculo (new Gasolina());
		Veiculo moto = new Veiculo (new Etanol());
		Veiculo caminhao = new Veiculo (new Diesel());
		
		carro.combustivel();
		moto.combustivel();
		caminhao.combustivel();
	}

}
