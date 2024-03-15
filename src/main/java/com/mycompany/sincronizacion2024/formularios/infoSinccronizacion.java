package formularios;

import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.MenuItem;
import java.awt.PopupMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.UIManager.LookAndFeelInfo;
import org.netbeans.lib.awtextra.AbsoluteConstraints;
import org.netbeans.lib.awtextra.AbsoluteLayout;

public class infoSinccronizacion extends JFrame {
   private MenuItem cierra_sistema;
   private JButton jButton1;
   private JLabel jLabel1;
   private JLabel jLabel13;
   private JLabel jLabel2;
   private JLabel jLabel3;
   private JLabel jLabel4;
   private JLabel jLabel5;
   private JLabel jLabel7;
   private JScrollPane jScrollPane1;
   public JTextField last_sync;
   public JTextArea logArea;
   public JTextField notification_sync;
   public JLabel pagos_linea;
   private PopupMenu popup;
   private MenuItem primer_plano;
   public JProgressBar reg_sinc_li_barra_pag;
   public JTextField synchronization_files_download;
   public JTextField synchronization_files_end;
   public JTextField synchronization_files_number;
   public JTextField synchronization_files_start;
   public JTextField synchronization_files_upload;
   public JProgressBar synchronization_movements_bar;
   public JProgressBar synchronization_movements_bar_update;
   public JTextField synchronization_movements_download;
   public JTextField synchronization_movements_end;
   public JLabel synchronization_movements_info;
   private JLabel synchronization_movements_label;
   public JTextField synchronization_movements_number;
   public JTextField synchronization_movements_start;
   public JTextField synchronization_movements_upload;
   private JLabel synchronization_product__provider_label;
   public JProgressBar synchronization_product_provider_bar;
   public JProgressBar synchronization_product_provider_bar_update;
   public JTextField synchronization_product_provider_download;
   public JTextField synchronization_product_provider_end;
   public JTextField synchronization_product_provider_end2;
   public JLabel synchronization_product_provider_info;
   public JTextField synchronization_product_provider_number;
   public JTextField synchronization_product_provider_start;
   public JTextField synchronization_product_provider_start2;
   public JTextField synchronization_product_provider_upload;
   public JProgressBar synchronization_returns_bar;
   public JTextField synchronization_returns_download;
   public JTextField synchronization_returns_end;
   public JLabel synchronization_returns_info;
   private JLabel synchronization_returns_label;
   public JTextField synchronization_returns_number;
   public JTextField synchronization_returns_start;
   public JTextField synchronization_returns_upload;
   public JProgressBar synchronization_rows_bar;
   public JTextField synchronization_rows_download;
   public JTextField synchronization_rows_end;
   public JLabel synchronization_rows_info;
   private JLabel synchronization_rows_label;
   public JTextField synchronization_rows_number;
   public JTextField synchronization_rows_start;
   public JTextField synchronization_rows_upload;
   public JProgressBar synchronization_sales_bar;
   public JProgressBar synchronization_sales_bar_update;
   public JTextField synchronization_sales_download;
   public JTextField synchronization_sales_end;
   public JLabel synchronization_sales_info;
   private JLabel synchronization_sales_label;
   public JTextField synchronization_sales_number;
   public JTextField synchronization_sales_start;
   public JTextField synchronization_sales_upload;
   public JProgressBar synchronization_sales_validation_bar;
   public JTextField synchronization_sales_validation_download;
   public JTextField synchronization_sales_validation_end;
   public JLabel synchronization_sales_validation_info;
   private JLabel synchronization_sales_validation_label;
   public JTextField synchronization_sales_validation_number;
   public JTextField synchronization_sales_validation_start;
   public JTextField synchronization_sales_validation_upload;
   public JProgressBar synchronization_test_bar;
   public JTextField synchronization_test_end;
   public JLabel synchronization_test_info;
   private JLabel synchronization_test_label;
   public JTextField synchronization_test_start;
   public JProgressBar synchronization_transfer_bar;
   public JTextField synchronization_transfer_download;
   public JLabel synchronization_transfer_info;
   private JLabel synchronization_transfer_label;
   public JTextField synchronization_transfer_number;
   public JTextField synchronization_transfer_upload;
   public JTextField time_interval_field;
   private JLabel time_interval_label;
   public JTextField url_field;
   private JLabel url_label;

   public infoSinccronizacion() {
      this.initComponents();
      this.setLocationRelativeTo((Component)null);
      this.last_sync.setEditable(false);
      this.notification_sync.setEditable(false);
   }

   private void initComponents() {
      this.popup = new PopupMenu();
      this.primer_plano = new MenuItem();
      this.cierra_sistema = new MenuItem();
      this.synchronization_rows_info = new JLabel();
      this.synchronization_rows_label = new JLabel();
      this.synchronization_sales_info = new JLabel();
      this.synchronization_sales_label = new JLabel();
      this.synchronization_movements_info = new JLabel();
      this.synchronization_movements_label = new JLabel();
      this.synchronization_returns_info = new JLabel();
      this.synchronization_returns_label = new JLabel();
      this.synchronization_product_provider_info = new JLabel();
      this.synchronization_product__provider_label = new JLabel();
      this.synchronization_sales_validation_info = new JLabel();
      this.synchronization_sales_validation_label = new JLabel();
      this.jLabel7 = new JLabel();
      this.synchronization_transfer_info = new JLabel();
      this.synchronization_transfer_label = new JLabel();
      this.pagos_linea = new JLabel();
      this.synchronization_rows_bar = new JProgressBar();
      this.synchronization_sales_bar = new JProgressBar();
      this.synchronization_returns_bar = new JProgressBar();
      this.synchronization_movements_bar = new JProgressBar();
      this.synchronization_sales_validation_bar = new JProgressBar();
      this.synchronization_product_provider_bar = new JProgressBar();
      this.reg_sinc_li_barra_pag = new JProgressBar();
      this.synchronization_transfer_bar = new JProgressBar();
      this.last_sync = new JTextField();
      this.notification_sync = new JTextField();
      this.jLabel13 = new JLabel();
      this.jScrollPane1 = new JScrollPane();
      this.logArea = new JTextArea();
      this.jLabel1 = new JLabel();
      this.jLabel2 = new JLabel();
      this.synchronization_rows_end = new JTextField();
      this.synchronization_rows_start = new JTextField();
      this.synchronization_sales_start = new JTextField();
      this.synchronization_sales_end = new JTextField();
      this.synchronization_returns_start = new JTextField();
      this.synchronization_returns_end = new JTextField();
      this.synchronization_movements_start = new JTextField();
      this.synchronization_movements_end = new JTextField();
      this.synchronization_sales_validation_start = new JTextField();
      this.synchronization_sales_validation_end = new JTextField();
      this.synchronization_product_provider_start = new JTextField();
      this.synchronization_product_provider_end = new JTextField();
      this.synchronization_sales_bar_update = new JProgressBar();
      this.synchronization_product_provider_bar_update = new JProgressBar();
      this.synchronization_movements_bar_update = new JProgressBar();
      this.synchronization_test_info = new JLabel();
      this.synchronization_test_label = new JLabel();
      this.synchronization_test_bar = new JProgressBar();
      this.synchronization_test_end = new JTextField();
      this.synchronization_rows_download = new JTextField();
      this.time_interval_field = new JTextField();
      this.time_interval_label = new JLabel();
      this.synchronization_files_start = new JTextField();
      this.synchronization_files_end = new JTextField();
      this.synchronization_product_provider_start2 = new JTextField();
      this.synchronization_product_provider_end2 = new JTextField();
      this.url_field = new JTextField();
      this.url_label = new JLabel();
      this.jLabel3 = new JLabel();
      this.jLabel4 = new JLabel();
      this.synchronization_test_start = new JTextField();
      this.synchronization_rows_upload = new JTextField();
      this.synchronization_sales_download = new JTextField();
      this.synchronization_sales_upload = new JTextField();
      this.synchronization_returns_download = new JTextField();
      this.synchronization_returns_upload = new JTextField();
      this.synchronization_movements_download = new JTextField();
      this.synchronization_movements_upload = new JTextField();
      this.synchronization_sales_validation_download = new JTextField();
      this.synchronization_sales_validation_upload = new JTextField();
      this.synchronization_product_provider_download = new JTextField();
      this.synchronization_product_provider_upload = new JTextField();
      this.synchronization_files_download = new JTextField();
      this.synchronization_files_upload = new JTextField();
      this.synchronization_transfer_download = new JTextField();
      this.synchronization_transfer_upload = new JTextField();
      this.jButton1 = new JButton();
      this.jLabel5 = new JLabel();
      this.synchronization_rows_number = new JTextField();
      this.synchronization_sales_number = new JTextField();
      this.synchronization_returns_number = new JTextField();
      this.synchronization_movements_number = new JTextField();
      this.synchronization_sales_validation_number = new JTextField();
      this.synchronization_product_provider_number = new JTextField();
      this.synchronization_files_number = new JTextField();
      this.synchronization_transfer_number = new JTextField();
      this.popup.setLabel("popupMenu1");
      this.primer_plano.setLabel("Mostrar Sincronizacion");
      this.primer_plano.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            infoSinccronizacion.this.primer_planoActionPerformed(evt);
         }
      });
      this.popup.add(this.primer_plano);
      this.cierra_sistema.setLabel("Cerrar Sincronizacion");
      this.cierra_sistema.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            infoSinccronizacion.this.cierra_sistemaActionPerformed(evt);
         }
      });
      this.popup.add(this.cierra_sistema);
      this.setDefaultCloseOperation(0);
      this.setTitle("Sistema Sincronizacion 2023");
      this.setBackground(new Color(102, 204, 255));
      this.addWindowListener(new WindowAdapter() {
         public void windowClosing(WindowEvent evt) {
            infoSinccronizacion.this.formWindowClosing(evt);
         }

         public void windowIconified(WindowEvent evt) {
            infoSinccronizacion.this.formWindowIconified(evt);
         }
      });
      this.getContentPane().setLayout(new AbsoluteLayout());
      this.synchronization_rows_info.setText("0%");
      this.getContentPane().add(this.synchronization_rows_info, new AbsoluteConstraints(250, 140, 50, 30));
      this.synchronization_rows_label.setText("Registros sincronizacion");
      this.getContentPane().add(this.synchronization_rows_label, new AbsoluteConstraints(20, 140, 230, 20));
      this.synchronization_sales_info.setText("0%");
      this.getContentPane().add(this.synchronization_sales_info, new AbsoluteConstraints(250, 180, 140, 30));
      this.synchronization_sales_label.setText("Ventas");
      this.getContentPane().add(this.synchronization_sales_label, new AbsoluteConstraints(20, 180, 230, 30));
      this.synchronization_movements_info.setText("0%");
      this.getContentPane().add(this.synchronization_movements_info, new AbsoluteConstraints(250, 260, 140, 30));
      this.synchronization_movements_label.setText("Movimientos Almacen");
      this.getContentPane().add(this.synchronization_movements_label, new AbsoluteConstraints(20, 260, 230, 30));
      this.synchronization_returns_info.setText("0%");
      this.getContentPane().add(this.synchronization_returns_info, new AbsoluteConstraints(250, 220, 140, 30));
      this.synchronization_returns_label.setText("Devoluciones");
      this.getContentPane().add(this.synchronization_returns_label, new AbsoluteConstraints(20, 210, 193, 39));
      this.synchronization_product_provider_info.setText("0%");
      this.getContentPane().add(this.synchronization_product_provider_info, new AbsoluteConstraints(250, 340, 140, 31));
      this.synchronization_product__provider_label.setText("Movimientos Proveedor Producto");
      this.getContentPane().add(this.synchronization_product__provider_label, new AbsoluteConstraints(20, 340, 230, 30));
      this.synchronization_sales_validation_info.setText("0%");
      this.getContentPane().add(this.synchronization_sales_validation_info, new AbsoluteConstraints(250, 300, 140, 30));
      this.synchronization_sales_validation_label.setText("Validaciones de ventas");
      this.getContentPane().add(this.synchronization_sales_validation_label, new AbsoluteConstraints(20, 300, 230, 30));
      this.jLabel7.setText("Archivos");
      this.getContentPane().add(this.jLabel7, new AbsoluteConstraints(20, 380, 230, 30));
      this.synchronization_transfer_info.setText("0%");
      this.getContentPane().add(this.synchronization_transfer_info, new AbsoluteConstraints(250, 419, 140, 30));
      this.synchronization_transfer_label.setText("Transferencias");
      this.getContentPane().add(this.synchronization_transfer_label, new AbsoluteConstraints(20, 420, 230, 30));
      this.pagos_linea.setText("0%");
      this.getContentPane().add(this.pagos_linea, new AbsoluteConstraints(250, 380, 140, 30));
      this.synchronization_rows_bar.setForeground(new Color(0, 153, 0));
      this.getContentPane().add(this.synchronization_rows_bar, new AbsoluteConstraints(300, 140, 160, 30));
      this.synchronization_sales_bar.setForeground(new Color(0, 153, 0));
      this.getContentPane().add(this.synchronization_sales_bar, new AbsoluteConstraints(300, 180, 80, 30));
      this.synchronization_returns_bar.setForeground(new Color(0, 153, 0));
      this.getContentPane().add(this.synchronization_returns_bar, new AbsoluteConstraints(300, 220, 160, 30));
      this.synchronization_movements_bar.setForeground(new Color(0, 153, 0));
      this.getContentPane().add(this.synchronization_movements_bar, new AbsoluteConstraints(300, 260, 80, 30));
      this.synchronization_sales_validation_bar.setForeground(new Color(0, 153, 0));
      this.getContentPane().add(this.synchronization_sales_validation_bar, new AbsoluteConstraints(300, 300, 160, 30));
      this.synchronization_product_provider_bar.setForeground(new Color(0, 153, 0));
      this.getContentPane().add(this.synchronization_product_provider_bar, new AbsoluteConstraints(300, 340, 80, 30));
      this.reg_sinc_li_barra_pag.setForeground(new Color(0, 153, 0));
      this.getContentPane().add(this.reg_sinc_li_barra_pag, new AbsoluteConstraints(300, 380, 160, 30));
      this.synchronization_transfer_bar.setForeground(new Color(0, 153, 0));
      this.getContentPane().add(this.synchronization_transfer_bar, new AbsoluteConstraints(300, 420, 160, 30));
      this.last_sync.setEditable(false);
      this.last_sync.setFont(new Font("Lucida Grande", 0, 15));
      this.last_sync.setForeground(new Color(0, 204, 0));
      this.last_sync.setText("0000-00-00 00:00:00");
      this.last_sync.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            infoSinccronizacion.this.last_syncActionPerformed(evt);
         }
      });
      this.getContentPane().add(this.last_sync, new AbsoluteConstraints(1120, 220, 210, 30));
      this.notification_sync.setFont(new Font("Lucida Grande", 0, 24));
      this.notification_sync.setForeground(new Color(255, 51, 0));
      this.notification_sync.setHorizontalAlignment(0);
      this.notification_sync.setText("!No hay conexión!");
      this.notification_sync.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            infoSinccronizacion.this.notification_syncActionPerformed(evt);
         }
      });
      this.getContentPane().add(this.notification_sync, new AbsoluteConstraints(590, 20, 530, 43));
      this.jLabel13.setText("Última sincronización exitosa :");
      this.getContentPane().add(this.jLabel13, new AbsoluteConstraints(1120, 190, 190, 30));
      this.logArea.setEditable(false);
      this.logArea.setColumns(20);
      this.logArea.setRows(5);
      this.jScrollPane1.setViewportView(this.logArea);
      this.getContentPane().add(this.jScrollPane1, new AbsoluteConstraints(20, 480, 1330, 160));
      this.jLabel1.setText("Por Bajar :");
      this.getContentPane().add(this.jLabel1, new AbsoluteConstraints(1030, 120, -1, -1));
      this.jLabel2.setText("Hora fin");
      this.getContentPane().add(this.jLabel2, new AbsoluteConstraints(700, 80, -1, -1));
      this.synchronization_rows_end.setEditable(false);
      this.getContentPane().add(this.synchronization_rows_end, new AbsoluteConstraints(650, 140, 150, 30));
      this.synchronization_rows_start.setEditable(false);
      this.synchronization_rows_start.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            infoSinccronizacion.this.synchronization_rows_startActionPerformed(evt);
         }
      });
      this.getContentPane().add(this.synchronization_rows_start, new AbsoluteConstraints(470, 140, 150, 30));
      this.synchronization_sales_start.setEditable(false);
      this.getContentPane().add(this.synchronization_sales_start, new AbsoluteConstraints(470, 180, 150, 30));
      this.synchronization_sales_end.setEditable(false);
      this.getContentPane().add(this.synchronization_sales_end, new AbsoluteConstraints(650, 180, 150, 30));
      this.synchronization_returns_start.setEditable(false);
      this.getContentPane().add(this.synchronization_returns_start, new AbsoluteConstraints(470, 220, 150, 30));
      this.synchronization_returns_end.setEditable(false);
      this.getContentPane().add(this.synchronization_returns_end, new AbsoluteConstraints(650, 220, 150, 30));
      this.synchronization_movements_start.setEditable(false);
      this.getContentPane().add(this.synchronization_movements_start, new AbsoluteConstraints(470, 260, 150, 30));
      this.synchronization_movements_end.setEditable(false);
      this.synchronization_movements_end.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            infoSinccronizacion.this.synchronization_movements_endActionPerformed(evt);
         }
      });
      this.getContentPane().add(this.synchronization_movements_end, new AbsoluteConstraints(650, 260, 150, 30));
      this.synchronization_sales_validation_start.setEditable(false);
      this.synchronization_sales_validation_start.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            infoSinccronizacion.this.synchronization_sales_validation_startActionPerformed(evt);
         }
      });
      this.getContentPane().add(this.synchronization_sales_validation_start, new AbsoluteConstraints(470, 300, 150, 30));
      this.synchronization_sales_validation_end.setEditable(false);
      this.getContentPane().add(this.synchronization_sales_validation_end, new AbsoluteConstraints(650, 300, 150, 30));
      this.synchronization_product_provider_start.setEditable(false);
      this.getContentPane().add(this.synchronization_product_provider_start, new AbsoluteConstraints(470, 340, 150, 30));
      this.synchronization_product_provider_end.setEditable(false);
      this.getContentPane().add(this.synchronization_product_provider_end, new AbsoluteConstraints(650, 340, 150, 30));
      this.synchronization_sales_bar_update.setForeground(new Color(0, 153, 0));
      this.getContentPane().add(this.synchronization_sales_bar_update, new AbsoluteConstraints(390, 180, 70, 30));
      this.synchronization_product_provider_bar_update.setForeground(new Color(0, 153, 0));
      this.getContentPane().add(this.synchronization_product_provider_bar_update, new AbsoluteConstraints(390, 340, 70, 30));
      this.synchronization_movements_bar_update.setForeground(new Color(0, 153, 0));
      this.getContentPane().add(this.synchronization_movements_bar_update, new AbsoluteConstraints(390, 260, 70, 30));
      this.synchronization_test_info.setText("0%");
      this.getContentPane().add(this.synchronization_test_info, new AbsoluteConstraints(250, 100, 50, 30));
      this.synchronization_test_label.setText("Comprobacion NO-IP");
      this.getContentPane().add(this.synchronization_test_label, new AbsoluteConstraints(20, 100, 230, 20));
      this.synchronization_test_bar.setForeground(new Color(0, 153, 0));
      this.getContentPane().add(this.synchronization_test_bar, new AbsoluteConstraints(300, 100, 160, 30));
      this.synchronization_test_end.setEditable(false);
      this.getContentPane().add(this.synchronization_test_end, new AbsoluteConstraints(650, 100, 150, 30));
      this.synchronization_rows_download.setEditable(false);
      this.synchronization_rows_download.setHorizontalAlignment(4);
      this.synchronization_rows_download.setText("0");
      this.synchronization_rows_download.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            infoSinccronizacion.this.synchronization_rows_downloadActionPerformed(evt);
         }
      });
      this.getContentPane().add(this.synchronization_rows_download, new AbsoluteConstraints(1020, 140, 80, 30));
      this.time_interval_field.setEditable(false);
      this.time_interval_field.setFont(new Font("Lucida Grande", 0, 15));
      this.time_interval_field.setHorizontalAlignment(4);
      this.time_interval_field.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            infoSinccronizacion.this.time_interval_fieldActionPerformed(evt);
         }
      });
      this.getContentPane().add(this.time_interval_field, new AbsoluteConstraints(1120, 300, 210, 30));
      this.time_interval_label.setText("Intervalo sincronizacion ( sg ) : ");
      this.getContentPane().add(this.time_interval_label, new AbsoluteConstraints(1120, 270, 190, 30));
      this.synchronization_files_start.setEditable(false);
      this.getContentPane().add(this.synchronization_files_start, new AbsoluteConstraints(470, 380, 150, 30));
      this.synchronization_files_end.setEditable(false);
      this.synchronization_files_end.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            infoSinccronizacion.this.synchronization_files_endActionPerformed(evt);
         }
      });
      this.getContentPane().add(this.synchronization_files_end, new AbsoluteConstraints(650, 380, 150, 30));
      this.synchronization_product_provider_start2.setEditable(false);
      this.getContentPane().add(this.synchronization_product_provider_start2, new AbsoluteConstraints(470, 420, 150, 30));
      this.synchronization_product_provider_end2.setEditable(false);
      this.getContentPane().add(this.synchronization_product_provider_end2, new AbsoluteConstraints(650, 420, 150, 30));
      this.url_field.setEditable(false);
      this.url_field.setFont(new Font("Lucida Grande", 0, 15));
      this.url_field.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            infoSinccronizacion.this.url_fieldActionPerformed(evt);
         }
      });
      this.getContentPane().add(this.url_field, new AbsoluteConstraints(90, 30, 460, 30));
      this.url_label.setText("URL API :");
      this.getContentPane().add(this.url_label, new AbsoluteConstraints(20, 30, 70, 30));
      this.jLabel3.setText("Hora inicio");
      this.getContentPane().add(this.jLabel3, new AbsoluteConstraints(510, 80, -1, -1));
      this.jLabel4.setText("Por Subir :");
      this.getContentPane().add(this.jLabel4, new AbsoluteConstraints(930, 120, -1, -1));
      this.synchronization_test_start.setEditable(false);
      this.synchronization_test_start.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            infoSinccronizacion.this.synchronization_test_startActionPerformed(evt);
         }
      });
      this.getContentPane().add(this.synchronization_test_start, new AbsoluteConstraints(470, 100, 150, 30));
      this.synchronization_rows_upload.setEditable(false);
      this.synchronization_rows_upload.setHorizontalAlignment(4);
      this.synchronization_rows_upload.setText("0");
      this.synchronization_rows_upload.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            infoSinccronizacion.this.synchronization_rows_uploadActionPerformed(evt);
         }
      });
      this.getContentPane().add(this.synchronization_rows_upload, new AbsoluteConstraints(920, 140, 80, 30));
      this.synchronization_sales_download.setEditable(false);
      this.synchronization_sales_download.setHorizontalAlignment(4);
      this.synchronization_sales_download.setText("0");
      this.synchronization_sales_download.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            infoSinccronizacion.this.synchronization_sales_downloadActionPerformed(evt);
         }
      });
      this.getContentPane().add(this.synchronization_sales_download, new AbsoluteConstraints(1020, 180, 80, 30));
      this.synchronization_sales_upload.setEditable(false);
      this.synchronization_sales_upload.setHorizontalAlignment(4);
      this.synchronization_sales_upload.setText("0");
      this.synchronization_sales_upload.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            infoSinccronizacion.this.synchronization_sales_uploadActionPerformed(evt);
         }
      });
      this.getContentPane().add(this.synchronization_sales_upload, new AbsoluteConstraints(920, 180, 80, 30));
      this.synchronization_returns_download.setEditable(false);
      this.synchronization_returns_download.setHorizontalAlignment(4);
      this.synchronization_returns_download.setText("0");
      this.synchronization_returns_download.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            infoSinccronizacion.this.synchronization_returns_downloadActionPerformed(evt);
         }
      });
      this.getContentPane().add(this.synchronization_returns_download, new AbsoluteConstraints(1020, 220, 80, 30));
      this.synchronization_returns_upload.setEditable(false);
      this.synchronization_returns_upload.setHorizontalAlignment(4);
      this.synchronization_returns_upload.setText("0");
      this.synchronization_returns_upload.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            infoSinccronizacion.this.synchronization_returns_uploadActionPerformed(evt);
         }
      });
      this.getContentPane().add(this.synchronization_returns_upload, new AbsoluteConstraints(920, 220, 80, 30));
      this.synchronization_movements_download.setEditable(false);
      this.synchronization_movements_download.setHorizontalAlignment(4);
      this.synchronization_movements_download.setText("0");
      this.synchronization_movements_download.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            infoSinccronizacion.this.synchronization_movements_downloadActionPerformed(evt);
         }
      });
      this.getContentPane().add(this.synchronization_movements_download, new AbsoluteConstraints(1020, 260, 80, 30));
      this.synchronization_movements_upload.setEditable(false);
      this.synchronization_movements_upload.setHorizontalAlignment(4);
      this.synchronization_movements_upload.setText("0");
      this.synchronization_movements_upload.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            infoSinccronizacion.this.synchronization_movements_uploadActionPerformed(evt);
         }
      });
      this.getContentPane().add(this.synchronization_movements_upload, new AbsoluteConstraints(920, 260, 80, 30));
      this.synchronization_sales_validation_download.setEditable(false);
      this.synchronization_sales_validation_download.setHorizontalAlignment(4);
      this.synchronization_sales_validation_download.setText("0");
      this.synchronization_sales_validation_download.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            infoSinccronizacion.this.synchronization_sales_validation_downloadActionPerformed(evt);
         }
      });
      this.getContentPane().add(this.synchronization_sales_validation_download, new AbsoluteConstraints(1020, 300, 80, 30));
      this.synchronization_sales_validation_upload.setEditable(false);
      this.synchronization_sales_validation_upload.setHorizontalAlignment(4);
      this.synchronization_sales_validation_upload.setText("0");
      this.synchronization_sales_validation_upload.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            infoSinccronizacion.this.synchronization_sales_validation_uploadActionPerformed(evt);
         }
      });
      this.getContentPane().add(this.synchronization_sales_validation_upload, new AbsoluteConstraints(920, 300, 80, 30));
      this.synchronization_product_provider_download.setEditable(false);
      this.synchronization_product_provider_download.setHorizontalAlignment(4);
      this.synchronization_product_provider_download.setText("0");
      this.synchronization_product_provider_download.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            infoSinccronizacion.this.synchronization_product_provider_downloadActionPerformed(evt);
         }
      });
      this.getContentPane().add(this.synchronization_product_provider_download, new AbsoluteConstraints(1020, 340, 80, 30));
      this.synchronization_product_provider_upload.setEditable(false);
      this.synchronization_product_provider_upload.setHorizontalAlignment(4);
      this.synchronization_product_provider_upload.setText("0");
      this.synchronization_product_provider_upload.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            infoSinccronizacion.this.synchronization_product_provider_uploadActionPerformed(evt);
         }
      });
      this.getContentPane().add(this.synchronization_product_provider_upload, new AbsoluteConstraints(920, 340, 80, 30));
      this.synchronization_files_download.setEditable(false);
      this.synchronization_files_download.setHorizontalAlignment(4);
      this.synchronization_files_download.setText("-");
      this.synchronization_files_download.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            infoSinccronizacion.this.synchronization_files_downloadActionPerformed(evt);
         }
      });
      this.getContentPane().add(this.synchronization_files_download, new AbsoluteConstraints(1020, 380, 80, 30));
      this.synchronization_files_upload.setEditable(false);
      this.synchronization_files_upload.setHorizontalAlignment(4);
      this.synchronization_files_upload.setText("-");
      this.synchronization_files_upload.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            infoSinccronizacion.this.synchronization_files_uploadActionPerformed(evt);
         }
      });
      this.getContentPane().add(this.synchronization_files_upload, new AbsoluteConstraints(920, 380, 80, 30));
      this.synchronization_transfer_download.setEditable(false);
      this.synchronization_transfer_download.setHorizontalAlignment(4);
      this.synchronization_transfer_download.setText("0");
      this.synchronization_transfer_download.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            infoSinccronizacion.this.synchronization_transfer_downloadActionPerformed(evt);
         }
      });
      this.getContentPane().add(this.synchronization_transfer_download, new AbsoluteConstraints(1020, 420, 80, 30));
      this.synchronization_transfer_upload.setEditable(false);
      this.synchronization_transfer_upload.setHorizontalAlignment(4);
      this.synchronization_transfer_upload.setText("0");
      this.synchronization_transfer_upload.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            infoSinccronizacion.this.synchronization_transfer_uploadActionPerformed(evt);
         }
      });
      this.getContentPane().add(this.synchronization_transfer_upload, new AbsoluteConstraints(920, 420, 80, 30));
      this.jButton1.setText("LimpiarLog");
      this.jButton1.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            infoSinccronizacion.this.jButton1ActionPerformed(evt);
         }
      });
      this.getContentPane().add(this.jButton1, new AbsoluteConstraints(1130, 430, -1, -1));
      this.jLabel5.setText("Reg x vuelta :");
      this.getContentPane().add(this.jLabel5, new AbsoluteConstraints(820, 120, -1, -1));
      this.synchronization_rows_number.setEditable(false);
      this.synchronization_rows_number.setHorizontalAlignment(4);
      this.synchronization_rows_number.setText("0");
      this.synchronization_rows_number.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            infoSinccronizacion.this.synchronization_rows_numberActionPerformed(evt);
         }
      });
      this.getContentPane().add(this.synchronization_rows_number, new AbsoluteConstraints(820, 140, 80, 30));
      this.synchronization_sales_number.setEditable(false);
      this.synchronization_sales_number.setHorizontalAlignment(4);
      this.synchronization_sales_number.setText("0");
      this.synchronization_sales_number.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            infoSinccronizacion.this.synchronization_sales_numberActionPerformed(evt);
         }
      });
      this.getContentPane().add(this.synchronization_sales_number, new AbsoluteConstraints(820, 180, 80, 30));
      this.synchronization_returns_number.setEditable(false);
      this.synchronization_returns_number.setHorizontalAlignment(4);
      this.synchronization_returns_number.setText("0");
      this.synchronization_returns_number.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            infoSinccronizacion.this.synchronization_returns_numberActionPerformed(evt);
         }
      });
      this.getContentPane().add(this.synchronization_returns_number, new AbsoluteConstraints(820, 220, 80, 30));
      this.synchronization_movements_number.setEditable(false);
      this.synchronization_movements_number.setHorizontalAlignment(4);
      this.synchronization_movements_number.setText("0");
      this.synchronization_movements_number.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            infoSinccronizacion.this.synchronization_movements_numberActionPerformed(evt);
         }
      });
      this.getContentPane().add(this.synchronization_movements_number, new AbsoluteConstraints(820, 260, 80, 30));
      this.synchronization_sales_validation_number.setEditable(false);
      this.synchronization_sales_validation_number.setHorizontalAlignment(4);
      this.synchronization_sales_validation_number.setText("0");
      this.synchronization_sales_validation_number.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            infoSinccronizacion.this.synchronization_sales_validation_numberActionPerformed(evt);
         }
      });
      this.getContentPane().add(this.synchronization_sales_validation_number, new AbsoluteConstraints(820, 300, 80, 30));
      this.synchronization_product_provider_number.setEditable(false);
      this.synchronization_product_provider_number.setHorizontalAlignment(4);
      this.synchronization_product_provider_number.setText("0");
      this.synchronization_product_provider_number.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            infoSinccronizacion.this.synchronization_product_provider_numberActionPerformed(evt);
         }
      });
      this.getContentPane().add(this.synchronization_product_provider_number, new AbsoluteConstraints(820, 340, 80, 30));
      this.synchronization_files_number.setEditable(false);
      this.synchronization_files_number.setHorizontalAlignment(4);
      this.synchronization_files_number.setText("-");
      this.synchronization_files_number.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            infoSinccronizacion.this.synchronization_files_numberActionPerformed(evt);
         }
      });
      this.getContentPane().add(this.synchronization_files_number, new AbsoluteConstraints(820, 380, 80, 30));
      this.synchronization_transfer_number.setEditable(false);
      this.synchronization_transfer_number.setHorizontalAlignment(4);
      this.synchronization_transfer_number.setText("0");
      this.synchronization_transfer_number.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            infoSinccronizacion.this.synchronization_transfer_numberActionPerformed(evt);
         }
      });
      this.getContentPane().add(this.synchronization_transfer_number, new AbsoluteConstraints(820, 420, 80, 30));
      this.pack();
   }

   private void formWindowClosing(WindowEvent evt) {
   }

   private void primer_planoActionPerformed(ActionEvent evt) {
   }

   private void cierra_sistemaActionPerformed(ActionEvent evt) {
      System.exit(0);
   }

   private void formWindowIconified(WindowEvent evt) {
   }

   private void notification_syncActionPerformed(ActionEvent evt) {
   }

   private void last_syncActionPerformed(ActionEvent evt) {
   }

   private void synchronization_rows_startActionPerformed(ActionEvent evt) {
   }

   private void synchronization_movements_endActionPerformed(ActionEvent evt) {
   }

   private void synchronization_sales_validation_startActionPerformed(ActionEvent evt) {
   }

   private void synchronization_rows_downloadActionPerformed(ActionEvent evt) {
   }

   private void time_interval_fieldActionPerformed(ActionEvent evt) {
   }

   private void synchronization_files_endActionPerformed(ActionEvent evt) {
   }

   private void url_fieldActionPerformed(ActionEvent evt) {
   }

   private void synchronization_test_startActionPerformed(ActionEvent evt) {
   }

   private void synchronization_rows_uploadActionPerformed(ActionEvent evt) {
   }

   private void synchronization_sales_downloadActionPerformed(ActionEvent evt) {
   }

   private void synchronization_sales_uploadActionPerformed(ActionEvent evt) {
   }

   private void synchronization_returns_downloadActionPerformed(ActionEvent evt) {
   }

   private void synchronization_returns_uploadActionPerformed(ActionEvent evt) {
   }

   private void synchronization_movements_downloadActionPerformed(ActionEvent evt) {
   }

   private void synchronization_movements_uploadActionPerformed(ActionEvent evt) {
   }

   private void synchronization_sales_validation_downloadActionPerformed(ActionEvent evt) {
   }

   private void synchronization_sales_validation_uploadActionPerformed(ActionEvent evt) {
   }

   private void synchronization_product_provider_downloadActionPerformed(ActionEvent evt) {
   }

   private void synchronization_product_provider_uploadActionPerformed(ActionEvent evt) {
   }

   private void synchronization_files_downloadActionPerformed(ActionEvent evt) {
   }

   private void synchronization_files_uploadActionPerformed(ActionEvent evt) {
   }

   private void synchronization_transfer_downloadActionPerformed(ActionEvent evt) {
   }

   private void synchronization_transfer_uploadActionPerformed(ActionEvent evt) {
   }

   private void jButton1ActionPerformed(ActionEvent evt) {
      this.logArea.setText("");
   }

   private void synchronization_rows_numberActionPerformed(ActionEvent evt) {
   }

   private void synchronization_sales_numberActionPerformed(ActionEvent evt) {
   }

   private void synchronization_returns_numberActionPerformed(ActionEvent evt) {
   }

   private void synchronization_movements_numberActionPerformed(ActionEvent evt) {
   }

   private void synchronization_sales_validation_numberActionPerformed(ActionEvent evt) {
   }

   private void synchronization_product_provider_numberActionPerformed(ActionEvent evt) {
   }

   private void synchronization_files_numberActionPerformed(ActionEvent evt) {
   }

   private void synchronization_transfer_numberActionPerformed(ActionEvent evt) {
   }

   public static void main(String[] args) {
      try {
         LookAndFeelInfo[] var1 = UIManager.getInstalledLookAndFeels();
         int var2 = var1.length;

         for(int var3 = 0; var3 < var2; ++var3) {
            LookAndFeelInfo info = var1[var3];
            if ("Nimbus".equals(info.getName())) {
               UIManager.setLookAndFeel(info.getClassName());
               break;
            }
         }
      } catch (ClassNotFoundException var5) {
         Logger.getLogger(infoSinccronizacion.class.getName()).log(Level.SEVERE, (String)null, var5);
      } catch (InstantiationException var6) {
         Logger.getLogger(infoSinccronizacion.class.getName()).log(Level.SEVERE, (String)null, var6);
      } catch (IllegalAccessException var7) {
         Logger.getLogger(infoSinccronizacion.class.getName()).log(Level.SEVERE, (String)null, var7);
      } catch (UnsupportedLookAndFeelException var8) {
         Logger.getLogger(infoSinccronizacion.class.getName()).log(Level.SEVERE, (String)null, var8);
      }

      EventQueue.invokeLater(new Runnable() {
         public void run() {
            (new infoSinccronizacion()).setVisible(true);
         }
      });
   }
}
