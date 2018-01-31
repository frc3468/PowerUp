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
	
	
	Spark motorDrivetrainFrontRight = new Spark(RobotMap.drivetrainFrontRight);
	Spark motorDrivetrainBackRight = new Spark(RobotMap.drivetrainRearRight);
	SpeedControllerGroup rightMotors = new SpeedControllerGroup(motorDrivetrainFrontRight, motorDrivetrainBackRight);
	
	Spark motorDrivetrainFrontLeft = new Spark(RobotMap.drivetrainFrontLeft);
	Spark motorDrivetrainBackLeft = new Spark(RobotMap.drivetrainRearLeft);
	SpeedControllerGroup leftMotors = new SpeedControllerGroup(motorDrivetrainFrontLeft, motorDrivetrainBackLeft);
	
	DifferentialDrive robotDrive = new DifferentialDrive(leftMotors, rightMotors);
	
	public void haloDrive(double magnitude, double rotation) {
		robotDrive.arcadeDrive(magnitude, rotation);
	}
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        setDefaultCommand(new HaloDrive());
    }
}

