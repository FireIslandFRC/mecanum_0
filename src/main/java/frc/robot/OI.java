package frc.robot;
import edu.wpi.first.wpilibj.Joystick;
import frc.robot.Constants.Vars;

public class OI {
    //Joystick setup
    public Joystick m_Driver = new Joystick(Vars.m_DriverVar);

    //Joystick values
    public static int translationAxis = Joystick.kDefaultYChannel;
    public static int strafeAxis = Joystick.kDefaultXChannel;
    public static int rotationAxis = Joystick.kDefaultTwistChannel;
}
