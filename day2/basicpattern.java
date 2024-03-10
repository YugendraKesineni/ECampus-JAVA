class basicpattern {
    public static void main(String[] args) {
        
        /* this is the n values discussed */
        int rows = 10;

        /* This will create 10 rows here */
        for(int row = 0; row < rows; row++){

            /* This loop is used for printing each row */
            /* We want row number of columns */
            for(int col = 0; col <= row; col++){
                System.out.print("* ");
            }
            /* We finished printing the row */
            System.out.println();
        }
    }
}