public class Arrays {
    public static void main(String[] args) {

        // defined array
        int nums[] = { 1, 2, 3, 4 };
        for (int i = 0; i <= 3; i++) {
            System.out.println(nums[i]);
        }

        nums[2] = 5; // updating
        for (int i = 0; i <= nums.length - 1; i++) {
            System.out.println(nums[i]);
        }

        // dynamic array
        int numbers[] = new int[5];

        for (int i = 0; i < numbers.length - 1; i++) {
            System.out.println(numbers[i]);
        }

        System.out.println("\n");

        for (int i = 0; i < numbers.length - 1; i++) {
            numbers[i] = i;
            System.out.println(numbers[i]);
        }

    }
}
