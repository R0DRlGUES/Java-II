package busca;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class tarefaBusca implements Runnable {
	
	private String nomeDoArquivo;
	private String nome;
	public tarefaBusca(String nomeDoArquivo, String nome) {
		this.nomeDoArquivo = nomeDoArquivo;
		this.nome = nome;
		
	}
	@Override
	public void run() {
		int numLinha=1;
		try {
			Scanner J = new Scanner(new File(nomeDoArquivo));
			//enquanto existe uma prox linha
			while(J.hasNextLine()) {
				String linha = J.nextLine();
				//se linha contem nome
				if(linha.toLowerCase().contains(nome.toLowerCase())) {
					System.out.println(nomeDoArquivo+" - "+" N° "+numLinha+" - "+linha);
				}
				numLinha++;	
			}
			
			
			J.close();
		} catch (FileNotFoundException e) {
			throw new RuntimeException(e) ;
		}
		// TODO Auto-generated method stub

	}

}
