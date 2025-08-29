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
       
    }


    // methods(behaviors)
    // walk with arms out
    //eat brains
    // growl
    public String growl(){
        return "grrrssaaaaajlhhhh...";
    }

    public int bodyCount(){
        return humansEaten;
    }
}

// Challenge: make a new method that returns num of humans eaten