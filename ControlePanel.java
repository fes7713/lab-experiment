/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package phy1061lab2;

import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/**
 *
 * @author fes77
 */
public class ControlePanel extends javax.swing.JPanel {

    /**
     * Creates new form ControlePanel
     */
    PHY1061Lab2 lab;
    public ControlePanel(PHY1061Lab2 lab) {
        this.lab = lab;
        initComponents();
    }
    
    public void setTime(float time)
    {
        timerDisplay.setText(time + "");
//        mass1Text.getDocument().addDocumentListener(
//            new DocumentListener() {
//                public void changedUpdate(DocumentEvent e) {
//                    System.out.println(mass1Text.getText());
//                }
//                public void removeUpdate(DocumentEvent e) {
//
//                }
//                public void insertUpdate(DocumentEvent e) {
//
//                }
//            }
//        );
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        startButton = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        timerDisplay = new javax.swing.JLabel();
        timerLabel = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        gravityLabel = new javax.swing.JLabel();
        gravityUnitLabel = new javax.swing.JLabel();
        gravityValueLabel = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        massCarryLabel = new javax.swing.JLabel();
        massCarryUnitLabel = new javax.swing.JLabel();
        massCarrySlider = new javax.swing.JSlider();
        jPanel4 = new javax.swing.JPanel();
        massCart2Label = new javax.swing.JLabel();
        massCartSlider = new javax.swing.JSlider();
        massCartUnitLabel = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        mass2Label = new javax.swing.JLabel();
        mass2UnitLabel = new javax.swing.JLabel();
        mass2Slider = new javax.swing.JSlider();
        jPanel2 = new javax.swing.JPanel();
        mass1Label = new javax.swing.JLabel();
        mass1UnitLabel = new javax.swing.JLabel();
        mass1Slider = new javax.swing.JSlider();
        restartButton = new javax.swing.JButton();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        startButton.setText("Start");
        startButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startButtonActionPerformed(evt);
            }
        });

        jButton2.setText("Stop");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        timerDisplay.setText("10.0");

        timerLabel.setText("Timer");

        gravityLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        gravityLabel.setText("Gravity");

        gravityUnitLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        gravityUnitLabel.setText("m/s^2");

        gravityValueLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        gravityValueLabel.setText("9.81");

        massCarryLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        massCarryLabel.setText("Mass Carry");

        massCarryUnitLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        massCarryUnitLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        massCarryUnitLabel.setText("5 g");

        massCarrySlider.setMaximum(50);
        massCarrySlider.setMinorTickSpacing(5);
        massCarrySlider.setPaintLabels(true);
        massCarrySlider.setPaintTicks(true);
        massCarrySlider.setSnapToTicks(true);
        massCarrySlider.setValue(5);
        massCarrySlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                massCarrySliderStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(massCarryLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(massCarrySlider, javax.swing.GroupLayout.DEFAULT_SIZE, 443, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(massCarryUnitLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(massCarryLabel)
                    .addComponent(massCarrySlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(massCarryUnitLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        massCart2Label.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        massCart2Label.setText("Mass Cart");

        massCartSlider.setMaximum(500);
        massCartSlider.setMinorTickSpacing(10);
        massCartSlider.setPaintLabels(true);
        massCartSlider.setPaintTicks(true);
        massCartSlider.setSnapToTicks(true);
        massCartSlider.setToolTipText("");
        massCartSlider.setValue(200);
        massCartSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                massCartSliderStateChanged(evt);
            }
        });

        massCartUnitLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        massCartUnitLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        massCartUnitLabel.setText("200 g");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(massCart2Label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(massCartSlider, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(massCartUnitLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(massCart2Label)
                    .addComponent(massCartSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(massCartUnitLabel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        mass2Label.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        mass2Label.setText("Mass 2");

        mass2UnitLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        mass2UnitLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        mass2UnitLabel.setText("10 g");

        mass2Slider.setMinorTickSpacing(10);
        mass2Slider.setPaintLabels(true);
        mass2Slider.setPaintTicks(true);
        mass2Slider.setSnapToTicks(true);
        mass2Slider.setValue(10);
        mass2Slider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                mass2SliderStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mass2Label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mass2Slider, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mass2UnitLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(9, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mass2Label)
                    .addComponent(mass2UnitLabel)
                    .addComponent(mass2Slider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        mass1Label.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        mass1Label.setText("Mass 1");

        mass1UnitLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        mass1UnitLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        mass1UnitLabel.setText("10 g");

        mass1Slider.setMinorTickSpacing(10);
        mass1Slider.setPaintLabels(true);
        mass1Slider.setPaintTicks(true);
        mass1Slider.setSnapToTicks(true);
        mass1Slider.setToolTipText("");
        mass1Slider.setValue(10);
        mass1Slider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                mass1SliderStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mass1Label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mass1Slider, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mass1UnitLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mass1Label)
                    .addComponent(mass1Slider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mass1UnitLabel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(gravityLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(gravityValueLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(gravityUnitLabel))
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gravityLabel)
                    .addComponent(gravityUnitLabel)
                    .addComponent(gravityValueLabel))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(54, 54, 54))
        );

        restartButton.setText("Restart");
        restartButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restartButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(timerLabel)
                        .addGap(35, 35, 35)
                        .addComponent(timerDisplay))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(startButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(restartButton)))
                .addGap(31, 31, 31))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(timerDisplay)
                    .addComponent(timerLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(startButton)
                    .addComponent(restartButton))
                .addGap(40, 40, 40))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void startButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startButtonActionPerformed
        lab.startTimer();
    }//GEN-LAST:event_startButtonActionPerformed

    private void mass1SliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_mass1SliderStateChanged
        mass1UnitLabel.setText(mass1Slider.getValue() + " g");
        lab.setMass1Value((mass1Slider.getValue() + massCartSlider.getValue()) / 1000f);
    }//GEN-LAST:event_mass1SliderStateChanged

    private void mass2SliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_mass2SliderStateChanged
        mass2UnitLabel.setText(mass2Slider.getValue() + " g");
        lab.setMass2Value((mass2Slider.getValue() + massCarrySlider.getValue()) / 1000f);
    }//GEN-LAST:event_mass2SliderStateChanged

    private void massCartSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_massCartSliderStateChanged
        massCartUnitLabel.setText(massCartSlider.getValue() + " g");
        lab.setMass1Value((mass1Slider.getValue() + massCartSlider.getValue()) / 1000f);
    }//GEN-LAST:event_massCartSliderStateChanged

    private void massCarrySliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_massCarrySliderStateChanged
        massCarryUnitLabel.setText(massCarrySlider.getValue() + " g");
        lab.setMass2Value((mass2Slider.getValue() + massCarrySlider.getValue()) / 1000f);
    }//GEN-LAST:event_massCarrySliderStateChanged

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        lab.stopTimer();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void restartButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restartButtonActionPerformed
        lab.restart(mass1Slider.getValue(), mass2Slider.getValue(), massCartSlider.getValue(), massCarrySlider.getValue());
    }//GEN-LAST:event_restartButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel gravityLabel;
    private javax.swing.JLabel gravityUnitLabel;
    private javax.swing.JLabel gravityValueLabel;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JLabel mass1Label;
    private javax.swing.JSlider mass1Slider;
    private javax.swing.JLabel mass1UnitLabel;
    private javax.swing.JLabel mass2Label;
    private javax.swing.JSlider mass2Slider;
    private javax.swing.JLabel mass2UnitLabel;
    private javax.swing.JLabel massCarryLabel;
    private javax.swing.JSlider massCarrySlider;
    private javax.swing.JLabel massCarryUnitLabel;
    private javax.swing.JLabel massCart2Label;
    private javax.swing.JSlider massCartSlider;
    private javax.swing.JLabel massCartUnitLabel;
    private javax.swing.JButton restartButton;
    private javax.swing.JButton startButton;
    private javax.swing.JLabel timerDisplay;
    private javax.swing.JLabel timerLabel;
    // End of variables declaration//GEN-END:variables
}