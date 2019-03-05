// Matt Goff
// Mosaic Lite

import javax.swing.JFrame;

class MosaicLiteFrame extends JFrame {
    public MosaicLiteFrame() {
        setBounds(10,10,1200,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

public class MosaicLite {
    public static void main(String[] args) {
        System.out.println("MosaicLite starting...");

        MosaicLiteFrame myMosaicLiteFrame = new MosaicLiteFrame();
        myMosaicLiteFrame.setVisible(true);
    }
}