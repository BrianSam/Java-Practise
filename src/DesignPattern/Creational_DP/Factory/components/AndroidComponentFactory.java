package DesignPattern.Creational_DP.Factory.components;

import DesignPattern.Creational_DP.Factory.components.UIComponentFactory;
import DesignPattern.Creational_DP.Factory.components.button.AndroidButton;
import DesignPattern.Creational_DP.Factory.components.button.Button;
import DesignPattern.Creational_DP.Factory.components.dropdown.AndroidDropDown;
import DesignPattern.Creational_DP.Factory.components.dropdown.DropDown;
import DesignPattern.Creational_DP.Factory.components.menu.AndroidMenu;
import DesignPattern.Creational_DP.Factory.components.menu.Menu;

public class AndroidComponentFactory implements UIComponentFactory {
    @Override
    public Button createButton() {
        return new AndroidButton();
    }

    @Override
    public DropDown createDropDown() {
        return new AndroidDropDown();
    }

    @Override
    public Menu createMenu() {
        return new AndroidMenu();
    }
}
