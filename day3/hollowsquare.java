/*
 * 
 *      * * * * * 
 *      *       * 
 *      *       *
 *      *       *
 *      * * * * *
 */

class hollowsquare {
    public static void main(String[] args) {
        
        int size = 10;

        /* This is for first row */
        for(int i = 0; i < size; i++){
            System.out.print("* ");
        }
        System.out.println();

        /* THis is for middle rows */
        for(int row = 2; row < size ; row++){
            for(int col = 1; col <= size; col++){

                if(col == 1 || col == size){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        /* THis is for last row */
        for(int i = 0; i < size; i++){
            System.out.print("* ");
        }
        System.out.println();
    }
}