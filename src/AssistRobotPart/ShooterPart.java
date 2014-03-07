/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AssistRobotPart;

import edu.wpi.first.wpilibj.Jaguar;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import AssistRobotRunner.BotRunner;

/**
 *
 * @author Team 3695
 */
public class ShooterPart extends BotPart {
    
    private double speed;
    
    private Jaguar pullMotor;
    
    private BotRunner bot;
    
    private boolean armLimitSwitch;
    private boolean shooterReady;
        
    private DoubleSolenoid release;
   
    public ShooterPart(BotRunner runner){
        super(runner);
        
        speed = 1;
        
        bot = runner;
        
        pullMotor = new Jaguar(5);
        
        armLimitSwitch = true;
        shooterReady = false;
        
        release = new DoubleSolenoid(1,2);
    }
    
    public void updateTeleop(){
    
        armLimitSwitch = bot.getSensor().getArmLimit();
        
        
        if(bot.getSensor().getOpStick().getTrigger())
            release.set(DoubleSolenoid.Value.kForward);
        else
            release.set(DoubleSolenoid.Value.kReverse);
        
        
        if (bot.getSensor().getOpStick().getRawButton(5))
            pullMotor.set(1);
        else
            pullMotor.stopMotor();
        
        
        if (bot.getSensor().getOpStick().getRawButton(4))
            pullMotor.set(-1);
        else
            pullMotor.stopMotor();
    }
}
