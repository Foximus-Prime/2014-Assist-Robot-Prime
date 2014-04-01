/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AssistRobotPart;

import AssistRobotRunner.BotRunner;
import edu.wpi.first.wpilibj.Jaguar;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Timer;

/**
 *
 * @author Team 3695
 */
public class DrivePart extends BotPart {
    
    private Jaguar frontRight;
    private Jaguar frontLeft;
    private Jaguar backRight;
    private Jaguar backLeft;

    private int shotRange;
    
    private Timer autoTime;
    
    private double highRange;
    private double lowRange;
    
    private BotRunner bot;
    
    private RobotDrive roboDrive;
    
    public DrivePart(BotRunner runner){
        super(runner);
         
        bot = runner;
        
        shotRange = 90;
        highRange = 60;
        lowRange = 30;
        
        autoTime = new Timer();
        
        frontRight = new Jaguar(1);
        frontLeft = new Jaguar(2);
        backRight = new Jaguar(3);
        backLeft = new Jaguar(4);
        
        roboDrive = new RobotDrive(frontLeft, backLeft, frontRight, backRight);
        
        roboDrive.setInvertedMotor(RobotDrive.MotorType.kRearRight, true);
        roboDrive.setInvertedMotor(RobotDrive.MotorType.kFrontLeft, true);
    }
    
    public void updateTeleop(){
        
        if(bot.getSensor().getDriverStick().getRawButton(2))
            roboDrive.mecanumDrive_Cartesian(0, bot.getSensor().getDriverStick().getY(), bot.getSensor().getDriverStick().getX(), 0);
        else
            roboDrive.mecanumDrive_Cartesian(bot.getSensor().getDriverStick().getX(), bot.getSensor().getDriverStick().getY(), 0, 0);
        
    }
    
    public void updateAuto(){
        if(bot.getSensor().getUltra() > shotRange){
            autoTime.reset();
            roboDrive.mecanumDrive_Cartesian(0, -0.5 , 0, 0);
        }
                    
        if(autoTime.get() > 3){
            bot.getShooter().fire();
            roboDrive.mecanumDrive_Cartesian(0, 0, 0, 0);
        }
    }
    
    public void startTimer(){
        autoTime.reset();
        autoTime.start();
    }
    
    public boolean inRange()
    {return bot.getSensor().getUltra() < highRange && bot.getSensor().getUltra() > lowRange;}
    
    public double getTimer()
    {return autoTime.get();}
    
}





