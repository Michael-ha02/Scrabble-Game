/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scraggle;

import dictionary.Dictionary;
import game.Game;
import userInterface.ScraggleUi;

/**
 *
 * @author Karin Whiting UCF COP 3330
 */
public class Scraggle
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Dictionary dictionary = new Dictionary();
        Game game = new Game(dictionary);
        game.displayGrid();  
        
        ScraggleUi ui = new ScraggleUi(game);
    }   
}