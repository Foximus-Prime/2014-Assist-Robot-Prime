/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AssistRobotPart;

import edu.wpi.first.wpilibj.Compressor;

/**
 *
 * @author Team 3695
 */
public class PnuematicPart extends BotPart {
    
    Compressor botCompressor;
            
    public PnuematicPart(){
        botCompressor = new Compressor(1,2);
    }
    
    public void compressorOn()
    {botCompressor.start();}
    
    public void compressorOff()
    {botCompressor.stop();}
    
}
