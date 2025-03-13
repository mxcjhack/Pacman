package com.epam.campus.console;

public class Printer {

    public String show(char[][] screen){
        StringBuilder result = new StringBuilder();

        for(char[] line : screen){
            result.append(line);
            result.append("\n");
        }

        return result.toString();
    }
}
