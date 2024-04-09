package DesignPattern.Creational_DP.Factory.components;

import DesignPattern.Creational_DP.Factory.components.button.Button;
import DesignPattern.Creational_DP.Factory.components.dropdown.DropDown;
import DesignPattern.Creational_DP.Factory.components.menu.Menu;

public interface UIComponentFactory {
    public Button createButton();
    public DropDown createDropDown();
    public Menu createMenu();
}
