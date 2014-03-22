
package AssistRobotPart;

import edu.wpi.first.wpilibj.AnalogChannel;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.camera.AxisCamera;
import edu.wpi.first.wpilibj.camera.AxisCameraException;
import edu.wpi.first.wpilibj.networktables.NetworkTable;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import AssistRobotRunner.BotRunner;

/**
 *
 * @author Team 3695
 */
public class SensorPart extends BotPart{
    
    private AxisCamera cam;
    
    private NetworkTable driverStation;
    
    private Joystick driveStick;
    private Joystick opStick;
    
    private DigitalInput armLimit;
    private DigitalInput armSensor;
    
    private AxisCamera camera;
    
    private AnalogChannel ultraSonic;
    
    private SmartDashboard dash;
    
    public SensorPart(BotRunner runner){
        super(runner);
        
        //driverStation = NetworkTable.getTable("SmartDashboard");
        
        driveStick = new Joystick(1);
        opStick = new Joystick(2);
        
        ultraSonic = new AnalogChannel(6);
        
        armLimit = new DigitalInput(4);
        armSensor = new DigitalInput(14);
        
        //frontUltra = new Ultrasonic(2,2);
    
    }
    
    public void UpdateTeleop(){
        
        dash.putDouble("UltraDistance", ultraSonic.getVoltage());
    }
    
    public void UpdateAuto(){
        
        dash.putDouble("UltraDistance", ultraSonic.getVoltage());
        
    }
    
    //public AxisCamera getCam()
    //{}
    
    public Joystick getDriverStick()
    {return driveStick;}
    
    public Joystick getOpStick()
    {return opStick;}
    
    public boolean getArmLimit()
    {return armLimit.get();}
    
    public double getUltra()
    {return ultraSonic.getAverageValue();}
    
    public boolean getArmSensor()
    {return armSensor.get();}

}
