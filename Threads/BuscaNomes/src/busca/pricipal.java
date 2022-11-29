package busca;

public class pricipal {
	public static void main(String[] args) {
		
		String nome = "da";
		
		Thread assiantura1 = new Thread(new tarefaBusca("assinatura1", nome));
		Thread assiantura2 = new Thread(new tarefaBusca("assinatura2", nome));
		Thread autores = new Thread(new tarefaBusca("autores", nome));
		
		
		assiantura1.start();
		assiantura2.start();
		autores.start();
	
	}
	
}
