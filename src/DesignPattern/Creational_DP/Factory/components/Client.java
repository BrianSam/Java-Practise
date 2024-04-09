package DesignPattern.Creational_DP.Factory.components;

import DesignPattern.Creational_DP.Factory.components.button.Button;
import DesignPattern.Creational_DP.Factory.components.dropdown.DropDown;
import DesignPattern.Creational_DP.Factory.components.menu.Menu;

public class Client {
    public static void main(String[] args) {
        Platform platform = new Android();

        Button button = platform.uiComponentFactory().createButton();
        DropDown dropDown = platform.uiComponentFactory().createDropDown();
        Menu menu = platform.uiComponentFactory().createMenu();

        System.out.println(button.newButton());
        System.out.println(dropDown.newDropdown());
        System.out.println(menu.newMenu());
        platform.Charge_time();
        platform.RefreshRate();

        Platform platform1 = new Platform("ios");
        Button button1 = platform1.uiComponentFactory().createButton();
        DropDown dropDown1=platform1.uiComponentFactory().createDropDown();
        Menu menu1 = platform1.uiComponentFactory().createMenu();

        System.out.println(button1.newButton());
        System.out.println(dropDown1.newDropdown());
        System.out.println(menu1.newMenu());
        platform1.Charge_time();
        platform1.RefreshRate();

    }
}
