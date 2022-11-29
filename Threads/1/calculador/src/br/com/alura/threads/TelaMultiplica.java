package threads;

public class TelaMultiplica {

	public class TarefaMultiplicacao implements Runnable {

	    private JTextField primeiro;
	    private JTextField segundo;
	    private JLabel resultado;

	    public TarefaMultiplicacao(JTextField primeiro, JTextField segundo, 
	JLabel resultado) {
	        this.primeiro = primeiro;
	        this.segundo = segundo;
	        this.resultado = resultado;
	    }

	    @Override
	    public void run() {

	    	TarefaMultiplicacao tarefa = new TarefaMultiplicacao(primeiro, segundo, resultado);
	    	Thread threadMultiplicador = new Thread(tarefa);
	    	threadMultiplicador.start();
	    	
	        long valor1 = Long.parseLong(primeiro.getText());
	        long valor2 = Long.parseLong(segundo.getText());
	        BigInteger calculo = new BigInteger("0");

	        for (int i = 0; i < valor1; i++) {
	            for (int j = 0; j < valor2; j++) {
	                calculo = calculo.add(new BigInteger("1"));
	            }
	        }

	        resultado.setText(calculo.toString());
	    }
	}
