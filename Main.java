import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        


        JOptionPane.showMessageDialog(null, "Hey sexy ;)");

        String feeling = JOptionPane.showInputDialog(null,"How are you tonight?");

        int vibe = JOptionPane.showConfirmDialog(null, feeling + "? Really? .....Anyways sexy time?");
        
        switch (vibe) {
            case JOptionPane.YES_OPTION:
                    String time = JOptionPane.showInputDialog(null, "Hmmmm what time ;)");
                    JOptionPane.showMessageDialog(null, "So in " + time + " I will be expecting you in your sexy dress ;)");

                    break;
            case JOptionPane.NO_OPTION:
                    JOptionPane.showMessageDialog(null,"Great, I'll sleep on the highway :)");
                    break;
            case JOptionPane.CLOSED_OPTION:
                    JOptionPane.showMessageDialog(null, "PLEASE COME BACK :(");
                    break;
                
            case JOptionPane.CANCEL_OPTION:
                    JOptionPane.showMessageDialog(null, "FINE UR LOST!!");
                    break;
                
        }
       

    }
}