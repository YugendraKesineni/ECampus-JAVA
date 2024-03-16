public class zigzag {
    public static void main(String[] args){

        /* 
         *   * * * *  // First row -- part 1
         *       *\n    // Logic to be used..   2 space === 4 - 2  4 is size and then 2 is row number
         *     *\n     //                       1 space === 4 - 3  4 is size and then 1 is row number
         *   * * * * // Copy of first row here
         */


        int size = 10;

        for(int fr = 1; fr <= size ; fr++){
            System.out.print("* ");
        }
        System.out.println();

        // Middle row/rows
        for(int row = 2; row < size; row++){

            // Spaces first
            for(int space = 1 ; space <= size - row; space ++){
                System.out.print("  ");
            }

            // Stars
            System.out.println("*");
        }

        // Last row
        for(int lr = 1; lr <= size ; lr++){
            System.out.print("* ");
        }
        System.out.println();

    }
}