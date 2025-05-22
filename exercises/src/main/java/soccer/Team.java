/*
 * This is the Team class blueprint for the Soccer Application.
 * It defines the data that each Team object will hold.
 * It's in the 'soccer' package.
 */
package soccer;

/**
 * Represents a team in the soccer league.
 * This blueprint defines the team's name and a list of its players.
 */
public class Team {

    // Public field to store the team's name.
    public String teamName;

    // Public field to store an array of Player objects.
    // This means a Team object will contain a list of Player objects.
    // The 'Player[]' syntax declares an array where each element is a reference to a Player object.
    public Player[] playerArray;
}
