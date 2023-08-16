package frc.robot;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj.drive.MecanumDrive;




/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
   public static class RobotMap{

    //Motors controllers
    public static CANSparkMax FL = new CANSparkMax(2, MotorType.kBrushless);
    public static CANSparkMax BL = new CANSparkMax(4, MotorType.kBrushless);
    public static CANSparkMax FR = new CANSparkMax(1, MotorType.kBrushless);
    public static CANSparkMax BR = new CANSparkMax(3, MotorType.kBrushless);
    
    public static CANSparkMax Test_Motor = new CANSparkMax(5, MotorType.kBrushless);
   
    //Mecanum drive setup
    
    //Joysicks

    }
    public static final class Vars{
        //Controller port
        public static final int m_DriverVar = 0;
    }
}
