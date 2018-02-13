package org.usfirst.frc.team3468.robot.subsystems;

import org.usfirst.frc.team3468.robot.RobotMap;
import org.usfirst.frc.team3468.robot.commands.ElevatorPOV;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Elevator extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	Spark elevatorMotor = new Spark(RobotMap.elevatorMotor);
	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	setDefaultCommand(new ElevatorPOV());
    }
    
    public void set(double speed) {
    	elevatorMotor.set(speed);
    }
    
    public void stop() {
    	set(0);
    }
    
    public void ascend() {
    	set(0.2);
    }
    
    public void descend() {
    	set(-0.2);
    }
}

