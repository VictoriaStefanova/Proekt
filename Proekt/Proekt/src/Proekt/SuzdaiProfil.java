/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Proekt;

import java.io.File;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author Виктория Стефанова
 */
public class SuzdaiProfil extends javax.swing.JFrame {

    /**
     * Creates new form SuzdaiProfil
     */
    public SuzdaiProfil() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlSuzdaiProfil = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnProfil = new javax.swing.JButton();
        txtName = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtUsername = new javax.swing.JTextField();
        txtPassword = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        emailError = new javax.swing.JTextField();
        usernameError = new javax.swing.JTextField();
        passwordError = new javax.swing.JTextField();
        nameError = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 102, 153));

        pnlSuzdaiProfil.setBackground(new java.awt.Color(0, 102, 153));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 204, 0));
        jLabel1.setText("Създаване на профил");

        btnProfil.setBackground(new java.awt.Color(255, 204, 0));
        btnProfil.setText("Създай");
        btnProfil.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnProfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProfilActionPerformed(evt);
            }
        });

        txtName.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        txtEmail.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtUsername.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtPassword.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Име и фамилия");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Имейл");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Username");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Password");

        emailError.setBackground(new java.awt.Color(0, 102, 153));
        emailError.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        emailError.setForeground(new java.awt.Color(255, 0, 0));
        emailError.setBorder(null);

        usernameError.setBackground(new java.awt.Color(0, 102, 153));
        usernameError.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        usernameError.setForeground(new java.awt.Color(255, 0, 0));
        usernameError.setBorder(null);

        passwordError.setBackground(new java.awt.Color(0, 102, 153));
        passwordError.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        passwordError.setForeground(new java.awt.Color(255, 0, 0));
        passwordError.setBorder(null);

        nameError.setBackground(new java.awt.Color(0, 102, 153));
        nameError.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        nameError.setForeground(new java.awt.Color(255, 0, 0));
        nameError.setBorder(null);
        nameError.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameErrorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlSuzdaiProfilLayout = new javax.swing.GroupLayout(pnlSuzdaiProfil);
        pnlSuzdaiProfil.setLayout(pnlSuzdaiProfilLayout);
        pnlSuzdaiProfilLayout.setHorizontalGroup(
            pnlSuzdaiProfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSuzdaiProfilLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(pnlSuzdaiProfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlSuzdaiProfilLayout.createSequentialGroup()
                        .addGroup(pnlSuzdaiProfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtName, javax.swing.GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
                            .addComponent(txtUsername)
                            .addComponent(txtEmail, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPassword, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(30, 30, 30)
                        .addGroup(pnlSuzdaiProfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(emailError)
                            .addComponent(passwordError)
                            .addComponent(nameError, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
                            .addComponent(usernameError)))
                    .addGroup(pnlSuzdaiProfilLayout.createSequentialGroup()
                        .addGroup(pnlSuzdaiProfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnProfil, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlSuzdaiProfilLayout.setVerticalGroup(
            pnlSuzdaiProfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSuzdaiProfilLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(3, 3, 3)
                .addGroup(pnlSuzdaiProfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameError, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlSuzdaiProfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailError, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addGap(1, 1, 1)
                .addGroup(pnlSuzdaiProfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usernameError, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlSuzdaiProfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordError, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnProfil, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlSuzdaiProfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 53, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlSuzdaiProfil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
private String username;
private String name;
private String password;
private String email;
public void setUsername(String username){
    if(username != null){
    this.username=username;}
}
public String getUsername(){
    return username;
}
public void setName(String name){
    if(name != null){
    this.name=name;}
}
public String getName(){
    return name;
}
public void setPassword(String password){
    if(password != null){
    this.password=password;}
}
public String getPassword(){
    return password;
}
public void setEmail(String email){
    if(email != null){
    this.email=email;}
}
public String getEmail(){
    return email;
}
public static boolean checkUsername(String username){
    Pattern p = Pattern.compile("[[a-zа-я][A-ZА-Я]_0-9]{8,15}");
    Matcher m = p.matcher(username);
    return m.matches();
}
public static boolean checkName(String name){
    Pattern p = Pattern.compile("[A-ZА-Я]{1}[a-zа-я]+ [A-ZА-Я]{1}[a-zа-я]+");
    Matcher m = p.matcher(name);
    return m.matches();
}
public static boolean checkPassword(String password){
    Pattern p = Pattern.compile("[[a-zа-я][A-ZА-Я]_0-9]{6,15}");
    Matcher m = p.matcher(password);
    return m.matches();
}
//\"\\\\w+@\\\\w+\\\\.[a-zA-Z]{2,3}"
public static boolean checkEmail(String email){
    Pattern p = Pattern.compile("[A-ZА-Я]{1}[a-zа-я]+ [A-ZА-Я]{1}[a-zа-я]+");
    Matcher m = p.matcher(email);
    return m.matches();
}

    void readFromFile() throws FileNotFoundException {
        boolean a= false;
        File file = new File("src\\Proekt\\files\\danni.txt");
        Scanner fileReader = new Scanner(file);
        try{
        while(fileReader.hasNextLine()){
            System.out.println("bfrbouer");
            System.out.printf("%s%n", fileReader.nextLine());
            String splitText[]= fileReader.nextLine().split(",");
            System.out.println(splitText[0]);
            if(splitText[0].equals(txtUsername.getText())){
                JOptionPane.showMessageDialog(null, "Вече съществува такъв човек", "",JOptionPane.ERROR_MESSAGE);
            }
            else{
               
                a=true;
                writeFromFile();
           }
        } 
        }catch(NoSuchElementException ee){
        }
       fileReader.close();
    }
    
    void writeFromFile() throws IOException {
       
    FileWriter file = new FileWriter("src\\Proekt\\files\\danni.txt", true);
    BufferedWriter fileWriter= new BufferedWriter(file);
     try{
    fileWriter.write("Лични данни");
    fileWriter.write(txtUsername.getText()+","+txtPassword.getText()+","+txtEmail.getText()+","+txtName.getText());
    fileWriter.close();
    }
    catch(RuntimeException ee){
        ee.printStackTrace();
    }catch(IOException ea){
        ea.printStackTrace();
    }
    }
    private void btnProfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProfilActionPerformed
        //ДА НЯМА ТАКЪВ СЪЩЕСТВУВАЩ USERNAME
        //username password ime email
        String username = txtUsername.getText();
        String name = txtName.getText();
        String password = txtPassword.getText();
        String email = txtEmail.getText();
        
        System.out.println(checkUsername(txtUsername.getText()));
        System.out.println(checkName(txtName.getText()));
        System.out.println(checkPassword(txtPassword.getText()));
        System.out.println(checkEmail(txtEmail.getText()));
        
        if(checkName(txtName.getText())==false) nameError.setText("*Невалидно име!");
        if(checkUsername(txtUsername.getText())==false) usernameError.setText("*Невалидно потребителско име!");
        if(checkPassword(txtPassword.getText())==false) passwordError.setText("*Невалидна парола!");
        if(checkEmail(txtEmail.getText())==false) emailError.setText("*Невалиден имейл!");
        
        
        else{
            try {
                readFromFile();
                writeFromFile();
            } catch (FileNotFoundException ex) {
            } 
        this.dispose();
        new SportNaDenq().setVisible(true);
        }
       
    }//GEN-LAST:event_btnProfilActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void nameErrorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameErrorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameErrorActionPerformed

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
            java.util.logging.Logger.getLogger(SuzdaiProfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SuzdaiProfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SuzdaiProfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SuzdaiProfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SuzdaiProfil().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnProfil;
    private javax.swing.JTextField emailError;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField nameError;
    private javax.swing.JTextField passwordError;
    private javax.swing.JPanel pnlSuzdaiProfil;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtUsername;
    private javax.swing.JTextField usernameError;
    // End of variables declaration//GEN-END:variables
}
