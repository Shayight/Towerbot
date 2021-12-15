package frc.robot.subsystem;

import com.ctre.phoenix.motorcontrol.can.*;

import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

public class DriveSubsystem extends Subsystem {
    public WPI_TalonSRX _FR,_FL,_RL,_RR;
    public DifferentialDrive _drive;


    public DriveSubsystem() {
        _FL = new WPI_TalonSRX(6); //call Front Left motor
        _RL = new WPI_TalonSRX(1); //call Rear Left motor
        SpeedControllerGroup leftSide = new SpeedControllerGroup(_FL, _RL);
        //combine FL and RL motors into one side, which is left side.

        
        _FR = new WPI_TalonSRX(4); //call Front Right motor
        _RR = new WPI_TalonSRX(7); //call Rear Right motor 
        SpeedControllerGroup rightSide = new SpeedControllerGroup(_FR, _RR);
        //combine FR and FR motors into right side.

        _drive = new DifferentialDrive(leftSide, rightSide); 
        //group the two sides into one motor group, which consists of the left and right sides.
    }

    public void TankDrive(double leftSpeed, double rightSpeed) { //method to be used outside of this class
        _drive.tankDrive(leftSpeed, rightSpeed); //Control the motor group speeds based on sides
    }

    protected void initDefaultCommand() {
        //autocreated section that is required, ignore.
    }
}

