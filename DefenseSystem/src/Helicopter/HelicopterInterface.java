/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Helicopter;

import MainController.ControlObserver;
import MainController.MainControllerInterface;

/**
 *
 * @author kguna
 */
public class HelicopterInterface extends javax.swing.JFrame implements ControlObserver {

    private MainControllerInterface mci;

    /**
     * Creates new form HelicopterInterface
     */
    public HelicopterInterface(MainControllerInterface mci) {
        this.mci = mci;
        initComponents();
        setLocation(770, 0);
        //setLocationRelativeTo(null);
        btnHeliSh.setEnabled(false);
        btnHeliMO.setEnabled(false);
        btnHeliLO.setEnabled(false);
        setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLaANC = new javax.swing.JLabel();
        btnHeliSh = new javax.swing.JButton();
        btnHeliLO = new javax.swing.JButton();
        btnHeliMO = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jTextField1 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jSpinner1 = new javax.swing.JSpinner();
        jSpinner2 = new javax.swing.JSpinner();
        jSlider1 = new javax.swing.JSlider();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(750, 422));
        getContentPane().setLayout(null);

        jLaANC.setBackground(new java.awt.Color(0, 102, 102));
        jLaANC.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLaANC.setForeground(new java.awt.Color(255, 255, 255));
        jLaANC.setText("Area Not Cleared");
        getContentPane().add(jLaANC);
        jLaANC.setBounds(40, 80, 120, 17);

        btnHeliSh.setBackground(new java.awt.Color(0, 102, 102));
        btnHeliSh.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnHeliSh.setForeground(new java.awt.Color(255, 255, 255));
        btnHeliSh.setText("Shoot");
        btnHeliSh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHeliShActionPerformed(evt);
            }
        });
        getContentPane().add(btnHeliSh);
        btnHeliSh.setBounds(50, 110, 150, 30);

        btnHeliLO.setBackground(new java.awt.Color(0, 102, 102));
        btnHeliLO.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnHeliLO.setForeground(new java.awt.Color(255, 255, 255));
        btnHeliLO.setText("Laser Operation");
        btnHeliLO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHeliLOActionPerformed(evt);
            }
        });
        getContentPane().add(btnHeliLO);
        btnHeliLO.setBounds(210, 130, 150, 30);

        btnHeliMO.setBackground(new java.awt.Color(0, 102, 102));
        btnHeliMO.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnHeliMO.setForeground(new java.awt.Color(255, 255, 255));
        btnHeliMO.setText("Missile Operation");
        btnHeliMO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHeliMOActionPerformed(evt);
            }
        });
        getContentPane().add(btnHeliMO);
        btnHeliMO.setBounds(40, 150, 158, 30);

        jTextArea1.setColumns(20);
        jTextArea1.setForeground(new java.awt.Color(0, 0, 0));
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(40, 210, 310, 110);

        jTextField1.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jTextField1);
        jTextField1.setBounds(40, 330, 240, 26);

        jButton4.setBackground(new java.awt.Color(0, 102, 102));
        jButton4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Sent");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(290, 330, 66, 27);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Soldier Count");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(520, 30, 100, 17);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Ammo Count");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(520, 70, 100, 17);

        jCheckBox1.setBackground(new java.awt.Color(0, 0, 0));
        jCheckBox1.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox1.setText("Position");
        getContentPane().add(jCheckBox1);
        jCheckBox1.setBounds(600, 140, 85, 20);
        getContentPane().add(jSpinner1);
        jSpinner1.setBounds(630, 30, 43, 26);
        getContentPane().add(jSpinner2);
        jSpinner2.setBounds(630, 70, 43, 26);

        jSlider1.setBackground(new java.awt.Color(255, 255, 255));
        jSlider1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jSlider1.setForeground(new java.awt.Color(255, 255, 255));
        jSlider1.setMajorTickSpacing(20);
        jSlider1.setOrientation(javax.swing.JSlider.VERTICAL);
        jSlider1.setPaintLabels(true);
        jSlider1.setPaintTicks(true);
        jSlider1.setValue(10);
        getContentPane().add(jSlider1);
        jSlider1.setBounds(610, 170, 60, 200);

        jLabel4.setBackground(new java.awt.Color(0, 102, 102));
        jLabel4.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 102));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Helicopter");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(300, 20, 160, 33);

        jLabel1.setIcon(new javax.swing.ImageIcon("E:\\Object-Oriented Programming\\OOP Final Coursework\\img\\helicopter.png")); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 750, 420);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnHeliShActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHeliShActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHeliShActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        String tankText = "Helicopter- " + jTextField1.getText();
        mci.setTankText(tankText);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void btnHeliMOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHeliMOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHeliMOActionPerformed

    private void btnHeliLOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHeliLOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHeliLOActionPerformed

    public void updateTitle(boolean isChecked) {
        //System.out.println("correct");
        jLaANC.setText(isChecked ? "Area Cleared" : "Area Not Cleared");

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHeliLO;
    private javax.swing.JButton btnHeliMO;
    private javax.swing.JButton btnHeliSh;
    private javax.swing.JButton jButton4;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLaANC;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

    @Override
    public void update(int scrollValue, String selectedValue) {
        if (!selectedValue.equals("Helicopter")) {
            btnHeliSh.setEnabled(false);
            btnHeliMO.setEnabled(false);
            btnHeliLO.setEnabled(false);
            return;
        }

        btnHeliSh.setEnabled(scrollValue > 25);
        btnHeliMO.setEnabled(scrollValue > 50);
        btnHeliLO.setEnabled(scrollValue > 75);
    }

    @Override
    public void updateMainText(String mainText) {
        //System.out.println(mainText);
        jTextArea1.setText(mainText);
    }
}
