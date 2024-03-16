public class pyramid {
    public static void main(String[] args) {
        
        /*
         *          *       2 spaces 1 star 2 spaces
         *        * * *     1 space  1 star 1 star
         *      * * * * *   0 spaces 
         */

        int size = 3;

        for(int row = 1; row <= size ; row++){

            // Spaces

            for(int space = 1; space <= size - row; space++){
                System.out.print("  ");
            }
        
            // Stars

            for( int star = 1; star <= 2 * row - 1; star++){
                System.out.print("* ");
            }

            System.out.println();
        }

    }
}