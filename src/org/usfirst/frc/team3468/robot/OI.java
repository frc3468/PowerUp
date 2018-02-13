/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team3468.robot;

import org.usfirst.frc.team3468.robot.commands.CubeExhaust;
import org.usfirst.frc.team3468.robot.commands.CubeIntake;
import org.usfirst.frc.team3468.robot.commands.LiftTriggers;

import edu.wpi.first.wpilibj.GenericHID.Hand;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	//// CREATING BUTTONS
	// One type of button is a joystick button which is any button on a
	//// joystick.
	// You create one by telling it which joystick it's on and which button
	// number it is.
	// Joystick stick = new Joystick(port);
	// Button button = new JoystickButton(stick, buttonNumber);

	// There are a few additional built in buttons you can use. Additionally,
	// by subclassing Button you can create custom triggers and bind those to
	// commands the same as any other Button.

	//// TRIGGERING COMMANDS WITH BUTTONS
	// Once you have a button, it's trivial to bind it to a button in one of
	// three ways:

	// Start the command when the button is pressed and let it run the command
	// until it is finished as determined by it's isFinished method.
	// button.whenPressed(new ExampleCommand());

	// Run the command while the button is being held down and interrupt it once
	// the button is released.
	// button.whileHeld(new ExampleCommand());

	// Start the command when the button is released and let it run the command
	// until it is finished as determined by it's isFinished method.
	// button.whenReleased(new ExampleCommand());
	
	XboxController xboxController = new XboxController(RobotMap.xboxController);
	
	Button cubeIntakeButton = new JoystickButton(xboxController, RobotMap.cubeIntakeButton);
	Button cubeExhaustButton = new JoystickButton(xboxController, RobotMap.cubeExhaustButton);
	
	Button liftTriggerButton = new JoystickButton(xboxController, RobotMap.liftTriggerButton);
	
	public OI() {
		cubeIntakeButton.whileHeld(new CubeIntake());
		cubeExhaustButton.whileHeld(new CubeExhaust());
		
		liftTriggerButton.whileHeld(new LiftTriggers());
	}
	
	public double getLX() {
		return xboxController.getX(Hand.kLeft);
	}
	
	public double getLY() {
		return xboxController.getY(Hand.kLeft);
	}
	
	public double getRX() {
		return xboxController.getX(Hand.kRight);
	}
	
	public double getRY() {
		return xboxController.getY(Hand.kRight);
	}
	
	public double getTriggers() {
		return (xboxController.getTriggerAxis(Hand.kRight) - xboxController.getTriggerAxis(Hand.kLeft));
	}
	
	public int getPOV() {
		return xboxController.getPOV();
	}
}
