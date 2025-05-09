package com.jayshah.chapter_11_NotePad_Editor_Project2.part1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileOutputStream;

/*
    1. create frame : JFrame
    2. menu bar : JMenuBar
    3. list of menu : JMenu
    4. menu item : JMenuItem
    5. JScrollPane (add on frame)
    6. text area (add on JScrollPane)
    7. setLookAndFeel (search on google : copy class name) : for good looking according to platform (like windows)
    - add this in try-catch block at start time
    8. title
    - do R&D for icon change on top
    - do R&D for shortcut
    9. jscroll : vertical scroll bar
       jscroll : horizontal scroll bar
    10. new, save, saveas, exit, pagesetup
    11. complete all the menus in menubar
        Edit - cut, copy, paste,  replace, date/time
        Format - font, font-color, textarea, color
        Help
    12. Backend functionality
        implements ActionListener and override method
    13. save()
    14. newNotePad
    15. complete this:
        - if we did not save the file in new option, then textarea should b=not be empty
        - open button : open dialog box and set title of that file name
 */
public class Notepad implements ActionListener {
    JFrame jf;

    JMenuBar menubar;
    JMenu file;
    JMenuItem neww, open, save, saveas, exit, page_setup, print;

    JTextArea textarea;

    String title = "Untitled - Notepad";

    File filee;

    public Notepad() {
        try {
            //UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName()); // for cross platform
        } catch (Exception e) {
            System.out.println(e);
        }

        jf = new JFrame(title);
        jf.setSize(500, 500);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        menubar = new JMenuBar();

        file = new JMenu("File");

        neww = new JMenuItem("New");
        neww.addActionListener(this);
        file.add(neww);

        open = new JMenuItem("Open");
        open.addActionListener(this);
        file.add(open);

        save = new JMenuItem("Save");
        save.addActionListener(this);
        file.add(save);

        saveas = new JMenuItem("Save As");
        saveas.addActionListener(this);
        file.add(saveas);

        file.addSeparator();    // this will add line => ------

        page_setup = new JMenuItem("Page Setup");
        page_setup.addActionListener(this);
        file.add(page_setup);

        print = new JMenuItem("Print...");
        print.addActionListener(this);
        file.add(print);

        file.addSeparator();

        exit = new JMenuItem("Exit");
        exit.addActionListener(this);
        file.add(exit);

        menubar.add(file);

        jf.setJMenuBar(menubar);

        textarea = new JTextArea();
        JScrollPane scollpane = new JScrollPane(textarea);
        scollpane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scollpane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        jf.add(scollpane);

        jf.setVisible(true);
    }

    public static void main(String[] args) {
        new Notepad();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == neww) {
            newNotepad();
        }
        if (e.getSource() == exit) {
            System.exit(0);
        }
        if (e.getSource() == save) {
            save();
        }
    }

    public void newNotepad() {
        String text = textarea.getText();
        if (!text.equals("")) {
            int i = JOptionPane.showConfirmDialog(jf, "Do you want to save this file ?");
            // 1 means not save, 0 means save file, 2 means cancel
            if (i == 0) {
                save();
                setTitle(title);
                textarea.setText("");
            } else if (i == 1) {
                textarea.setText("");
            }
        }
    }

    public void save() {
        try {
            JFileChooser filechooser = new JFileChooser();
            int i = filechooser.showSaveDialog(jf);
            // System.out.println("i : " + i);   // 1 means not save, 0 means save file, 2 means cancel
            if (i == 0) {
                filee = filechooser.getSelectedFile();
//                System.out.println(filee);
//                System.out.println(filee.getName());

                String text = textarea.getText();
                byte[] b = text.getBytes();
                FileOutputStream fos = new FileOutputStream(filee);
                fos.write(b);

                setTitle(filee.getName());

                fos.close();
            } else {
                JOptionPane.showMessageDialog(filechooser, "You did not save the file...", "File not saved", JOptionPane.WARNING_MESSAGE);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    void setTitle(String title) {
        jf.setTitle(title);
    }
}
