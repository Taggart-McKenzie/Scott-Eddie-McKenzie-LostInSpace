/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moonjumpers;

import byui.cit260.moomJumpers.model.Player;

/**
 *
 * @author Eddie Pincay
 */
public class MoonJumpers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Player playerOne = new Player();
       
       playerOne.setName("Eddie Pincay");
       playerOne.setBestTime(10.00);
       
       String playerInfo = playerOne.toString();
       System.out.println(playerInfo);
       
    }
    
}
