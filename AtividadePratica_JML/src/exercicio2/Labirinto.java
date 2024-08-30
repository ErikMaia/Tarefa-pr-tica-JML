package exercicio2;

public class Labirinto {

  public final static int MOVE_ACIMA    = 0;
  public final static int MOVE_ABAIXO   = 1;
  public final static int MOVE_ESQUERDA = 2;
  public final static int MOVE_DIREITA  = 3;


  public final static int LIVRE  = 0;
  public final static int PAREDE = 1;
  public final static int SAIDA = 2;

  /**
   * O labirinto � formado por uma matriz retangular na qual:
   *
   *   - As paredes s�o representadas pelas posi��es com o valor Labirinto.PAREDE ('1')
   *   - A sa�da � representadas pelas posi��es com o valor Labirinto.SAIDA ('2')
   *   - Todas as outras posi��es s�o livres, Labirinto.LIVRE ('0')
   */
  private int[][] labirinto;

  /**
   * Posi��o do jogador:
   *
   *   - A posi��o do jogador deve sempre ser uma c�lula dentro do labirinto que n�o seja parede.
   */
  private int linhaJogador, colunaJogador;
  

  public Labirinto(int[][] labirinto, int linhaInicio, int colunaInicio) {
    this.labirinto = labirinto;
    // indica a posicao atual do jogador
    this.linhaJogador = linhaInicio;
    this.colunaJogador = colunaInicio;
  }

  /**
   * Retorna true se o jogador alcan�ou a sa�da do labirinto
   */
  public boolean venceu() {
    throw new RuntimeException();
  }

  /**
   * O movimento para a posi�ao (novaLinha, novaColuna) � poss�vel se estiver dentro das 
   * dimens�es do labirinto e estiver livre (n�o � uma parede)
   */
  public boolean movimentoPossivel(int novaLinha, int novaColuna) {
    throw new RuntimeException();
  }

  /**
   * A partir da dire��o dada, realiza o movimento se for poss�vel, 
   * caso contr�rio o jogador fica na mesma posi��o.
   * A dire��o deve ser uma daquelas definidas (veja as constantes MOVE_xyz).
   * O valor de retorno indica se o movimento foi realizado.
   */
  
  /*@ requires direcao == Labirinto.MOVE_ACIMA && this.linhaJogador
   * 
   */
  public boolean move(int direcao) {
    throw new RuntimeException();
  }
}
