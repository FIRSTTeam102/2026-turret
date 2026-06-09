// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.revrobotics.spark.SparkFlex;
import com.revrobotics.spark.SparkBase.ControlType;
import com.revrobotics.spark.SparkLowLevel.MotorType;
import edu.wpi.first.wpilibj.Timer;

public class Turret extends SubsystemBase {
  /** Creates a new ExampleSubsystem. */

  private SparkFlex turretMotor = new SparkFlex(0, null);
  private double kP = 0.0001; 
  private double kD = 0.000;
  private double goalX = 0;
  private double lastError =0; 
  private double angleTolerance = 0.2; //TODO might change 
  private final double max_power = 0.5; //TODO might change 
  double power = 0.0;
  
  //make elasped timer 

  public void setkP(double newkP){
    kP= newkP;
  }

  public void setkD(double newkD){
    kD= newkD;
  }

 

  public Turret() {





  }

  /**
   * Example command factory method.
   *
   * @return a command
   */
 

  /**
   * An example method querying a boolean state of the subsystem (for example, a digital sensor).
   *
   * @return value of some boolean subsystem state, such as a digital sensor.
   */
  public boolean exampleCondition() {
    // Query some boolean state, such as a digital sensor.
    return false;
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  @Override
  public void simulationPeriodic() {
    // This method will be called once per scheduler run during simulation
  }
}
