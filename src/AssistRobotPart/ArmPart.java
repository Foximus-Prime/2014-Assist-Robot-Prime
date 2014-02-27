/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AssistRobotPart;

import AssistRobotRunner.BotRunner;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Joystick;

/**
 *
 * @author Team 3695
 */

public class ArmPart extends BotPart {
    
    private BotRunner bot;
    
    private DoubleSolenoid armControl;
    
    private boolean armLimit;
    
    public ArmPart(BotRunner runner){
        super(runner);
        
        bot = runner;
        
        armLimit = true;
      
        armControl = new DoubleSolenoid(3,4);
    }
    
    public void updateTeleop(){
        
        armLimit = bot.getSensor().getArmLimit();
        
        if(bot.getSensor().getOpStick().getRawButton(2))
            armControl.set(DoubleSolenoid.Value.kReverse);
        
        else if(bot.getSensor().getOpStick().getRawButton(3))
            armControl.set(DoubleSolenoid.Value.kForward);
        
        else 
            armControl.set(DoubleSolenoid.Value.kOff);
    }
    
}
