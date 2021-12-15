package frc.robot;

import frc.robot.subsystem.*;

public class RobotContainer {

    public DriveSubsystem m_drive; //creates a drive system named m_driv
    public OI m_driverController; //creates a controller named driverController.
    public OI m_operatorController;

    public RobotContainer() {
        m_driverController = new OI(0); //first controller connected is driver's controller
        m_operatorController = new OI(1); //second controller connected is operator's controller
        /**
         * Controllers always start at 0. So controller 1 would in code be OI(0), controller 2 as OI(1), and so on.
         */
    }
}
