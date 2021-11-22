package Tkachenko.Lab21;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Window extends JFrame {
    JLabel labelResult = new JLabel("Result: 0 x 0");
    JLabel labelLastScorer = new JLabel("Last Scorer: N/A");
    JLabel labelWinner = new JLabel("Winner: DRAW");

    JButton buttonMilan = new JButton("Milan");
    JButton buttonMadrid = new JButton("Madrid");

    int milanScore = 0;
    int madridScore = 0;

    public Window() {
        super("Soccer");

        setSize(400, 400);
        setResizable(false);
        setLayout(null);

        buttonMilan.setBounds(getWidth() / 2 - 100 - 20, 250, 100, 20);
        buttonMadrid.setBounds(getWidth() / 2 + 20, 250, 100, 20);

        add(buttonMilan);
        add(buttonMadrid);

        labelResult.setSize(labelResult.getPreferredSize());
        labelResult.setLocation(getWidth() / 2 - labelResult.getWidth() / 2, 50);
        labelLastScorer.setSize(labelLastScorer.getPreferredSize());
        labelLastScorer.setLocation(getWidth() / 2 - labelLastScorer.getWidth() / 2, 100);
        labelWinner.setSize(labelWinner.getPreferredSize());
        labelWinner.setLocation(getWidth() / 2 - labelWinner.getWidth() / 2, 150);

        add(labelResult);
        add(labelLastScorer);
        add(labelWinner);

        buttonMilan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                milanScored();
            }
        });

        buttonMadrid.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                madridScored();
            }
        });
    }

    private void madridScored() {
        ++madridScore;
        setResult();
        labelLastScorer.setText("Last Scorer: Madrid");
        resizeLabelLastScorer();
        setWinner();
    }

    private void milanScored() {
        ++milanScore;
        setResult();
        labelLastScorer.setText("Last Scorer: Milan");
        resizeLabelLastScorer();
        setWinner();
    }

    private void setWinner() {
        if(milanScore > madridScore)
            labelWinner.setText("Winner: Milan");
        else if(madridScore > milanScore)
            labelWinner.setText("Winner: Madrid");
        else
            labelWinner.setText("Winner: N/A");

        labelWinner.setSize(labelWinner.getPreferredSize());
        labelWinner.setLocation(getWidth() / 2 - labelWinner.getWidth() / 2, 150);
    }

    private void setResult() {
        labelResult.setText("Result: " + milanScore + " x " + madridScore);
        labelResult.setSize(labelResult.getPreferredSize());
        labelResult.setLocation(getWidth() / 2 - labelResult.getWidth() / 2, 50);
    }

    private void resizeLabelLastScorer() {
        labelLastScorer.setSize(labelLastScorer.getPreferredSize());
        labelLastScorer.setLocation(getWidth() / 2 - labelLastScorer.getWidth() / 2, 100);
    }
}
