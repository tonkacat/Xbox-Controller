
package org.usfirst.frc.team86.robot;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import org.usfirst.frc.team86.robot.*;
import org.usfirst.frc.team86.util.*;


public class Robot extends IterativeRobot {
	


	@Override
	public void robotInit() {
		IO.left.setSelectedSensorPosition(0);
		IO.right.setSelectedSensorPosition(0);
		SmartDashboard.putNumber("Encoder Val left", 0);
	    SmartDashboard.putNumber("Encoder Val right", 0);
	}

	
	@Override
	public void autonomousInit() {
		IO.left.setSelectedSensorPosition(0);
		IO.right.setSelectedSensorPosition(0);
		SmartDashboard.putNumber("Encoder Val left", 0);
	    SmartDashboard.putNumber("Encoder Val right", 0);
	}

	/**
	 * This function is called periodically during autonomous.
	 */
	@Override
	public void autonomousPeriodic() {
		
		Auto.Auto1();
	}
	
	@Override
	public void teleopInit() {
		
		IO.left.setSelectedSensorPosition(0);
		IO.right.setSelectedSensorPosition(0);
		SmartDashboard.putNumber("Encoder Val left", 0);
	    SmartDashboard.putNumber("Encoder Val right", 0);
	}

	/**
	 * This function is called periodically during operator control.
	 */
	@Override
	public void teleopPeriodic() {
		Drive.Update();
	}

	/**
	 * This function is called periodically during test mode.
	 */
	@Override
	public void testPeriodic() {
	}
}
