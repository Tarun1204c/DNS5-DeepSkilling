package org.example.designpattern;

public class DesignPatternApplication {
    public static void main(String[] args) {
        ConfigManager c1 = ConfigManager.getInstance();
        ConfigManager c2 = ConfigManager.getInstance();
        System.out.println("Same instance? " + (c1 == c2));
        System.out.println("App Name: " + c1.getAppName());
    }
}
