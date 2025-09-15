package lanchonete;

import lanchonete.area.cliente.Cliente;
import lanchonete.atendimento.Atendente;

import lanchonete.atendimento.cozinha.Cozinheiro;




public class Estabelecimento {

	public static void main(String[] args) {
		Cozinheiro cozinheiro = new Cozinheiro();
		//açoes que não precisam estarem disponiveis para toda a aplicação
//		cozinheiro.lavarIngredientes();
//		cozinheiro.baterVitaminaLiquidificador();
//		cozinheiro.selecionarIngredientesVitamina();
//		cozinheiro.prepararLanche();
//		cozinheiro.prepararVitamina();
//		cozinheiro.prepararCombo();
		
		//açoes que estabelecimento precisa ter ciencia
		cozinheiro.adicionarSucoBalcao();
		cozinheiro.adicionarLancheNoBalcao();
		cozinheiro.adiconarComboNoBalcao();
		
//		Almoxarife almoxarife = new Almoxarife();
		//ações que não precisam estarem disponiveis para toda a aplicação
//		almoxarife.controlarEntrada();
//		almoxarife.controlarSaida();		
//		ação que somente o seu pacote cozinha precisa conhecer(default)
//		almoxarife.entregarIngredientes();
//		almoxarife.trocarGas();
		
		Atendente atendente = new Atendente();
//		atendente.pegarLancheCozinha();
		atendente.receberPagamento();
		atendente.servindoMesa();
		//ação que somente o seu pacote cozinha precisa conhecer (default)
//		atendente.trocarGas();
		
		Cliente cliente = new Cliente();
		cliente.escolherLanches();
		cliente.fazerPedido();
		cliente.pagarConta();
		
		//não deveria, mas o estabelecimento
		//ainda não definiu normas de atendimento
//		cliente.pegarPedidoBalcao();
		
		//esta ação é muito sigilosa, que tal ser privada ?
//		cliente.consultarSaldoAplicativo();
		
		//já pensou o cliente ouvindo que o Gas acabou?
//		cozinheiro.pedirParaTrocarGas(atendente);
//		cozinheiro.pedirIngredientes(almoxarife);
		
		
				
		
		
		

	}

}
