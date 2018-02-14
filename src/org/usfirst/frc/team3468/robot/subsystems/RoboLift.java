package org.usfirst.frc.team3468.robot.subsystems;

import org.usfirst.frc.team3468.robot.RobotMap;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class RoboLift extends Subsystem {
	
	Spark motorLift = new Spark(RobotMap.liftMotor);
	Spark otherMotorLift = new Spark(RobotMap.secondLiftMotor);
	
	SpeedControllerGroup liftMotors = new SpeedControllerGroup(motorLift, otherMotorLift);
	

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	public RoboLift() {
		motorLift.setInverted(true);
		
	}
	public void pullUp() {
		
		liftMotors.set(.25);
	}
	
	public void stop() {
		liftMotors.set(0);
		
	}
	
	public void pushDown() {
		liftMotors.set(-.25);
		
		
	}
		
	
    public void initDefaultCommand() {
    	
    	
    	
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

