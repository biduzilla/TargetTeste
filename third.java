package teste;

public class third {

    static long fibo(int n) {
        if (n < 2) {
            return n;
        } else {
            return fibo(n - 1) + fibo(n - 2);
        }
    }

    public static void main(String[] args) {

        int x = 1;
        System.out.print("a) ");
        for (int i = 0; i < 5; i++) {
            System.out.print(x + ", ");
            x = x + 2;
        }

        System.out.print("\n\nb) ");
        x = 2;
        for (int i = 0; i < 7; i++) {
            System.out.print(x + ", ");
            x = x * 2;
        }

        System.out.print("\n\nc) ");
        for (int i = 0; i < 9; i++) {
            x = i * i;
            System.out.print(x + ", ");
        }

        System.out.print("\n\nd) ");
        for (int i = 2; i < 12; i += 2) {
            x = i * i;
            System.out.print(x + ", ");
        }


        System.out.print("\n\ne) ");
        for (int i = 1; i < 8; i++) {
            System.out.print(fibo(i) + ", ");
        }

        System.out.println("\n\nf) Lista de números que começa com D" + "\n2,10, 12, 16, 17, 18, 19, 200");
    }
}
