package banheiro;

public class princiapl {
	public static void main(String[] args) {
		
		banheiro banheiro  = new banheiro();
		
		Thread convidado1 = new Thread(new tarefaNum1(banheiro),"pessoa1 ");
		Thread convidado2 = new Thread(new tarefaNum2(banheiro),"pessoa2 ");
		Thread limpeza = new Thread(new tarefaNum3(banheiro),"limpeza ");
		limpeza.setDaemon(true);
//		Thread convidado4 = new Thread(new tarefaNum2(banheiro),"pessoa4 ");
//		Thread convidado5 = new Thread(new tarefaNum2(banheiro),"pessoa5 ");
		
		
		convidado1.start();
		convidado2.start();
		limpeza.start();
//		convidado4.start();
//		convidado5.start();
	}

}
