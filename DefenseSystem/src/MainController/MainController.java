/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MainController;

/**
 *
 * @author kguna
 */
public class MainController implements ControlObserver {

    private ControlObserver[] observerArray;

    private int positionLevel;

    public MainController() {
        observerArray = new ControlObserver[0];
    }

    private void extendsObserverArray() {
        ControlObserver[] tempObserverArray = new ControlObserver[observerArray.length + 1];
        System.arraycopy(observerArray, 0, tempObserverArray, 0, observerArray.length);
        observerArray = tempObserverArray;
    }

    public void addPositionLevelObserver(ControlObserver ob) {
        extendsObserverArray();
        observerArray[observerArray.length - 1] = ob;
    }

    public void setPositionLevel(int positionLevel) {
        if (this.positionLevel != positionLevel) {
            this.positionLevel = positionLevel;
        }
        notifyObjects();
    }

    public void notifyObjects() {
        for (ControlObserver ob : observerArray) {
            ob.update(positionLevel);
        }
    }

    @Override
    public void update(int positionLevel) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}