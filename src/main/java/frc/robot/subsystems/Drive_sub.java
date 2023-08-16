package frc.robot.subsystems;

import edu.wpi.first.wpilibj.drive.MecanumDrive;
import edu.wpi.first.wpilibj2.command.PrintCommand;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;
import frc.robot.Constants.RobotMap;
import frc.robot.commands.Drive;
public class Drive_sub extends SubsystemBase{
    public MecanumDrive m_robotDrive = new MecanumDrive(Constants.RobotMap.FL, Constants.RobotMap.BL, Constants.RobotMap.FR, Constants.RobotMap.BR);

    public Drive_sub(){
        
    }

    public void drive(double vx, double vy, double omega) {
        m_robotDrive.driveCartesian(vx, vy, omega);
        System.out.println("X" + vx);
        System.out.println("Y" + vy);
        System.out.println("Omega" + omega);

    }

    public void stop() {
        m_robotDrive.driveCartesian(0, 0, 0);
    }
}
