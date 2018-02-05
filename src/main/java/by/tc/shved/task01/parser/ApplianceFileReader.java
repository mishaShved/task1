/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.tc.shved.task01.parser;

import java.io.*;//??
import java.util.List;

/**
 *
 * @author misha
 */
public class ApplianceFileReader {

    public static String[] readFile(String fileName) throws IOException {

        StringBuilder builder = new StringBuilder();// поднять в память весь файл - это, конечно легкое решение, но не лучшее
        // всегда надо думать наперед
        // у тебя файл -хранит данные - его рост до больших размеров обеспечен


        try(BufferedReader reader = new BufferedReader(new FileReader(fileName))){
            String line;

            while ((line = reader.readLine()) != null){
                builder.append(line).append("\n");
            }

        }

        return builder.toString().split("\n");
    }

    public static String getValue(String parameter, String appliance) {

        StringBuilder value = new StringBuilder();

        int i = appliance.indexOf(parameter) + parameter.length() + 1;

        while (appliance.toCharArray()[i] != ';' && appliance.toCharArray()[i] != '\n' // и фиормирование строки по буква - это круто)), но как-то по детски
                && appliance.toCharArray()[i] != ',') {

            value.append(appliance.toCharArray()[i]);
            i++;

        }

        return value.toString();

    }
}

