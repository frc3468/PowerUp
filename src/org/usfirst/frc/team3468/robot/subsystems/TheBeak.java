package org.usfirst.frc.team3468.robot.subsystems;

import org.usfirst.frc.team3468.robot.RobotMap;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class TheBeak extends Subsystem {
	
	Spark rightBeak = new Spark(RobotMap.theRightBeakMotor);
	Spark leftBeak = new Spark(RobotMap.theLeftBeakMotor);
	
	SpeedControllerGroup beakMotors = new SpeedControllerGroup(leftBeak, rightBeak);
	
	public TheBeak() {
		
		leftBeak.setInverted(true);
		
	}
	public void theEat() {
		beakMotors.set(-0.8);
		
	}
	public void theRegurgitate() {
		beakMotors.set(1);
		
	}
	public void theHalt() {
		beakMotors.set(0);
		
		
	}
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

