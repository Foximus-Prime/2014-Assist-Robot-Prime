
package AssistRobotPart;

import AssistRobotRunner.BotRunner;
import edu.wpi.first.wpilibj.AnalogChannel;
import edu.wpi.first.wpilibj.Joystick;

/**
 *
 * @author Team 3695
 */
public class SensorPart extends BotPart{
    
    private Joystick driveStick;
    private Joystick opStick;
    
    private AnalogChannel ultraSonic;
    
    public SensorPart(BotRunner runner){
        super(runner);
        
        driveStick = new Joystick(1);
        opStick = new Joystick(2);
        
        ultraSonic = new AnalogChannel(6);
    
    }
    
    public Joystick getDriverStick()
    {return driveStick;}
    
    public Joystick getOpStick()
    {return opStick;}
    
    public double getUltra()
    {return ultraSonic.getAverageValue();}

}
