package com.epam.campus.movement;

public class Down {
    public static char[][] moveDown(int[] cord, char[][] screen) {
        if(cord[0] < 4){
            screen[cord[0]][cord[1]] = '*';
            screen[++cord[0]][cord[1]] = '^';

        }

        return screen;
    }
}
