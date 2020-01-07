import java.util.Scanner;

public class PrimaAlgorithm {

    Scanner scan = new Scanner(System.in);

    int min = 999;
    int u=0, v=0;
    int weight=0;

    public void mainAlgorithm(int i) {

        int[] visited = new int[i];
        int[][] array = new int[i][i];
        System.out.println("Введите главную диагональ: ");
        for (int g = 0; g < i; g++) {
            array[g][g] = scan.nextInt();
        }

        System.out.println("Введите остальные элементы матрицы: ");

        int counter = 0;

        for (int j = 0; j < i; j++) {
            visited[j] = 0;
            counter++;
            for (int k = counter; k < i; k++) {
                array[j][k] = array[k][j] = scan.nextInt();
                if(array[j][k] == 0) {
                    array[j][k] = min;
                }
                inputMatrix(i, array);
            }
        }

        visited[0] = 1;

        for(int count = 0; count < i-1 ; count++){
            min = 999;
            for(int k = 0; k < i; k++){
                if(visited[k]==1){
                    for(int j = 0; j < i; j++){
                        if(visited[j]==0){
                            if(min > array[k][j]){
                                min = array[k][j];
                                u = k;
                                v = j;
                            }
                        }
                    }
                }
            }
            visited[v] = 1;
            weight += min;
            array[u][v] = array[u][v] = 999;
            System.out.println("Соединение ребра: "+u+" -> "+v+" : "+min);
        }

        System.out.println("Вес: "+ weight);
    }


    public void inputMatrix(int i, int[][] array) {
        for (int j = 0; j < i; j++) {
            for (int k = 0; k < i; k++) {
                System.out.print(" " + array[j][k]);
            }
            System.out.println();
        }
    }
}