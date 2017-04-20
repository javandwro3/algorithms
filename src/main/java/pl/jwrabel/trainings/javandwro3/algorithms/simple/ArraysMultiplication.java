package pl.jwrabel.trainings.javandwro3.algorithms.simple;

/**
 * Created by jakubwrabel on 20.04.2017.
 */
public class ArraysMultiplication {
    public static void main(String[] args) {
        System.out.println("--- MNOŻENIE MACIERZY ----");
        int[][] matrixA = new int[][]{{1,2},{3,4}};
        int[][] matrixB = new int[][]{{5,6},{7,8}};

        System.out.println("Macierz A:");
        MultArrays.printArray(matrixA);

        System.out.println("Macierz B:");
        MultArrays.printArray(matrixB);

        int sizeXofA = matrixA.length;
        int sizeYofA = matrixA[0].length;

        int sizeXofB = matrixB.length;
        int sizeYofB = matrixB[0].length;

        if(sizeXofA == sizeYofB){
            int[][] result = new int[sizeXofB][sizeYofA];

            for (int x = 0; x < result.length; x++) { // result.length == sizeXofB
                for (int y = 0; y < result[0].length; y++) { // result[0].lenght == sizeYofA
                        // wiersz z macierzy A y
                        // kolumnę z macierzy B x
                        int[] bColumn = matrixB[x];
                        int[] aRow = getRowFromMatrixA(y, matrixA);

                        result[x][y] = 1;
                }
            }
        } else {
            System.out.println("Niepoprawne macierze!!!");
        }
    }

    private static int[] getRowFromMatrixA(int y, int[][] matrixA) {
        int[] row = new int[matrixA.length];

        System.out.println("Wiersz Y: " + y + " z macierzy A");
        for (int i = 0; i < matrixA.length; i++) {
            row[i] = matrixA[i][y];
            System.out.println(row[i]);
        }
        return row;
    }
}
