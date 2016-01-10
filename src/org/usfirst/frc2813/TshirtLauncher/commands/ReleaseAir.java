package org.usfirst.frc2813.TshirtLauncher.commands;

import org.usfirst.frc2813.TshirtLauncher.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class ReleaseAir extends Command {

	protected void initialize() {
		requires(Robot.shirtLauncher);
	}

	protected void execute() {
		Robot.shirtLauncher.solenoidOn();
	}

	protected boolean isFinished() {
		return false;
	}

	protected void end() {
		Robot.shirtLauncher.solenoidOff();
	}

	protected void interrupted() {
		Robot.shirtLauncher.solenoidOff();
	}

}
