package org.usfirst.frc.team3468.robot.commands;

import org.usfirst.frc.team3468.robot.commands.autonomous.AutoBoxInsurance;
import org.usfirst.frc.team3468.robot.commands.autonomous.AutoClaw;
import org.usfirst.frc.team3468.robot.commands.autonomous.AutoDrive;
import org.usfirst.frc.team3468.robot.commands.autonomous.AutoLift;
import org.usfirst.frc.team3468.robot.commands.autonomous.AutoTheJerk;
import org.usfirst.frc.team3468.robot.commands.autonomous.AutoTheJerkpt2;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class SwitchAutonomous extends CommandGroup {

    public SwitchAutonomous() {
    	
    	addSequential(new AutoTheJerk());
    	
    	addParallel(new AutoTheJerkpt2());
    	addSequential(new AutoBoxInsurance());
    	
    	addParallel(new AutoDrive(3));
    	addSequential(new AutoLift());
    	
    	addSequential(new AutoClaw());
    	
    	
        // Add Commands here:
        // e.g. addSequential(new Command1());
        //      addSequential(new Command2());
        // these will run in order.

        // To run multiple commands at the same time,
        // use addParallel()
        // e.g. addParallel(new Command1());
        //      addSequential(new Command2());
        // Command1 and Command2 will run in parallel.

        // A command group will require all of the subsystems that each member
        // would require.
        // e.g. if Command1 requires chassis, and Command2 requires arm,
        // a CommandGroup containing them would require both the chassis and the
        // arm.
    }
}
