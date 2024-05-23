package tetris;

import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;

public class Tetris
{
    private static GameForm gf;
    private static StartupForm sf;
    private static LeaderboardForm lf;
    
    private static AudioPlayer audio = new AudioPlayer();
    
    public static void start() 
    {
    gf.setVisible(true);
    gf.startGame();
    }
    public static void showLeaderboard() {
        lf.setVisible(true);
    }
    
    public static void showStartup()
    {
        sf.setVisible(true);
    }
    public static void gameOvrer(int score) 
    {
      playGameover();
        
     String playerName = JOptionPane.showInputDialog("Game Over! \n Please enter your name");
     
     gf.setVisible(false);
     lf.addPlayer(playerName, score);
    }
    
    public static void playClear()
    {
        audio.playClearLIne();
    }
    
    public static void playGameover()
    {
        audio.playGameover();
    }
    
    public static void main(String[] args)
    {
       java.awt.EventQueue.invokeLater(() -> {
           gf = new GameForm();
           sf = new StartupForm();
           lf = new LeaderboardForm();
           
           sf.setVisible(true);
       });
    }
}
