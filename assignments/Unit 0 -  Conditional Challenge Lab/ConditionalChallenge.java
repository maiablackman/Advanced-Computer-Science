public class ConditionalChallenge {
    public static void main(String[] args){

        System.out.println("--- Part 1: Temperature Converter ---");
        boolean isCold = true;
        double temperature = 20;
        if (isCold == true) {
            temperature = temperature - 15;
        } else; {
            temperature = temperature + 10;
        }
        System.out.println("The temperature is " + temperature + " degrees.");



        System.out.println("--- Part 2: Grade Calculator ---");
        double score = 67;
        if (score >= 70) {
            System.out.println("Passed. Your score is " + score + "");
        } else {
            System.out.println("Failed. Your score is " + score + "");
        }


        System.out.println("--- Part 3: Season Determiner ---");
        double temperature2 = 75;
        if (temperature2 > 80) {
            System.out.println("It's summer! The temperature is " + temperature2 + " degrees.");
        } else if (temperature2 >= 60 & temperature2 < 80) {
            System.out.println("It's spring! The temperature is " + temperature2 + " degrees.");
        } else if (temperature2 >= 40 & temperature2 < 60) {
            System.out.println("It's fall! The temperature is " + temperature2 + " degrees.");
        } else {
            System.out.println("It's winter! The temperature is " + temperature2 + " degrees.");
        }

        System.out.println("--- Part 4: Number Classifier ---");
        double number = -200;
        if (number > 100) {
            System.out.println("Large");
        } else if (number > 0) {
            System.out.println("Positive");
        } else if (number == 0 ) {
            System.out.println("Zero");
        } else if (number < -100) {
            System.out.println("Very negative");
        } else {
            System.out.println("Negative");
        }


        }
    }
    

