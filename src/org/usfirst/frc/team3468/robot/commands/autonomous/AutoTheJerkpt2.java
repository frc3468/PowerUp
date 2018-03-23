package org.usfirst.frc.team3468.robot.commands.autonomous;

import org.usfirst.frc.team3468.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class AutoTheJerkpt2 extends Command {

    public AutoTheJerkpt2() {
    	requires(Robot.drivetrain);
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	setTimeout(0.1);
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.drivetrain.haloDrive(-0.6,0);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
    	
        return isTimedOut();
    }

    // Called once after isFinished returns true
    protected void end() {
    	interrupted();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	Robot.drivetrain.haloDrive(0,0);
    }
}