/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AssistRobotPart;

import AssistRobotRunner.BotRunner;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Jaguar;
import edu.wpi.first.wpilibj.Timer;

/**
 *
 * @author Team 3695
 */
public class ShooterPart extends BotPart {
    
    private Timer fireTime;
    private Timer pullTime;
    
    private double speed;
    private double pullBack;
    
    private Jaguar pullMotor;
    
    private BotRunner bot;
    
    private boolean armLimitSwitch;
    private boolean shooterReady;
    private boolean fired;
        
    private DoubleSolenoid release;
   
    public ShooterPart(BotRunner runner){
        super(runner);
        
        speed = 1;
        pullBack = 2;
        
        bot = runner;
        
        pullMotor = new Jaguar(5);
        
        armLimitSwitch = true;
        shooterReady = false;
        fired = false;
        
        release = new DoubleSolenoid(1,2);
        
        fireTime = new Timer();
        pullTime = new Timer();
    }
    
    public void updateTeleop(){
    
        armLimitSwitch = bot.getSensor().getArmLimit();
        
        
        if(bot.getSensor().getOpStick().getTrigger()){
            release.set(DoubleSolenoid.Value.kForward);
            pullTime.reset();
        }
        else
            release.set(DoubleSolenoid.Value.kReverse);
        
        if(pullTime.get() > 0.25 && pullTime.get() < pullBack)
            pullMotor.set(-1);
        else
            pullMotor.stopMotor();
        
        if (bot.getSensor().getOpStick().getRawButton(4) && bot.getSensor().getArmLimit())
            pullMotor.set(-1);
        else
            pullMotor.stopMotor();
        
    }
    
    public void updateAuto(){
    
        if(!bot.getSensor().getArmSensor() && !fired)
            pullMotor.set(-1);
        else
            pullMotor.stopMotor();
    }
    
    public void fire(){
       fired = true;
       release.set(DoubleSolenoid.Value.kForward);
    }
    
    public void startArms()
    { pullTime.start();}
    
    public boolean getFired()
    {return fired;}
    
    public void resetFired()
    {fired = false;}
}