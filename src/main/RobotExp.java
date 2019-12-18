package main;

import java.awt.AWTException;

import java.awt.Robot;

import java.awt.event.KeyEvent;

public class RobotExp {

    public void startRobot()

    {

        try {

            java.awt.Robot robot = new java.awt.Robot();

            // Creates the delay of 5 sec so that you can open notepad before

            // Robot start writting

            robot.delay(5000);

            robot.keyPress(KeyEvent.VK_1);

            robot.keyPress(KeyEvent.VK_2);

            robot.keyPress(KeyEvent.VK_3);

            robot.keyPress(KeyEvent.VK_4);

            robot.keyPress(KeyEvent.VK_5);

            robot.keyPress(KeyEvent.VK_6);

            robot.keyPress(KeyEvent.VK_7);


        } catch (AWTException e) {

            e.printStackTrace();

        }

    }

}