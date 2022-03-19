package com.javaseleniumtemplate;

import java.io.*;
import java.util.Properties;

public class GlobalParameters {
    public static String PROJECT_PATH;
    public static String BROWSER_DEFAULT;
    public static String EXECUTION;
    public static int TIMEOUT_DEFAULT;
    public static String URL_DEFAULT;
    public static String DOWNLOAD_DEFAULT_PATH;
    public static String SENHA_GERAL;

    private Properties properties;

    public GlobalParameters(){
        properties = new Properties();
        InputStream input = null;

        try {
            input = new FileInputStream("globalParameters.properties");
            properties.load(input);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        PROJECT_PATH = getProjectPath();
        BROWSER_DEFAULT = properties.getProperty("browser.default");
        EXECUTION = properties.getProperty("execution");
        TIMEOUT_DEFAULT = Integer.parseInt(properties.getProperty("timeout.default"));
        URL_DEFAULT = properties.getProperty("url.default");
        DOWNLOAD_DEFAULT_PATH =
                PROJECT_PATH + properties.getProperty("download.default.path");
        SENHA_GERAL = properties.getProperty("senhaGeral");
    }

    public static String getProjectPath() {
        File directory = new File("./");

        String projectPath = "";
        try {
            projectPath = directory.getCanonicalPath();
        } catch (IOException e) {
            e.printStackTrace();
        }

        directory.delete();

        return projectPath;
    }

}
