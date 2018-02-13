package org.usfirst.frc.team3468.robot.commands;

import org.usfirst.frc.team3468.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class ElevatorPOV extends Command {

    public ElevatorPOV() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.elevator);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	int povPosition = Robot.m_oi.getPOV();
    	
    	if(povPosition == 0) {
    		Robot.elevator.ascend();
    	} else if(povPosition == 180) {
    		Robot.elevator.descend();
    	} else {
    		Robot.elevator.stop();
    	}
    	
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.elevator.set(0);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}
