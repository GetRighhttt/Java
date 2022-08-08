package basics;

public class MethodExamples {
    public static void main(String[] args) {

        // Here we will discuss how methods
        // Can improve readability and restrict
        // duplication of code.
        // These are the variable we will pass to the method.
        // This is how you call a method:

        boolean gameOver = true;
        int score = 10000;
        int levelCompleted = 5;
        int bonus = 100;

        // finalScore placed into 'highscore' variable
        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);

        //playerScore from the method is put into highScorePosition
        int highScorePosition = calculateHighScorePosition(1500); // assigning an int to return a value from
        displayHighScorePosition("Stefan", highScorePosition);        // the method calculateHighScorePosition

        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("John", highScorePosition);

        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Vince", highScorePosition);

        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Shawn", highScorePosition);

        // displayHighScorePosition passed two parameters for name and position.
        // One argument was passed for calculateHighScorePosition with was
        // playerScore.
        // Because we were returning a value, int highScorePosition had to be declared.
        //

    }

    // Methods cannot be in another method
    // Must be made outside public main method
    // Using parameters from above

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        // Method for calculating score

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            return finalScore;
        } else {
            return -1;
        }
    }

    public static void displayHighScorePosition(String name, int positionPlayer) { //method to display the highscore
        System.out.println(name + " managed to get into position "
                + positionPlayer + " on the high score table!");
    }

    public static int calculateHighScorePosition(int playerScore) { //returning the value of the method in a format
        if (playerScore >= 1000) {
            return 1;
        } else if (playerScore >= 500) {
            return 2;
        } else if (playerScore >= 100) {
            return 3;
        } else {
            return 4;
        }
    }

}

/*
Outputs:

Your final score was 11500
Your final score was 12600
Stefan managed to get into position 1 on the high score table!
John managed to get into position 2 on the high score table!
Vince managed to get into position 3 on the high score table!
Shawn managed to get into position 4 on the high score table!
 */

