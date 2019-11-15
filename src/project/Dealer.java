/*
Created by :
Timothyy Stanek
tstanek117@gmail.com
Student Number : 991428353
 */
package project;

/**
 *
 * @author User
 */


enum playersChoice {
    hit,
    hold,
    surrender
    
}
public class Dealer {
 
   
    
    public void startGame(){
      
      // deal initial card layout
    }
    
    public String pickPlay(){
        
        // prompt player is sleect play choices
        
        return " ";
        
    }
    
     public static void readPlay(){
        
        String x = " ";// need to pull variable from recievePlay
        
                playersChoice myVar = playersChoice.hit; 
                
        // when the dealer hears the player's choice then the switch statement will add code to instruct dealer and recalculate the totals of the cards of the table each time a player/dealer selects play
        
        switch(myVar){
            case hit:
                System.out.println("player calls hit!");
                break;
                case hold:
                System.out.println("player calls hold!");
                break;
                case surrender:
                System.out.println("player calls surrender!");
                break;
        }
        
    }
    

            
            

 
}
