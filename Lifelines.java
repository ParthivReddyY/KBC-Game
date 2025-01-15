import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Lifelines {
    private boolean fiftyFiftyUsed = false;
    private boolean audiencePollUsed = false;

    public void useFiftyFifty(Question q, JPanel optionsPanel) {
        if (fiftyFiftyUsed) {
            JOptionPane.showMessageDialog(null, "50-50 has already been used!");
            return;
        }

        fiftyFiftyUsed = true;
        int correctIndex = q.getCorrectIndex();

        
        List<Component> buttons = new ArrayList<>(List.of(optionsPanel.getComponents()));
        Collections.shuffle(buttons);
        
        int disabledCount = 0;
        for (Component c : buttons) {
            JButton button = (JButton) c;
            if (optionsPanel.getComponentZOrder(button) != correctIndex && disabledCount < 2) {
                button.setEnabled(false);
                button.setBackground(Color.GRAY);
                disabledCount++;
            }
        }
    }

    public void useAudiencePoll(Question q) {
        if (audiencePollUsed) {
            JOptionPane.showMessageDialog(null, "Audience Poll has already been used!");
            return;
        }

        audiencePollUsed = true;
        String[] options = q.getOptions();
        int correctIndex = q.getCorrectIndex();

        
        Random rand = new Random();
        int[] percentages = new int[options.length];
        percentages[correctIndex] = 50 + rand.nextInt(31); 
        
        int remaining = 100 - percentages[correctIndex];
        for (int i = 0; i < options.length; i++) {
            if (i != correctIndex) {
                if (i == options.length - 1) {
                    percentages[i] = remaining;
                } else {
                    int value = rand.nextInt(remaining);
                    percentages[i] = value;
                    remaining -= value;
                }
            }
        }

        
        StringBuilder pollResult = new StringBuilder("Audience Poll Result:\n");
        for (int i = 0; i < options.length; i++) {
            pollResult.append((char)('A' + i)).append(": ")
                     .append(percentages[i]).append("%\n");
        }
        JOptionPane.showMessageDialog(null, pollResult.toString());
        
        
        JPanel chartPanel = new JPanel();
        chartPanel.setLayout(new BoxLayout(chartPanel, BoxLayout.Y_AXIS));
        
        for (int i = 0; i < options.length; i++) {
            JProgressBar bar = new JProgressBar(0, 100);
            bar.setValue(percentages[i]);
            bar.setStringPainted(true);
            bar.setString(((char)('A' + i)) + ": " + percentages[i] + "%");
            chartPanel.add(bar);
        }
        
        JOptionPane.showMessageDialog(null, chartPanel, "Audience Poll Results", 
            JOptionPane.INFORMATION_MESSAGE);
    }
}
