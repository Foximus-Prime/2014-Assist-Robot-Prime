/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AssistRobotPart;

import AssistRobotRunner.BotRunner;
import edu.wpi.first.wpilibj.camera.AxisCamera;

/**
 *
 * @author Team 3695
 */

public class ImageProPart extends BotPart {
        
    public ImageProPart(BotRunner runner){
        super(runner);
        
        AxisCamera.getInstance("10.36.95.11");
    }

    
}
