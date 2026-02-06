package Daily_Code.LeetCodeEasyProblems;

public class MaximumOnes {
    static int countMaxOnes(int[] arr) {
        int count1 = 0;
        int maxCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                count1 += 1;
                maxCount = Math.max(maxCount, count1);
            } else {
                count1 = 0;
            }
        }
        return maxCount;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 0, 1, 1, 1, 5, 1, 1 };
        System.out.println(countMaxOnes(arr));
    }
}
