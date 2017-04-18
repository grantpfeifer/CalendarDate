/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CalendarDatePackage;

/**
 *
 * @author grant
 */
public class CalendarDateFrame extends javax.swing.JFrame {
private int day;
private int month;
private int year;


    
private CalendarDate current;
    /**
     * Creates new form CalendarDateFrame
     */
    public CalendarDateFrame() {
        CalendarDate date = new CalendarDate();
        current = date;
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

        dayLbl = new javax.swing.JLabel();
        dayTextField = new javax.swing.JTextField();
        monthLbl = new javax.swing.JLabel();
        monthTextField = new javax.swing.JTextField();
        yearLbl = new javax.swing.JLabel();
        yearTextField = new javax.swing.JTextField();
        enterDateBtn = new javax.swing.JButton();
        displayDateLbl = new javax.swing.JLabel();
        lastWeekBtn = new javax.swing.JButton();
        yesterdayBtn = new javax.swing.JButton();
        todayBtn = new javax.swing.JButton();
        nextWeekBtn = new javax.swing.JButton();
        tomorrowBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        dayLbl.setText("Day:");

        dayTextField.setText("jTextField1");
        dayTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dayTextFieldActionPerformed(evt);
            }
        });

        monthLbl.setText("Month:");

        monthTextField.setText("jTextField1");
        monthTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                monthTextFieldActionPerformed(evt);
            }
        });

        yearLbl.setText("Year:");

        yearTextField.setText("jTextField1");
        yearTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yearTextFieldActionPerformed(evt);
            }
        });

        enterDateBtn.setText("Set Date");
        enterDateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterDateBtnActionPerformed(evt);
            }
        });

        displayDateLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        displayDateLbl.setText("Day of week, Month Day, Year");

        lastWeekBtn.setText("Last Week");
        lastWeekBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastWeekBtnActionPerformed(evt);
            }
        });

        yesterdayBtn.setText("Yesterday");
        yesterdayBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yesterdayBtnActionPerformed(evt);
            }
        });

        todayBtn.setText("Today");
        todayBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                todayBtnActionPerformed(evt);
            }
        });

        nextWeekBtn.setText("Next Week");
        nextWeekBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextWeekBtnActionPerformed(evt);
            }
        });

        tomorrowBtn.setText("Tomorrow");
        tomorrowBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tomorrowBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(enterDateBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(dayLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dayTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(monthLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(monthTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(yearLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(yearTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(displayDateLbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lastWeekBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(yesterdayBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(todayBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(nextWeekBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tomorrowBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dayLbl)
                    .addComponent(dayTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(monthLbl)
                    .addComponent(monthTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(yearLbl)
                    .addComponent(yearTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(enterDateBtn)
                .addGap(18, 18, 18)
                .addComponent(displayDateLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lastWeekBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(yesterdayBtn))
                    .addComponent(todayBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(nextWeekBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tomorrowBtn)))
                .addContainerGap(76, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void yesterdayBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yesterdayBtnActionPerformed
        current.yesterday();
        updateFields();
    }//GEN-LAST:event_yesterdayBtnActionPerformed

    private void todayBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_todayBtnActionPerformed
        CalendarDate today = new CalendarDate();
        current = today;
        updateFields();
    }//GEN-LAST:event_todayBtnActionPerformed

    private void enterDateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterDateBtnActionPerformed
        current.setDate(this.day, this.month, this.year);
        updateFields();
    }//GEN-LAST:event_enterDateBtnActionPerformed

    private void dayTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dayTextFieldActionPerformed
        this.day = Integer.parseInt(dayTextField.getText()); 
    }//GEN-LAST:event_dayTextFieldActionPerformed

    private void monthTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monthTextFieldActionPerformed
         this.month = Integer.parseInt(monthTextField.getText()); 
    }//GEN-LAST:event_monthTextFieldActionPerformed

    private void yearTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yearTextFieldActionPerformed
         this.year = Integer.parseInt(yearTextField.getText()); 
    }//GEN-LAST:event_yearTextFieldActionPerformed

    private void lastWeekBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastWeekBtnActionPerformed
       current.lastWeek();
       updateFields();
    }//GEN-LAST:event_lastWeekBtnActionPerformed

    private void nextWeekBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextWeekBtnActionPerformed
       current.nextWeek();    
       updateFields();
    }//GEN-LAST:event_nextWeekBtnActionPerformed

    private void tomorrowBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tomorrowBtnActionPerformed
        current.tomorrow();
        updateFields();
    }//GEN-LAST:event_tomorrowBtnActionPerformed

    private void updateFields(){
        String str = "";
        str += current.getDayOfWeek() + ", " + current.getMonthAsString() + " " + Integer.toString(current.getDay()) + ", " + Integer.toString(current.getYear());
        displayDateLbl.setText(str);
    }
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
            java.util.logging.Logger.getLogger(CalendarDateFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalendarDateFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalendarDateFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalendarDateFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalendarDateFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel dayLbl;
    private javax.swing.JTextField dayTextField;
    private javax.swing.JLabel displayDateLbl;
    private javax.swing.JButton enterDateBtn;
    private javax.swing.JButton lastWeekBtn;
    private javax.swing.JLabel monthLbl;
    private javax.swing.JTextField monthTextField;
    private javax.swing.JButton nextWeekBtn;
    private javax.swing.JButton todayBtn;
    private javax.swing.JButton tomorrowBtn;
    private javax.swing.JLabel yearLbl;
    private javax.swing.JTextField yearTextField;
    private javax.swing.JButton yesterdayBtn;
    // End of variables declaration//GEN-END:variables
}
