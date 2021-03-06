/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package divisas;

/**
 *
 * @author alumno
 */
public class ProjectDivisas extends javax.swing.JFrame {

    /**
     * Creates new form ProjectDivisas
     */
    public ProjectDivisas() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Conversor de divisas");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        importeCalcular = new javax.swing.JTextField();
        monedaincial = new javax.swing.JComboBox<>();
        monedaConver = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        resultado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel1.setText("Introduce importe:");

        monedaincial.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "EUR", "USD", "GTQ", "PESO MX" }));

        monedaConver.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "EUR", "USD", "GTQ", "PESO MX" }));

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel2.setText("Convertir a:");

        jButton1.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jButton1.setText("Convertir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Resultado:");

        resultado.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(monedaConver, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(54, 54, 54)
                                .addComponent(jButton1))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(resultado))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(importeCalcular))
                                .addGap(34, 34, 34)
                                .addComponent(monedaincial, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(importeCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(monedaincial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(monedaConver, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(resultado))
                .addGap(51, 51, 51))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        double resultadocalculo;
        String vaciar = "";
        String datoinicial = importeCalcular.getText();
        String resultadoRealizado;
        double datoconvertido = Double.parseDouble(datoinicial);
        String seleccionMonedaInicial = monedaincial.getSelectedItem().toString();
        String seleccionConvertir = monedaConver.getSelectedItem().toString();
        if (seleccionMonedaInicial == "EUR"){
            if (seleccionConvertir == "GTQ"){
                resultadocalculo = datoconvertido * 8.07;
                resultadoRealizado = "" + resultadocalculo;
                resultado.setText(resultadoRealizado + " " + seleccionConvertir);
                resultadoRealizado = "";
            }
            if (seleccionConvertir == "USD"){
                resultadocalculo = datoconvertido * 1.05;
                resultadoRealizado = "" + resultadocalculo;
                resultado.setText(resultadoRealizado + " " + seleccionConvertir);
                resultadoRealizado = "";
            }
            if (seleccionConvertir == "PESO MX"){
                resultadocalculo = datoconvertido * 21.50;
                resultadoRealizado = "" + resultadocalculo;
                resultado.setText(resultadoRealizado + " " + seleccionConvertir);
                resultadoRealizado = "";
            }
            if (seleccionConvertir == "EUR"){
                resultadoRealizado = datoinicial;
                resultado.setText(resultadoRealizado + " " + seleccionConvertir);
                resultadoRealizado = "";
            }
            
        }
        if (seleccionMonedaInicial == "USD"){
            if (seleccionConvertir == "GTQ"){
                resultadocalculo = datoconvertido * 7.67;
                resultadoRealizado = "" + resultadocalculo;
                resultado.setText(resultadoRealizado + " " + seleccionConvertir);
                resultadoRealizado = "";
            }
            if (seleccionConvertir == "EUR"){
                resultadocalculo = datoconvertido * 0.95;
                resultadoRealizado = "" + resultadocalculo;
                resultado.setText(resultadoRealizado + " " + seleccionConvertir);
                resultadoRealizado = "";
            }
            if (seleccionConvertir == "PESO MX"){
                resultadocalculo = datoconvertido * 20.43;
                resultadoRealizado = "" + resultadocalculo;
                resultado.setText(resultadoRealizado + " " + seleccionConvertir);
                resultadoRealizado = "";
            }
            if (seleccionConvertir == "USD"){
                resultadoRealizado = datoinicial;
                resultado.setText(resultadoRealizado + " " + seleccionConvertir);
                resultadoRealizado = "";
            }
        }
        if (seleccionMonedaInicial == "GTQ"){
            if (seleccionConvertir == "EUR"){
                resultadocalculo = datoconvertido * 0.12;
                resultadoRealizado = "" + resultadocalculo;
                resultado.setText(resultadoRealizado + " " + seleccionConvertir);
                resultadoRealizado = "";
            }
            if (seleccionConvertir == "USD"){
                resultadocalculo = datoconvertido * 0.13;
                resultadoRealizado = "" + resultadocalculo;
                resultado.setText(resultadoRealizado + " " + seleccionConvertir);
                resultadoRealizado = "";
            }
            if (seleccionConvertir == "PESO MX"){
                resultadocalculo = datoconvertido * 2.67;
                resultadoRealizado = "" + resultadocalculo;
                resultado.setText(resultadoRealizado + " " + seleccionConvertir);
                resultadoRealizado = "";
            }
            if (seleccionConvertir == "GTQ"){
                resultadoRealizado = datoinicial;
                resultado.setText(resultadoRealizado + " " + seleccionConvertir);
                resultadoRealizado = "";
            }
        }
        if (seleccionMonedaInicial == "PESO MX"){
            if (seleccionConvertir == "GTQ"){
                resultadocalculo = datoconvertido * 0.38;
                resultadoRealizado = "" + resultadocalculo;
                resultado.setText(resultadoRealizado + " " + seleccionConvertir);
                resultadoRealizado = "";
            }
            if (seleccionConvertir == "USD"){
                resultadocalculo = datoconvertido * 0.049;
                resultadoRealizado = "" + resultadocalculo;
                resultado.setText(resultadoRealizado + " " + seleccionConvertir);
                resultadoRealizado = "";
            }
            if (seleccionConvertir == "EUR"){
                resultadocalculo = datoconvertido * 0.047;
                resultadoRealizado = "" + resultadocalculo;
                resultado.setText(resultadoRealizado + " " + seleccionConvertir);
                resultadoRealizado = "";
            }
            if (seleccionConvertir == "PESO MX"){
                resultadoRealizado = datoinicial;
                resultado.setText(resultadoRealizado + " " + seleccionConvertir);
                resultadoRealizado = "";
            }
        }
            
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(ProjectDivisas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProjectDivisas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProjectDivisas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProjectDivisas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProjectDivisas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField importeCalcular;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JComboBox<String> monedaConver;
    private javax.swing.JComboBox<String> monedaincial;
    private javax.swing.JLabel resultado;
    // End of variables declaration//GEN-END:variables
}
