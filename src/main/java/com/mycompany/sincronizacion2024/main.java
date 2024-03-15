package com.mycompany.sincronizacion2024;

import clases.carga_inicial;
import java.awt.Component;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.ServerSocket;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class main {
   public static String ruta_config;
   public static int puerto;
   public static long retardo_inicial;
   public static String local_system_path;
   private static ServerSocket SERVER_SOCKET;

   public static void main(String[] args) throws SQLException, IOException, FileNotFoundException, InterruptedException {
      carga_inicial carga = new carga_inicial();
      File arch = new File("ruta.txt");
      if (!arch.exists()) {
         carga_inicial.crea_config();
      } else {
         carga_inicial.leer_ruta();
      }

      carga_inicial.carga_inicial(ruta_config);

      try {
         SERVER_SOCKET = new ServerSocket(carga_inicial.puerto_sinc);
      } catch (IOException var4) {
         JOptionPane.showMessageDialog((Component)null, "El sistema de sincronizacion ya se encuentra en ejecucion");
         System.exit(0);
      }

      new ventanaInicio(ruta_config, retardo_inicial, local_system_path);
   }
}
