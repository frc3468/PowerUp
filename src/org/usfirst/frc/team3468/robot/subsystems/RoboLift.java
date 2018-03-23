package org.usfirst.frc.team3468.robot.subsystems;

import org.usfirst.frc.team3468.robot.RobotMap;
import org.usfirst.frc.team3468.robot.commands.LiftBreaker;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class RoboLift extends Subsystem {
	
	Spark motorLift = new Spark(RobotMap.liftMotor);
	
	DigitalInput lowerLimit = new DigitalInput(RobotMap.lowerLimit);
	
	DigitalInput upperLimit = new DigitalInput(RobotMap.upperLimit);
	

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	public void set(double speed) {
		motorLift.set(speed);
		
	}
	
	public void pullUp() {
		motorLift.set(-0.7);
	}
	
	public void stop() {
		motorLift.set(0);
		
	}
	
	public void pushDown() {
		motorLift.set(0.3);
		
	}
	
	public boolean getLowerLimit() {
		return lowerLimit.get();
	}
	
	public boolean getUpperLimit() {
		return upperLimit.get();
	}
		
	
    public void initDefaultCommand() {
    	setDefaultCommand(new LiftBreaker());
    	
    	
    	
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

