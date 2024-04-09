package DesignPattern.Creational_DP.Factory.components;

import DesignPattern.Creational_DP.Factory.components.UIComponentFactory;
import DesignPattern.Creational_DP.Factory.components.button.Button;
import DesignPattern.Creational_DP.Factory.components.button.IosButton;
import DesignPattern.Creational_DP.Factory.components.dropdown.DropDown;
import DesignPattern.Creational_DP.Factory.components.dropdown.IosDropDown;
import DesignPattern.Creational_DP.Factory.components.menu.IosMenu;
import DesignPattern.Creational_DP.Factory.components.menu.Menu;

public class IosComponentFactory implements UIComponentFactory {
    @Override
    public Button createButton() {
        return new IosButton();
    }

    @Override
    public DropDown createDropDown() {
        return new IosDropDown();
    }

    @Override
    public Menu createMenu() {
        return new IosMenu();
    }
}
