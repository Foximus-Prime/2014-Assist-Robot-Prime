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
    
    private Jaguar pullMotor;
    
    private BotRunner bot;
    
    private boolean armLimitSwitch;
    private boolean shooterReady;
    
    private DoubleSolenoid release;
   
    public ShooterPart(BotRunner runner){
        super(runner);
        
        bot = runner;
        
        pullMotor = new Jaguar(5);
        
        armLimitSwitch = true;
        shooterReady = false;
        
        release = new DoubleSolenoid(1,2);
    }
    
    public void fire(){
        
        release.set(DoubleSolenoid.Value.kForward);
    }
    
    public void updateTeleop(){
    
        armLimitSwitch = bot.getSensor().getArmLimit();
    }
    
    
    
    
    
    
}
