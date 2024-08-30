package exercicio3;

public class Tabuleiro {
	
	
	private Peca[][] tabuleiro     = new Peca[8][8];
	private char     jogadorDaVez;
	

	public Tabuleiro(){		
	}
	
	/**
     * Valida o movimento da peça e se a peça movimentada é do jogador da vez
     *  
     */
    //@ requires peca.validaMovimento(novaLinha,novaColuna)==true &&
	//@          peca.cor == jogadorVez;
	//@
    //@ ensures  ????;
	public boolean move (Peca peca, int novaLinha, int novaColuna){

		return true;
	}
	
	
	/**
     * Verifica se um jogador está em xeque 
     *  
     */
    //@ requires ????;
    //@ ensures  \result == ??? 
	public boolean verificaXeque (char corPeca) {
		
	}

	/**
     * Encontra a posição no tabuleiro onde está o rei da cor solicitada 
     *  
     */
    //@ requires ????;
    //@ ensures  ????
	public /*@ pure @*/ Peca rei(char corPeca){
			if (tabuleiro[i][j] instanceof Rei && ..... ) 
	}
	
}
