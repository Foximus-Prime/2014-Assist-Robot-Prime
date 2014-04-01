/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AssistRobotPart;

import AssistRobotRunner.BotRunner;
import edu.wpi.first.wpilibj.DoubleSolenoid;

/**
 *
 * @author Team 3695
 */

public class ArmPart extends BotPart {
    
    private BotRunner bot;
    
    private DoubleSolenoid armControlOne;
    private DoubleSolenoid armControlTwo;
    
    public ArmPart(BotRunner runner){
        super(runner);
        
        bot = runner;
      
        armControlOne = new DoubleSolenoid(3,4);
        armControlTwo = new DoubleSolenoid(5,6);
    }
    
    public void updateTeleop(){
        
        if(bot.getSensor().getOpStick().getRawButton(2)){
            armControlOne.set(DoubleSolenoid.Value.kForward);
            armControlTwo.set(DoubleSolenoid.Value.kForward);
        }
        
        else if(bot.getSensor().getOpStick().getRawButton(3)){
            armControlOne.set(DoubleSolenoid.Value.kReverse);
            armControlTwo.set(DoubleSolenoid.Value.kReverse);
        }
        
        else{
            armControlOne.set(DoubleSolenoid.Value.kForward);
            armControlTwo.set(DoubleSolenoid.Value.kReverse);
        }
    }
}
