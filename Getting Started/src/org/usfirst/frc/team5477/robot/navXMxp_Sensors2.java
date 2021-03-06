package org.usfirst.frc.team5477.robot;
 
import com.kauailabs.navx.frc.AHRS;

import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.I2C;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;;

public class navXMxp_Sensors2
{
	AHRS ahrs;
	
	public navXMxp_Sensors2()
	{
		try
		{
			ahrs = new AHRS(I2C.Port.kOnboard);
		}
		catch (RuntimeException ex)
		{
			DriverStation.reportError("Error : Navx-MXP " + ex.getMessage() ,true );
		}
	}
	
	public void getGyro()
	{
		ahrs.reset();
		SmartDashboard.putNumber("Gyro Angle:",ahrs.getAngle());
		//SmartDashboard.putNumber("Gyro Roll:",ahrs.getRoll());
		//SmartDashboard.putBoolean("Gyro Connected:",ahrs.isConnected());
		SmartDashboard.putNumber("Gyro Rate:",ahrs.getRate());
		SmartDashboard.putNumber("Gyro Raw X:",ahrs.getRawGyroX());
		SmartDashboard.putNumber("Gyro Raw Y:",ahrs.getRawGyroY());
		SmartDashboard.putNumber("Gyro Raw Z:",ahrs.getRawGyroZ());
		
	}
	
	public void getAccelometer()
	{
		SmartDashboard.putNumber("NavX-MXP Accelometer X:", ahrs.getRawAccelX());
		SmartDashboard.putNumber("NavX-MXP Accelometer Y:", ahrs.getRawAccelY());
		SmartDashboard.putNumber("NavX-MXP Accelometer Z:", ahrs.getRawAccelZ());
	}
}
