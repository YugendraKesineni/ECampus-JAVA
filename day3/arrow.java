public class arrow {
    public static void main(String[] args) {
        
        int size = 4;

        /* This is for the upper part of the arrow pattern */
        for(int row = 1; row <= size ; row ++){
            for(int col = 1; col <= row; col++){
                System.out.print("* ");
            }
            System.out.println();
        }

        /* Starting with size - 1 */
        /*  Decreasing number of stars in each row */
        /* Helps us print the lower part */
        for(int lower_row = size - 1; lower_row >= 1; lower_row-- ){
            for(int lower_col = 1; lower_col <= lower_row; lower_col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}