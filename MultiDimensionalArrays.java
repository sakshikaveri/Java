public class MultiDimensionalArrays {
    public static void main(String[] args) {

        // initializing an array-- nums is an array of arrays- 3 arrays having 4
        // elements
        int nums[][] = new int[3][4];
        // System.out.println((int)(Math.random()*10));

        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 3; j++) {
                nums[i][j] = (int) (Math.random() * 10);
            }
        }

        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 3; j++) {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
        // enhanced for loop
        for (int n[] : nums) { // here n is an iterator which has an array
            for (int m : n) { // here m is an iterator which iterates over single array
                System.out.print(m + " ");
            }
            System.out.println();
        }

        // JAGGED ARRAYS-- wherein the internal elements of arrays are not specified.

        int numbers[][] = new int[3][];
        numbers[0] = new int[5]; // first array will have 5 elements
        numbers[1] = new int[4];
        numbers[2] = new int[3];

        //System.out.println(numbers.length);

        for (int i = 0; i <= numbers.length - 1; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                numbers[i][j] = (int) (Math.random() * 10);
            }
        }

        System.out.println();
        for (int n[] : numbers) {
            for (int m : n) {
                System.out.print(m + " ");
            }
            System.out.println();
        }
    }
}
