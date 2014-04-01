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
    
    private Timer pullTime;
    
    private Jaguar pullMotor;
    
    private BotRunner bot;
    
    private boolean fired;
        
    private DoubleSolenoid release;
   
    public ShooterPart(BotRunner runner){
        super(runner);
        
        bot = runner;
        
        pullMotor = new Jaguar(5);
        
        fired = false;
        
        release = new DoubleSolenoid(1,2);
        
        pullTime = new Timer();
    }
    
    public void updateTeleop(){       
        if(bot.getSensor().getOpStick().getTrigger()){
            release.set(DoubleSolenoid.Value.kForward);
            pullTime.reset();
        }
        else
            release.set(DoubleSolenoid.Value.kReverse);
        
        if (bot.getSensor().getOpStick().getRawButton(4))
            pullMotor.set(-1);
        else
            pullMotor.stopMotor();
        
    }
    
    public void updateAuto(){
    
        if(!fired)
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