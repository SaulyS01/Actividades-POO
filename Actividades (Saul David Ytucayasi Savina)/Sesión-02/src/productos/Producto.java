package src.productos;

public class Producto {

    private String polo;
    private String casaca;
    private String gorro;

    public Producto(String polo, String casaca, String gorro) {
        this.polo = polo;
        this.casaca = casaca;
        this.gorro = gorro;
    }

    public void setPolo(String polo) {
        this.polo = polo;
    }
    
    public String getPolo() {
        return polo;
    }

    public void setCasaca(String casaca) {
        this.casaca = casaca;
    }

    public String getCasaca() {
        return casaca;
    }

    public void setGorro(String gorro) {
        this.gorro = gorro;
    }

    public String getGorro() {
        return gorro;
    }
    
    public String agregar() {
        return "El polo es: " + getPolo() + "\n" +
        "El casaca es: " + getCasaca() + "\n" + 
        "El gorro es: " + getGorro() + "\n";
    }
}