package entities;

public class Vaca {

    int id;
    String Arete;
    String fechaN;
    Finca fincaId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getArete() {
        return Arete;
    }

    public void setArete(String arete) {
        Arete = arete;
    }

    public String getFechaN() {
        return fechaN;
    }

    public void setFechaN(String fechaN) {
        this.fechaN = fechaN;
    }

    public Finca getFincaId() {
        return fincaId;
    }

    public void setFincaId(Finca fincaId) {
        this.fincaId = fincaId;
    }
}
