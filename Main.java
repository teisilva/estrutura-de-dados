import java.util.Scanner;
import java.util.Random;

public class Main {

    public static long comparacoees = 0;
    public static long trocas = 0;

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        int var, target, escolha, teste = 0;
        int[] vetor = new int[10000];

        System.out.println(
                """
                        MENU
                        1) criar o vetor vazio ou "zerar o vetor"
                        2) inserir um valor no vetor
                        3) apagar um valor do vetor
                        4) consultar se existe determinado valor no vetor
                        5) consultar quantos valores significativos já ocupam o vetor
                        6) consultar qual o maior valor armazenado no vetor e indicar qual o elemento que contém esse valor
                        7) consultar qual o menor valor armazenado no vetor e indicar qual o elemento que contém esse valor
                        8) apresentar uma listagem dos valores armazenados no vetor
                        9) encha o vetor de valores aleatórios (ja ordenados)
                        10) encha o vetor de valores aleatorios (não ordenados)
                        11) Bubble Sort
                        12) Selection Sort
                        13) Insertion Sort
                        14) Quick Sort
                        15) Comparação dos Sorts
                        0) sair do programa""");

        while (true) {
            var = tec.nextInt();

            switch (var) {

                case 0:
                    System.out.println("Programa Finalizado");
                    break;

                case 1:
                    Metodos.zerar(vetor);
                    break;

                case 2:
                    Metodos.atribuiValor(vetor);
                    break;

                case 3:
                    Metodos.remover(vetor);
                    break;

                case 4:
                    Metodos.consultaMetodo(vetor);
                    break;
                case 5:
                    Metodos.valores(vetor);
                    break;

                case 6:
                    Metodos.maior(vetor);
                    break;

                case 7:
                    Metodos.menor(vetor);
                    break;

                case 8:
                    Metodos.listagem(vetor);
                    break;
                case 9:
                    Metodos.povoaVetorSequencial(vetor);
                    break;
                case 10:
                    Metodos.povoaVetor(vetor);
                    break;
                case 11:
                    Metodos.bubbleSort(vetor);
                    System.out.println("Valores Ordenados!");
                    System.out.println("O que deseja fazer?");
                    break;
                case 12:
                    Metodos.selectionSort(vetor);
                    System.out.println("Valores Ordenados!");
                    System.out.println("O que deseja fazer?");
                    break;
                case 13:
                    Metodos.insertionSort(vetor);
                    System.out.println("Valores Ordenados!");
                    System.out.println("O que deseja fazer?");
                    break;
                case 14:
                    Metodos.quickSort(vetor, 0, vetor.length - 1);
                    System.out.println("Valores Ordenados!");
                    System.out.println("O que deseja fazer?");
                    break;
                case 15:
                    long startTime;
                    long endTime;

                    startTime = System.nanoTime();
                    Metodos.bubbleSort(vetor);
                    endTime = System.nanoTime();
                    System.out.println("Dados do BubbleSort");
                    Metodos.print(startTime, endTime, comparacoees, trocas);

                    startTime = System.nanoTime();
                    Metodos.selectionSort(vetor);
                    endTime = System.nanoTime();
                    System.out.println("Dados do SelectionSort");
                    Metodos.print(startTime, endTime, comparacoees, trocas);

                    startTime = System.nanoTime();
                    Metodos.insertionSort(vetor);
                    endTime = System.nanoTime();
                    System.out.println("Dados do InsertionSort");
                    Metodos.print(startTime, endTime, comparacoees, trocas);

                    startTime = System.nanoTime();
                    Metodos.quickSort(vetor, 0, vetor.length - 1);
                    endTime = System.nanoTime();
                    System.out.println("Dados do QuickSort");
                    Metodos.print(startTime, endTime, comparacoees, trocas);
                    break;
            }
        }
    }
}