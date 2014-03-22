/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AssistRobotPart;

import AssistRobotRunner.BotRunner;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 * @author Team 3695
 */
public class DriverStationPart extends BotPart {
    
    private BotRunner bot;
    
    public DriverStationPart(BotRunner runner){
        super(runner);
        
        bot = runner;
    }
    
    public void updateTeleop(){
        SmartDashboard.putBoolean("Compressing?", !bot.getPnuematic().isCompressing());
        SmartDashboard.putDouble("UltraSonic Distance", bot.getSensor().getUltra());
        SmartDashboard.putBoolean("In Range", bot.getDrive().inRange());
    }
}
