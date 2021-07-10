package Extraa;

public class Products {
    //Given an integer array nums, write a function that returns an array products, such that each
    //entry at position i, in products is a product of all other elements in nums except nums[i].
    //Example: if nums = [4, 5, 10, 2], your function should return [100, 80, 40, 200]

    public static void displayArray(int[] numbers) {
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }

    public static void products() {
        int[] nums = {4, 5, 10, 2};
        int[] products = new int[nums.length];
        int product = 1;

        for (int num : nums) {
            product *= num;
        }

        for(int i = 0; i < nums.length; i++) {
            products[i] = product / nums[i];
        }

        displayArray(products);
    }

    public static void main(String[] args) {
        products();
    }
}
