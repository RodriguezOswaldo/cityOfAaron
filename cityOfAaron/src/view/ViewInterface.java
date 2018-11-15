// The ViewInterface class - part of the view layer
// Object of this class manages the main menu
// Author: Gabriel Gonzalez, Sam Wagner, Oswaldo Rodrgiguez
// Date last modified: October 31, 2018
//-------------------------------------------------------------
package view;

/**
 *
 * @author Own
 */
public interface ViewInterface {
    public void displayMenu();
    public int getMenuOption();
    public void doAction(int option);

}
