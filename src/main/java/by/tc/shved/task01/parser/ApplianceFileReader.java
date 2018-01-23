/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.tc.shved.task01.parser;

import java.io.*;
/**
 *
 * @author misha
 */
public class ApplianceFileReader {

    public static String readFile(String fileName) throws IOException {

        StringBuilder builder = new StringBuilder();


        try(BufferedReader reader = new BufferedReader(new FileReader(fileName))){
            String line;

            while ((line = reader.readLine()) != null){
                builder.append(line).append("\n");
            }

        }

        return builder.toString();
    }

    public static String getValue(String parameter, String appliance) {

        StringBuilder value = new StringBuilder();

        int i = appliance.indexOf(parameter) + parameter.length() + 1;

        while (appliance.toCharArray()[i] != ';' && appliance.toCharArray()[i] != '\n'
                && appliance.toCharArray()[i] != ',') {

            value.append(appliance.toCharArray()[i]);
            i++;

        }

        return value.toString();

    }
}

