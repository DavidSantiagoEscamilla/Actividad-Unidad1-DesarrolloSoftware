public class Especie {
    private int idEspecie;
    private String nombreCientifico;
    private String nombreComun;
    private String dieta;

    public Especie(int idEspecie, String nombreCientifico, String nombreComun, String dieta) {
        this.idEspecie = idEspecie;
        this.nombreCientifico = nombreCientifico;
        this.nombreComun = nombreComun;
        this.dieta = dieta;
    }

    public int getIdEspecie() {
        return idEspecie;
    }

    public void setIdEspecie(int idEspecie) {
        this.idEspecie = idEspecie;
    }

    public String getNombreCientifico() {
        return nombreCientifico;
    }

    public void setNombreCientifico(String nombreCientifico) {
        this.nombreCientifico = nombreCientifico;
    }

    public String getNombreComun() {
        return nombreComun;
    }

    public void setNombreComun(String nombreComun) {
        this.nombreComun = nombreComun;
    }

    public String getDieta() {
        return dieta;
    }

    public void setDieta(String dieta) {
        this.dieta = dieta;
    }
}
