package exercicio3;

public abstract class Peca {
	
	// P para preta e B para Branca
	private char      cor;
	private int       linha, coluna;
	private Tabuleiro tabuleiro;
	
    /**  invariantes de classe **/
	// @ invariant cor == "P" || cor == "B";
    // @ invariant linha > 0 && linha < 8;
    // @ invariante coluna > 0 && coluna < 8;
	
	
	/**
     * Verifica se a nova posi��o est� desocupada ou est� 
     * ocupada por uma pe�a do advers�rio 
     *  
     */
    //@ requires novaLinha >= 0 &&  novaLinha < 8;
    //@ requires novaColuna >= 0 &&  novaColuna < 8;
    //@ ensures  \result == (tabuleiro.tabuleiro[novaLinha][novaColuna] == NULL) || tabuleiro.tabuleiro[novaLinha][novaColuna].cor != tabuleiro.jogadorDaVez;
	public abstract boolean validaMovimento(int novaLinha, int novaColuna);
	


}
