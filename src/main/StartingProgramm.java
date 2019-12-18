package main;

import java.io.IOException;

public class StartingProgramm {
    public static void main(String[] args) throws InterruptedException, IOException {
        TimeCount timeCount = new TimeCount(5);
        timeCount.StartTimeCount();

        InputData inputData = new InputData();

        RobotExp robot = new RobotExp(inputData.start());
        robot.startRobot();


    }
}