package com.javaseleniumtemplate.utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

//import org.apache.commons.io.FileUtils;
//import org.testng.ITestResult;

public class Utils {

    public static String getNowDate(String mask){
        DateFormat dateFormat = new SimpleDateFormat(mask);
        Date date = new Date();
        return dateFormat.format(date);
    }

    public static String getFileContent(String filePath) {
        BufferedReader br=null;
        StringBuilder sb=null;
        try {
            br = new BufferedReader(new FileReader(filePath));
            sb = new StringBuilder();
            String line = br.readLine();

            while (line != null) {
                sb.append(line);
                sb.append("\n");
                line = br.readLine();
            }

            br.close();

        }  catch (Exception e) {
            e.printStackTrace();
        }

        return sb.toString();
    }

    public static List<String> getFileByLine(String filePath) {
        BufferedReader br=null;
        StringBuilder sb=null;
        List<String> s = new ArrayList<>();
        try {
            br = new BufferedReader(new FileReader(filePath));
            String line = br.readLine();

            while (line != null) {
                s.add(line);
                line = br.readLine();
            }

            br.close();

        }  catch (Exception e) {
            e.printStackTrace();
        }

        return s;
    }
}
