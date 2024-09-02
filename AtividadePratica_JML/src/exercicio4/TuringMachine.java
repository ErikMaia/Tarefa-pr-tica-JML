package exercicio4;

public class TuringMachine {
    
    private char[]       alphabet;
    private char[]       auxiliaryAlphabet;
    private char[]       tape;
    private int          head;
    private String[]     states;
    private String       currentState;
    private String       initialState;
    private String[]     finalStates;
    private Transition[] transitions;

    //  invariantes de classe
    
    // Invariante para o alfabeto: o alfabeto deve conter pelo menos um símbolo
    // @ invariant alphabet.length > 0;
    
    // Invariante para a cabeça de leitura: a posição da cabeça deve ser maior ou igual a zero
    // @ invariant head >= 0;

    // Adicione invariantes para outros atributos da máquina de Turing,
    // como fita, estados finais, etc.

    
    public TuringMachine(String[] states, String initialState, String[] finalStates, char[] alphabet){
        this.states       = states;
        this.currentState = initialState;
        // .....
    }
    
    /**
     * A fita deve conter a entrada a ser processada e a entrada deve ser definida a partir 
     * do alfabeto da entrada. 
     */
    // Pré-condição: cada símbolo na entrada deve pertencer ao alfabeto da máquina
    // @ requires (\forall int i; i>=0 && i<input.length(); (\exists int j;   input[i]) == alphabet[j] );
    // Pós-condição: o estado atual deve ser igual ao estado inicial e ... (adicione outras pós-condições)
    // @ ensures  currentState == initialState && .... ;
    public void start(char[] input){

    }
    
    /**
     * Simula um passo da máquina de Turing.
     *  
     */
    // Pré-condição: a máquina deve estar em um estado válido (existe um estado no conjunto de estados)
    // @ requires (\exists int i; states[i] == currentState;);
    // Pós-condição: o estado atual pode ser diferente do estado inicial
    // @ ensures  current != currentState;
    public boolean step(){
        
    }
     
     /**
      * Determina se a máquina de Turing aceita a entrada. 
      *  
      */
    // Pré-condição: sempre verdadeira
    // @ requires true;
    // Pós-condição: precisa ser definida de acordo com a lógica de aceitação da máquina de Turing
    // (por exemplo, o estado atual deve ser um estado final)
    // @ ensures  ????;
    public boolean accept(){
        
    }
    
    /**
     * Determina se a máquina de Turing rejeita a entrada.
     *  
     */
    // Pré-condição: precisa ser definida de acordo com a lógica de rejeição da máquina de Turing
    // (por exemplo, a máquina não pode ficar presa em um loop infinito)
    // @ requires ????;
    // Pós-condição: precisa ser definida de acordo com a lógica de rejeição da máquina de Turing
    /*  @ ensures (\forall Transition t; t in transitions; 
            !(t.getCurrentState().equals(currentState) && 
			t.getSymbol() == tape[head]));
    */
			  public boolean reject(){
        
    }

}