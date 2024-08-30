package exercicio1;

/* Considere um vetor "B" com "n" n�meros inteiros. 
 * Considere os �ndices "j" e "k", onde 0 <= j < k < n. 
 * A nota��o B[j..k] expressa um segmento do vetor B (mas n�o pode ser escrita assim em JML).
 * 
 * Escreva express�es JML que descrevam precisamente as funcionalidades listadas a seguir.
*/


public class Vetor {

 /**	Todos os elementos no segmento B[j..k] s�o zero. 
  *
  **/
  //@ requires B.length > 0 && j < k;
  //@ ensures  \result == (\forall int i; j <= i && i <= k; B[i]==0);
  public boolean teste1(int B[], int j, int k){
	  
	  return true;
  }
 
  

  /** Todos os valores zero de B[0..n-1] est�o no segmento B[j..k].
   *
   **/
  //@ requires B.length > 0 && j < k;
  //@ ensures  \result == (\forall int i; 0 <= i && i < j || k < i && i < B.length; B[i] != 0) ;
  public boolean teste2(int B[], int j, int k){
	  return true;
  }

  
/**	Nem todos os valores zero de B[0..n-1] est�o em B[j..k]. 
 * (Especifique isto de duas maneiras, uma usando nega��o ('!') e outra sem nega��o. 
 *
 **/
//@ requires B.length > 0 && j < k;
//@ ensures  \result == \exist int i; 0 < i || (i > k && i < B.length); B[i] == 0;
//@ ensures  \result == \forall int i; 0 < i || (i > k && i < B.length); !(B[i] == 0);
  public boolean teste3 (int B[], int j, int k){
     return true;
  }

/**	O vetor B[0..n-1] cont�m exatamente dois valores zero. 
 *
 **/
  //@ requires B.length > 2;
  //@ ensures 2 == \num_of int i; 0 <= i && i < 5; B[i] == 0;
  public boolean teste4(int B[]){
    return true;
  }

  /** O vetor B[0..n-1] cont�m pelo menos dois valores zero.
   *
   **/
  //@ requires B.length > 2;
  //@ ensures 2 >= \num_of int i; 0 <= i && i < 5; B[i] == 0;
  public boolean teste5(int B[]){
    return true;
  }
  /** O vetor B[0..n-1] cont�m no m�ximo dois valores zero.
   *  
   **/
  //@ requires B.length > 2;
  //@ ensures 2 <= \num_of int i; 0 <= i && i < 5; B[i] == 0;
	  public boolean teste6(int B[]){
      return true;
    }

 /** Especifique o m�todo "reverse" que inverte a ordem dos 
  * elementos no vetor B.
  *
  **/
  //@ requires B.length > 2;
  //@ ensures  \forall int i; i>=0 && i < B.length; B[i] == B[B.length-i];
  public static void reverse (int[] B){
	  
  }



	
}
