/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package defensesystem;

import Helicopter.HelicopterInterface;
import MainController.MainController;
import MainController.MainControllerInterface;
import Submarine.SubmarineInterface;
import Tank.TankInterface;

/**
 *
 * @author kguna
 */
public class DefenseSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MainController mc = new MainController();
        // TODO code application logic here
        MainControllerInterface mci= new MainControllerInterface(mc);
        mc.addPositionLevelObserver(new TankInterface(mci));
        mc.addPositionLevelObserver(new HelicopterInterface(mci));
        mc.addPositionLevelObserver(new SubmarineInterface(mci));
        //new MainControllerInterface(mc).setVisible(true);
        //new TankInterface().setVisible(true);
        //new SubmarineInterface().setVisible(true);
        //new HelicopterInterface().setVisible(true);
    }
}
