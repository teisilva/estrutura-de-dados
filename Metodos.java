import java.util.Random;
import java.util.Scanner;

public class Metodos {

    public static long comparacoees = 0;
    public static long trocas = 0;
    static void povoaVetor(int[] vetor){

        Random random = new Random();
        Scanner tec = new Scanner(System.in);

        int soma = 0;
        int qtd = vetor.length;
        for (int i = 0; i < qtd; i++) {
            soma = random.nextInt(10000) + 1;
            vetor[i] = soma;
        }
        System.out.println("Pronto!");
        System.out.println("O que deseja fazer agora?");
    }

    static void povoaVetorSequencial(int[] vetor){

        Random random = new Random();
        Scanner tec = new Scanner(System.in);

        int soma = 1;
        int qtd = vetor.length;
        for (int i = 0; i < qtd; i++) {
            soma = random.nextInt(10) + soma;
            vetor[i] = soma;
        }
        System.out.println("Pronto!");
        System.out.println("O que deseja fazer agora?");

    }

    public static int atribuiValor(int[] vetor){

        Scanner tec = new Scanner(System.in);
        System.out.println("Digite o valor");
        int dois = tec.nextInt();
        for (int lDois = 0; lDois < vetor.length; lDois++) {
            if (vetor[lDois] == 0) {
                vetor[lDois] = dois;
                System.out.println("Número inserido");
                System.out.println("O que deseja fazer?");
                break;
            }
        }
        return dois;
    }

    static void consultaMetodo(int[] vetor){

        Scanner tec = new Scanner(System.in);
        System.out.println("Com qual método você quer prucurar este elemento?");
        System.out.println("1: Squencial");
        System.out.println("2: Binária");
        int escolha = tec.nextInt();
        if (escolha == 1) {
            consulta(vetor, escolha);
        } else if (escolha == 2) {
            System.out.println("Qual Valor deseja procurar?");
            int target = tec.nextInt();
            int index = buscaBinariaRecursiva(vetor, target);

            if (index == -1) {
                System.out.println(target + " Não foi encontrado dentro do vetor");
            } else {
                System.out.println("valor encontrado na posicão: " + index);
            }
        }
    }

    public static int consulta(int[] vetor, int lQuatro) {
        Scanner tec = new Scanner(System.in);
        System.out.println("Digite o valor que quer consultar");
        int quatro = tec.nextInt();
        for (lQuatro = 0; lQuatro < vetor.length; lQuatro++) {
            if (quatro == vetor[lQuatro]) {
                System.out.println("O numero " + quatro + " foi encontrado na posição " + lQuatro + ", e foram feitas " + lQuatro + " consultas");
                System.out.println("O que deseja fazer?");
                break;
            }
        }
        if (lQuatro == vetor.length) {
            System.out.println("O valor não foi encontrado dentro do vetor");
        }
        return quatro;
    }

    public static int buscaBinariaRecursiva(int[] vetor, int target) {
        return buscaBinariaRecursiva(vetor, target, 0, vetor.length - 1);
    }

    public static int buscaBinariaRecursiva(int[] vetor, int target, int low, int high) {
        if (low <= high) {
            int meio = low + (high - low) / 2;
            int valorMeio = vetor[meio];

            System.out.println("meio: " + valorMeio);

            if (valorMeio == target) {
                return meio;
            } else if (valorMeio < target) {
                return buscaBinariaRecursiva(vetor, target, meio + 1, high);
            } else {
                return buscaBinariaRecursiva(vetor, target, low, meio - 1);
            }
        }
        return -1;
    }

    public static void zerar(int[] vetor) {

        System.out.println("Vetor criado");
        System.out.println("O que deseja fazer?");
    }

    public static int remover(int[] vetor) {

        Scanner tec = new Scanner(System.in);
        System.out.println("Digite o valor a ser excluido do vetor");
        int tres = tec.nextInt();
        for (int lTres = 0; lTres < vetor.length; lTres++) {
            if (tres == vetor[lTres]) {
                vetor[lTres] = 0;
                System.out.println("O que deseja fazer?");
                break;
            }
        }
        return tres;
    }

    public static void valores(int[] vetor) {
        int c = 0;
        for (int lCinco = 0; lCinco < vetor.length; lCinco++) {
            if (vetor[lCinco] != 0) {
                c++;
            }
        }
        System.out.println("Estão armazenados " + c + " valores significativos dentro do vetor");
    }

    public static void maior(int[] vetor) {
        int maior = Integer.MIN_VALUE, cs = 0;
        for (int lSeis = 0; lSeis < vetor.length; lSeis++) {
            if (maior < vetor[lSeis]) {
                maior = vetor[lSeis];
                cs = lSeis;
            }
        }
        System.out.println("O maior número dentro do vetor é " + maior + ", e está contido na posição " + cs);
    }

    public static void menor(int[] vetor) {
        int menor = Integer.MAX_VALUE, cse = 0;
        for (int lSete = 0; lSete < vetor.length; lSete++) {
            if (menor > vetor[lSete] && vetor[lSete] != 0) {
                menor = vetor[lSete];
                cse = lSete;
            }
        }
        System.out.println("O menor número dentro do vetor é " + menor + ", e está contido na posição " + cse);
    }

    public static void listagem(int[] vetor) {
        int i;
        for (i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
            if (vetor[i] == 0) {
                break;
            }
        }
        System.out.println(" ");
        System.out.println("O que deseja fazer?");
    }

    public static void bubbleSort(int[] vetor) {

        comparacoees = 0;
        trocas = 0;
        int n = vetor.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                comparacoees++;
                if (vetor[j] > vetor[j + 1]) {
                    int temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                    trocas++;
                }
            }
        }
    }

    public static void selectionSort(int[] vetor) {

        comparacoees = 0;
        trocas = 0;
        int n = vetor.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                comparacoees++;
                if (vetor[j] < vetor[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = vetor[i];
            vetor[i] = vetor[minIndex];
            vetor[minIndex] = temp;
            trocas++;
        }
    }

    public static void insertionSort(int[] vetor) {

        comparacoees = 0;
        trocas = 0;
        int n = vetor.length;
        for (int i = 1; i < n; i++) {
            int chave = vetor[i];
            int j = i - 1;
            while (j >= 0 && vetor[j] > chave) {
                comparacoees++;
                vetor[j + 1] = vetor[j];
                j--;
            }
            vetor[j + 1] = chave;
            trocas++;
        }
    }

    public static void quickSort(int[] vetor, int inicio, int fim) {
        if (inicio < fim) {
            int posicaoPivo = separar(vetor, inicio, fim);
            quickSort(vetor, inicio, posicaoPivo - 1);
            quickSort(vetor, posicaoPivo + 1, fim);
        }
    }

    private static int separar(int[] vetor, int inicio, int fim) {

        comparacoees = 0;
        trocas = 0;
        int pivo = vetor[inicio];
        int i = inicio + 1;
        while (i <= fim) {
            comparacoees++;
            if (vetor[i] <= pivo)
                i++;
            else if (pivo < vetor[fim])
                fim--;
            else {
                int troca = vetor[i];
                vetor[i] = vetor[fim];
                vetor[fim] = troca;
                i++;
                fim--;
                trocas++;
            }
        }
        vetor[inicio] = vetor[fim];
        vetor[fim] = pivo;
        trocas++;
        return fim;
    }

    public static void print(long startTime, long endTime, long comparacoees, long trocas){

        long tempo = endTime - startTime;

        System.out.println("Tempo em NanoSegundos: " + tempo);
        System.out.println("Comparações totais " + comparacoees);
        System.out.println("Trocas totais " + trocas);
        System.out.println("=================================");
    }






}
