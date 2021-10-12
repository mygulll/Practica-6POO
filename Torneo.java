public class Torneo {
    private final int CANT_EQUIPOS = 5;
    private final String[] regiones = {"Norte", "Sur", "Este", "Oeste"};
    String nombreTorneo;
    String region;
    int numParticipantes;
    int partidosTotales;
    int partidosJugados;
    int partidosPendientes;
    public Equipo[] equipos = new Equipo[CANT_EQUIPOS];

    public Torneo(String nombreTorneo) {
        setNombreTorneo(nombreTorneo);
        setNumParticipantes();
        setPartidosTotales();
        setRegion();
        agregarEquipos();
    }

    private void agregarEquipos(){
        for (int i = 0; i < CANT_EQUIPOS; i++) {
            Jugador.ID = 0;
            System.out.println("Equipo "+(i+1));
            equipos[i] = new Equipo();
        }
    }

    public void setNombreTorneo(String nombreTorneo) {
        this.nombreTorneo = nombreTorneo;
    }

    public void setNumParticipantes() {
        this.numParticipantes = equipos.length*10;
    }

    public void setPartidosTotales() {
        this.partidosTotales = (int)(Math.random()*20);
        setPartidosJugados();
        setPartidosPendientes();
    }

    public void setPartidosJugados() {
        this.partidosJugados = partidosTotales - (int)(Math.random()*19);
    }

    public void setPartidosPendientes() {
        this.partidosPendientes = partidosTotales - partidosJugados;
    }

    public void setRegion() {
        int num;
        num = (int) (Math.random() * 4);
        this.region = regiones[num];
    }

    public String getNombreTorneo() {
        return nombreTorneo;
    }

    public String getRegion() {
        return region;
    }

    public int getNumParticipantes() {
        return numParticipantes;
    }

    public int getPartidosTotales() {
        return partidosTotales;
    }

    public int getPartidosJugados() {
        return partidosJugados;
    }

    public int getPartidosPendientes() {
        return partidosPendientes;
    }
}