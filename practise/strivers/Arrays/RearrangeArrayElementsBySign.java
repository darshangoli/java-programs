public class RearrangeArrayElementsBySign {
    int[] rearrange(int[] arr){
        int[] result = new int[arr.length];
        int evenIndex = 0;
        int oddIndex = 1;
        for(int i=0 ; i<arr.length ; i++){
            if(arr[i] < 0){
                result[evenIndex] = arr[i];
                evenIndex += 2;
            }
            else{
                result[oddIndex] = arr[i];
                oddIndex += 2;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        RearrangeArrayElementsBySign obj = new RearrangeArrayElementsBySign();
        int[] arr = {1,3,2,-4,-7,-9};
        int[] result = obj.rearrange(arr);
        for(int i : result){
            System.out.print(i+" ");
        }
    }
}
