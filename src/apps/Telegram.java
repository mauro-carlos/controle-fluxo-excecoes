package src.apps;

public class Telegram extends ServicoMensagemInstantanea{

	@Override
	public void enviarMensagem() {
		validarConectadoInternet();
		System.out.println("Enviando Mensagem pelo Telegram");
		
	}

	@Override
	public void receberMensagem() {
		System.out.println("Recebendo Mensagem pelo Telegram");
		
	}

	@Override
	public void salvarHistoricoMensagem() {
		System.out.println("Salvando Historion da Mensagem no Telegram");
		
	}
	
	

}
