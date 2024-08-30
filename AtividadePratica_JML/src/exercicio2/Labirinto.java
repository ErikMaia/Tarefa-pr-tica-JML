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
   * O labirinto é formado por uma matriz retangular na qual:
   *
   *   - As paredes são representadas pelas posições com o valor Labirinto.PAREDE ('1')
   *   - A saída é representadas pelas posições com o valor Labirinto.SAIDA ('2')
   *   - Todas as outras posições são livres, Labirinto.LIVRE ('0')
   */
  private int[][] labirinto;

  /**
   * Posição do jogador:
   *
   *   - A posição do jogador deve sempre ser uma célula dentro do labirinto que não seja parede.
   */
  private int linhaJogador, colunaJogador;
  

  public Labirinto(int[][] labirinto, int linhaInicio, int colunaInicio) {
    this.labirinto = labirinto;
    // indica a posicao atual do jogador
    this.linhaJogador = linhaInicio;
    this.colunaJogador = colunaInicio;
  }

  /**
   * Retorna true se o jogador alcançou a saída do labirinto
   */
  public boolean venceu() {
    throw new RuntimeException();
  }

  /**
   * O movimento para a posiçao (novaLinha, novaColuna) é possível se estiver dentro das 
   * dimensões do labirinto e estiver livre (não é uma parede)
   */
  public boolean movimentoPossivel(int novaLinha, int novaColuna) {
    throw new RuntimeException();
  }

  /**
   * A partir da direção dada, realiza o movimento se for possível, 
   * caso contrário o jogador fica na mesma posição.
   * A direção deve ser uma daquelas definidas (veja as constantes MOVE_xyz).
   * O valor de retorno indica se o movimento foi realizado.
   */
  
  /*@ requires direcao == Labirinto.MOVE_ACIMA && this.linhaJogador
   * 
   */
  public boolean move(int direcao) {
    throw new RuntimeException();
  }
}
