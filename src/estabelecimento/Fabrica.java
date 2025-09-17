package src.estabelecimento;

import src.equipamentos.copiadora.Copiadora;
import src.equipamentos.digitalizadora.Digitalizadora;
import src.equipamentos.digitalizadora.Scanner;
import src.equipamentos.impressora.DeskJet;
import src.equipamentos.impressora.Impressora;
import src.equipamentos.multifuncional.EquipamentoMultiFuncional;


public class Fabrica {
	
	public static void main(String[] args) {
		EquipamentoMultiFuncional em = new EquipamentoMultiFuncional();	
		
		Scanner scanner = new Scanner();
		
		
//		Impressora impressora = scanner;
		Digitalizadora digitalizadora = scanner;
//		Copiadora copiadora = scanner;
		
		
//	impressora.imprimir();
	digitalizadora.digitalizar();
//	copiadora.copiar();
		
		
		
	}

}
