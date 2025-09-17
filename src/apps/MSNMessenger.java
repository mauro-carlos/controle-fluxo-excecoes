package src.apps;

public class MSNMessenger extends ServicoMensagemInstantanea {

	@Override
	public void enviarMensagem() {
		validarConectadoInternet();
		System.out.println("Enviando Mensagem pelo MSN MEssenger");
		
	}

	@Override
	public void receberMensagem() {
		System.out.println("Recbebendo Mensagem pelo MSN MEssenger");
		
	}

	@Override
	public void salvarHistoricoMensagem() {
		System.out.println("Salvando Historion da Mensagem no MSN");
		
	}
	
	
	

}
