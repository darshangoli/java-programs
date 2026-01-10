package Daily_Code.strivers.Arrays;

public class MajorityElementFinderNBy2 {

    public int majorityElement(int[] nums) {
        int cnt = 0;
        int el = 0;

        // Phase 1: Find candidate
        for (int num : nums) {
            if (cnt == 0) {
                el = num;
                cnt = 1;
            } else if (num == el) {
                cnt++;
            } else {
                cnt--;
            }
        }

        // Phase 2: Verify candidate
        int cnt1 = 0;
        for (int num : nums) {
            if (num == el) cnt1++;
        }

        if (cnt1 > nums.length / 2) {
            return el;
        }

        return -1; // no majority element
    }

    public static void main(String[] args) {
        MajorityElementFinderNBy2 finder = new MajorityElementFinderNBy2();
        int[] arr = {2, 2, 1, 2, 3, 2, 2, 3};
        System.out.println(finder.majorityElement(arr)); // Output: 2
    }
}



