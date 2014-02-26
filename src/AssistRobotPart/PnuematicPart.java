/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AssistRobotPart;

import edu.wpi.first.wpilibj.Compressor;
import AssistRobotRunner.BotRunner;

/**
 *
 * @author Team 3695
 */
public class PnuematicPart extends BotPart {
    
    private Compressor botCompressor;
            
    public PnuematicPart(BotRunner runner){
        super(runner);
        botCompressor = new Compressor(1,1);
    }
    
    public void compressorOn()
    {botCompressor.start();}
    
    public void compressorOff()
    {botCompressor.stop();}
    
}
