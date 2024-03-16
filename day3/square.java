import java.util.*;


class square {
    public static void main(String[] args) {
        
        int n;

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        /* Let us iterate through the rows */
        for(int row = 1; row <= n; row ++){

            /* Let us print each row completely by iterating the columns */
            for(int col = 1; col <= n; col++){
                System.out.print("* ");
            }
            /*This row is printed completely */

            /* Let us print in next row */
            System.out.println();
        }
    }
}