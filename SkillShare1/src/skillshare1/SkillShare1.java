/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package skillshare1;

import javax.swing.*;

/**
 *
 * @author austinspencer
 */
public class SkillShare1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String word = JOptionPane.showInputDialog("Enter a word");
        System.out.println(word.toUpperCase());
        String result = word.toLowerCase();
        System.out.println(result);
        
        boolean test = true;
    }
    
}
