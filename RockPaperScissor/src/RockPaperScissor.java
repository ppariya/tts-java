import java.util.*;
public class RockPaperScissor {
    //    Create a game of 'Rock Paper Scissors' that runs until one player has three wins
//
//    Store the player names and number of wins for each player in variables
//    Use a while loop to run the game until one player has 3 wins
//    Use the following code to randomly select a weapon
//
//    var weapons = ["rock", "paper", "scissors"];
//
//    var weaponOfChoice = weapons[Math.floor(Math.random() * weapons.length)];
//
//    Output each players hand to the console
//    Use an if or switch statement to determine a winner of the round
//    Output the round winner's name to the console
//    Create a way to track how many rounds each player has won
//    When one player wins 3 rounds, announce that player's name as the game winner
//    Push the code to our class GitHub Repo
//            See below for all possible winning outcomes
    static Scanner reader = new Scanner(System.in);
    static List<String> weapons = new ArrayList<>();
    static List<String> players = new ArrayList<>();
    static Map<String, Integer> scores = new HashMap<>();
    static Random random = new Random();
    static int input;
    static int rand;
    static String currentPlayer = "";
    private static void player(){
        System.out.println("Enter your name");
        String name = reader.nextLine();
        players.add(name);
        scores.put(name , 0);
        currentPlayer = name;
        players.add("AI");
        scores.put("AI", 0);
    }

    private static void choice(){
        System.out.println("Please choose: \n0. Rock\n1. Paper\n2. Scissor");
        input = Integer.parseInt(reader.nextLine());
        rand = random.nextInt(3);


    }

    private static void result() {
        if (input == rand) {
            System.out.println("Your weapon: " + weapons.get(input));
            System.out.println("AI weapon: " + weapons.get(rand));
            System.out.print("Result: Tie!");
            System.out.println("Scores: " + currentPlayer + "= " + scores.get(currentPlayer) + " AI= " + scores.get("AI"));
        } else if (input == 0 && rand == 1 || input == 1 && rand == 2 || input == 2 && rand == 0) {
            System.out.println("Your weapon: " + weapons.get(input));
            System.out.println("AI weapon: " + weapons.get(rand));
            System.out.print("Result: AI won! ");
            scores.put("AI", scores.get("AI") + 1);
            System.out.println("Scores: " + currentPlayer + "= " + scores.get(currentPlayer) + " AI= " + scores.get("AI"));

        } else if (input == 1 && rand == 0 || input == 2 && rand == 1 || input == 0 && rand == 2) {
            System.out.println("Your weapon: " + weapons.get(input));
            System.out.println("AI weapon: " + weapons.get(rand));
            System.out.print("Result: " + currentPlayer + " won! ");
            scores.put(currentPlayer, scores.get(currentPlayer) + 1);
            System.out.println("Scores: " + currentPlayer + "= " + scores.get(currentPlayer) + " AI= " + scores.get("AI"));
        }
    }

        private static void winner(){
            if(scores.get(currentPlayer) == 3){
                System.out.println("Winner is " + currentPlayer);

            } else if (scores.get("AI") == 3){
                System.out.println("Winner is AI");
            }
        }

    public static void main(String[] args){
            weapons.add("Rock");
            weapons.add("Paper");
            weapons.add("Scissor");

            player();
            while (scores.get(currentPlayer) < 3 && scores.get("AI") < 3) {
                choice();
                result();
            }
            winner();
        }
}
