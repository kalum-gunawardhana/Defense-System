/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package MainController;

/**
 *
 * @author kguna
 */
public interface ControlObserver {
    public void update(int scrollValue,String selectedValue);
    public void updateTitle(boolean isChecked);
    public void updateMainText(String mainText);
}
