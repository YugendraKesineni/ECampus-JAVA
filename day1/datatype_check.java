class datatype_check {
    public static void main(String[] args) {
        
        /* Integer Data Types */
        byte a = 10;
        short b = 10;
        int c = 100;
        long d = 100000000;

        /* Decimal Data Types */
        float e = 16.45f;
        double f = 2000.99999999;

        /* Character Data Types */
        char g = '\u20B9';

        /* Boolean Data Types */
        boolean isFalse = false;

        System.out.println(g);

        /* Reference Data Types */

        int[] arr = {1,2,3,4};

        char[] arr1 = {1,2,3,4};

        boolean[] arr2 = {2>3, 3<5, 100==2};

        /* Operations */
        System.out.println(16 >> 1);

        System.out.println(16 & 1);
        System.out.println(16 | 1);
        System.out.println(16 != 1);


        /* Ternary */
        /* a = 10 */
        String result = (a > 2 ? "True" : "False");
        System.out.println(result);

        /* Type Casting */
        int p = 200;
        float o = 5000;
        /* Implicit */
        float k = p + o;
        int t = (int)(p + o);
        System.out.println(t);

        byte y = (byte)(t);
        System.out.println(y);

        int[] ia = {1,2,3,4};
        float[] fa = ia;

        /*
         * Float[] fa = {1.1, 1.2, 1.3};
         * 1.1 to 1 
         * (int)(1.1) it will result in 1
         * 
         * using loops we can convert all at once... 
         * Wrapper class methods 
         * 
         * Integer is a wrapper class and it has some methods..
         * Out of these methods there may be some method to convert.
         * Float
         * Character 
         * 
         * int[] ia = {1,1,1}
         */
    }
}