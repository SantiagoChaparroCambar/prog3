import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;
import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class ParqueaderoApp extends javax.swing.JFrame {
private List<Vehiculo> listaDeVehiculos = new ArrayList<>();
   

    public ParqueaderoApp() {
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        guardar = new javax.swing.JButton();
        placa = new javax.swing.JTextField();
        Automovil = new javax.swing.JRadioButton();
        motocicleta = new javax.swing.JRadioButton();
        bicicleta = new javax.swing.JRadioButton();
        horaIngreso = new javax.swing.JTextField();
        horaEgreso = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        lista1 = new javax.swing.JTextArea();
        valorPagar = new javax.swing.JTextField();
        Retirar = new javax.swing.JButton();
        placasalir = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("PLACA : ");

        jLabel2.setText("TIPO : ");

        jLabel5.setText("HORA INGRESO : ");

        jLabel6.setText("HORA SALIDA : ");

        jLabel8.setText("VALOR A PAGAR: ");

        guardar.setText("GUARDAR");
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });

        placa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                placaActionPerformed(evt);
            }
        });

        Automovil.setText("Automovil");
        Automovil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AutomovilActionPerformed(evt);
            }
        });

        motocicleta.setText("Motocicleta");
        motocicleta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                motocicletaActionPerformed(evt);
            }
        });

        bicicleta.setText("bicicleta");
        bicicleta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bicicletaActionPerformed(evt);
            }
        });

        horaIngreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                horaIngresoActionPerformed(evt);
            }
        });

        horaEgreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                horaEgresoActionPerformed(evt);
            }
        });

        lista1.setColumns(20);
        lista1.setRows(5);
        jScrollPane1.setViewportView(lista1);

        valorPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valorPagarActionPerformed(evt);
            }
        });

        Retirar.setText("Retirar");
        Retirar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RetirarActionPerformed(evt);
            }
        });

        placasalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                placasalirActionPerformed(evt);
            }
        });

        jLabel3.setText("Vehiculo :");

        jLabel4.setText("00:00:00");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Automovil))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel6))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(horaIngreso, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(placa, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(horaEgreso, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(guardar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(motocicleta)
                                .addComponent(bicicleta)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Retirar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(valorPagar)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 28, Short.MAX_VALUE)
                                .addComponent(placasalir, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(placa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Automovil)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(motocicleta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bicicleta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(horaIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6)
                        .addGap(0, 6, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(horaEgreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(placasalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addComponent(guardar)
                        .addGap(23, 23, 23))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(valorPagar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Retirar)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 291, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 39, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
         String tipo = "";
    if (Automovil.isSelected()) {
        tipo = "Automovil";
    } else if (motocicleta.isSelected()) {
        tipo = "Motocicleta";
    } else if (bicicleta.isSelected()) {
        tipo = "Bicicleta";
    }

    Date fechaActual = new Date();
    SimpleDateFormat formatoHora = new SimpleDateFormat("HH:mm:ss");
    String horaActual = formatoHora.format(fechaActual);

    String placaText = placa.getText();
    
    Vehiculo vehiculo = new Vehiculo(placaText, tipo, horaActual);
    listaDeVehiculos.add(vehiculo);
    horaIngreso.setText(horaActual);

    // Mostrar los datos guardados en lista1
    lista1.append("Tipo: " + tipo + ", Placa: " + placaText + ", Hora de Ingreso: " + horaActual + "\n");
    }                                       

    private void RetirarActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
       String placaSalir = placasalir.getText();

    for (Vehiculo vehiculo : listaDeVehiculos) {
        if (vehiculo.getPlaca().equals(placaSalir)) {
            Date fechaActual = new Date();
            SimpleDateFormat formatoHora = new SimpleDateFormat("HH:mm:ss");
            String horaSalida = formatoHora.format(fechaActual);
            
            horaEgreso.setText(horaSalida);
            

            vehiculo.setHoraSalida(horaSalida);
            double valor = vehiculo.calcularValor();

            lista1.append("Placa: " + placaSalir + ", Tipo: " + vehiculo.getTipo() +
                          ", Hora de Ingreso: " + vehiculo.getHoraIngreso() +
                          ", Hora de Salida: " + horaSalida +
                          ", Tiempo Total: " + vehiculo.calcularTiempoEnMinutos() + " minutos" +
                          ", Valor a Pagar: " + valor + " COP\n");
            
               

            listaDeVehiculos.remove(vehiculo);
            return;
        }
        
    }
    lista1.append("Vehículo no encontrado\n");

    }                                       

    private void placaActionPerformed(java.awt.event.ActionEvent evt) {                                      
        // TODO add your handling code here:
    }                                     

    private void AutomovilActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    }                                         

    private void motocicletaActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void bicicletaActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    }                                         

    private void horaIngresoActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
        Date fechaActual = new Date();

    // Formatear la fecha a un formato legible
    SimpleDateFormat formatoHora = new SimpleDateFormat("HH:mm:ss");
    String horaActual = formatoHora.format(fechaActual);

    // Mostrar la hora actual en el campo de texto
    horaIngreso.setText(horaActual);
    horaIngreso.getText();
    }                                           

    private void horaEgresoActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
        Date fechaActual = new Date();

    // Formatear la fecha a un formato legible
    SimpleDateFormat formatoHora = new SimpleDateFormat("HH:mm:ss");
    String horaActual = formatoHora.format(fechaActual);

    // Mostrar la hora actual en el campo de texto
    horaEgreso.setText(horaActual);
    }                                          

    private void placasalirActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
        String placaBuscar = placasalir.getText();
    for (Vehiculo vehiculo : listaDeVehiculos) {
        if (vehiculo.getPlaca().equals(placaBuscar)) {
            double valor = vehiculo.calcularValor();
            valorPagar.setText(String.valueOf(valor));
            return;
        }
    }
    valorPagar.setText("Vehículo no encontrado");
    }                                          

    private void valorPagarActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
        String horaIngresoStr = horaIngreso.getText();
    String horaSalidaStr = horaEgreso.getText();
    String tipoVehiculo = "";  // Debes obtener el tipo de vehículo de tu objeto Vehiculo

    try {
        SimpleDateFormat formatoHora = new SimpleDateFormat("HH:mm:ss");

        Date horaIngresoDate = formatoHora.parse(horaIngresoStr);
        Date horaSalidaDate = formatoHora.parse(horaSalidaStr);

        long diferenciaEnMilisegundos = horaSalidaDate.getTime() - horaIngresoDate.getTime();
        long diferenciaEnSegundos = diferenciaEnMilisegundos / 1000;

        // Dependiendo del tipo de vehículo, aplicar la tarifa correspondiente
        int tarifaPorMinuto = 0;

        if (tipoVehiculo.equals("Automovil")) {
            tarifaPorMinuto = 60;
        } else if (tipoVehiculo.equals("Motocicleta")) {
            tarifaPorMinuto = 30;
        } else if (tipoVehiculo.equals("Bicicleta")) {
            tarifaPorMinuto = 20;
        }

        int valorAPagar = (int) (diferenciaEnSegundos / 5) * tarifaPorMinuto;

        // Mostrar el valor a pagar
        valorPagar.setText(Integer.toString(valorAPagar));
    } catch (ParseException e) {
        e.printStackTrace();
    }
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
            java.util.logging.Logger.getLogger(ParqueaderoApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ParqueaderoApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ParqueaderoApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ParqueaderoApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ParqueaderoApp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JRadioButton Automovil;
    private javax.swing.JButton Retirar;
    private javax.swing.JRadioButton bicicleta;
    private javax.swing.JButton guardar;
    private javax.swing.JTextField horaEgreso;
    private javax.swing.JTextField horaIngreso;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea lista1;
    private javax.swing.JRadioButton motocicleta;
    private javax.swing.JTextField placa;
    private javax.swing.JTextField placasalir;
    private javax.swing.JTextField valorPagar;
    // End of variables declaration                   

}
