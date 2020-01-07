import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите количество вершин графа: ");
        int i = scan.nextInt();
        PrimaAlgorithm primaAlgorithm = new PrimaAlgorithm();
        primaAlgorithm.mainAlgorithm(i);
    }
}
