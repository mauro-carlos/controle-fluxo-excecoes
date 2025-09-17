package src;

import src.apps.FacebookMessenger;
import src.apps.MSNMessenger;
import src.apps.ServicoMensagemInstantanea;
import src.apps.Telegram;

public class ComputadorPedrinho {

	public static void main(String[] args) {
		
		ServicoMensagemInstantanea smi = null;
		
		
		String appEscolhido = "msn";
		
		if (appEscolhido.equals("msn"))
			smi = new MSNMessenger();
		
		if (appEscolhido.equals("fcb"))
			smi = new FacebookMessenger();
		
		if (appEscolhido.equals("tlg"))
			smi = new Telegram();
		
		smi.enviarMensagem();
		smi.receberMensagem();
		smi.salvarHistoricoMensagem();
		
		
		
//		System.out.println("MSN");
//		MSNMessenger msn = new MSNMessenger();
//		msn.enviarMensagem();
//		msn.receberMensagem();
//		System.out.println("------------");
//
//		System.out.println("FACEBOOK");
//		FacebookMessenger fcb = new FacebookMessenger();
//		fcb.enviarMensagem();
//		fcb.receberMensagem();
//		System.out.println("------------");
//
//		System.out.println("TELEGRAM");
//		Telegram tlg = new Telegram();
//		tlg.enviarMensagem();
//		tlg.receberMensagem();
//		System.out.println("------------");

	}

}
