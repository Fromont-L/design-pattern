package fr.diginamic.singleton;

import java.util.ResourceBundle;

public class ConfigSingleton {
    private static ConfigSingleton instance;
    private ResourceBundle configuration;

    private ConfigSingleton() {
        configuration = ResourceBundle.getBundle("configuration");
    }

    public static ConfigSingleton getInstance() {
        if (instance == null) {
            instance = new ConfigSingleton();
        }
        return instance;
    }

    public String getProperty(String cle) {
        return configuration.getString(cle);
    }
}
