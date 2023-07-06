package org.example;

import java.util.HashMap;

class Configuration {
    private static Configuration instance;
    private HashMap<String, String> config;

    private Configuration() {
        config = new HashMap<>();
    }

    public static Configuration getInstance() {
        if (instance == null) {
            instance = new Configuration();
        }
        return instance;
    }

    public void setProperty(String key, String value) {
        config.put(key, value);
    }

    public String getProperty(String key) {
        return config.get(key);
    }
}










