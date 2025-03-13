package com.epam.campus.model;

public class LoadScreen {

    public static char[][] loadScreen(int[] cord){
        char[][] screen = new char[5][9];
        for(int i = 0 ; i < 5 ; i++){
            for(int j = 0 ; j < 9; j++){

                if(i == 2 && j == 4){
                    screen[i][j] = '<';
                } else{
                    screen[i][j] = '*';
                }
            }
        }

        return screen;
    }
}
