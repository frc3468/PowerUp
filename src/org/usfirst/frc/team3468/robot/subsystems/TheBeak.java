package org.usfirst.frc.team3468.robot.subsystems;

import org.usfirst.frc.team3468.robot.RobotMap;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class TheBeak extends Subsystem {
	
	Spark rightBeak = new Spark(RobotMap.theRightBeakMotor);
	Spark leftBeak = new Spark(RobotMap.theLeftBeakMotor);
	
	public TheBeak() {
		
		leftBeak.setInverted(true);
		
	}
	public void theEat() {
		
		rightBeak.set(.5);
		leftBeak.set(.5);
		
	}
	public void theRegurgitate() {
		rightBeak.set(-.5);
		leftBeak.set(-.5);
		
	}
	public void theHalt() {
		rightBeak.set(0);
		leftBeak.set(0);
		
	}
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

