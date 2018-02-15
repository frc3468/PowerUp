package org.usfirst.frc.team3468.robot.subsystems;

import org.usfirst.frc.team3468.robot.RobotMap;
import org.usfirst.frc.team3468.robot.commands.ElevatorPOV;
import org.usfirst.frc.team3468.robot.commands.LimitLift;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.buttons.Trigger;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Elevator extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	Spark elevatorMotor = new Spark(RobotMap.elevatorMotor);
	
	Trigger lowerLimitSwitch = new Trigger() {
		
		DigitalInput limitSwitch = new DigitalInput(RobotMap.lowerElevatorLimitSwitch);
		
		@Override
		public boolean get() {
			// TODO Auto-generated method stub
			return limitSwitch.get();
		}
	};
	
	Trigger upperLimitSwitch = new Trigger() {
		
		DigitalInput limitSwitch = new DigitalInput(RobotMap.upperElevatorLimitSwitch);
		
		@Override
		public boolean get() {
			// TODO Auto-generated method stub
			return limitSwitch.get();
		}
	};
	
	public Elevator() {
		lowerLimitSwitch.whileActive(new LimitLift());
		upperLimitSwitch.whileActive(new LimitLift());
	}
	
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
    
    public boolean atLowerLimit() {
    	return lowerLimitSwitch.get();
    }
    
    public boolean atUpperLimit() {
    	return upperLimitSwitch.get();
    }
}

