public class MultiDimensionalArrays {
    public static void main(String[] args) {

        // initializing an array-- nums is an array of arrays- 3 arrays having 4 elements 
        int nums[][] = new int[3][4];
        //System.out.println((int)(Math.random()*10));

        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 3; j++) {
                nums[i][j] = (int)(Math.random()*10);
            }
        }

        for ( int i = 0; i <= 2; i++) {
            for ( int j = 0; j <= 3; j++) {
                System.out.print(nums[i][j] +" ");
            }
            System.out.println();
        }
    }
}
