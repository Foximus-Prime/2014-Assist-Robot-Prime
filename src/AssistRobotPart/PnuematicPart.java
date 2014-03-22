/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AssistRobotPart;

import AssistRobotRunner.BotRunner;
import edu.wpi.first.wpilibj.Compressor;

/**
 *
 * @author Team 3695
 */
public class PnuematicPart extends BotPart {
    
    private Compressor botCompressor;
    
    private BotRunner bot;
    
    public PnuematicPart(BotRunner runner){
        super(runner);
        
        bot = runner;
        
        botCompressor = new Compressor(1,1);
    }
    
    public void compressorOn()
    {botCompressor.start();}
    
    public void compressorOff()
    {botCompressor.stop();}
    
    public boolean isCompressing()
    {return botCompressor.getPressureSwitchValue();}
    
}
