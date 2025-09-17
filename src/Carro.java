package src;

public class Carro extends Veiculo{
	
	

	public void ligar() {
		confereCombustivel();
		confereCambio();

		System.out.println("CARRO LIGADO");

	}

	private void confereCombustivel() {
		System.out.println("COMBUSTIVEL CONFERIDO");
	}

	private void confereCambio() {
		System.out.println("CAMBIO CONFERIDO em P");
	}

}
