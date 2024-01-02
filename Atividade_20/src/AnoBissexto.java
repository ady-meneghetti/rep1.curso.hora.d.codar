import java.util.Scanner;
//.Crie um programa que determine se um ano é bissexto.

public class AnoBissexto {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um ano para testar: ");
        int ano = sc.nextInt();


        if ((ano % 4 == 0 && ano % 100 != 0) || ano % 400 == 0) {
            System.out.println("O ano " + ano + " é bissexto.");
        } else {
            System.out.println("O ano " + ano + " não é bissexto.");
        }
    }
}