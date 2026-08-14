package Clases;

public class Sala {
    private int cupo;
    private int idSala;

    public Sala(int cupo, int id){
        this.cupo=cupo;
        this.idSala = id;

    }

    public int getCupo() {
        return cupo;
    }

    public void setCupo(int cupo) {
        this.cupo = cupo;
    }
}
