public class Zombie {
    // instance variables (attributes)
    // green
    String skinColor = "Green";
    // rot and dead
    boolean isDead = true;
    // shamble about
    //humans eaten count
    int humansEaten = 0;

// main
    public static void main(String[] args) {
        Zombie phillip = new Zombie();

        phillip.growl();
        System.out.println(phillip.growl());

        Zombie brian = new Zombie();

        System.out.println(brian.growl());
        System.out.println("Phillip ate " + phillip.bodyCount() + " humans.");

        System.out.println(brian.bodyCount());
        brian.eatHuman();
        System.out.println(brian.bodyCount());
        
       
    }


    // methods(behaviors)
    // walk with arms out
    //eat brains
    // growl
    public String growl(){
        return "grrrssaaaaajlhhhh...";
    }


// Challenge: make a new method that returns num of humans eaten
    public int bodyCount() {
        return humansEaten;
    }

    public void eatHuman() {
        humansEaten++;
    }

    public void feast(int humanCount){
        humansEaten += humanCount;

    }}