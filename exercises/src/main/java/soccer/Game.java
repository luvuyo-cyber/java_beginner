/*
 * This is the Game class blueprint for the Soccer Application.
 * It defines the data that each Game object will hold.
 * It's in the 'soccer' package.
 */
package soccer;

/**
 * Represents a soccer game between two teams.
 * This blueprint defines the teams involved and a place to store goals.
 */

public class Game {
    // Public fields to store the home team, away team, and goals scored.
    // These fields hold references to other objects (Team and Goal arrays).
    public Team homeTeam; // Reference variable that will point to a Team object (the home team)
    public Team awayTeam; // Reference variable that will point to a Team object (the away team)
//    public Goal[] goals; // Reference variable that will point to an array of Goal objects
}
