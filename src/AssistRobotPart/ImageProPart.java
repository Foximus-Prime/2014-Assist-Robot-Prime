/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AssistRobotPart;

import AssistRobotRunner.BotRunner;
import edu.wpi.first.wpilibj.camera.AxisCamera;
import edu.wpi.first.wpilibj.image.BinaryImage;
import edu.wpi.first.wpilibj.image.ColorImage;
import edu.wpi.first.wpilibj.image.Image;

/**
 *
 * @author Team 3695
 */

public class ImageProPart extends BotPart {
    
    private BinaryImage darkImage;
    
    public ImageProPart(BotRunner runner){
        super(runner);
        
        AxisCamera.getInstance("10.36.95.11");
    }
    
    public void updateTeleop(){
    }
    
    public void updateAuto(){
        
//        try {
//            colorImage = cam.getImage();
//            darkImage = colorImage.thresholdHSI(200, 255, 0, 255, 0, 255);
//        } catch (AxisCameraException ex) {
//            ex.printStackTrace();
//            
//        } catch (NIVisionException ex) {
//            ex.printStackTrace();
//        }
    }
    
    public Image getBinary()
    { return darkImage; }
    
}
