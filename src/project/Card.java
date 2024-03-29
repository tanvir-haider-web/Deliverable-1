/**
 * SYST 17796 Project Winter 2019 Base code.
 * Students can modify and extend to implement their game.
 * 4GUYS 2019/11/15
 */
package project;

/**
 *
 * @author 4GUYS
 * 2019/11/15
 */
public abstract class Card 
{
    //default modifier for child classes
    
    /**
     * 
     * Students should implement this method for their specific children classes 
     * @return a String representation of a card. Could be an UNO card, a regular playing card etc.
     */
    
    @Override
    public abstract String toString();
    
}
