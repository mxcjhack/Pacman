package com.epam.campus.buble;

import java.util.Random;

public class GenerateBubble {

    public int[] generateBubble(int[]cords, char[][] screen){
        Random random = new Random();
        int i;
        int j;

        do {
            i = random.nextInt(4);
            j = random.nextInt(8);
        } while (i == cords[0] && j == cords[1]);

        screen[i][j] = 'O';
        return new int[]{i, j};
    }

    public boolean checkCollision(int[] cords, int[] bubbleCords){
        return cords[0] == bubbleCords[0] && bubbleCords[1] == cords[1];
    }
}
