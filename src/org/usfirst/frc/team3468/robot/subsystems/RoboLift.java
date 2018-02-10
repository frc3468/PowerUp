package org.usfirst.frc.team3468.robot.subsystems;

import org.usfirst.frc.team3468.robot.RobotMap;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class RoboLift extends Subsystem {
	
	Spark motorLift = new Spark(RobotMap.liftMotor);
	

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	
	public void pullUp() {
		motorLift.set(.2);
	}
	
	public void stop() {
		motorLift.set(0);
		
	}
	
	public void pushDown() {
		motorLift.set(-.2);
		
	}
		
	
    public void initDefaultCommand() {
    	
    	
    	
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

