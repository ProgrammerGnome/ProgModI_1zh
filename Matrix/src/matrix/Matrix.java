/*
Készítsen egy Matrix osztályt. Az osztályban írja meg a numberOfNonZeroValues 
és a indexOfColumnsWithSameValues metódusokat. Mindkét metódus meghatározza 
egy 2-dimenziós egész mátrixban: előbbi hány darab nem 0 elemet tartalmaz, 
utóbbi azon oszlopok sorszámát, amelyek csupa azonos értéket tartalmaznak!
*/

package matrix;
/**
 *
 * @author kiralymark
 */
public class Matrix {
    public static void main(String[] args) {
        // create a 2d array
        int[][] two_dimensional_matrix = {
            {8, 2, 3}, 
            {4, 5, 6, 9}, 
            {5, 4}, 
            {8, 8, 0},
            {23},
            {17,6,1},
            {0, 7, 1},
        };
        System.out.print("Ennyi db nem nulla elemet tartalmaz a 2d-s tömb:\n");
        numberOfNonZeroValues(two_dimensional_matrix);
        System.out.print("\n A csupa azonos elemeket tartalmazo oszlopok sorszámai:\n");
        indexOfColumnsWithSameValues(two_dimensional_matrix);
    }
    public static void numberOfNonZeroValues(int[][] two_dimensional_matrix){
        int counter = 0;
        for (int[] data: two_dimensional_matrix) {
            for (int element: data){
                if(element == 0) {
                    counter++;
                    //System.out.println(counter);
                }
            }  
        }
        int add = 0;
        for (int i = 0; i < two_dimensional_matrix.length; ++i) {
            for(int j = 0; j < two_dimensional_matrix[i].length; ++j) {
                add++;
            }
        }
        int kiir = add-counter;
        System.out.print(kiir);
    }
    public static void indexOfColumnsWithSameValues(int[][] two_dimensional_matrix){
        int max_column = 0;
        for (int i = 0; i < two_dimensional_matrix.length; ++i) {
            int column_counter = 0;
            if(two_dimensional_matrix[i] != null){
                for(int j = 0; j < two_dimensional_matrix[i].length; ++j) {
                    column_counter++;
                    for(int j2 = 0; j2 < two_dimensional_matrix[i].length; ++j2){
                    if(two_dimensional_matrix[i][j] == two_dimensional_matrix[i][j2]){
                        System.out.print(two_dimensional_matrix[i][j2] + "\n");
                    max_column = column_counter;}
                }
            }
        }}
        //System.out.println(max);
        System.out.print("oszlop: "+max_column+", ");
    }
}