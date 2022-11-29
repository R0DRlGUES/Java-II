package banheiro;

public class tarefaNum1 implements Runnable {
	
	private banheiro banheiro;
	
	
	public tarefaNum1(banheiro banheiro) {
		super();
		this.banheiro = banheiro;
	}


	@Override
	public void run() {
		banheiro.fazNumero1();
		
		
		
		
	}

}
