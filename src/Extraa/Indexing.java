package Extraa;

public class Indexing {
    public static int[] sort() {
        int[] nums = {0, 8, -2, 5, 0};
        int temp;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        for(int number : nums) {
            System.out.print(number + " ");
        }
        return nums;
    }

    public static void positioning() {
        int[] nums = sort();
        int val = 3;
        System.out.println();
        for(int i = 0; i < nums.length; i++) {
            if(val == nums[i]) {
                System.out.println(i);
            } else {
                System.out.println(-1);
            }
            break;
        }

        for(int i = nums.length - 1; i > 0; i--) {
            if(val == nums[i]) {
                System.out.println(i);
            } else {
                System.out.println(-1);
            }
            break;
        }

    }

    public static void main(String[] args) {
        positioning();
    }
}
