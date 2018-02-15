package org.usfirst.frc.team3468.robot.commands;

import org.usfirst.frc.team3468.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class LimitLift extends Command {

    public LimitLift() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.elevator);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	if(Robot.elevator.atLowerLimit()) {
    		Robot.elevator.ascend();
    	} else if(Robot.elevator.atUpperLimit()) {
    		Robot.elevator.descend();
    	} else {
    		Robot.elevator.stop();
    	}
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
    	// Not at the Lower or Upper Limit
        return !(Robot.elevator.atLowerLimit() || Robot.elevator.atUpperLimit());
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.elevator.stop();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}
