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
    
    private DoubleSolenoid armControl;
    
    private boolean armLimit;
    
    public ArmPart(BotRunner runner){
        super(runner);
        armLimit = true;
      
        armControl = new DoubleSolenoid(3,4);
    }
    
}
