package banheiro;

public class tarefaNum3 implements Runnable {
	
	private banheiro banheiro;

	public  tarefaNum3(banheiro banheiro) {
		this.banheiro = banheiro;
	}
	@Override
	public void run() {
		while(true) {
			banheiro.limpa();
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			};	
		}
	}
}
