package com.epam.campus;

import com.epam.campus.buble.GenerateBubble;
import com.epam.campus.console.Printer;
import com.epam.campus.model.HomeScreen;
import com.epam.campus.movement.Down;
import com.epam.campus.movement.Left;
import com.epam.campus.movement.Right;
import com.epam.campus.movement.Up;
import com.sun.tools.attach.AgentInitializationException;

import java.util.Scanner;

public class Main {
    static Printer printer;
    static GenerateBubble generateBubble;

    static void init() {
        printer = new Printer();
        generateBubble = new GenerateBubble();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[][] screen = HomeScreen.loadHomeScreen();
        int[] cord = {2, 4}; // Starting position
        init();
        int[] bubble = generateBubble.generateBubble(cord, screen);
        int points = 0;

        while (true) {
            System.out.println(printer.show(screen));

            String move = scanner.next();
            if ("D".equalsIgnoreCase(move)) {
                Right.moveRight(cord, screen);
            } else if ("A".equalsIgnoreCase(move)) {
                Left.moveLeft(cord, screen);
            } else if ("W".equalsIgnoreCase(move)) {
                Up.moveUp(cord, screen);
            } else if ("S".equalsIgnoreCase(move)) {
                Down.moveDown(cord, screen);
            } else if ("Q".equalsIgnoreCase(move)) {
                break;
            }


            if(generateBubble.checkCollision(cord, bubble)){
                bubble = generateBubble.generateBubble(cord, screen);
                points++;
            }

            System.out.println("Points = " + points);

        }
    }

}
