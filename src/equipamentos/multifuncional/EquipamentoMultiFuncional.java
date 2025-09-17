package src.equipamentos.multifuncional;

import src.equipamentos.copiadora.Copiadora;
import src.equipamentos.digitalizadora.Digitalizadora;
import src.equipamentos.impressora.Impressora;

public class EquipamentoMultiFuncional implements Copiadora, Digitalizadora, Impressora  {

	@Override
	public void copiar() {
		System.out.println("COPIANDO VIA EQUIPAMENTO MULTI FUNCIONAL");
		
	}

	@Override
	public void digitalizar() {
		System.out.println("DIGITALIZANDO VIA EQUIPAMENTO MULTI FUNCIONAL");
		
	}

	@Override
	public void imprimir() {
		System.out.println("IMPRIMINDO VIA EQUIPAMENTO MULTI FUNCIONAL");
		
	}

}
