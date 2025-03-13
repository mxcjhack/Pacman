package com.epam.campus.movement;

public class Up {
    public static char[][] moveUp(int[] cord, char[][] screen) {
        if(cord[0] > 0){
            screen[cord[0]][cord[1]] = '*';
            screen[--cord[0]][cord[1]] = 'V';
        }

        return screen;
    }
}
