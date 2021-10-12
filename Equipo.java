public class Equipo {
    private final int CANT_JUGADORES = 10;
    private final String[] divisiones = {"Primera", "Segunda", "Tercera"};
    private final String[] entrenadores = {"Pikachu", "lucario", "Lobezno", "Giglipuff"};
    String nombre;
    String division;
    String nombreEntrenador;
    int torneosParticipacion;
    int torneosGanados;
    public int torneosPerdidos;
    public Jugador[] jugadores = new Jugador[CANT_JUGADORES];

    public Equipo() {
        setNombre(CapturaEntrada.capturarCadena("Nombre del equipo "));
        setNombreEntrenador();
        setDivision();
        agregarJugadores();
    }

    private void agregarJugadores(){
        for (int i = 0; i < CANT_JUGADORES; i++) {
            jugadores[i] = new Jugador();
        }
    }

    public int cantJugadores(Jugador[] jugadores){
        return jugadores.length;
    }

    public int ptsTotales(Jugador[] jugadores){
        int num = 0;
        for (int i = 0; i < jugadores.length; i++) {
            num += jugadores[0].puntosAnotados;
        }
        return num;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNombreEntrenador() {
        int num;
        num = (int) (Math.random() * 4);
        this.nombreEntrenador = entrenadores[num];
    }

    public void setDivision() {
        int num;
        num = (int) (Math.random() * 3);
        this.division = divisiones[num];
    }

    public String getNombre() {
        return nombre;
    }

    public String getDivision() {
        return division;
    }

    public String getNombreEntrenador() {
        return nombreEntrenador;
    }

    public int getTorneosParticipacion() {
        return torneosParticipacion;
    }

    public int getTorneosGanados() {
        return torneosGanados;
    }
}
