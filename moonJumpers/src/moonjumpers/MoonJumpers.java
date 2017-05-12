/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moonjumpers;

import byui.cit260.moonJumpers.model.Actor;
import byui.cit260.moonJumpers.model.Game;
import byui.cit260.moonJumpers.model.Player;
import byui.cit260.moonJumpers.model.Weapon;

/**
 *
 * @author mckenzietaggart
 */
public class MoonJumpers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //display the player test
        Player playerOne = new Player();
        
        playerOne.setName("Fred Flintsone");
        playerOne.setBestTime(7.00);
        
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);
        
        //display the actor test
        Actor actorOne = new Actor();
        
        actorOne.setName("Green Alien");
        actorOne.setDescription("Fights against the player on the planet Jupiter");
        actorOne.setCurrentLocation("Jupiter");

        String actorInfo = actorOne.toString();
        System.out.println(actorInfo);
        
        //display the weapon test
        Weapon weaponOne = new Weapon();
        
        weaponOne.setName("Astro Blaster");
        weaponOne.setDescription("The astro blaster has maximum strength and will kill an alien in one hit");
        weaponOne.setStrength(20);
        
        String weaponInfo = weaponOne.toString();
        System.out.println(weaponInfo);
        
        //display the game test
        Game gameOne = new Game();
        
        gameOne.setTotalTime(10);
        gameOne.setNumberOfPeople(1);
        gameOne.setAttribute("You have visited Earth's Moon, Saturn, and the Sun");

        String gameInfo = gameOne.toString();
        System.out.println(gameInfo);

    }
    
}
