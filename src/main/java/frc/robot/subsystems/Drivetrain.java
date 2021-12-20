package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

public class Drivetrain extends Subsystem {
    
    WPI_TalonSRX m_FL = new WPI_TalonSRX(6),
    m_FR = new WPI_TalonSRX(4),
    m_RL = new WPI_TalonSRX(1),
    m_RR = new WPI_TalonSRX(7);
    //front left 6, rear left 1, front right 4, rear right 7

    DifferentialDrive m_drive;

    public Drivetrain() {
        //left side
        //m_FL = new TalonSRX(6);
        //m_RL = new TalonSRX(1);
        SpeedControllerGroup m_leftSide = new SpeedControllerGroup(m_FL, m_RL);

        //right side
        //m_FR = new TalonSRX(4);
        //m_RR = new TalonSRX(7);
        SpeedControllerGroup m_rightSide = new SpeedControllerGroup(m_FR, m_RR);

        m_drive = new DifferentialDrive(m_leftSide, m_rightSide);


    }

    public void TankDrive(double leftSpeed, double rightSpeed) {
        m_drive.tankDrive(leftSpeed, rightSpeed);
    }

    



    @Override
    protected void initDefaultCommand() {
        // TODO Auto-generated method stub

    }
}
