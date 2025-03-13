package com.epam.campus.movement;

public class Right {
    public static char[][] moveRight(int[] cord, char[][] screen) {
        if(cord[1] < 8){
            screen[cord[0]][cord[1]] = '*';
            screen[cord[0]][++cord[1]] = '<';
        }

        return screen;
    }
}
