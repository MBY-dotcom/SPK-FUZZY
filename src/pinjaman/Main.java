
package pinjaman;
import java.sql.Connection;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    Koneksi koneksi = new Koneksi();
    Rule rule = new Rule();
    JOptionPane rules =  new JOptionPane();
    String id="";
    public Main() {
        initComponents();
        
        setLocationRelativeTo(null);
        loadTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txNama = new javax.swing.JTextField();
        txPendapatan = new javax.swing.JTextField();
        txPinjaman = new javax.swing.JTextField();
        txWaktu = new javax.swing.JTextField();
        btTambah = new javax.swing.JButton();
        btHapus = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblData = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        jButton1.setText("jButton1");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SPK Pemberian Pinjaman");
        setLocation(new java.awt.Point(0, 0));

        jLabel1.setText("Nama Peminjam");

        jLabel2.setText("Pendapatan");

        jLabel3.setText("Pinjaman");

        jLabel4.setText("Lama Pinjam");

        btTambah.setText("TAMBAH");
        btTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTambahActionPerformed(evt);
            }
        });

        btHapus.setText("HAPUS");
        btHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btHapusActionPerformed(evt);
            }
        });

        tblData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nama", "Pendapatan", "Pinjaman", "Lama Pinjam", "Kelayakan"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDataMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblData);
        if (tblData.getColumnModel().getColumnCount() > 0) {
            tblData.getColumnModel().getColumn(0).setPreferredWidth(10);
            tblData.getColumnModel().getColumn(1).setMinWidth(90);
            tblData.getColumnModel().getColumn(2).setPreferredWidth(70);
            tblData.getColumnModel().getColumn(3).setPreferredWidth(60);
            tblData.getColumnModel().getColumn(4).setPreferredWidth(70);
            tblData.getColumnModel().getColumn(5).setPreferredWidth(60);
        }

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setText("SPK Pemberian Pinjaman");

        jLabel6.setText("Metode Sugeno");

        jLabel7.setText("juta");

        jLabel8.setText("juta");

        jLabel9.setText("bulan");

        jButton2.setText("Rule");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txNama, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(txWaktu, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                                            .addComponent(txPinjaman, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txPendapatan, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel9))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btHapus, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btTambah, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(193, 193, 193)
                        .addComponent(jLabel6)))
                .addContainerGap(7, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(16, 16, 16))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jButton2))
                .addGap(5, 5, 5)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txPendapatan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel7)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(btTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txPinjaman, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txWaktu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(btHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void loadTable(){
        // membuat tampilan model tabel
        DefaultTableModel model = (DefaultTableModel) tblData.getModel();
        model.setRowCount(0);
        
        //menampilkan data database kedalam tabel
        try {
            int no=1;
            String sql = "select * from pinjaman";
            java.sql.Connection conn=(Connection)koneksi.configDB();
            java.sql.Statement stm=conn.createStatement();
            java.sql.ResultSet res=stm.executeQuery(sql);
            while(res.next()){
                model.addRow(new Object[]{res.getString(1),res.getString(2),res.getString(3),res.getString(4),res.getString(5),res.getString(6)});
            }
            tblData.setModel(model);
            
        } catch (Exception e) {
        }
    }
    
    //FORMAT DESIMAL
    private static String format(double desimal){
        DecimalFormat df = new DecimalFormat("#.###");
        return df.format(desimal);
    }
    private static double des(double desimal){
        return Double.valueOf(format(desimal));
    }
    
    //MENCARI NILAI TERKECIL
    private static double smallest(double[] data){
        double x=data[0];
        for(int i=1;i<3;i++){
            if(data[i]<x) x=data[i];
        }
        return x; 
    }
    
    //MENCARI NILAI KELAYAKAN
    private double Hitung(double pendapatan, double pinjaman, double waktu){

        double y, atas = 0, bawah = 0;        
        
        double[][][] derajat = {{{0, 0},{0, 0}},{{0, 0},{0, 0}}};
        double[][] komposisi = {{0,0},{0,0},{0,0},{0,0},{0,0},{0,0},{0,0},{0,0}};
        double[] pdt={0,0},  pjm={0,0},  wkt={0,0}, temp={0,0,0}, w={rule.GetRendah(),rule.GetSedang(),rule.GetTinggi()};
        
        System.out.println("------Input------");
        System.out.println("Pendapatan = "+pendapatan+" juta ");
        System.out.println("Pinjaman = "+pinjaman+" juta");
        System.out.println("Waktu = "+waktu+" bulan");
        
        System.out.println("------Nilai Fuzzy------");
        
        if(pendapatan<=rule.GetPdptKB()){
            y=rule.PdptKecil(pendapatan);
            pdt[0]=des(y);
            System.out.print("- "+pdt[0]+" ");
            System.out.println("Pendapatan Kecil");
            
        }
        if(pendapatan>rule.GetPdptBB()){
            y=rule.PdptBesar(pendapatan);
            pdt[1]=des(y);
            System.out.print("- "+pdt[1]+" ");
            System.out.println("Pendapatan Besar");
        }
        if(pinjaman<=rule.GetPjmKB()){
            y=rule.PjmSedikit(pinjaman);
            pjm[0]=des(y);
            System.out.print("- "+pjm[0]+" ");
            System.out.println("Pinjaman Sedikit");
        }
        if(pinjaman>rule.GetPjmBB()){
            y=rule.PjmBanyak(pinjaman);
            pjm[1]=des(y);
            System.out.print("- "+pjm[1]+" ");
            System.out.println("Pinjaman Banyak");
        }
        if(waktu<=rule.GetWktKB()){
            y=rule.WktSebentar(waktu);
            wkt[0]=des(y);
            System.out.print("- "+wkt[0]+" ");
            System.out.println("Waktu Sebentar");
        }
        if(waktu>rule.GetWktBB()){
            y=rule.WktLama(waktu);
            wkt[1]=des(y);
            System.out.print("- "+wkt[1]+" ");
            System.out.println("Waktu Lama");
        }
        
        System.out.println("------Conjunction & Disjunction------");
        
        int i, j, k;
        for(i=0;i<2;i++){
            for(j=0; j<2;j++){
                for(k=0;k<2;k++){
                    //System.out.print("i="+i+" j="+j+" k="+k+" Kelayakan ");
                    if(i==0 && j==0 && k==0) {
                        temp[0]=pdt[0];
                        temp[1]=pjm[0];
                        temp[2]=wkt[0];
                        derajat[i][j][k]=smallest(temp);
                        System.out.println(derajat[i][j][k]+" Kelayakan Sedang");
                        komposisi[0][0] = derajat[i][j][k];
                        komposisi[0][1] = 2;
                    }
                    if(i==0 && j==0 && k==1) {
                        temp[0]=pdt[0];
                        temp[1]=pjm[0];
                        temp[2]=wkt[1];
                        derajat[i][j][k]=smallest(temp);
                        System.out.println(derajat[i][j][k]+" Kelayakan Tinggi");
                        komposisi[1][0] = derajat[i][j][k];
                        komposisi[1][1] = 3;
                    }
                    if(i==0 && j==1 && k==0) {
                        temp[0]=pdt[0];
                        temp[1]=pjm[1];
                        temp[2]=wkt[0];
                        derajat[i][j][k]=smallest(temp);
                        System.out.println(derajat[i][j][k]+" Kelayakan Rendah");
                        komposisi[2][0] = derajat[i][j][k];
                        komposisi[2][1] = 1;
                    }
                    if(i==0 && j==1 && k==1) {
                        temp[0]=pdt[0];
                        temp[1]=pjm[1];
                        temp[2]=wkt[1];
                        derajat[i][j][k]=smallest(temp);
                        System.out.println(derajat[i][j][k]+" Kelayakan Sedang");
                        komposisi[3][0] = derajat[i][j][k];
                        komposisi[3][1] = 2;
                    }
                    if(i==1 && j==0 && k==0) {
                        temp[0]=pdt[1];
                        temp[1]=pjm[0];
                        temp[2]=wkt[0];
                        derajat[i][j][k]=smallest(temp);
                        System.out.println(derajat[i][j][k]+" Kelayakan Tinggi");
                        komposisi[4][0] = derajat[i][j][k];
                        komposisi[4][1] = 3;
                    }
                    if(i==1 && j==0 && k==1) {
                        temp[0]=pdt[1];
                        temp[1]=pjm[0];
                        temp[2]=wkt[1];
                        derajat[i][j][k]=smallest(temp);
                        System.out.println(derajat[i][j][k]+" Kelayakan Tinggi");
                        komposisi[5][0] = derajat[i][j][k];
                        komposisi[5][1] = 3;
                    }
                    if(i==1 && j==1 && k==0) {
                        temp[0]=pdt[1];
                        temp[1]=pjm[1];
                        temp[2]=wkt[0];
                        derajat[i][j][k]=smallest(temp);
                        System.out.println(derajat[i][j][k]+" Kelayakan Sedang");
                        komposisi[6][0] = derajat[i][j][k];
                        komposisi[6][1] = 2;
                    }
                    if(i==1 && j==1 && k==1) {
                        temp[0]=pdt[1];
                        temp[1]=pjm[1];
                        temp[2]=wkt[1];
                        derajat[i][j][k]=smallest(temp);
                        System.out.println(derajat[i][j][k]+" Kelayakan Tinggi");
                        komposisi[7][0] = derajat[i][j][k];
                        komposisi[7][1] = 3;
                    } 
                }
            }
        }
        System.out.println("------Composition------");
        //Versi terbesar
        temp[0] = temp[1] = temp[2] = 0;
        for(i=0;i<8;i++){
            if(komposisi[i][1]==1.0){
                if(komposisi[i][0]>temp[0]) temp[0]=komposisi[i][0];
            }
            else if(komposisi[i][1]==2.0){
                if(komposisi[i][0]>temp[1]) temp[1]=komposisi[i][0];
            }
            else {
                if(komposisi[i][0]>temp[2]) temp[2]=komposisi[i][0];
            }
        }
        
        System.out.println(temp[0]+" Rendah\n"+temp[1]+" Sedang\n"+temp[2]+" Tinggi");
        
        for(i=0;i<temp.length;i++){
            if(i==0) atas+=temp[i]*w[i];
            else if(i==1) atas+=temp[i]*w[i];
            else atas+=temp[i]*w[i];
            bawah += temp[i];
        }
                
        System.out.println("------Weighted Average------");
        System.out.println("y = "+atas+"/"+bawah);
        y=atas/bawah;
        System.out.println("Weighted Average = "+des(y));
        System.out.println("------------");
        
        return des(y);
    }
    
    private void Clear(){
        txNama.setText(null);
        txPendapatan.setText(null);
        txPinjaman.setText(null);
        txWaktu.setText(null);  
    }
    
    private void btTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTambahActionPerformed
        // TODO add your handling code here:
        if("".equals(txNama.getText())||"".equals(txPendapatan.getText())||"".equals(txPinjaman.getText())||"".equals(txWaktu.getText())){
            JOptionPane.showMessageDialog(null, "Pastikan semua kolom terisi dengan benar");
        }
        else{
            double pendapatan = Double.valueOf(txPendapatan.getText());
            double pinjaman = Double.valueOf(txPinjaman.getText());
            double waktu = Double.valueOf(txWaktu.getText());

            double kelayakan = Hitung(pendapatan, pinjaman, waktu);
            try{
            String sql = "INSERT INTO pinjaman VALUES (NULL,'"+txNama.getText()+"','"+txPendapatan.getText()+"','"+txPinjaman.getText()+"','"+txWaktu.getText()+"','"+kelayakan+"')";
            //String sql = "INSERT INTO 'pinjaman' ('id', 'nama', 'pendapatan', 'pinjaman', 'waktu', 'kelayakan') VALUES (NULL, '"+txNama.getText()"', '"+txPendapatan.getText()+"', '"+txPinjaman.getText()+"', '"+txWaktu.getText()+"', '"+kelayakan+"')";
            java.sql.Connection conn=(Connection)koneksi.configDB();
                java.sql.PreparedStatement pst=conn.prepareStatement(sql);
                pst.execute();
                JOptionPane.showMessageDialog(null, "Penyimpanan Data Berhasil");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e.getMessage());
            }

            loadTable();
            Clear();
        }
        
    }//GEN-LAST:event_btTambahActionPerformed

    private void tblDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDataMouseClicked
        // TODO add your handling code here:
        int table = tblData.getSelectedRow();
        id=(tblData.getModel().getValueAt(table, 0).toString());
        System.out.println(table+" "+id);
    }//GEN-LAST:event_tblDataMouseClicked

    private void btHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btHapusActionPerformed
        // TODO add your handling code here:
        System.out.println(id);
        if("".equals(id)){
            JOptionPane.showMessageDialog(null, "Tidak ada data yang dipilih");
        }
        else{
            try{   
                java.sql.Connection conn =(Connection)koneksi.configDB();
                String sql ="delete from pinjaman where id='"+id+"'";
                java.sql.PreparedStatement pst = conn.prepareStatement(sql);
                pst.execute();
                JOptionPane.showMessageDialog(null, "Data akan dihapus?");
            }
            catch (Exception e) {}
            loadTable();
        }
        id="";
    }//GEN-LAST:event_btHapusActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Rules frame = new Rules(rule);
                frame.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btHapus;
    private javax.swing.JButton btTambah;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tblData;
    private javax.swing.JTextField txNama;
    private javax.swing.JTextField txPendapatan;
    private javax.swing.JTextField txPinjaman;
    private javax.swing.JTextField txWaktu;
    // End of variables declaration//GEN-END:variables
}