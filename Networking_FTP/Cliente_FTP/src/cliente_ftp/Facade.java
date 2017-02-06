/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cliente_ftp;

import controlador.Red;
import javax.swing.JTree;

/**
 * Patron de diseño Façade. Intermediario entre la vista y el controlador para separar el codigo entre ambos.
 * @author Mario Codes Sánchez
 * @since 04/02/2017
 */
public class Facade {
    private Red red = null;
    
    /**
     * Realizacion de un testeo de conexion Cliente - Server.
     * @param ip IP del server a Conectarse.
     * @param puerto Puerto del server por donde entra la conexion.
     * @return Estado de la conexion.
     */
    public static boolean testearConexionCliente(String ip, int puerto) {
        return new Red(ip, puerto).checkConexion();
    }
    
    /**
     * Obtenemos el mapeo local del Server en un Tree que se puede settear directamente.
     * @param ip IP del server a Conectarse.
     * @param puerto Puerto del Server por donde entra la conexion.
     * @return JTree Mapeado para settear en la GUI.
     * @deprecated Idea original, no me da tiempo. Lo mantengo para hacerlo por mi cuenta mas adelante con tiempo.
     */
    public static JTree obtencionMapeoServer(String ip, int puerto) {
        return new Red(ip, puerto).obtencionMapeoServer();
    }
    
    /**
     * Envio de un Fichero desde el Cliente al Server.
     * @param ip IP a la que nos conectamos.
     * @param puerto Puerto por el cual nos conectamos.
     * @param rutaServer Ruta del server donde queremos el fichero.
     * @param rutaLocal Ruta local del cliente donde se encuentra el fichero.
     * @param nombreFich Nombre del fichero a copiar.
     */
    public static void envioFicheroClienteServer(String ip, int puerto, String rutaServer, String rutaLocal, String nombreFich) {
        new Red(ip, puerto).envioFicheroClienteServer(rutaServer, rutaLocal, nombreFich);
    }
    
    /**
     * Recibo de un fichero o envio desde el Server al Cliente.
     * @param ip IP a la que nos conectamos.
     * @param puerto Puerto por el cual nos conectamos.
     * @param rutaServer Ruta del Server donde se encuentra el fichero.
     * @param rutaLocal Ruta local del Cliente donde queremos el fichero.
     * @param nombreFich Nombre del fichero a copiar.
     */
    public static void envioFicheroServerCliente(String ip, int puerto, String rutaServer, String rutaLocal, String nombreFich) {
        new Red(ip, puerto).reciboFicheroServerCliente(rutaServer, rutaLocal, nombreFich);
    }
}
