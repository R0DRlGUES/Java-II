package banheiro;

public class tarefaNum2 implements Runnable {
	
	private banheiro banheiro;
	
	
	public tarefaNum2(banheiro banheiro) {
		super();
		this.banheiro = banheiro;
	}


	@Override
	public void run() {
		banheiro.fazNumero2();
		
		
		
		
	}

}
