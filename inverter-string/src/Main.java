//Importando Scanner
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Criando um objeto Scanner
        Scanner scanner = new Scanner(System.in);

        //Recebendo a String e chamando a função que inverte a ordem dos caracteres
        System.out.println("Digite uma String: ");
        String str = scanner.nextLine();
        String strInvertida = inverterString(str);

        //Imprimindo a String inserida pelo usuário e a String invertida
        System.out.println("String inserida: "+ str);
        System.out.println("String invertida: "+ strInvertida);

    }
    //Função que inverte a ordem dos caracteres da String
    public static String inverterString(String str){
        int tam = str.length();
        char[] caracteres = str.toCharArray();

        for (int i = 0; i < tam / 2; i++) {
            char temp = caracteres[i];
            caracteres[i] = caracteres[tam - 1 - i];
            caracteres[tam - 1 - i] = temp;
        }
        return new String(caracteres);
    }
}