import javax.swing.*;
import java.awt.event.*;

public class GUI {
    JFrame frm = new JFrame("GitLab");
    JPanel pnl = new JPanel();
    JMenuBar menuBar = new JMenuBar();
    JMenu menu = new JMenu("Projects");
    JMenu menu1 = new JMenu("Activity");
    JMenu menu2 = new JMenu("Milestones");
    JMenuItem your_projects = new JMenuItem("Your Projects");
    JMenuItem starred_projects = new JMenuItem("Starred Projects");
    JMenuItem pushed_events = new JMenuItem("Pushed Events");
    JMenuItem merge_events = new JMenuItem("Merge Events");


    public GUI() {
        frm.setJMenuBar(menuBar);
        frm.setVisible(true);
        frm.setSize(500, 500);
        frm.setLocationRelativeTo(null);
        frm.add(pnl);
        pnl.setVisible(true);
        menuBar.add(menu);
        menuBar.add(menu1);
        menuBar.add(menu2);
        menu.add(your_projects);
        menu.add(starred_projects);
        menu1.add(pushed_events);
        menu1.add(merge_events);

        your_projects.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //show projects
            }

        });
        starred_projects.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //show starred projects
            }

        });
        pushed_events.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //show pushed events
            }

        });
        merge_events.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //show merge events
            }

        });

    }
    public static void main(String[] args){
        GUI gui = new GUI();
    }

}
