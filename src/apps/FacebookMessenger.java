package src.apps;

public class FacebookMessenger extends ServicoMensagemInstantanea{

	@Override
	public void enviarMensagem() {
		validarConectadoInternet();
		System.out.println("Enviando Mensagem pelo Facebook");
		
	}

	@Override
	public void receberMensagem() {
		System.out.println("Enviando Mensagem pelo Facebook");
		
	}

	@Override
	public void salvarHistoricoMensagem() {
		System.out.println("Salvando Historion da Mensagem no Facebook");
		
	}
	
	
}
