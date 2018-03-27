package org.usfirst.frc.team3468.robot.subsystems;

import org.usfirst.frc.team3468.robot.RobotMap;
import org.usfirst.frc.team3468.robot.commands.HaloDrive;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

/**
 *
 */
public class Drivetrain extends Subsystem {
	
	//boolean liftMode = false;
	
	
	
	Spark motorDrivetrainFrontRight = new Spark(RobotMap.drivetrainFrontRight);
	Spark motorDrivetrainBackRight = new Spark(RobotMap.drivetrainRearRight);
	SpeedControllerGroup rightMotors = new SpeedControllerGroup(motorDrivetrainFrontRight, motorDrivetrainBackRight);
	
	Spark motorDrivetrainFrontLeft = new Spark(RobotMap.drivetrainFrontLeft);
	Spark motorDrivetrainBackLeft = new Spark(RobotMap.drivetrainRearLeft);
	SpeedControllerGroup leftMotors = new SpeedControllerGroup(motorDrivetrainFrontLeft, motorDrivetrainBackLeft);
	
	DifferentialDrive robotDrive = new DifferentialDrive(leftMotors, rightMotors);
	
	public void haloDrive(double magnitude, double rotation) {
		//if(liftMode == true) {
			//magnitude = .6*magnitude;
		//}
		rotation = map(rotation, -1.0, 1.0, -0.8, 0.8);
		robotDrive.arcadeDrive(magnitude, rotation);
	}
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        setDefaultCommand(new HaloDrive());
    }
    
    private double map(double x, double in_min, double in_max, double out_min, double out_max) {
      return (x - in_min) * (out_max - out_min) / (in_max - in_min) + out_min;
    }
    
   // public void setLiftMode(boolean mode) {
    	//liftMode = mode;
   //` }
}

