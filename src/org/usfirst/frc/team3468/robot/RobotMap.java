/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team3468.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	// For example to map the left and right motors, you could define the
	// following variables to use with your drivetrain subsystem.
	// public static int leftMotor = 1;
	// public static int rightMotor = 2;

	// If you are using multiple modules, make sure to define both the port
	// number and the module. For example you with a rangefinder:
	// public static int rangefinderPort = 1;
	// public static int rangefinderModule = 1;
	
	// Joysticks
	public static int xboxController = 0;
	
	// Buttons
	public static int cubeIntakeButton = 1; // A Button
	public static int cubeExhaustButton = 2; // B Button
	public static int liftTriggerDriveButton = 3; // X Button
	
	//Drivetrain
	public static int leftFrontDrivetrainMotor = 0;
	public static int leftRearDrivetrainMotor = 1;
	public static int rightFrontDrivetrainMotor = 2;
	public static int rightRearDrivetrainMotor = 3;
	
	//Claw
	public static int leftClawMotor = 4;
	public static int rightClawMotor = 5;
	
	//Lift
	public static int liftMotor = 6;
	
}
