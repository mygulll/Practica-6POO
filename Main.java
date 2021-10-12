public class Main {
    public static void main(String[] args) {

        Torneo t = new Torneo(CapturaEntrada.capturarCadena("Ingrese el nombre del torneo "));
        System.out.println("*** Zona de impresion de datos ***");
        System.out.println("Datos del torneo");
        System.out.println("Nombre del torneo: "+t.getNombreTorneo());
        System.out.println("Region: "+t.getRegion());
        System.out.println("Numero de equipos participantes " + t.getNumParticipantes());
        System.out.println("Partidos jugados " + t.getPartidosJugados());
        System.out.println("Partidos pendientes " + t.getPartidosPendientes());
        System.out.println("\n***");
        for (int i = 0; i < t.equipos.length; i++) {
            System.out.println("Datos del equipo "+t.equipos[i].getNombre());
            System.out.println("Division" + t.equipos[i].getDivision());
            System.out.println("Cantidad de jugadores "+ t.equipos[i].cantJugadores(t.equipos[i].jugadores));
            System.out.println("Puntos totales del equipo "+ t.equipos[i].ptsTotales(t.equipos[i].jugadores));
            for (int j = 0; j < t.equipos[i].jugadores.length; j++) {
                System.out.println("Numero de jugador " + t.equipos[i].jugadores[j].getNumUniforme());
                System.out.println("Nombre " + t.equipos[i].jugadores[j].getNombre());
                System.out.println();
            }
            System.out.println("\n***");
        }

    }
}
