class run{

    /* Instance Variables */
    private int coins;
    private int diamonds; 
    private int powers;

    /* Default */
    float current_score; 

    /* Constructors  : Method name must be the name of the class.*/
    run(){
        /* This is a default constructor */

        coins = 100; /*We can access coins because run() method is in the same class */
        powers = 2;
    }


    /* Getter Methods */
    public int getCoins(){
        return coins;
    }

    public float getCurrent_Score(){
        return current_score;
    }

    /* Setter Methods */

    public void setCoins(int coins){
        this.coins = coins;
    }
}

public class play{

    /*This is the main method */
    public static void main( String[] args){

        /* Creating an Object called game 1 using run class */
        run game1 = new run();
        /* All the instance variables are initialised to 0 */
        System.out.println(game1.getCoins());
    }
}

