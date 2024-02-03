/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import controller.Manager;

/**
 *
 * @author PC
 */
public class Main extends Menu{

    private static String[] mc = {"Normal Calculator ", "BMI Calculator",  "Exit"};
    
    public Main() {
        super(mc, "Equation Program ");
    }
    public static void main(String[] args) {
        new Main().run();
    }
    @Override
    public void execute(int n) {
        switch(n){
            case 1:
                Manager.normalCalculator();
                break;
            case 2:
                Manager.BMICalculator();
                break;
            default:
                break;        
        }
    }
    
}
