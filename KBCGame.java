import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Timer;
import java.util.TimerTask;

public class KBCGame {
    private static int currentQuestion = 0;
    private static int score = 0;
    private static ArrayList<Question> questions;
    private static Lifelines lifelines;
    private static Timer timer;
    private static int timeRemaining = 30; 
    private static JProgressBar timerBar;
    private static String userName;
    private static JFrame frame;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            try {
                
                userName = JOptionPane.showInputDialog(null, "Enter your name:");
                if (userName == null || userName.trim().isEmpty()) {
                    userName = "Player";
                }

                
                questions = QuestionBank.getQuestions();
                Collections.shuffle(questions); 

                
                lifelines = new Lifelines();

                
                showQuestion();
            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "An error occurred: " + e.getMessage());
            }
        });
    }

    private static void showQuestion() {
        if (currentQuestion >= questions.size()) {
            JOptionPane.showMessageDialog(null, "Congratulations " + userName + "! You completed the game!\nFinal Score: ₹" + score);
            System.exit(0);
        }

        Question q = questions.get(currentQuestion);

        frame = new JFrame("KBC - Kaun Banega Crorepati");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setLayout(new BorderLayout());

        // Main panel to hold everything
        JPanel mainPanel = new JPanel(new BorderLayout(10, 10)) {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2d = (Graphics2D) g;
                int width = getWidth();
                int height = getHeight();
                Color color1 = new Color(25, 25, 112);
                Color color2 = new Color(65, 105, 225);
                GradientPaint gp = new GradientPaint(0, 0, color1, 0, height, color2);
                g2d.setPaint(gp);
                g2d.fillRect(0, 0, width, height);
            }
        };
        mainPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        
        JPanel optionsPanel = new JPanel(new GridLayout(2, 2, 20, 20));
        optionsPanel.setOpaque(false);
        optionsPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        
        JPanel topPanel = new JPanel(new BorderLayout(10, 10));
        topPanel.setOpaque(false);

        
        JPanel headerPanel = new JPanel();
        headerPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 10));
        headerPanel.setOpaque(false);

        
        JLabel moneyBagIcon = new JLabel("₹" + score);
        moneyBagIcon.setFont(new Font("Arial", Font.BOLD, 24));
        moneyBagIcon.setForeground(Color.YELLOW);
        headerPanel.add(moneyBagIcon);

        JButton fiftyFiftyButton = new JButton("50:50");
        fiftyFiftyButton.setFont(new Font("Arial", Font.BOLD, 16));
        fiftyFiftyButton.setBackground(Color.ORANGE);
        fiftyFiftyButton.setForeground(Color.BLACK);
        fiftyFiftyButton.setToolTipText("Removes two incorrect options");
        fiftyFiftyButton.addActionListener(_ -> lifelines.useFiftyFifty(q, optionsPanel));
        headerPanel.add(fiftyFiftyButton);

        JButton audiencePollButton = new JButton("Audience Poll");
        audiencePollButton.setFont(new Font("Arial", Font.BOLD, 16));
        audiencePollButton.setBackground(Color.ORANGE);
        audiencePollButton.setForeground(Color.BLACK);
        audiencePollButton.setToolTipText("Poll the audience for their opinion");
        audiencePollButton.addActionListener(_ -> lifelines.useAudiencePoll(q));
        headerPanel.add(audiencePollButton);

        JButton swapQuestionButton = new JButton("Swap Question");
        swapQuestionButton.setFont(new Font("Arial", Font.BOLD, 16));
        swapQuestionButton.setBackground(Color.ORANGE);
        swapQuestionButton.setForeground(Color.BLACK);
        swapQuestionButton.setToolTipText("Swap the current question with a new one");
        swapQuestionButton.addActionListener(_ -> {
            JOptionPane.showMessageDialog(frame, "Question swapped!");
            currentQuestion++;
            frame.dispose();
            showQuestion();
        });
        headerPanel.add(swapQuestionButton);

        topPanel.add(headerPanel, BorderLayout.NORTH);

        
        JPanel timerPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        timerPanel.setOpaque(false);

        
        timerBar = new JProgressBar(0, 30);
        timerBar.setValue(30);
        timerBar.setStringPainted(true);
        timerBar.setFont(new Font("Arial", Font.BOLD, 48));
        timerBar.setForeground(Color.RED);
        timerBar.setBackground(Color.ORANGE);
        timerBar.setString(timeRemaining + "s"); 
        timerPanel.add(timerBar);

        topPanel.add(timerPanel, BorderLayout.CENTER);
        mainPanel.add(topPanel, BorderLayout.NORTH);

        
        JPanel questionPanel = new JPanel();
        questionPanel.setLayout(new BorderLayout(10, 10));
        questionPanel.setOpaque(false);
        questionPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JLabel questionLabel = new JLabel("<html><div style='text-align: center; width: 400px;'>" + q.getQuestion() + "</div></html>");
        questionLabel.setFont(new Font("Arial", Font.BOLD, 24));
        questionLabel.setForeground(Color.WHITE);
        questionLabel.setHorizontalAlignment(SwingConstants.CENTER);
        questionLabel.setPreferredSize(new Dimension(600, 100));
        questionLabel.setBorder(BorderFactory.createLineBorder(Color.YELLOW, 3, true));
        questionPanel.add(questionLabel, BorderLayout.CENTER);

        mainPanel.add(questionPanel, BorderLayout.CENTER);

        String[] options = q.getOptions();
        char optionLabel = 'A';
        for (int i = 0; i < options.length; i++) {
            JButton optionButton = new JButton(optionLabel + ": " + options[i]);
            optionButton.setFont(new Font("Arial", Font.BOLD, 18));
            optionButton.setBackground(new Color(255, 215, 0));
            optionButton.setForeground(Color.BLACK);
            optionButton.setBorder(BorderFactory.createLineBorder(new Color(218, 165, 32), 2));
            optionButton.setFocusPainted(false);
            optionButton.setPreferredSize(new Dimension(200, 50));
            optionsPanel.add(optionButton);

            int finalI = i; 
            optionButton.addActionListener(_ -> {
                timer.cancel();
                if (options[finalI].equals(q.getOptions()[q.getCorrectIndex()])) {
                    score += 10000;
                    JOptionPane.showMessageDialog(frame, "<html><font color='green'>Correct Answer!</font><br>You've won ₹" + score + "</html>");
                } else {
                    JOptionPane.showMessageDialog(frame, "<html><font color='red'>Wrong Answer!</font><br>Game Over, " + userName + ".<br>You won ₹" + score + "</html>");
                    System.exit(0);
                }
                currentQuestion++;
                frame.dispose();
                showQuestion();
            });

            optionLabel++;
        }

        mainPanel.add(optionsPanel, BorderLayout.SOUTH);
        frame.add(mainPanel);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setVisible(true);

        
        startTimer(frame, timerBar);
    }

    private static void startTimer(JFrame frame, JProgressBar timerBar) {
        timeRemaining = 30;
        if (timer != null) {
            timer.cancel();
        }
        timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                SwingUtilities.invokeLater(() -> {
                    timeRemaining--;
                    timerBar.setValue(timeRemaining);
                    timerBar.setString(timeRemaining + "s"); 
                    if (timeRemaining <= 0) {
                        timer.cancel();
                        JOptionPane.showMessageDialog(frame, 
                            "Time's up! Game Over, " + userName + ".\nYou won ₹" + score);
                        System.exit(0);
                    }
                });
            }
        }, 1000, 1000);
    }
}
