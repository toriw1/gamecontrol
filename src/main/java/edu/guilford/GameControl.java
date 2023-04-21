package edu.guilford;

/**
 * A simple game control application
 *
 */
public class GameControl 
{
    public static void main( String[] args )
    {
       // Instantiate a GameState object
         GameState gameState = new GameState();

       // Initialize the game, then start it, wait 3 seconds, pause the game, wait 5 seconds
       // then change the state to running, wait 4 more seconds, and end the game. Print the Banner
       // after each state change
            gameState.startGame();
            System.out.println(gameState.getBanner());
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            gameState.pauseGame();
            System.out.println(gameState.getBanner());
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            gameState.resumeGame();
            System.out.println(gameState.getBanner());
            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            gameState.endGame();
            System.out.println(gameState.getBanner());
    }
}
