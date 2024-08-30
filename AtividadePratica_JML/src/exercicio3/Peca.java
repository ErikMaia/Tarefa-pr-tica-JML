package exercicio3;

public abstract class Peca {
	
	// P para preta e B para Branca
	private char      cor;
	private int       linha, coluna;
	private Tabuleiro tabuleiro;
	
    /**  invariantes de classe **/
	//@ invariant cor == "P" || cor == "B";
    //@ .....
	
	
	/**
     * Verifica se a nova posição está desocupada ou está 
     * ocupada por uma peça do adversário 
     *  
     */
    //@ requires ????;
    //@ ensures  \result == tabuleiro[novaLinha][novaColuna] == NULL && ????;
	public boolean abstract validaMovimento(int novaLinha, int novaColuna);
	


}
