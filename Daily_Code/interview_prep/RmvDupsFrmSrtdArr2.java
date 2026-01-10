public class RmvDupsFrmSrtdArr2 {
    void removeDups(int[] sortedArray){
        int[] resultArray = new int[sortedArray.length];
        int index = 0;
        resultArray[index++] = sortedArray[0];

        for(int i=1; i<sortedArray.length; i++){
            if(sortedArray[i-1] != sortedArray[i]){
                resultArray[index++] = sortedArray[i];
            }
        }

        for(int i=0; i<=index-1; i++){
            System.out.print(resultArray[i]+" ");
        }
    }

    public static void main(String[] args) {
        RmvDupsFrmSrtdArr2 obj = new RmvDupsFrmSrtdArr2();
        int[] sortArr = {1,2,3,4,4,4,5,5,6,7,7,8,9};
        obj.removeDups(sortArr);
    }
}
