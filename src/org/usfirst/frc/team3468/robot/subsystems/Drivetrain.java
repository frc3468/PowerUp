package org.usfirst.frc.team3468.robot.subsystems;

import org.usfirst.frc.team3468.robot.RobotMap;
import org.usfirst.frc.team3468.robot.commands.JoystickDrive;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

/**
 *
 */
public class Drivetrain extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	Spark leftMotor = new Spark(RobotMap.leftDrivetrainMotor);
	Spark rightMotor = new Spark(RobotMap.rightDrivetrainMotor);
	
	DifferentialDrive robotDrive = new DifferentialDrive(leftMotor, rightMotor);
	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	setDefaultCommand(new JoystickDrive());
    }
    
    public void tankDrive(double leftSpeed, double rightSpeed) {
    	robotDrive.tankDrive(leftSpeed, rightSpeed);
    }
    
    public void arcadeDrive(double speed, double rotation) {
    	robotDrive.arcadeDrive(speed, rotation);
    }
}

