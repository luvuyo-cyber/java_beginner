/*
 * This is the main application class for the Soccer League.
 * It contains the main method to start the program
 * and demonstrates creating and linking Player, Team, and Game objects.
 */
package soccer;

/**
 * Main class to set up and run the soccer league simulation.
 * This class contains the entry point (main method) and creates the initial objects.
 */
public class League {

    public static void main(String[] args) {
        // --- Creating Team 1 ("The Greens") ---
        // Create Player objects for team 1 using the 'new' keyword.
        // This allocates memory for a new Player object, and the variable stores a reference to it.
        Player player1 = new Player();
        // Set the playerName field of the player1 object using the dot operator (.).
        player1.playerName = "George Elliot";

        Player player2 = new Player();
        player2.playerName = "Graham Greene";

        Player player3 = new Player();
        player3.playerName = "Geoffrey Chaucer";

        // Create an array to hold the Player objects for team 1.
        // We use an array initializer {} to create the array and put the player objects into it at once.
        Player[] thePlayers = {player1, player2, player3};

        // Create the Team 1 object ("The Greens").
        Team team1 = new Team();
        // Set the teamName field of the team1 object.
        team1.teamName = "The Greens";
        // Assign the array of players to the team's playerArray field.
        // This links the Team object to the array of Player objects.
        team1.playerArray = thePlayers;

        // --- Creating Team 2 ("The Reds") ---
        // Create the Team 2 object ("The Reds").
        Team team2 = new Team();
        team2.teamName = "The Reds";

        // Create an array for team 2's players.
        // This time, we create the array first and then create and assign players individually.
        team2.playerArray = new Player[3]; // Create an array of size 3 to hold Player references

        // Create Player objects directly into the array slots using 'new' and the dot operator.
        team2.playerArray[0] = new Player(); // Create a new Player object and put its reference in the first slot
        team2.playerArray[0].playerName = "Robert Service"; // Set the name of the Player object in the first slot

        team2.playerArray[1] = new Player();
        team2.playerArray[1].playerName = "Robbie Burns";

        team2.playerArray[2] = new Player();
        team2.playerArray[2].playerName = "Rafael Sabatini";

        // --- Displaying Team Players ---
        // Loop through team1's players array and print each player's name.
        System.out.println("Team 1 Players:");
        // Enhanced for loop: "For each Player object (referred to by 'thePlayer') in the 'team1.playerArray' array..."
        for (Player thePlayer : team1.playerArray) {
            System.out.println(thePlayer.playerName); // Access the playerName field of the current Player object
        }

        // Loop through team2's players array and print their names.
        for (Player thePlayer : team2.playerArray) {
            System.out.println(thePlayer.playerName);
        }

        // --- Creating a Game ---
        // Create a new Game object.
        Game currGame = new Game();

        // Assign the Team objects to the homeTeam and awayTeam fields of the Game object.
        // This links the Game object to the two Team objects.
        currGame.homeTeam = team1; // Set the home team to the object referenced by team1
        currGame.awayTeam = team2; // Set the away team to the object referenced by team2

    }
}
