/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import model.StudentGrade;

/**
 *
 * @author INT105
 */
public class StudentGradeView {
    private JFrame frameGrade;
    private JLabel lbSubject[];
    private JTextField txtGrade[];
    private JTextField txtCredit[];
    private JButton btCal;
    private StudentGrade[] stdGrade;

    public StudentGradeView(int numOfSubject,StudentGrade[] myGrade) {
        lbSubject = new JLabel[numOfSubject];
        txtGrade = new JTextField[numOfSubject];
        txtCredit = new JTextField[numOfSubject];
        stdGrade = myGrade;
        initGui();
    }
    public void initGui(){
        //set JFrame
        frameGrade = new JFrame("GPA Calculator");
        frameGrade.setSize(400,400);
        
        // set layout
        GridLayout grid = new GridLayout(8,3);
        frameGrade.setLayout(grid);
        addSubjectToFrame();
        
        btCal = new JButton("Calculator");
        frameGrade.add(btCal);
        
        // set operation
        frameGrade.pack();
        frameGrade.setLocationRelativeTo(null);
        frameGrade.setVisible(true);
        frameGrade.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    private  void addSubjectToFrame(){
        frameGrade.add(new JLabel("Subject"));
        frameGrade.add(new JLabel("Grade"));
        frameGrade.add(new JLabel("Credit"));
       
// add subject , grade ,credit 
        for (int i = 0; i < stdGrade.length; i++) {
            lbSubject[i] = new JLabel(stdGrade[i].getSubject());
            txtGrade[i] = new JTextField(stdGrade[i].getGrade());
            Float jtxt = stdGrade[i].getCredit();
            // convert to String
            txtCredit[i]=new JTextField(jtxt.toString());
            // add course to JFrame
            frameGrade.add(lbSubject[i]);
            frameGrade.add(txtGrade[i]);
            frameGrade.add(txtCredit[i]);
        }
    }
    
    
    
}
