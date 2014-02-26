
package AssistRobotPart;

import edu.wpi.first.wpilibj.Ultrasonic;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import AssistRobotRunner.BotRunner;

/**
 *
 * @author Team 3695
 */
public class SensorPart extends BotPart{
    
    private Joystick driveStick;
    private Joystick opStick;
    
    private DigitalInput armLimit;
    private DigitalInput armSensor;
    
    private Ultrasonic frontUltra;
    
    private SmartDashboard smarts;
    
    public SensorPart(BotRunner runner){
        super(runner);
        
        driveStick = new Joystick(1);
        opStick = new Joystick(2);
        
        armLimit = new DigitalInput(4);
        armSensor = new DigitalInput(3);
        
        //frontUltra = new Ultrasonic(2,2);
    }
    
    public void UpdateTeleop(){
    }
    
    public Joystick getDriverStick()
    {return driveStick;}
    
    public Joystick getOpStick()
    {return opStick;}
    
    public boolean getArmLimit()
    {return armLimit.get();}
    
    public double getUltra()
    {return frontUltra.getRangeInches();}
    
    public boolean getArmSensor()
    {return armSensor.get();}

}
