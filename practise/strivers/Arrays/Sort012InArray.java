public class Sort012InArray {
    int[] sort012(int [] arr){
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == 0){
                count0 += 1;
            }
            else if(arr[i] == 1){
                count1 += 1;
            }
            else if(arr[i] == 2){
                count2 += 1;
            }
        }
        for(int l=0; l<count0; l++){
            arr[l] = 0;
        }
        for(int m=count0; m<count0+count1; m++){
            arr[m] = 1;
        }
        for(int n=count0+count1; n<arr.length; n++){
            arr[n] = 2;
        }
        return arr;
    }
    public static void main(String[] args) {
        Sort012InArray obj = new Sort012InArray();
        int[] arr = {1,1,0,2,1,0,2,1,2,0,0,0,2};
        int[] result = obj.sort012(arr);
        for(int i : result){
            System.out.print(i+" ");
        }
    }
}
