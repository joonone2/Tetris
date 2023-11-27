/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tetris;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author joonwon
 */
public class GameThread extends Thread {
    
    private GameArea ga;
    
    public GameThread(GameArea ga) {
        this.ga = ga;
    }
    
    public void run() {
        while(true) {
            ga.spawnBlock();
            while (ga.moveBlockDown()) {
                try {

                    Thread.sleep(700);
                } catch (InterruptedException ex) {
                    Logger.getLogger(GameThread.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
    
}
