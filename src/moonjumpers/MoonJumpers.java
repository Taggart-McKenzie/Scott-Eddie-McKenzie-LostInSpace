/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moonjumpers;

import byui.cit260.moomJumpers.model.Player;
import byui.cit260.moonJumpers.model.Items;
import byui.cit260.moonJumpers.model.Map;
import byui.cit260.moonJumpers.model.Questions;

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
       
       Map location = new Map();
       
       location.setCurrentLocation("Jupiter");
       location.setAvailableLocations("Earth");
       
       String locationInfo = location.toString();
       System.out.println(location);
       
       Items moonBoots = new Items();
       
       moonBoots.setInventoryType("Footwear");
       moonBoots.setQuantityInStock(1.00);
       moonBoots.setRequiredAmount(1.00);
       
       String moonBootsInfo = moonBoots.toString();
       System.out.println(moonBoots);
       
       Questions quiz = new Questions();
       
       quiz.setQuestions("What is the sun?");
       quiz.setAnswers("A ball of fire");
       quiz.setCorrectAnswers("Yes");
       quiz.setEquations(2.00);
       
       String quizInfo = quiz.toString();
       System.out.println(quiz);
    }
    
}
