import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos valores vai ter cada vetor?");
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];

        System.out.println("Digite os valores do vator A: ");
        for(int i=0;i< a.length;i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Digite os valores do vator B: ");
        for(int i=0;i< b.length;i++) {
            b[i] = sc.nextInt();
        }

        int[] soma = new int[n];
        System.out.println("VETOR RESULTANTE: ");
        for(int i=0;i< b.length;i++) {
            soma[i] = a[i] + b[i];
            System.out.println(soma[i]);
        }
    }
}