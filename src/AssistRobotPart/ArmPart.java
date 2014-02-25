/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AssistRobotPart;

import edu.wpi.first.wpilibj.DoubleSolenoid;

/**
 *
 * @author Team 3695
 */
public class ArmPart extends BotPart {
    
    DoubleSolenoid armControl;
    
    boolean armLimit;
    
    public ArmPart(){
        
        armLimit = true;
      
        armControl = new DoubleSolenoid(3,4);
    }
    
}
