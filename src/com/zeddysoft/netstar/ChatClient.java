package com.zeddysoft.netstar;

import java.awt.Font;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.*;
import java.net.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.LineUnavailableException;
import javax.swing.*;

/**
 *
 * @author AZEEZ TAIWO
 */
public class ChatClient extends javax.swing.JFrame {

    Login lg = new Login();
    String disconMessage = "";
    public String recipient = "";
    public int PORT;
    BufferedReader input;
    PrintWriter output;
    Scanner sc;
    Socket sock;

    /**
     * Creates new form ChatClient
     */
    public ChatClient() {
        initComponents();
        this.setLocationRelativeTo(null); //code to centralize the window
        initialize();
        jTextField2.setEditable(false);
        jTextArea1.setEditable(false);
        jTextArea2.setEditable(false);
        jList1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }

    public ChatClient(String a) {
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
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Virtual DJ", 1, 20)); // NOI18N
        jLabel1.setText("netstar CHAT SERVICE");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(90, 30, 420, 40);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
        });
        jPanel1.add(jTextField1);
        jTextField1.setBounds(20, 390, 270, 50);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 0, 204));
        jButton1.setText("Send");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(297, 390, 70, 50);

        jList1.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jList1ValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(jList1);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(390, 160, 150, 280);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true), "Currently Online", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(380, 130, 170, 320);

        jLabel4.setText("Currently logged In As");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(300, 100, 130, 30);

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField2);
        jTextField2.setBounds(430, 100, 120, 30);

        jPanel2.setLayout(null);

        jTextArea1.setColumns(20);
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(0, 0, 340, 190);

        jTabbedPane1.addTab("Room Messages", jPanel2);

        jPanel3.setLayout(null);

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane3.setViewportView(jTextArea2);

        jPanel3.add(jScrollPane3);
        jScrollPane3.setBounds(0, 0, 340, 190);

        jTabbedPane1.addTab("Private Messagas", jPanel3);

        jPanel1.add(jTabbedPane1);
        jTabbedPane1.setBounds(20, 160, 340, 220);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "Conversation", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), java.awt.Color.black)); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 130, 370, 320);

        jMenu2.setText("Account");

        jMenuItem3.setText("Compose Message");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuItem2.setText("Logout");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 555, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 497, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String chatMes = jTextField1.getText();
        if (!chatMes.isEmpty()) {
            try {
                System.out.println(chatMes);
                output.println(chatMes);
                output.flush();
                jTextField1.setText("");
                jTextField1.requestFocus();
            } catch (Exception ex) {
                System.out.println("Error while sending message to the SERVER: " + ex.getMessage());
                JOptionPane.showMessageDialog(rootPane, "Error occured while sending message");
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            String chatMes = jTextField1.getText();
            if (!(jTextField1.getText().isEmpty())) {
                try {
                    System.out.println(chatMes);
                    output.println(chatMes);
                    output.flush();
                    jTextField1.setText("");
                    jTextField1.requestFocus();
                } catch (Exception ex) {
                    System.out.println("Error while sending message to the SERVER: " + ex.getMessage());
                }
            }
        }
    }//GEN-LAST:event_jTextField1KeyPressed

    private void jList1ValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jList1ValueChanged
        if (!evt.getValueIsAdjusting()) {
            Message priv_chat = new Message();
            priv_chat.getlabel().setText(jList1.getSelectedValue().toString());
            priv_chat.setVisible(true);
        }
    }//GEN-LAST:event_jList1ValueChanged

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        int reply = JOptionPane.showConfirmDialog(rootPane, "Do you want to logout from the chat service?");
        if (reply == JOptionPane.YES_OPTION) {
            this.dispose();
            new Login().setVisible(true);
        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
    }//GEN-LAST:event_jMenuItem3ActionPerformed

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
            java.util.logging.Logger.getLogger(ChatClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChatClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChatClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChatClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                new ChatClient().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JList jList1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables

    public void setUpNetworking() throws IOException {
        input = new BufferedReader(new InputStreamReader(sock.getInputStream()));
        output = new PrintWriter(sock.getOutputStream());
    }

    private class IncomingReader implements Runnable {

        @Override
        public void run() {
            String serverMessage = null;
            while (true) {
                try {
                    while ((serverMessage = input.readLine()) != null) {
                        if (serverMessage.contains("#?:")) {
                            //update the jList of online users
                            String onlineList = serverMessage.substring(3);
                            onlineList = onlineList.replace("[", "");
                            onlineList = onlineList.replace("]", "");
                            String[] currentUsers = onlineList.split(", ");
                            jList1.setListData(currentUsers);
                        } else {
                            System.out.println("Message From SERVER: " + serverMessage);
                            jTextArea1.append(serverMessage + "\n");
                            try {
                                SoundUtils.tone(100, 1000);
                            } catch (LineUnavailableException ex) {
                                Logger.getLogger(ChatClient.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                    }
                } catch (IOException ex) {
                    System.out.println("Error occured while trying to read from the SERVER: " + ex.getMessage());
                    break;
                }
            }
        }

    }

    public void initialize() {
        jTextField2.setText(lg.name);
        try {
            sock = new Socket(lg.ip_Add, lg.port); //creates a connection to the server
            setUpNetworking();
            System.out.println("Successfully connected to the SERVER");
            output.println(lg.name);
            output.flush();
            Thread readFromServer = new Thread(new IncomingReader()); //reads from the server
            readFromServer.start();
        } catch (ConnectException ex) {
            JOptionPane.showMessageDialog(rootPane, "Connection to server refused, SERVER OFFLINE");
            System.exit(0);
        } catch (UnknownHostException ex) {
            JOptionPane.showMessageDialog(rootPane, "Unknown Host");
            System.exit(0);
        } catch (NoRouteToHostException ex) {
            JOptionPane.showMessageDialog(rootPane, "Unreachable host");
            System.exit(0);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(rootPane, "You have been disconnected from the server");
            System.exit(0);
        }
    }

    public JTextField getSender() {
        return jTextField2;
    }

    public BufferedReader getReader() {
        return input;
    }

    public PrintWriter getWriter() {
        return output;
    }
}
