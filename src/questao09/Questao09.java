

package questao09;
import java.util.Scanner;

//Leia 15 números e os coloque em um array. Depois mostre o menor número lido e em
//quais índices ele aparece no array. Exemplo: no array {3,5,2,7,4,2,9,5}, o menor
//número é o 2 e aparece nas posições 3 e 6.

public class Questao09 {

   
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int maior = 0, menor = 10000, aux;
        int num[] = new int[15];

        for (int i = 0; i < 4; i++){
        System.out.println("Informe o numero: ");
        num[i] = ler.nextInt();
        aux=num[i];
        if(menor>aux){
            menor = num[i];
        }
        if(maior < aux){
            maior = num[i];
        }
        
    }
        System.out.println("maior:" +maior+ " menor: " +menor);
    }
    
}
