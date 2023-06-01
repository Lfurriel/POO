package aula14;

import javax.swing.*;
import java.util.concurrent.ExecutionException;

public class ButtonWorker extends SwingWorker<Integer, Void> {
    private int sleepTime;

    public ButtonWorker(int sleepTime) {
        this.sleepTime = sleepTime;
    }

    @Override
    protected Integer doInBackground() throws Exception {
        try {
            Thread.sleep(sleepTime);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return sleepTime;
    }

    @Override
    protected void done(){
        int result;
        try {
            result = get();
            JOptionPane.showMessageDialog(null, "Finished: " + result, "swing worker",
                    JOptionPane.INFORMATION_MESSAGE);

        } catch (ExecutionException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
