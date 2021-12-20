
    /*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystem;



import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.command.Subsystem;

public class OI extends Subsystem {
  public Joystick joy; //creates joys
  public Joystick joyDrive;
  
@Override
protected void initDefaultCommand() {
    // TODO Auto-generated method stub
    
}

  public OI(int controller) {
    joy = new Joystick(controller); //assigns joy to a joystick, set by RobotContainer.
  }

  public Joystick getController() {
    return joy;
  }

  //all axes 

  public double getLSVertical(){ //gets the value of the axis, inverted so forward is 1
    return joy.getRawAxis(1);
  }

  public double getLSHorizontal(){
    return joy.getRawAxis(0);
  }

  public double getRSVertical(){ 
    return joy.getRawAxis(5);
  }

  public double getRSHorizontal(){
    return joy.getRawAxis(2);
  }

  public double getLeftTrigger(){
    return joy.getRawAxis(3)/2+0.5;
  }

  public double getRightTrigger(){
    return joy.getRawAxis(4)/2+0.5;
  }



  /* all buttons
  getRawButtonPressed for the event and
  getRawButton for the state of the button */

  public boolean getSquare(){ 
    return joy.getRawButton(1);
  }

  public boolean getCross(){ //intake
    return joy.getRawButton(2);
  }

  public boolean getCircle(){
    return joy.getRawButton(3);
  }
  public boolean isCircleUp(){
    return joy.getRawButtonReleased(3);
  }

  public boolean getTriangle(){
    return joy.getRawButtonPressed(4);
  }

  public boolean getLeftBumper(){
    return joy.getRawButton(5);
  }

  public boolean getRightBumper(){ 
    return joy.getRawButtonPressed(6);
  }

  public boolean getLeftTriggerBool(){ 
    return joy.getRawButtonPressed(7);
  }

  public boolean getRightTriggerBool(){ 
    return joy.getRawButtonPressed(8);
  }

  public boolean getShare(){ 
    return joy.getRawButton(9);
  }

  public boolean getOptions(){
    return joy.getRawButtonPressed(10);
  }

  public boolean getLSButton(){ 
    return joy.getRawButtonPressed(11);
  }

  public boolean getRSButton(){
    return joy.getRawButtonPressed(12);
  }

  public boolean getHome(){ 
    return joy.getRawButtonPressed(13);
  }

  public boolean getPadPressed(){
    return joy.getRawButtonPressed(14);
  }


}
