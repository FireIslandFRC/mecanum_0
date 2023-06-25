package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.RobotMap;
public class Drive_sub extends SubsystemBase{
    public Drive_sub(){
    }

    public void drive(double vx, double vy, double omega) {
        RobotMap.m_robotDrive.driveCartesian(vx,vy,omega);
    }

    public void stop() {
        RobotMap.m_robotDrive.driveCartesian(0, 0, 0);
    }
}
