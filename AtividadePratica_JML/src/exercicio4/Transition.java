package exercicio4;

public class Transition {
	
	// atributos
	
	// estado corrente da m�quina
	private String state;
	// s�mbolo sob a cabe�a de leitura da m�quina 
	private char   symbol;
	// estado resultante da transi��o
	private String targetState;
	// simbolo a ser gravado na fita
	private char   symbolGravado;

	private String currentState; 
		
	// movimenta��o da cabe�a de leitura (D para direita e E para esquerda)
    private char   moviment;

    public Transition(String cs, char s, String ts, char m){
    	currentState = cs;
    	symbol       = s;
    	targetState  = ts;
    	moviment     = m;
    }

	public String getCurrentState() {
		return currentState;
	}

	public char /*@ pure @*/ getSymbol() {
		return symbol;
	}

	public String getTargetState() {
		return targetState;
	}

	public char getMoviment() {
		return moviment;
	}
}
