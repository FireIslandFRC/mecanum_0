package frc.robot;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import frc.robot.Constants.Vars;

public class OI {
    public Joystick m_Driver = new Joystick(Vars.m_DriverVar);

    public static int translationAxis = Joystick.kDefaultYChannel;
    public static int strafeAxis = Joystick.kDefaultXChannel;
    public static int rotationAxis = Joystick.kDefaultTwistChannel;
}
