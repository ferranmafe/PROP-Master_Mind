package Dominio;

import java.util.ArrayList;

public class Tablero {
    private ArrayList<Dominio.Linea> lineas;

    public Tablero(){lineas=new ArrayList<>();}

    public void setNuevoCandidato(String candidato){
        lineas.add(new Dominio.Linea(candidato));
    }
    public void setNuevoBn(String Bn){
        lineas.get(lineas.size()-1).setBn(Bn);
    }
    public String getUltimoCandidato(){
        return lineas.get(lineas.size()-1).getCandidato();
    }
    public String getUltimoBn(){
        return  lineas.get(lineas.size()-1).getBn();
    }
    public int getNumLineas(){
        return lineas.size();
    }
    public String getCandidato(int i){
        return lineas.get(i).getCandidato();
    }
    public Boolean existsBN(int i){
        return ! lineas.get(i).existsBN();
    }
    public String getBN(int i){
        return lineas.get(i).getBn();
    }
    //todo GetAllCandidatoBn
}