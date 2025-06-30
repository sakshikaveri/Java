public class ThreeDimensionalArrays {
    public static void main(String[] args) {
        
        int nums[][][] = new int[3][4][5];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                for(int k=0;k<5;k++){
                nums[i][j][k] = (int) (Math.random() * 10);
                }
            }
        }

        

        System.out.println();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                for(int k = 0; k < 5; k++){
                System.out.print(nums[i][j][k]+" ");
                }
                System.out.print(" ");
            }
            System.out.println();
        }

        System.out.println();
        //Jagged arrays
        int numbers[][][] = new int[3][][];
        numbers[0]= new int[4][];
        numbers[0][0] = new int[5];
        numbers[0][1] = new int[5];
        numbers[0][2] = new int[5];
        numbers[0][3] = new int[5];

        numbers[1]= new int[3][];
        numbers[1][0] = new int[6];
        numbers[1][1] = new int[6];
        numbers[1][2] = new int[6];

        numbers[2]= new int[2][];
        numbers[2][0] = new int[7];
        numbers[2][1] = new int[7];

       
       /*  for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                for(int k=0;k<numbers[i][j].length;k++){
                numbers[i][j][k] = (int) (Math.random() * 10);
                }
            }
        }*/
        for (int i = 0; i < numbers.length; i++) {
                for (int j = 0; j < numbers[i].length; j++) {
                        for (int k = 0; k < numbers[i][j].length; k++) {
                            numbers[i][j][k] = (int) (Math.random() * 10);
                        }
                    }
            
        }
        

        /*
        for(int n[][]:numbers){
            for(int m[]:n){
                for(int o:m){
                    System.out.print(o +" ");
                }
                System.out.print(" ");
            }
            System.out.println();
        }*/
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                    for (int k = 0; k < numbers[i][j].length; k++) {
                       System.out.print(numbers[i][j][k]+" ");
                    }
                    System.out.print(" ");
                }
                System.out.println();
                //System.out.println();
        
    }
        


    }
}
