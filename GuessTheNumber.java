import java .util.*; // importing java package

class GuessTheNumber {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        Random num=new Random();

        int lowerLimit=1;
        int upperLimit=100;
        int sec_num; //stores the number to be guessed by th user

        int MaxAttempts=10; // you can change maximum number of attempts from here!!
        int score=0;

        System.out.println("Welocme to Guess the Number game!");

        while(true) {
            //generate random number for every unique round
            sec_num=num.nextInt(upperLimit - lowerLimit + 1) + lowerLimit;
            int attempts=0;

            System.out.println("I'm thinking of a number between " + lowerLimit + " and "+ upperLimit);

            while(attempts < MaxAttempts) {
                System.out.println("Enter your guess");
                int User_Guess=sc.nextInt();
                attempts++;

                if(User_Guess < sec_num) {
                    System.out.println("Too low! Try again");
                }
                else if(User_Guess > sec_num) {
                    System.out.println("Too high! Try again");
                }
                else {
                    System.out.println("Congratulations! You guessed the number "+ sec_num + " in " + attempts +" attempts");
                    score++;
                    break;
                }
            }
            System.out.println("Do you want to play again? (yes/no): ");
            String playAgain=sc.next();
             
            if(!playAgain.toLowerCase().equals("yes")) {
                break;
            }
                System.out.println("Thanks for playing! Your total score is "+ score);
                sc.close();
        }
    }
}