package ListaT;

import java.util.List;

public class TarefaAdicionarElemento implements Runnable {
	private List <String> lista;
	private int numeroDoThread;
	
	public TarefaAdicionarElemento(List <String> lista, int i,int numeroDoThread) {
		this.lista = lista;
		this.numeroDoThread = numeroDoThread;
	}

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			lista.add("Threads "+ numeroDoThread+" - "+ i);
		}

		
		
		
		
	}

}
