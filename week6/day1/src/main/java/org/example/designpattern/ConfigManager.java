package org.example.designpattern;

public class ConfigManager {
    private static ConfigManager instance;
    private String appName = "DN5 Deep Skilling";

    private ConfigManager() {}

    public static ConfigManager getInstance() {
        if (instance == null) {
            instance = new ConfigManager();
        }
        return instance;
    }

    public String getAppName() {
        return appName;
    }
}