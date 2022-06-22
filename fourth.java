package teste;

public class fourth {
    public static void main(String[] args) {
        int carroKmporHora = 110;
        int caminhaoKmporHora = 80;
        int distKm = 100;

        int distM = distKm*1000;

        double carroMetrosporSeg = carroKmporHora/3.6;
        double caminhaoMetrosporSeg = caminhaoKmporHora/3.6;

        double tempoEncontro = distM/(carroMetrosporSeg+caminhaoMetrosporSeg);

        double distCarro = carroMetrosporSeg*tempoEncontro;
        double distCaminhao = distM - caminhaoMetrosporSeg*tempoEncontro;
        System.out.println("Distância de Ribeirão Preto até Franca");
        System.out.println("Quando eles se encontrarem caso não tenham passado por nenhum pedágio: "+  distCarro/1000 + "KM");

        /*
        Para resolver o problema converti tudo para metro e metro/segundo, depois usei a formula de S1+S2/Tempo,
        onde S = distância + velocidade*tempo, após saber o tempo de percurso ao eles se encontrarem após o carro sair
        de Ribeirão Preto, multipliquei o tempo pela velocidade, já que velocidade estava em m/s e tempo em s. Sabendo
        a distância do carro deu para descobrir a distância da saída do carro de Ribeirão Preto até ele se encontrar com
        o caminhão
        */
    }

}
