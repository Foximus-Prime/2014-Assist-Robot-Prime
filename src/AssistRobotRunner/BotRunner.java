/*----------------------------------------------------------------------------*/
/* Copyright (c) FIRST 2008. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package AssistRobotRunner;


import edu.wpi.first.wpilibj.SimpleRobot;
import AssistRobotPart.ArmPart;
import AssistRobotPart.DrivePart;
import AssistRobotPart.PnuematicPart;
import AssistRobotPart.SensorPart;
import AssistRobotPart.ShooterPart;
import edu.wpi.first.wpilibj.IterativeRobot;

public class BotRunner extends IterativeRobot {
    /**
     * This function is called once each time the robot enters autonomous mode.
     */    
    
    private ArmPart arm;
    private DrivePart drive;
    private PnuematicPart pnuematic;
    private SensorPart sensor;
    private ShooterPart shooter;
    
    public void robotInit() {
        
        arm = new ArmPart(this);
        drive = new DrivePart(this);
        pnuematic = new PnuematicPart(this);
        sensor = new SensorPart(this);
        shooter = new ShooterPart(this);
        
        //pnuematic.compressorOn();
    }
    
    public void autonomusInit(){
    }
        
    public void autonomousPeriodic() {
        
        arm.updateAuto();
        drive.updateAuto();
        pnuematic.updateAuto();
        sensor.updateAuto();
        shooter.updateAuto();
    }
    
    public void teleopInit(){
    }
    
    public void teleopDisable(){
        //pnuematic.compressorOff();
    }

    public void teleopPeriodic() {

        arm.updateTeleop();
        drive.updateTeleop();
        pnuematic.updateTeleop();
        sensor.updateTeleop();
        shooter.updateTeleop();
    }
    
    public ArmPart getArm()
    {return arm;}
    
    public DrivePart getDrive()
    {return drive;}
    
    public PnuematicPart getPnuematic()
    {return pnuematic;}
    
    public SensorPart getSensor()
    {return sensor;}
    
    public ShooterPart getShooter()
    {return shooter;}
}
    