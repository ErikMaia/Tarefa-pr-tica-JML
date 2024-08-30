package exercicio4;

public class Transition {
	
	// atributos
	
	// estado corrente da máquina
	private String state;
	// símbolo sob a cabeça de leitura da máquina 
	private char   symbol;
	// estado resultante da transição
	private String targetState;
	// simbolo a ser gravado na fita
	private char   symbolGravado;
		
	// movimentação da cabeça de leitura (D para direita e E para esquerda)
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
