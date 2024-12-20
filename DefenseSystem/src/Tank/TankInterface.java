/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Tank;

import MainController.ControlObserver;
import MainController.MainController;
import MainController.MainControllerInterface;

/**
 *
 * @author kguna
 */
public class TankInterface extends javax.swing.JFrame implements ControlObserver {

    private MainControllerInterface mci;

    /**
     * Creates new form TankInterface
     */
    public TankInterface(MainControllerInterface mci) {
        this.mci = mci;
        initComponents();
        setLocation(10, 440);
        //setLocationRelativeTo(null);
        btnTaSh.setEnabled(false);
        btnTanRO.setEnabled(false);
        btnTaMO.setEnabled(false);
        btnTanRS.setEnabled(false);
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

        jLabANC = new javax.swing.JLabel();
        btnTaSh = new javax.swing.JButton();
        btnTanRO = new javax.swing.JButton();
        btnTaMO = new javax.swing.JButton();
        btnTanRS = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        jSpinner2 = new javax.swing.JSpinner();
        jCheckBox1 = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jTextField1 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jSlider1 = new javax.swing.JSlider();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(750, 422));
        setMinimumSize(new java.awt.Dimension(750, 422));
        getContentPane().setLayout(null);

        jLabANC.setBackground(new java.awt.Color(255, 255, 255));
        jLabANC.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabANC.setForeground(new java.awt.Color(255, 255, 255));
        jLabANC.setText("Area Not Cleared");
        getContentPane().add(jLabANC);
        jLabANC.setBounds(30, 20, 120, 30);

        btnTaSh.setBackground(new java.awt.Color(0, 102, 102));
        btnTaSh.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnTaSh.setForeground(new java.awt.Color(255, 255, 255));
        btnTaSh.setText("Shoot");
        btnTaSh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaShActionPerformed(evt);
            }
        });
        getContentPane().add(btnTaSh);
        btnTaSh.setBounds(40, 70, 124, 30);

        btnTanRO.setBackground(new java.awt.Color(0, 102, 102));
        btnTanRO.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnTanRO.setForeground(new java.awt.Color(255, 255, 255));
        btnTanRO.setText("Ready Operation");
        getContentPane().add(btnTanRO);
        btnTanRO.setBounds(30, 110, 160, 30);

        btnTaMO.setBackground(new java.awt.Color(0, 102, 102));
        btnTaMO.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnTaMO.setForeground(new java.awt.Color(255, 255, 255));
        btnTaMO.setText("Missile Operation");
        getContentPane().add(btnTaMO);
        btnTaMO.setBounds(190, 70, 160, 30);

        btnTanRS.setBackground(new java.awt.Color(0, 102, 102));
        btnTanRS.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnTanRS.setForeground(new java.awt.Color(255, 255, 255));
        btnTanRS.setText("Rotate Shooting\t");
        getContentPane().add(btnTanRS);
        btnTanRS.setBounds(210, 110, 150, 30);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Soldier Count");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(570, 20, 100, 17);

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Ammo Count");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(570, 50, 100, 17);
        getContentPane().add(jSpinner1);
        jSpinner1.setBounds(670, 10, 44, 26);
        getContentPane().add(jSpinner2);
        jSpinner2.setBounds(670, 50, 44, 26);

        jCheckBox1.setBackground(new java.awt.Color(0, 0, 0));
        jCheckBox1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jCheckBox1.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox1.setText("Position");
        getContentPane().add(jCheckBox1);
        jCheckBox1.setBounds(600, 90, 85, 21);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(40, 200, 380, 130);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(40, 340, 299, 26);

        jButton5.setBackground(new java.awt.Color(0, 102, 102));
        jButton5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Sent");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(350, 340, 70, 27);

        jSlider1.setBackground(new java.awt.Color(255, 255, 255));
        jSlider1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jSlider1.setForeground(new java.awt.Color(255, 255, 255));
        jSlider1.setMajorTickSpacing(20);
        jSlider1.setOrientation(javax.swing.JSlider.VERTICAL);
        jSlider1.setPaintLabels(true);
        jSlider1.setPaintTicks(true);
        jSlider1.setValue(10);
        getContentPane().add(jSlider1);
        jSlider1.setBounds(610, 110, 55, 260);

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Tank");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(340, 20, 70, 33);

        jLabel5.setIcon(new javax.swing.ImageIcon("E:\\Object-Oriented Programming\\OOP Final Coursework\\img\\tank.png")); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, 0, 750, 420);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTaShActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaShActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTaShActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        String tankText = "Tank- " + jTextField1.getText();
        mci.setTankText(tankText);
    }//GEN-LAST:event_jButton5ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTaMO;
    private javax.swing.JButton btnTaSh;
    private javax.swing.JButton btnTanRO;
    private javax.swing.JButton btnTanRS;
    private javax.swing.JButton jButton5;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabANC;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

    @Override
    public void update(int scrollValue, String selectedValue) {
        //System.out.println("correct");
//        if (scrollValue > 50 && selectedValue.equals("Tank")) {
//            btnTaSh.setEnabled(true);
//            btnTaMO.setEnabled(true);
//            btnTanRO.setEnabled(true);
//            btnTanRS.setEnabled(true);
//        }else if(scrollValue < 50 && selectedValue.equals("Tank")){
//            btnTaSh.setEnabled(false);
//            btnTaMO.setEnabled(false);
//            btnTanRO.setEnabled(false);
//            btnTanRS.setEnabled(false);
//        }
        if (!selectedValue.equals("Tank")) {
            btnTaSh.setEnabled(false);
            btnTaMO.setEnabled(false);
            btnTanRO.setEnabled(false);
            btnTanRS.setEnabled(false);
            return;
        }
        btnTaSh.setEnabled(scrollValue > 1);
        btnTaMO.setEnabled(scrollValue > 26);
        btnTanRO.setEnabled(scrollValue > 51);
        btnTanRS.setEnabled(scrollValue > 76);
    }

    @Override
    public void updateTitle(boolean isChecked) {
        //System.out.println("correct");
        jLabANC.setText(isChecked ? "Area Cleared" : "Area Not Cleared");

    }

    @Override
    public void updateMainText(String mainText) {
        //System.out.println(mainText);
        jTextArea1.setText(mainText);
    }
}
