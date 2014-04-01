/*----------------------------------------------------------------------------*/
/* Copyright (c) FIRST 2008. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package AssistRobotRunner;

import AssistRobotPart.*;
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
    private ImageProPart image;
    private DriverStationPart ds;
    
    public void robotInit() {
        
        arm = new ArmPart(this);
        drive = new DrivePart(this);
        pnuematic = new PnuematicPart(this);
        sensor = new SensorPart(this);
        shooter = new ShooterPart(this);
        image = new ImageProPart(this);
        ds = new DriverStationPart(this);
        
        //pnuematic.compressorOn();
    }
    
    public void autonomousInit(){
        drive.startTimer();
        shooter.resetFired();
    }
        
    public void autonomousPeriodic() {
        
        arm.updateAuto();
        drive.updateAuto();
        pnuematic.updateAuto();
        sensor.updateAuto();
        shooter.updateAuto();
        image.updateAuto();
        ds.updateAuto();
    }
    
    public void teleopInit(){
        pnuematic.compressorOn();
        shooter.startArms();
    }
    
    public void teleopDisable(){
        pnuematic.compressorOff();
    }

    public void teleopPeriodic() {

        arm.updateTeleop();
        drive.updateTeleop();
        pnuematic.updateTeleop();
        sensor.updateTeleop();
        shooter.updateTeleop();
        image.updateTeleop();
        ds.updateTeleop();
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
    
    public ImageProPart getImage()
    {return image;}
}
    