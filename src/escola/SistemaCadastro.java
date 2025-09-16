package escola;

public class SistemaCadastro {
	
	public static void main(String[] args) {
		
		
		
		
		Pessoa marcos = new Pessoa("FELIPE" , "222222-22");
		
		Pessoa junior = new Pessoa("Junior");
		
		
		marcos.setEndereco("RUA DAS MARIAS");
		
		
		System.out.println(marcos.getNome() + "-" + marcos.getCpf());
		System.out.println(junior.getNome());
		
	}

}
