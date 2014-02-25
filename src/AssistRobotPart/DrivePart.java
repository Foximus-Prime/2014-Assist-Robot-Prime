/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AssistRobotPart;

import edu.wpi.first.wpilibj.Jaguar;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 * @author Team 3695
 */
public class DrivePart extends BotPart {
    
    private Jaguar frontRight;
    private Jaguar frontLeft;
    private Jaguar backRight;
    private Jaguar backLeft;
    
    private RobotDrive roboDrive;
    
    public DrivePart(){
        
        frontRight = new Jaguar(1);
        frontLeft = new Jaguar(2);
        backRight = new Jaguar(3);
        backLeft = new Jaguar(4);
        
        roboDrive = new RobotDrive(frontLeft, backLeft, frontRight, backRight);
    }
    
}
