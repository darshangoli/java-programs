public class SetMatrixRowsColumnsZeroOptimal {
    public static int[][] set(int[][] arr){
        int n = arr.length;
        int m = arr[0].length;

        int[] rows = new int[n];
        int[] columns = new int[m];

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(arr[i][j] == 0){
                    rows[i] = 1;
                    columns[j] = 1;
                }
            }
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(rows[i] == 1 || columns[j] == 1){
                    arr[i][j] = 0;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[][] arr = {
            {0,1,1,1},
            {1,1,1,1},
            {1,1,0,1},
            {1,1,1,1}
        };
        set(arr);
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
