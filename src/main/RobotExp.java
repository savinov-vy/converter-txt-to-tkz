package main;

import java.awt.AWTException;

import java.awt.Robot;

import java.awt.event.KeyEvent;
import java.util.ArrayList;

public class RobotExp {
    ArrayList<Character> listChar;

    public RobotExp(ArrayList<Character> listChar) {
        this.listChar = listChar;
    }

    public void startRobot()

    {

        try {

            java.awt.Robot robot = new java.awt.Robot();

            // Creates the delay of 5 sec so that you can open notepad before

            // Robot start writting

            robot.delay(5000);
            for (Character symbolChar : listChar)
                switch (symbolChar) {
                    case '1' : robot.keyPress(KeyEvent.VK_1);
                    case '2' : robot.keyPress(KeyEvent.VK_2);
                    case '3' : robot.keyPress(KeyEvent.VK_3);
                    case '4' : robot.keyPress(KeyEvent.VK_4);
                    case '5' : robot.keyPress(KeyEvent.VK_5);
                    case '6' : robot.keyPress(KeyEvent.VK_6);
                    case '7' : robot.keyPress(KeyEvent.VK_7);
                    case '8' : robot.keyPress(KeyEvent.VK_8);
                    case '9' : robot.keyPress(KeyEvent.VK_9);
                    case '0' : robot.keyPress(KeyEvent.VK_0);
                    case ',' : robot.keyPress(KeyEvent.VK_COMMA);

                }




        } catch (AWTException e) {

            e.printStackTrace();

        }

    }

}