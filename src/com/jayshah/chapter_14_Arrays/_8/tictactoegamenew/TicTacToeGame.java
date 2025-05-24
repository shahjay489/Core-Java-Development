package com.jayshah.chapter_14_Arrays._8.tictactoegamenew;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
    TicTacToeGame

    TicTacToeGame() constructor: design purpose
          - designing
            1. create frame
            2. create buttons --------------> : use array
    main method: call constructor
          - new TicTacToeGame()
    actionPerformed()
          - button events
            1. set events for all buttons --------------> : use array
    winningPossibilities()
          - cases by which person can win
    whoWin()
          - who win
    restartGame()
          - restart game --------------> : use array
    btnSetEnabling()
          - set enable true for all buttons --------------> : use array

By using this kind of thing we can develop algorithm:
winningPossibilities()
TODO:: try to make algorithm for this part: winningPossibilities()
 */
public class TicTacToeGame implements ActionListener {
    JFrame jf;
    JButton[] jb;

    int count = 0;
    String str = "";
    boolean win = false;
    Color color1;

    TicTacToeGame() {
        jf = new JFrame("TicTacToe Game by Govardhan");
        jf.setSize(500, 500);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setLayout(new GridLayout(3, 3));

        jb = new JButton[10];   // we leave 0 index position
        for (int i = 1; i < 10; i++) {
            jb[i] = new JButton();
            jb[i].addActionListener(this);
            jf.add(jb[i]);
        }

        jf.setVisible(true);
    }

    public static void main(String[] args) {
        new TicTacToeGame();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        count = count + 1;
        if (count % 2 == 0) {
            str = "0";
            color1 = Color.red;
        } else {
            color1 = Color.yellow;
            str = "X";
        }

        for (int i = 1; i < 10; i++) {
            if (e.getSource() == jb[i]) {
                jb[i].setBackground(color1);
                jb[i].setFont(new Font("Arial", 1, 50));
                jb[i].setText(str);
                jb[i].setEnabled(false);
            }
        }

        winningPossibilities();
        whoWins();
    }

    void winningPossibilities() {
        //horizontal winning possibilities
        if (jb[1].getText() == jb[2].getText() && jb[2].getText() == jb[3].getText() && jb[3].getText() != "") {
            win = true;
        } else if (jb[4].getText() == jb[5].getText() && jb[5].getText() == jb[6].getText() && jb[6].getText() != "") {
            win = true;
        } else if (jb[7].getText() == jb[8].getText() && jb[8].getText() == jb[9].getText() && jb[9].getText() != "") {
            win = true;
        }
        //vertical winning possibilities
        else if (jb[1].getText() == jb[4].getText() && jb[4].getText() == jb[7].getText() && jb[7].getText() != "") {
            win = true;
        } else if (jb[2].getText() == jb[5].getText() && jb[5].getText() == jb[8].getText() && jb[8].getText() != "") {
            win = true;
        } else if (jb[3].getText() == jb[6].getText() && jb[6].getText() == jb[9].getText() && jb[9].getText() != "") {
            win = true;
        }
        //diagonal winning possibilities
        else if (jb[1].getText() == jb[5].getText() && jb[5].getText() == jb[9].getText() && jb[9].getText() != "") {
            win = true;
        } else if (jb[3].getText() == jb[5].getText() && jb[5].getText() == jb[7].getText() && jb[7].getText() != "") {
            win = true;
        }
        //game draw
        else {
            win = false;
        }
    }

    void whoWins() {
        if (win == true) {
            JOptionPane.showMessageDialog(jf, str + " wins");
            restartGame();
        } else if (win == false && count == 9) {
            JOptionPane.showMessageDialog(jf, "Match Draw");
            restartGame();
        }
    }

    void restartGame() {
        int i = JOptionPane.showConfirmDialog(jf, "Do you want to restart the game ?");
        if (i == 0) {
            for (int j = 1; j < 10; j++) {
                jb[j].setText("");
                jb[j].setBackground(null);
            }

            btnSetEnabling(true);

            str = "";
            count = 0;
            win = false;
        } else if (i == 1) {
            System.exit(0);
        } else {
            btnSetEnabling(false);
        }
    }

    void btnSetEnabling(boolean b) {
        for (int i = 1; i < 10; i++) {
            jb[i].setEnabled(b);
        }
    }
}