package treinamentoJAVA;

    public class treinamentoLacos 
{
    public static void main(String[] args) throws Exception 
    {
//---Estruturas de Repetição
//------WHILE-----//
/* Contador crescente usando while */
int contador = 0, contagem=100;
while (contador<=50)
{
    System.out.println(contador);
    contador=contador+1; // ou contador++;
}

/* Contador descrescente usando while*/
while(contagem>=50)
{
    System.out.println("\n"+contagem);
    contagem--; // ou contagem = contagem-1 ou contagem=-1
}

//------DO WHILE----//
/*O WHILE faz a verificação no início do laço em questão, 
enquanto o DO WHILE faz uma verificação no final do laço de repetição. 
->Com isso, o DOWHILE executa no mínimo uma vez antes de verificar*/
float decimal=0; 
//O float tem uma capacidade de 7 dígitos decimais e 32bits,
// já o double tem o dobro de tamanho em bits(64), e suporta o dobro de dígitos decimais  (15)
do{                 
    System.out.println(decimal);
    decimal=decimal+1;
}while (decimal<=50);

//-------FOR-------//
/*A formatação do FOR é: 
 * for(>valor inicial da variável de contagem<; >condição a ser analisada no contador<; >forma de avanço depois da verificação condicional)
 * -> forma de avanço depois da verificação condicional == depois de passar na condição, a próxima a ser avaliada será crescente, decrescente, produto ou divisão
 */

 for (int i=20; i>=0; i--)
 {
    System.out.println(i);
 }
    }
}