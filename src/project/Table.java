/**
 * SYST 17796 Project Winter 2019 Base code.
 * Students can modify and extend to implement their game.
 * 4GUYS 2019/11/15
 */
package project;

import java.util.ArrayList;

/**
 *
 * @author 4GUYS 
 * 2019/11/15
 */
public abstract class Table 
{
    private String gameName = "Black Jack";//the title of the game
    private ArrayList<Player> attribute;
	/**
	 * the title of the game
	 */
	private java.util.ArrayList<project.Player> players;/**
	 * the players of the game
	 * @param givenName
	 */
    
    public void BlackJack(String givenName)
    {
        gameName = givenName;
        players = new ArrayList();
    }

    /**
     * @return the gameName
     */
    public String getGameName() 
    {
        return gameName;
    }
    
     /**
     * @return the players of this game
     */
    public ArrayList<Player> getAttribute() 
    {
        return attribute;
    }

    /**
     * @param players the players of this game
     */
    public void setAttribute(ArrayList<Player> players) 
    {
        this.attribute = players;
    }
    
    /**
     * When the game is over, use this method to declare and display a winning
     * player.
     */
    public abstract void declareWinner();

	public java.util.ArrayList<project.Player> getPlayers() {
		return this.players;
	}

	public void setPlayers(java.util.ArrayList<project.Player> players) {
		this.players = players;
	}

	/**
	 * Play the game. This might be one method or many method calls depending
	 * on your game.
	 */
	public abstract void play();
        
     

   
    
}//end class
