/*
Created by :
4GUYS
2019/11/15
 */
package project;

/**
 *
 * @author User
 */



public class Dealer {
 
   
    
    public void startGame(){
      
      // deal initial card layout
    }
    
     public static void readPlay(){
        
        String x = " ";// need to pull variable from recievePlay
        
        
        Player.PlayersChoice myVar = Player.PlayersChoice.hit;
        // when the dealer hears the player's choice then the switch statement will add code to instruct dealer and recalculate the totals of the cards of the table 
        
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
