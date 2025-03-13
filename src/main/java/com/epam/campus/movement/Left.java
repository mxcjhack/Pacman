package com.epam.campus.movement;

public class Left {
    public static char[][] moveLeft(int[] cord, char[][] screen) {
        if(cord[1] > 0){
            screen[cord[0]][cord[1]] = '*';
            screen[cord[0]][--cord[1]] = '>';
        }

        return screen;
    }
}
