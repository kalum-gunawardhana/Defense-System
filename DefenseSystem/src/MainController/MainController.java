/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MainController;

/**
 *
 * @author kguna
 */
public class MainController implements ControlObservableInterface {

    private ControlObserver[] observerArray;

    private int scrollValue;
    
    private String selectedValue;

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

    public void setPositionLevel(int scrollValue,String selectedValue) {
        if (this.scrollValue != scrollValue && this.selectedValue!="") {
            this.scrollValue = scrollValue;
            this.selectedValue=selectedValue;
        }
        notifyObjects(scrollValue,selectedValue);
    }

    public void notifyObjects(int scrollValue,String selectedValue) {
        for (ControlObserver ob : observerArray) {
            ob.update(scrollValue,selectedValue);
        }
    }

    public void setTitle(boolean isChecked) {
        //System.out.println("correct");
        for (ControlObserver ob : observerArray) {
            ob.updateTitle(isChecked);
        }
    }
}
