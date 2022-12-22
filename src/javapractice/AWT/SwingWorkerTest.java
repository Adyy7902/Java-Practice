package AWT;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingWorker;

public class SwingWorkerTest extends JFrame {

    public SwingWorkerTest() {
        this.setLayout(new FlowLayout());
        JButton button = new JButton("run");
        JLabel label = new JLabel("time: -");
        button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                Worker worker = new Worker(label);
                worker.execute();
                //Check for results truncation
//              boolean truncate = !jCheckBoxTruncate.isSelected();
//              long startTime = System.nanoTime();
//              String[] args = {fileName};
                //run solution and draw graph
//              SpeciesSelection specSel = new SpeciesSelection(args, truncate);
//              Thread t = new Thread(specSel);
//              t.start();
//              t.join();
//              ArrayList<Double> result = specSel.getResult();
//              drawGraph(result);
                worker.stop();

                System.out.println("button's actionPerformed finished");
            }
        });

        this.getContentPane().add(button);
        this.getContentPane().add(label);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new SwingWorkerTest();
    }
}

class Worker extends SwingWorker<String, String>{

    JLabel label;
    boolean run;

    public Worker(JLabel label)
    {
        this.label = label;
        this.run = true;
    }

    @Override
    protected String doInBackground() throws Exception {
        System.out.println("doInBackground..., run=" + run);
        //This is what's called in the .execute method
        long startTime = System.nanoTime();
//        while(run)
//        {
            System.out.println("running...");
            //This sends the results to the .process method
            publish(String.valueOf(System.nanoTime() - startTime));
            Thread.sleep(100);
//        }
        System.out.println("worker finished...");
        return null;
    }

    public void stop()
    {
//      System.out.println("stop");
//        run = false;
    }

    @Override
    protected void process(List<String> item) {
        System.out.println("processed");
        double seconds = Long.parseLong(item.get(item.size()-1))/1000000000.0;
        String secs = String.format("%.2f", seconds);
        //This updates the UI
        System.out.println("updating");
        label.setText("Processing Time: " + secs + " secs");
//        label.repaint();
    }
} 