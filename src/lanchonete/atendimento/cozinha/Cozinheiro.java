package lanchonete.atendimento.cozinha;

import lanchonete.atendimento.Atendente;

public class Cozinheiro {
	
	public void adicionarLancheNoBalcao() {
		System.out.println("ADICIONANDO LANCHE NATURAL HAMBURGER NO BALCÃO");
	}
	
	public void adicionarSucoBalcao() {
		System.out.println("ADICIONANDO SUCO BALCÃO");
	}
	
	public void adiconarComboNoBalcao() {
		adicionarLancheNoBalcao();
		adicionarSucoBalcao();
		
	}
	
	private void prepararLanche() {
		System.out.println("PREPARANDO LANCHE TIPO HAMBURGUER");
	}
	
	private void prepararVitamina() {
		System.out.println("PREPARANDO SUCO");
	}
	
	private void prepararCombo() {		
		prepararLanche();
		prepararVitamina();
		
	}
	
	private void selecionarIngredientesLanche() {
		System.out.println("SELECIONANDO O PÃO, SALADA, OVO E CANE");
	}
	
	private void selecionarIngredientesVitamina() {
		System.out.println("SELECIONANDO FRUTA,  LEITE E SUCO");
	}
	
	private void lavarIngredientes() {
		System.out.println("LAVANDO INGREDIENTES");
	}
	private void baterVitaminaLiquidificador() {
		System.out.println("BATENDO VITAMINA NO LIQUIDIFICADOR");
	}
	
	public void fritarIngredientesLanche() {
		System.out.println("FRITANDO A CARNE E O OVO PARA O HAMBURGUER");
	}
	
//	public void pedirParaTrocarGas(Atendente meuAmigo) {
//		meuAmigo.trocarGas();
//		
//	}
	
	private void pedirParaTrocarGas(Almoxarife meuAmigo) {
		meuAmigo.trocarGas();
		
	}
	
	private void pedirIngredientes(Almoxarife meuAmigo) {
		meuAmigo.entregarIngredientes();
		
	}

}
