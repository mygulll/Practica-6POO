public class Jugador {
    private final String[] posiciones = {"Delantero", "Defensa", "Bajo Campero"};
    private final String[] nombresPosibles = {"Arturo", "mulan","armando","lorenzo"};
    private final String[] abecedario = {"A.","B.","C.","D.","E.","F.","G.","H.","I.","J.","K.","K.","M.","N.","O.",
            "P.","Q.","R.","S.","T.","U.","V.","W.","X.","Y", "Z"};
    public static int ID = 0;
    int numUniforme;
    String nombre;
    int puntosAnotados;
    String posicion;
    float estatura;

    public Jugador() {
        setNombre();
        setNumUniforme();
        setPuntosAnotados();
        setEstatura();
        setPosicion();
    }


    public void setNumUniforme() {
        ID++;
        this.numUniforme = ID;
    }

    public void setNombre() {
        int num;
        String aux;
        num = (int) (Math.random() * 4);
        aux = nombresPosibles[num];
        num = (int) (Math.random() * abecedario.length);
        aux += " " + abecedario[num];
        this.nombre = aux;
    }

    public void setPuntosAnotados() {
        this.puntosAnotados = (int) (Math.random()*51);
    }

    public void setPosicion() {
        int num;
        num = (int) (Math.random() * 3);
        this.posicion = posiciones[num];
    }

    public void setEstatura() {
        this.estatura = (float) (Math.random()*(15-22+1)+22);
    }

    public int getNumUniforme() {
        return numUniforme;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPuntosAnotados() {
        return puntosAnotados;
    }

    public String getPosicion() {
        return posicion;
    }

    public float getEstatura() {
        return estatura;
    }
}
