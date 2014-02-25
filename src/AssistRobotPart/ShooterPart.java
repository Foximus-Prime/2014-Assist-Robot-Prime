/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AssistRobotPart;

import edu.wpi.first.wpilibj.Jaguar;
import edu.wpi.first.wpilibj.DoubleSolenoid;

/**
 *
 * @author Team 3695
 */
public class ShooterPart extends BotPart {
    
    Jaguar pullMotor;
    
    boolean armLimitSwitch;
    
    DoubleSolenoid release;
   
    public ShooterPart(){
        
        pullMotor = new Jaguar(5);
        
        armLimitSwitch = true;
        
        release = new DoubleSolenoid(1,2);
    }
    
    
    
    
    
    
}
