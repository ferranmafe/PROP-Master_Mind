package Presentacion;

import Dominio.CtrlDominio;
import java.util.ArrayList;
import javax.swing.UIManager;

public class CtrlPresentacion {
    
    private CtrlDominio dominio;
    private VistaPrincipal vista;
    

    public CtrlPresentacion() {
        dominio = new CtrlDominio();
        
        try { 
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        vista = new VistaPrincipal(this);
    }

    public void empezarPartida(String dificultad_s, String rol_s) {
        dominio.empezarPartida(dificultad_s, rol_s);
        System.out.println("Empezando partida...");
    }
    
    public String movimientoCB(String mov) throws Exception {
        System.out.println("Generando candidato...");
        System.out.println(mov);
        String NB = dominio.generarCandidato(mov);
        System.out.println("NB: " + NB);
        return NB;
    }
    
    public String getRondas() {
        return dominio.getRondas();
    }
    
    public ArrayList<ArrayList<String>> getRanking() {
        return dominio.consultarRanking();
    }
    
    public void anadirPuntuacion(String user, String punt) {
        dominio.anadirPuntuacion(user, punt);
    }
    
    public String generarSolucion(String solucion) throws Exception {
        return dominio.generarSolucion(solucion);
    }

    public String evaluarCandidato(String nb) throws Exception {
        return dominio.evaluarCandidato(nb);
    }
    
    public ArrayList<String> cargarPartida() throws Exception {
        ArrayList<String> gp = dominio.cargarPartida();
        return gp;
    }
    
    public void guardarPartida() {
        dominio.guardarPartida();
    }
    
}