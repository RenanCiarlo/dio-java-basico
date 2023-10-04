public class Operadores{
    public static void main(String[] args) {
        boolean condicao1=true;

        boolean condicao2=false;

         if(condicao1 && (7 > 4 )){
            System.out.println("as duas condicões são verdadeiras");
         }

         if(condicao1 || condicao2){
              System.out.println("uma condião é verdadeira");
         }
         // && Operador Lógico "E"
         // || Operador Lógico "OU"

         


        /*Exemplo de if else mais pratico:
         int a,b;
         a = 5;
         b = 6;

         String resultado = a==b ?"verdadeiro" : "falso"; (o String sempre vai esperar um resultado"boolean")
         Caso for um "Int" = int resultado = a == b ? 1 : 0; 

         "==" é para quando desejamos verificar se uma variável é IGUAL a outra.
         != é para quando desejamos verificar se uma variável é DIFERENTE da outra.
         <= menor ou igual a outra.
         >= Maior ou Igual. 
                                            

         System.out.println(resultado)
         'falso'

         */

        

    }
}