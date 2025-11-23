package strivers.Arrays;

public class RemoveDuplicates {

    int[] remove(int[] arr) {
        int[] result = new int[arr.length];
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            boolean isDuplicate = false;

            // Check if arr[i] exists before
            for (int j = 0; j < index; j++) {
                if (result[j] == arr[i]) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                result[index++] = arr[i];
            }
        }

        // Copy only the unique portion
        int[] finalResult = new int[index];
        for (int i = 0; i < index; i++) {
            finalResult[i] = result[i];
        }

        return finalResult;
    }

    public static void main(String[] args) {
        RemoveDuplicates obj = new RemoveDuplicates();
        int[] arr = {1, 2, 2, 4, 3, 3, 6, 5, 4, 8};

        int[] res = obj.remove(arr);

        for (int i : res) {
            System.out.print(i + " ");
        }
    }
}
