
// Um array é uma lista ordenada de elementos
// Como de fosse uma coluna de uma tabela
// Aqui trabalhamos com arrays vetores

package arraysvetores;

public class ArraysVetores {

    public static void main(String[] args) {
        // ao invez disso:
        double tempDia001 = 31.3;
        double tempDia002 = 32;
        double tempDia003 = 33.7;
        double tempDia004 = 34;
        double tempDia005 = 33.1;
        // utilizamos arrays assim:
        
        // Criando um array
        double [] temperaturas = new double [365];
        temperaturas [0] = 31.3;
        temperaturas [1] = 32;
        temperaturas [2] = 33.7;
        temperaturas [3] = 34;
        temperaturas [4] = 33.1;
        // buscando o valor de um array
        System.out.println("A temperatura do dia 1 is: " + temperaturas [0]);
        // descobrindo o tamanho de um array
        System.out.println("O tamanho do array is: " + temperaturas.length);
        // endereço de memoria do array
        System.out.println("Valores do array: " + temperaturas);
        
        // metodo para acessar todos os valores de um array
        //e fazer a contagem
        for (int i = 0 ; i < temperaturas.length ; i++){
        System.out.println("O valor da temperatura do dia " + (i+1) + " is: " + temperaturas[i]);
        }
        // for melhorado
        // aqui podemos acessar todos os valores de um array
        //porém não é possivel fazer a contagem
        for (double temp : temperaturas){
            System.out.println(temp);
    }
        
 
    }
    
}
