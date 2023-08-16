// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import frc.robot.subsystems.Drive_sub;

import java.util.function.DoubleSupplier;

import edu.wpi.first.wpilibj2.command.CommandBase;

/** An example command that uses an example subsystem. */
public class Drive extends CommandBase {
  public Drive_sub subsystem;
  public DoubleSupplier x;
  public DoubleSupplier y;
  public DoubleSupplier omega;

  /**
   * Creates a new ExampleCommand.
   *
   * @param subsystem The subsystem used by this command.
   */
  public Drive(Drive_sub subsystem, DoubleSupplier x, DoubleSupplier y, DoubleSupplier omega) {
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(subsystem);
    this.subsystem = subsystem;
    this.x = x;
    this.y = y;
    this.omega = omega;
  }


  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    //subsystem.stop();

  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    subsystem.drive(x.getAsDouble(), y.getAsDouble(), omega.getAsDouble());
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
