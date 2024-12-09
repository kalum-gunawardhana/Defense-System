/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package defensesystem;

/**
 *
 * @author kguna
 */
public class DefenseSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new MainController.MainControllerInterface().setVisible(true);
        new Tank.TankInterface().setVisible(true);
        new Submarine.SubmarineInterface().setVisible(true);
        new Helicopter.HelicopterInterface().setVisible(true);
    }
}