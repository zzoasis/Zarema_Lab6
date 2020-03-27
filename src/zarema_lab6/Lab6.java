/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zarema_lab6;

import com.sun.javafx.tk.Toolkit;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;


/**
 *
 * @author Зарема
 */
public class Lab6 extends javax.swing.JFrame {
       private  JFileChooser filechooser = new JFileChooser(); 
    
       
    public Lab6() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame2 = new javax.swing.JFrame();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jFrame3 = new javax.swing.JFrame();
        jTextField4 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jTextField5 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();

        jFrame2.setTitle("Поздравление");
        jFrame2.setMinimumSize(new java.awt.Dimension(400, 300));
        jFrame2.setResizable(false);
        jFrame2.getContentPane().setLayout(null);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Фамилия");
        jFrame2.getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 90, 100, 20);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Введите данные");
        jFrame2.getContentPane().add(jLabel2);
        jLabel2.setBounds(160, 50, 170, 30);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("Имя");
        jFrame2.getContentPane().add(jLabel4);
        jLabel4.setBounds(30, 120, 80, 17);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("Отчество");
        jFrame2.getContentPane().add(jLabel5);
        jLabel5.setBounds(30, 150, 100, 17);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jFrame2.getContentPane().add(jTextField1);
        jTextField1.setBounds(130, 90, 230, 20);

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jFrame2.getContentPane().add(jTextField2);
        jTextField2.setBounds(130, 120, 230, 20);

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jFrame2.getContentPane().add(jTextField3);
        jTextField3.setBounds(130, 150, 230, 20);

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton2.setText("Создать поздравление");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jFrame2.getContentPane().add(jButton2);
        jButton2.setBounds(180, 220, 180, 30);

        jButton4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton4.setText("Назад");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jFrame2.getContentPane().add(jButton4);
        jButton4.setBounds(20, 220, 110, 30);

        jFrame2.setLocationRelativeTo(null);

        jFrame3.setTitle("Поздравление");
        jFrame3.setBackground(new java.awt.Color(255, 255, 51));
        jFrame3.setForeground(java.awt.Color.white);
        jFrame3.setMinimumSize(new java.awt.Dimension(400, 300));
        jFrame3.setResizable(false);
        jFrame3.getContentPane().setLayout(null);

        jTextField4.setBackground(new java.awt.Color(255, 255, 51));
        jTextField4.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        jTextField4.setForeground(new java.awt.Color(204, 0, 0));
        jTextField4.setText("С днём рождения,");
        jTextField4.setToolTipText("");
        jTextField4.setBorder(null);
        jTextField4.setDisabledTextColor(new java.awt.Color(204, 0, 0));
        jTextField4.setEnabled(false);
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        jFrame3.getContentPane().add(jTextField4);
        jTextField4.setBounds(74, 120, 110, 100);

        jButton3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton3.setText("ОК");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jFrame3.getContentPane().add(jButton3);
        jButton3.setBounds(210, 230, 120, 30);

        jButton6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton6.setText("Назад");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jFrame3.getContentPane().add(jButton6);
        jButton6.setBounds(90, 230, 100, 30);

        jTextField5.setBackground(new java.awt.Color(255, 255, 51));
        jTextField5.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jTextField5.setForeground(new java.awt.Color(204, 0, 0));
        jTextField5.setBorder(null);
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        jFrame3.getContentPane().add(jTextField5);
        jTextField5.setBounds(190, 120, 240, 100);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cake-icon (3).png"))); // NOI18N
        jFrame3.getContentPane().add(jLabel6);
        jLabel6.setBounds(130, 10, 150, 110);

        jPanel1.setBackground(new java.awt.Color(255, 255, 51));
        jFrame3.getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 500, 300);

        jFrame3.setLocationRelativeTo(null);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Поздравление");
        setMaximumSize(new java.awt.Dimension(2147, 2147));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("Выберите язык");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(40, 30, 170, 20);

        jComboBox1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Русский", "Английский", "Французский", "Казахский" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(120, 100, 140, 30);

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton1.setText("Выбрать язык");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(90, 190, 210, 40);

        setSize(new java.awt.Dimension(416, 339));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
      if( "Английский".equals(jComboBox1.getSelectedItem().toString())){
       
       Locale l1= new Locale("en","GB");
          ResourceBundle r1=ResourceBundle.getBundle("zarema_lab6/english",l1);
           jButton2.setText(r1.getString("Lab6.jButton2.text"));
           jButton1.setText(r1.getString("Lab6.jButton1.text"));
           jButton4.setText(r1.getString("Lab6.jButton4.text"));
           jButton6.setText(r1.getString("Lab6.jButton6.text"));
           jLabel1.setText(r1.getString("Lab6.jLabel1.text"));
           jLabel2.setText(r1.getString("Lab6.jLabel2.text"));
           jLabel3.setText(r1.getString("Lab6.jLabel3.text"));
           jLabel4.setText(r1.getString("Lab6.jLabel4.text"));
           jLabel5.setText(r1.getString("Lab6.jLabel5.text"));
           jTextField4.setText(r1.getString("Lab6.jTextField4.text"));
           this.setTitle(r1.getString("Lab6.jFrame.title"));
           jFrame2.setTitle(r1.getString("Lab6.jFrame.title"));
           jFrame3.setTitle(r1.getString("Lab6.jFrame.title"));
           
        }
      if( "Русский".equals(jComboBox1.getSelectedItem())){
           Locale l2=new Locale("ru","RU");  
           ResourceBundle r2=ResourceBundle.getBundle("zarema_lab6/russian",l2);
           jButton2.setText(r2.getString("Lab6.jButton2.text"));
           jButton1.setText(r2.getString("Lab6.jButton1.text"));
           jButton4.setText(r2.getString("Lab6.jButton4.text"));
           jButton6.setText(r2.getString("Lab6.jButton6.text"));
            jLabel1.setText(r2.getString("Lab6.jLabel1.text"));
           jLabel2.setText(r2.getString("Lab6.jLabel2.text"));
           jLabel3.setText(r2.getString("Lab6.jLabel3.text"));
           jLabel4.setText(r2.getString("Lab6.jLabel4.text"));
           jLabel5.setText(r2.getString("Lab6.jLabel5.text"));
           jTextField4.setText(r2.getString("Lab6.jTextField4.text"));
           this.setTitle(r2.getString("Lab6.jFrame.title"));
           jFrame2.setTitle(r2.getString("Lab6.jFrame.title"));
           jFrame3.setTitle(r2.getString("Lab6.jFrame.title"));
                   }
         if( "Французский".equals(jComboBox1.getSelectedItem().toString())){
         Locale l3= new Locale("fr","FR");
             ResourceBundle r3=ResourceBundle.getBundle("zarema_lab6/french",l3);
           jButton2.setText(r3.getString("Lab6.jButton2.text"));
           jButton1.setText(r3.getString("Lab6.jButton1.text"));
           jButton4.setText(r3.getString("Lab6.jButton4.text"));
           jButton6.setText(r3.getString("Lab6.jButton6.text"));
            jLabel1.setText(r3.getString("Lab6.jLabel1.text"));
           jLabel2.setText(r3.getString("Lab6.jLabel2.text"));
           jLabel3.setText(r3.getString("Lab6.jLabel3.text"));
           jLabel4.setText(r3.getString("Lab6.jLabel4.text"));
           jLabel5.setText(r3.getString("Lab6.jLabel5.text"));
           jTextField4.setText(r3.getString("Lab6.jTextField4.text"));
           this.setTitle(r3.getString("Lab6.jFrame.title"));
           jFrame2.setTitle(r3.getString("Lab6.jFrame.title"));
           jFrame3.setTitle(r3.getString("Lab6.jFrame.title"));
        }
         if( "Казахский".equals(jComboBox1.getSelectedItem().toString())){
         Locale l4= new Locale("kk","KZ");
           ResourceBundle r4=ResourceBundle.getBundle("zarema_lab6/kazakh",l4);
           jButton2.setText(r4.getString("Lab6.jButton2.text"));
           jButton1.setText(r4.getString("Lab6.jButton1.text"));
           jButton4.setText(r4.getString("Lab6.jButton4.text"));
           jButton6.setText(r4.getString("Lab6.jButton6.text"));
           jLabel1.setText(r4.getString("Lab6.jLabel1.text"));
           jLabel2.setText(r4.getString("Lab6.jLabel2.text"));
           jLabel3.setText(r4.getString("Lab6.jLabel3.text"));
           jLabel4.setText(r4.getString("Lab6.jLabel4.text"));
           jLabel5.setText(r4.getString("Lab6.jLabel5.text"));
           jTextField4.setText(r4.getString("Lab6.jTextField4.text"));
           this.setTitle(r4.getString("Lab6.jFrame.title"));
           jFrame2.setTitle(r4.getString("Lab6.jFrame.title"));
           jFrame3.setTitle(r4.getString("Lab6.jFrame.title"));
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     this.setVisible(false); // Спрятать главное окно 1
     jFrame2.setVisible(true); // Показать окно 2
          
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
      System.exit(0); // Выход из программы
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jFrame2.setVisible(false); // Спрятать окно 2
jFrame3.setVisible(true); // Показать главное окно 3
jTextField5.setText(jTextField1.getText()+ "\n" + jTextField2.getText()+ "\n" + jTextField3.getText()+ "!");         
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
       
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        jFrame2.setVisible(false); // Спрятать окно 2
        this.setVisible(true); // Показать главное окно 1
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
       jFrame3.setVisible(false); // Спрятать окно 3
        jFrame2.setVisible(true); // Показать окно 2
    }//GEN-LAST:event_jButton6ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
      
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Lab6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Lab6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Lab6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Lab6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Lab6().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JFrame jFrame3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}
