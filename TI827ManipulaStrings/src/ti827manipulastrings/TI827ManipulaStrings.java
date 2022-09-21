

package ti827manipulastrings;

import java.util.Scanner;


public class TI827ManipulaStrings {

    public static Scanner ler = new Scanner(System.in);
    public static void main(String[] args) {
       int op;
      
       do{
           System.out.println(">>>>>>>>>>MENU<<<<<<<<<<");
           System.out.println("1 - Tamanho String");
           System.out.println("2 - Árvore de letras");
           
           System.out.println("0 - Sair");
           System.out.println("Insira a opção pretendida");
           op=ler.nextInt();
           switch(op){
               case 0: break;
               case 1: 
                   System.out.println("A string Inserida tem: "+
                           ExerciciosStrings.contaCaracteres()+" caracteres"); 
                   /*
                   int t = ExerciciosStrings.contaCaracteres();
                   System.out.println("A string Inserida tem: "+t+" caracteres");
                   */
                   break;
               case 2: ExerciciosStrings.arvoreCharAt(); break;
               default: 
                   System.out.println("Insira opção válida");
           }
       }while(op!=0);
    }

}
