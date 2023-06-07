package frc.robot;

import com.revrobotics.CANSparkMax;
import com.revrobotics.RelativeEncoder;
import com.revrobotics.CANSparkMax.IdleMode;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.math.geometry.Rotation2d;
import edu.wpi.first.math.geometry.Translation2d;
import edu.wpi.first.math.kinematics.SwerveDriveKinematics;
import edu.wpi.first.math.trajectory.TrapezoidProfile;
import edu.wpi.first.math.util.Units;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.PneumaticsModuleType;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.drive.MecanumDrive;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;




/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
   public static final class RobotMap{

    //Motors

    public static CANSparkMax RF =  new CANSparkMax(2, MotorType.kBrushless);
    public static CANSparkMax RB =  new CANSparkMax(4, MotorType.kBrushless);
    public static CANSparkMax LF =  new CANSparkMax(1, MotorType.kBrushless);
    public static CANSparkMax LB =  new CANSparkMax(3, MotorType.kBrushless);
    public static CANSparkMax Test_Motor =  new CANSparkMax(5, MotorType.kBrushless);

    //Differential drive

   
    MecanumDrive m_robotDrive = new MecanumDrive(LF, LB, RF, RB);
    
    //Joysicks

    Joystick m_stick = new Joystick(0);
    
   
}}
