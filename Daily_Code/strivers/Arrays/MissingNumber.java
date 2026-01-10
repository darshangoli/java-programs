public class MissingNumber {
    void missing(int[] arr){
        boolean found = false;
        int i = 0;
        while(i<arr.length-1){
            int next = arr[i]+1;
            while(next < arr[i+1]){
                System.out.print(next+" ");
                next++;
                found = true;
            }
            i++;
        }
        if(found != true){
            System.out.println("no missing numbers");
        }
    }
    public static void main(String[] args) {
        MissingNumber obj = new MissingNumber();
        int[] arr = {1,2,4,7};
        obj.missing(arr);
    }
}
