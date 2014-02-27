/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AssistRobotPart;

import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj.Compressor;
import AssistRobotRunner.BotRunner;

/**
 *
 * @author Team 3695
 */
public class PnuematicPart extends BotPart {
    
    private Compressor botCompressor;

    private Relay compression;
    
    private BotRunner bot;
    
    public PnuematicPart(BotRunner runner){
        super(runner);
        
        bot = runner;
        //botCompressor = new Compressor(1,1);
        compression = new Relay(8);
    }
    
    //public void compressorOn()
    //{botCompressor.start();}
    
    //public void compressorOff()
    //{botCompressor.stop();}
    
    public void updateTeleop(){
        
        if(bot.getSensor().getOpStick().getRawButton(11))
            compression.set(Relay.Value.kOn);
        else if(bot.getSensor().getOpStick().getRawButton(10))
            compression.set(Relay.Value.kOff);
                
    }
    
}
