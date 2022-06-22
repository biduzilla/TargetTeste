package teste;

import java.util.Scanner;

public class Second {

    public static boolean verifyFibonacci(int n) {
        int fib1 = 0;
        int fib2 = 1;
        do {
            int saveFib1 = fib1;
            fib1 = fib2;
            fib2 = saveFib1 + fib2;
        }
        while (fib2 < n);

        return fib2 == n;

    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Digite um número: ");

        int num = Integer.parseInt(input.nextLine());

        if(num < 0){
            System.out.println("Valor Inválido");
        }else {
            if (verifyFibonacci(num)){
                System.out.println("Número " + num + " pertence a sequência Fibonacci!");
            }else {
                System.out.println("Número " + num + " não pertence a sequência Fibonacci!");
            }
        }



    }
}
