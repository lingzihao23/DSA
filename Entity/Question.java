/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author lzhao
 */
public class Question  {
    private String word;
    private String difficulty;
    private int points;

    public Question(String word, String difficulty) {
        this.word = word;
        this.difficulty = difficulty;
        
        if((this.difficulty).equals("Easy"))
            points = 10;
        else if ((this.difficulty).equals("Normal"))
            points= 15;
        else 
            points=20;
            
    }

    public String getWord() {
        return word;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public int getPoints() {
        return points;
    }
    
}
