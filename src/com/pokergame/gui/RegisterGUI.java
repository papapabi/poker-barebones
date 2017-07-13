package com.pokergame.gui;

import com.pokergame.backend.IOHelper;
import com.pokergame.backend.Player;
import java.awt.Color;
import java.awt.Font;
import java.util.HashMap;
import javax.swing.JOptionPane;

/**
 *
 * @author Joshua Isaac
 */
public class RegisterGUI extends javax.swing.JFrame {

    /**
     * Creates new form RegisterGUI
     */
    public RegisterGUI() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSpinner1 = new javax.swing.JSpinner();
        RegisterPanel = new javax.swing.JPanel();
        RegisterLabel = new javax.swing.JLabel();
        UsernameField = new javax.swing.JTextField();
        UsernameLabel = new javax.swing.JLabel();
        PasswordField = new javax.swing.JPasswordField();
        ConfirmLabel = new javax.swing.JLabel();
        ConfirmField = new javax.swing.JPasswordField();
        PasswordLabel = new javax.swing.JLabel();
        UsernameTakenLabel = new javax.swing.JLabel();
        PasswordVerificationIncorrectLabel = new javax.swing.JLabel();
        BackB = new javax.swing.JButton();
        ClearB = new javax.swing.JButton();
        SubmitB = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Register");
        setResizable(false);

        RegisterLabel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        RegisterLabel.setText("Create an Account");

        UsernameLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        UsernameLabel.setText("Username:");

        ConfirmLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ConfirmLabel.setText("Password:");

        PasswordLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        PasswordLabel.setText("Confirm Password:");

        javax.swing.GroupLayout RegisterPanelLayout = new javax.swing.GroupLayout(RegisterPanel);
        RegisterPanel.setLayout(RegisterPanelLayout);
        RegisterPanelLayout.setHorizontalGroup(
            RegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RegisterPanelLayout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addGroup(RegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(RegisterLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RegisterPanelLayout.createSequentialGroup()
                        .addComponent(UsernameLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(UsernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RegisterPanelLayout.createSequentialGroup()
                        .addComponent(ConfirmLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(UsernameTakenLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(PasswordVerificationIncorrectLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RegisterPanelLayout.createSequentialGroup()
                        .addComponent(PasswordLabel)
                        .addGap(4, 4, 4)
                        .addComponent(ConfirmField, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        RegisterPanelLayout.setVerticalGroup(
            RegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RegisterPanelLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(RegisterLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(RegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UsernameLabel)
                    .addComponent(UsernameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(UsernameTakenLabel)
                .addGap(3, 3, 3)
                .addGroup(RegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ConfirmLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(RegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ConfirmField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PasswordLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PasswordVerificationIncorrectLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        BackB.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BackB.setText("Back to menu");
        BackB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackBActionPerformed(evt);
            }
        });

        ClearB.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ClearB.setText("Clear");
        ClearB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearBActionPerformed(evt);
            }
        });

        SubmitB.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        SubmitB.setText("Submit");
        SubmitB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(RegisterPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(BackB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ClearB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SubmitB)))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {ClearB, SubmitB});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(RegisterPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BackB)
                    .addComponent(SubmitB)
                    .addComponent(ClearB))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SubmitBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitBActionPerformed
        HashMap<String, Player> players = IOHelper.deserialize();
        boolean errorDetected = false;
        String username = UsernameField.getText();
        double cash = (username.equals("admin")) ? Player.ADMIN_CASH : Player.DEFAULT_CASH;
        if (username.equals("")) {
            UsernameTakenLabel.setText("Enter a valid username!");
            UsernameTakenLabel.setForeground(Color.RED);
            UsernameTakenLabel.setFont(new Font("Tahoma", Font.BOLD, 10));
            errorDetected = true;

        } else if (players.containsKey(username)) { // username already exists
            UsernameTakenLabel.setText("Username already taken!");
            UsernameTakenLabel.setForeground(Color.RED);
            UsernameTakenLabel.setFont(new Font("Tahoma", Font.BOLD, 10));
            errorDetected = true;
        }
        String password = new String(PasswordField.getPassword());
        String verificationPassword = new String(ConfirmField.getPassword());
        if (password.equals("")) {
            PasswordVerificationIncorrectLabel.setText("Enter a valid password!");
            PasswordVerificationIncorrectLabel.setForeground(Color.RED);
            PasswordVerificationIncorrectLabel.setFont(new Font("Tahoma", Font.BOLD, 10));
            errorDetected = true;
        } else if (!password.equals(verificationPassword)) {
            PasswordVerificationIncorrectLabel.setText("Password verification incorrect!");
            PasswordVerificationIncorrectLabel.setForeground(Color.RED);
            PasswordVerificationIncorrectLabel.setFont(new Font("Tahoma", Font.BOLD, 10));
            errorDetected = true;
        }

        if (errorDetected) {
            this.setSize(330, 260);
            return;
        }

        int n = JOptionPane.showConfirmDialog(this, "Sure about account details?", "Registration Verification", JOptionPane.YES_NO_OPTION);
        if (n == JOptionPane.NO_OPTION) {
            return;
        }

        Player player = new Player();
        player.setUsername(username);
        player.setPassword(password);
        player.setCash(cash);
        players.put(username, player);
        IOHelper.serialize(players);
        JOptionPane.showMessageDialog(this, "Registration successful! Press OK to redirect to the Launcher.");
        this.dispose();
        new LauncherGUI().setVisible(true);

    }//GEN-LAST:event_SubmitBActionPerformed

    private void BackBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackBActionPerformed
        this.dispose();
        new LauncherGUI().setVisible(true);
    }//GEN-LAST:event_BackBActionPerformed

    private void ClearBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearBActionPerformed
        UsernameField.setText("");
        PasswordField.setText("");
        ConfirmField.setText("");
    }//GEN-LAST:event_ClearBActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RegisterGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackB;
    private javax.swing.JButton ClearB;
    private javax.swing.JPasswordField ConfirmField;
    private javax.swing.JLabel ConfirmLabel;
    private javax.swing.JPasswordField PasswordField;
    private javax.swing.JLabel PasswordLabel;
    private javax.swing.JLabel PasswordVerificationIncorrectLabel;
    private javax.swing.JLabel RegisterLabel;
    private javax.swing.JPanel RegisterPanel;
    private javax.swing.JButton SubmitB;
    private javax.swing.JTextField UsernameField;
    private javax.swing.JLabel UsernameLabel;
    private javax.swing.JLabel UsernameTakenLabel;
    private javax.swing.JSpinner jSpinner1;
    // End of variables declaration//GEN-END:variables
}