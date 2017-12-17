package Dominio;

import java.util.ArrayList;


/**
 * Tablero representa el conjunto de lineas que se han jugado actualmente en la partida
 * Para todas las lineas excepto la ultima hay una evaluacion realizada
 * En caso que la ultima este sin evaluar es debido a que es el turno del CodeMaker
 *
 * @author Sergi Avila
 */
public class Tablero {

    private ArrayList<Linea> lineas; // contiene las lineas en el orden en que se han jugado

    /**
     * @pre Cierto
     * @post Se ha creado instancia de Tablero
     */
    public Tablero() { lineas = new ArrayList<>(); }

    // SETTERS

    /**
     * @pre Cierto
     * @post Se ha anadido a tablero una nueva linea con el candidato
     */
    public void setNuevoCandidato(Codigo candidato) { lineas.add(new Linea(candidato)); }

    /**
     * @pre El ultimo candidato anadido no tiene evaluacion
     * @post Se ha asignado a la ultima linea la evaluacion NB
     */
    public void setNuevoNB(String NB) { lineas.get(lineas.size() - 1).setNB(NB); }

    // GETTERS

    /**
     * @pre Previamente se ha anadido un candidato
     * @post Se devuelve el candidato de la ultima linea
     */
    public Codigo getUltimoCandidato() { return lineas.get(lineas.size() - 1).getCandidato(); }

    /**
     * @pre Todas, excepto quizas la ultima linea tienen una evaluacion
     * @post Devuelve un arraylist con todos los candidatos y evaluaciones
     */
    public ArrayList<String> guardarPartida(){
        ArrayList <String> datos=new ArrayList<>();
        for (Linea l:lineas){
            datos.add(l.getCandidato().getCodigo());
            // TODO: el != null no peta...verdad?
            if (l.getNB()!=null)datos.add(l.getNB());
        }
        return datos;
    }
}
