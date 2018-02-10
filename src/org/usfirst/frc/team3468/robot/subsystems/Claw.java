package org.usfirst.frc.team3468.robot.subsystems;

import org.usfirst.frc.team3468.robot.RobotMap;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Claw extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	Spark leftMotor = new Spark(RobotMap.leftClawMotor);
	Spark rightMotor = new Spark(RobotMap.rightClawMotor);
	
	public Claw() {
		rightMotor.setInverted(true);
	}
	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void set(double speed) {
    	leftMotor.set(speed);
    	rightMotor.set(speed);
    }
    
    public void intake() {
    	set(0.5);
    }
    
    public void exhaust() {
    	set(-0.5);
    }
}

