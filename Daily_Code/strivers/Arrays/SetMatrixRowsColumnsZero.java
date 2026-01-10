public class SetMatrixRowsColumnsZero {
    static int rows; 
    static int columns;

    public static int[][] set(int[][] arr){
        rows = arr.length;
        columns = arr[0].length;
        for(int i=0; i<rows; i++){
            for(int j=0; j<columns; j++){
                if(arr[i][j] == 0){
                    markRows(arr,i);
                    markColumns(arr,j);
                }
            }
        }
        for(int i=0; i<rows; i++){
            for(int j=0; j<columns; j++){
                if(arr[i][j] == -1){
                    arr[i][j] = 0;
                }
            }
        }
        return arr;
    }
    private static void markRows(int[][] arr, int i) {
        for(int j=0; j<columns; j++){
            if(arr[i][j] != 0){
                arr[i][j] = -1;
            }
        }
    }
    private static void markColumns(int[][] arr, int j) {
        for(int i=0; i<rows; i++){
            if(arr[i][j] != 0){
                arr[i][j] = -1;
            }
        }
    }
    public static void main(String[] args) {
        int[][] arr = {
            {1,1,1,1},
            {1,0,0,1},
            {1,1,0,1},
            {1,1,1,1}
        };
        set(arr);
        for(int i=0; i<rows; i++){
            for(int j=0; j<columns; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
