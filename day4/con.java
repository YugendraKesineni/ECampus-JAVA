class con {
    public static void main(String[] args) {
        
    }
}

class Employee{

    /* Instance Variables */
    String name;
    int age;
    String id;
    boolean isManager;
    double salary;
    char gender;

    /* Constructors
     */

    public Employee(){
        /* Default */
     }
    
    public Employee(String idf){
        this.name = idf;
     }

     /* You can arrange the data types */

     /*
      * 3 different types 
      3 are possibles
      3 are possibles
      1 is possible
      */

     /* Signature will include number of variables and 
     data type of each variable */
     public Employee(int age){

     }

     public Employee(boolean isManager){

     }

     /* 3 int - age, marks, salary
      * 1 variable only 1 constructor - 3 constructors possible
      but only 1 is allowed at a time

      2 variables age,marks   : age salary : marks salary possible 
      but only 1 is allowed

      3 variables 
      only one is allowed and possible

      only 7 constructors but a maximum of 3 are allowed
      */
     public Employee(double salary){

     }
}