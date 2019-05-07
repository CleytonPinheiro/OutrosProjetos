
import javax.swing.JOptionPane;


public class Formulario extends javax.swing.JFrame {

    public Formulario() {
        initComponents();
    }
    
     public void limpar(){
         
           nomeCampo.setText("");
           enderecoCampo.setText("");
           telefoneCampo.setText("");
           emailCampo.setText("");
           cidadeCampo.setText("");
           motivoCampo.setText("");
           
           espanholCampo.setSelected(false);
           alemaoCampo.setSelected(false);
           inglesCampo.setSelected(false);
           italianoCampo.setSelected(false);
           francesCampo.setSelected(false);
           japonesCampo.setSelected(false);
           
           femininoCampo.setSelected(false);
           masculinoCampo.setSelected(false);
           
           estadoCampo.setSelectedIndex(-1); 
                
            }
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox2 = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nomeCampo = new javax.swing.JTextField();
        emailCampo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        estadoCampo = new javax.swing.JComboBox<>();
        enderecoCampo = new javax.swing.JTextField();
        telefoneCampo = new javax.swing.JTextField();
        cidadeCampo = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        espanholCampo = new javax.swing.JCheckBox();
        alemaoCampo = new javax.swing.JCheckBox();
        francesCampo = new javax.swing.JCheckBox();
        inglesCampo = new javax.swing.JCheckBox();
        italianoCampo = new javax.swing.JCheckBox();
        japonesCampo = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        motivoCampo = new javax.swing.JTextArea();
        salvar = new javax.swing.JButton();
        femininoCampo = new javax.swing.JCheckBox();
        masculinoCampo = new javax.swing.JCheckBox();
        jLabel8 = new javax.swing.JLabel();

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CADASTRO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        jLabel1.setText("NOME");

        jLabel2.setText("ENDEREÇO");

        nomeCampo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeCampoActionPerformed(evt);
            }
        });

        emailCampo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailCampoActionPerformed(evt);
            }
        });

        jLabel4.setText("CIDADE");

        jLabel5.setText("FONE\n");

        jLabel6.setText("E-MAIL");

        jLabel7.setText("UF");

        estadoCampo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Acre AC ", "Alagoas AL ", "Amapá AP ", "Amazonas AM ", "BahiaBA ", "Ceará CE ", "Distrito Federal DF ", "Espírito Santo ES ", "Goiás GO ", "Maranhão MA", "Mato Grosso MT ", "Mato Grosso do Sul MS ", "Minas Gerais MG", "Pará PA ", "Paraíba PB ", "Paraná PR ", "Pernambuco PE ", "Piau íPI ", "Rio de Janeiro RJ ", "Rio Grande do Norte RN ", "Rio Grande do Sul RS ", "Rondônia RO ", "Roraima RR ", "Santa Catarina SC ", "São Paulo SP ", "Sergipe SE ", "Tocantins TO" }));
        estadoCampo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estadoCampoActionPerformed(evt);
            }
        });

        enderecoCampo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enderecoCampoActionPerformed(evt);
            }
        });

        telefoneCampo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telefoneCampoActionPerformed(evt);
            }
        });

        cidadeCampo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cidadeCampoActionPerformed(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CURSOS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("SELECIONE O(S) CURSO(S):");

        espanholCampo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        espanholCampo.setText("Espanhol");

        alemaoCampo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        alemaoCampo.setText("Alemão");
        alemaoCampo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alemaoCampoActionPerformed(evt);
            }
        });

        francesCampo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        francesCampo.setText("Frances");

        inglesCampo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        inglesCampo.setText("Inglês");

        italianoCampo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        italianoCampo.setText("Italiano");

        japonesCampo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        japonesCampo.setText("Japonês");

        motivoCampo.setColumns(20);
        motivoCampo.setRows(5);
        jScrollPane1.setViewportView(motivoCampo);

        salvar.setText("Salvar");
        salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(jLabel9))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(alemaoCampo)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(espanholCampo)))
                                .addGap(18, 18, 18)
                                .addComponent(francesCampo)
                                .addGap(18, 18, 18)
                                .addComponent(inglesCampo)
                                .addGap(18, 18, 18)
                                .addComponent(italianoCampo)
                                .addGap(38, 38, 38)
                                .addComponent(japonesCampo))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 694, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 2, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {alemaoCampo, espanholCampo, francesCampo, inglesCampo, italianoCampo, japonesCampo});

        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addGap(28, 28, 28)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(alemaoCampo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(espanholCampo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(francesCampo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(inglesCampo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(italianoCampo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(japonesCampo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(272, 272, 272))
        );

        femininoCampo.setText("Feminino");

        masculinoCampo.setText("Masculino");

        jLabel8.setText("SEXO:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2)
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(nomeCampo, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                    .addComponent(emailCampo)
                    .addComponent(enderecoCampo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel8)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(telefoneCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(75, 75, 75))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(femininoCampo)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(masculinoCampo))
                                    .addComponent(cidadeCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(estadoCampo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(nomeCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)
                        .addComponent(telefoneCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(enderecoCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel2)
                                        .addGap(36, 36, 36))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(cidadeCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(estadoCampo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(emailCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(femininoCampo)
                                    .addComponent(masculinoCampo)
                                    .addComponent(jLabel8))))
                        .addGap(51, 51, 51))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void emailCampoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailCampoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailCampoActionPerformed

    private void nomeCampoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeCampoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeCampoActionPerformed

    private void enderecoCampoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enderecoCampoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enderecoCampoActionPerformed

    private void telefoneCampoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefoneCampoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telefoneCampoActionPerformed

    private void cidadeCampoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cidadeCampoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cidadeCampoActionPerformed

    private void estadoCampoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estadoCampoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_estadoCampoActionPerformed

    private void salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarActionPerformed
        
          Cadastro objCadastro = new Cadastro();
          
          objCadastro .setNome(nomeCampo.getText());
          objCadastro .setCidade(cidadeCampo.getText());
          objCadastro .setEmail(emailCampo.getText());
          objCadastro .setTelefone(telefoneCampo.getText());
          objCadastro .setEndereco(enderecoCampo.getText());
          objCadastro .setMotivo(motivoCampo.getText());
          
          
    
    
            
          
           if (alemaoCampo.isSelected()){
               objCadastro.setAlemao(true);
               
           }if (italianoCampo.isSelected()){
               objCadastro.setItaliano(true);
               
           }if (francesCampo.isSelected()){
               objCadastro.setFrances(true);
               
           }if (inglesCampo.isSelected()){
               objCadastro.setIngles(true);
               
           }if (espanholCampo.isSelected()){
               objCadastro.setEspanhol(true);
               
           }if (japonesCampo.isSelected()){
               objCadastro.setJapones(true);
               
           }
            if (masculinoCampo.isSelected());{
        objCadastro.setSexo("M");
    } 
            if (femininoCampo.isSelected());{
        objCadastro.setSexo("M");
            
            }
            objCadastro.setEstado((String) estadoCampo.getSelectedItem());
            
            limpar();
            
            JOptionPane.showMessageDialog(null,"O cadastro foi salvo");
            
           
            
          
    }//GEN-LAST:event_salvarActionPerformed

    private void alemaoCampoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alemaoCampoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_alemaoCampoActionPerformed

   
    public static void main(String args[]) {
        
        
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Formulario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox alemaoCampo;
    private javax.swing.JTextField cidadeCampo;
    private javax.swing.JTextField emailCampo;
    private javax.swing.JTextField enderecoCampo;
    private javax.swing.JCheckBox espanholCampo;
    private javax.swing.JComboBox<String> estadoCampo;
    private javax.swing.JCheckBox femininoCampo;
    private javax.swing.JCheckBox francesCampo;
    private javax.swing.JCheckBox inglesCampo;
    private javax.swing.JCheckBox italianoCampo;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JCheckBox japonesCampo;
    private javax.swing.JCheckBox masculinoCampo;
    private javax.swing.JTextArea motivoCampo;
    private javax.swing.JTextField nomeCampo;
    private javax.swing.JButton salvar;
    private javax.swing.JTextField telefoneCampo;
    // End of variables declaration//GEN-END:variables
}
