package ListaT;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class principal {
public static void main(String[] args) throws InterruptedException {
	
	
	List<String> lista = Collections.synchronizedList(new ArrayList<String>());
	//List<String> lista = new Vector<String>();
	
	for (int i = 0;i<10;i++) {
		new Thread(new TarefaAdicionarElemento(lista,i, i)).start();
		}
	Thread.sleep(2000);
	
	for (int i = 0; i < lista.size(); i++) {
		System.out.println(i+" - "+lista.get(i));
		
	}
	}
}
