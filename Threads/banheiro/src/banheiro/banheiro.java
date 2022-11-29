package banheiro;

public class banheiro {
	
	private boolean ESujo = true;

	public void fazNumero1() {

		String nome = Thread.currentThread().getName();
		
		System.out.println(nome + "batendo na porta");
		
		synchronized (this) {	

		System.out.println(nome + " entrando no banheiro");
		
		if(ESujo) {
			EsperaLaFora(nome);
		}
		
		System.out.println(nome + " fazendo coisa rapida");

		dorme(5000);
		
		this.ESujo = true;
		
		System.out.println(nome + " dando descarga");
		System.out.println(nome + " lavando a mao");
		System.out.println(nome + " saindo do banheiro");
	}
		}

	public void fazNumero2() {
		synchronized (this) {

		String nome = Thread.currentThread().getName();

		System.out.println(nome + " batendo na porta");

		synchronized (this) {

			System.out.println(nome + " entrando no banheiro");
			while(ESujo) {
				EsperaLaFora(nome);
			}
			System.out.println(nome + " fazendo coisa demorada");

			dorme(1000);
			
			this.ESujo = true;

			System.out.println(nome + " dando descarga");
			System.out.println(nome + " lavando a mao");
			System.out.println(nome + " saindo do banheiro");
			}
		}
	}



	private void dorme(long millis) {
		try {
			Thread.sleep(millis);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void limpa() {
		String nome = Thread.currentThread().getName();

		System.out.println(nome + " batendo na porta");

		synchronized (this) {
			System.out.println(nome + " limpando");
			
			while(!ESujo) {
				System.out.println(nome+"não está sujo");
				return;
			}
			this.ESujo = false;

			try {
				Thread.sleep(12000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			this.notifyAll();
			System.out.println(nome + " saindo do banheiro");
		}
	}
	
	private void EsperaLaFora(String nome) {
		System.out.println(nome + "Eca, banheiro sujo");
		try {
			this.wait();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}