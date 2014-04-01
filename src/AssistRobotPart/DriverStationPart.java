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
    
    private SmartDashboard dash;
    
    private BotRunner bot;
    
    public DriverStationPart(BotRunner runner){
        super(runner);
        
        bot = runner;
        
        dash = new SmartDashboard();
    }
    
    public void updateTeleop(){
        dash.putBoolean("Compressing?", !bot.getPnuematic().isCompressing());
        dash.putDouble("UltraSonic Distance", bot.getSensor().getUltra());
        dash.putBoolean("In Range", bot.getDrive().inRange());
    }
}
