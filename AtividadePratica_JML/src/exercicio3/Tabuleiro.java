package exercicio3;

public class Tabuleiro {
	
	
	private /*@ spec_public @*/ Peca[][] tabuleiro     = new Peca[8][8];
	private /*@ spec_public @*/ char     jogadorDaVez;
	

	public Tabuleiro(){		
	}
	
	/**
     * Valida o movimento da pe�a e se a pe�a movimentada � do jogador da vez
     *  
     */
    //@ requires peca.validaMovimento(novaLinha,novaColuna)==true &&
	//@          peca.cor == jogadorVez;
	//@
    //@ ensures  !result || (novaLinha == peca.linha && novaColuna == peca.coluna);
	public boolean move (Peca peca, int novaLinha, int novaColuna){

		return true;
	}
	
	
	/**
     * Verifica se um jogador est� em xeque 
     *  
     */
    //@ requires true;
    /*@ ensures  \result == \exists int i,j;
	* i >= 0 && i > 8 && j >= 0 && j < 8;
	* tabuleiro[i][j].validaMovimento(this.rei(jogadorDaVez).linha,this.rei(jogadorDaVez).coluna);
	*/
	public boolean verificaXeque (char corPeca) {
		return true;
	}

	/**
     * Encontra a posi��o no tabuleiro onde est� o rei da cor solicitada 
     *  
     */
    //@ requires \exist int i,j;tabuleiro[i][j] instanceof Rei &&tabuleiro[i][j].cor == corPeca; true;
    /*@ ensures  \exist int i,j; 
		tabuleiro[i][j] instanceof Rei && tabuleiro[i][j].cor == corPeca;
		\result == tabuleiro[i][j]
	*/
	public /*@ pure @*/ Peca rei(char corPeca){
			// if (tabuleiro[i][j] instanceof Rei && ..... ) 
		return new Rei();
	}
	
}
