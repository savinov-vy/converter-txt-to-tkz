package main;

public class StartingProgramm {
    public static void main(String[] args) throws InterruptedException {
        TimeCount timeCount = new TimeCount(5);
        timeCount.StartTimeCount();

        RobotExp robot = new RobotExp();
        robot.startRobot();

    }
}