/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AssistRobotPart;

import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj.Compressor;
import AssistRobotRunner.BotRunner;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.Timer;

/**
 *
 * @author Team 3695
 */
public class PnuematicPart extends BotPart {
    
    private Compressor botCompressor;

    private SmartDashboard dash;
    
    private BotRunner bot;
    
    public PnuematicPart(BotRunner runner){
        super(runner);
        
        dash = new SmartDashboard();
        
        bot = runner;
        
        botCompressor = new Compressor(1,1);
    }
    
    public void compressorOn()
    {botCompressor.start();}
    
    public void compressorOff()
    {botCompressor.stop();}
    
    public void updateTeleop(){
        
          dash.putBoolean("pressure switch!", botCompressor.getPressureSwitchValue());
          dash.putBoolean("compressor enabled", botCompressor.enabled());
        
    }
    
}
