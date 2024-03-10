class basicif {

    /*
     * Public is a access modifier
     * static is a keyword used when we want to execute a method without 
     * creating an object of the class.
     * void is the return type of the method
     */

    public static void main(String[] args) {
        /*
         * Basic IF statement
         */
        int i = 10;
        if( i < 5){
            System.out.println("Block 1 is executed");
        }
        
        else{
            System.out.println("Block 2 is executed");
            if( i < 8 ){
                System.out.println("Block 2.1 is executed");
            }
            else{
                System.out.println("Block 2.2 will be executed");
            }
        }

    }
}