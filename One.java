package teste;

public class One {
    public static void main(String[] args) {
        int INDICE = 13;
        int SOMA = 0;
        int K = 0;

        while (K< INDICE){
            K++;
            SOMA += K;
        }
        System.out.println("SOMA = " + SOMA);
    }
}
