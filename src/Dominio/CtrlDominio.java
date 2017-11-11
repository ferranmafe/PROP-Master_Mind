package Dominio;

public class CtrlDominio {
    private Maquina maquina;
    private Normas normas;
    private Partida partida;

    public CtrlDominio() {}

    /*public String pedirAyuda() {
        //Por ahora no hace nada
    }*/

    public boolean empezarPartida(String dificultad_s,String rol_s) {
        Dificultad dif = Dificultad.valueOf(dificultad_s);
        Rol rol = Rol.valueOf(rol_s);
        partida = new Partida(dif, rol);
        normas = new Normas();
        maquina = new Maquina(normas, dif, rol);
        if (rol == Rol.CODEBREAKER) {
            String solucion = maquina.generarSolucion(partida.getDificultad());
            partida.setSolucion(solucion);
        }
        return true;
    }
    public String generarSolucion(String solucion) {
        try {
            normas.comprobarLinea(solucion, partida.getDificultad());
            partida.setSolucion(solucion);
            String candidato = maquina.generarCandidato(null,null,partida.getDificultad());
            partida.setNuevoCandidato(candidato);
            return candidato;
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return "";
    }

    public String evaluarCandidato(String nb) {
        String candidato = partida.getUltimoCandidato();
        String NB = partida.getUltimaNB();
        String solucion = partida.getSolucion();
        try {
            normas.comprobarNB(candidato, solucion, nb);
            partida.setNuevaNB(nb);
            String siguiente_candidato = maquina.generarCandidato(candidato,NB,partida.getDificultad());
            partida.setNuevoCandidato(siguiente_candidato);
            return siguiente_candidato;
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return "";
    }

    public String generarCandidato(String candidato) {
        try {
            normas.comprobarLinea(candidato, partida.getDificultad());
            partida.setNuevoCandidato(candidato);
            String nb_ultima_jugada = normas.calcularNB(candidato, partida.getSolucion());
            partida.setNuevaNB(nb_ultima_jugada);
            return nb_ultima_jugada;
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return "";
    }

}
