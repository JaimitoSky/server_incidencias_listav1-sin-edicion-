package modelo;

public class Incidencia {
    private int id;
    private String nombre;
    private String lugar;
    private String referencia;
    private String foto;
    private String victima;
    private int contacto;
    private boolean requiereAmbulancia;
    private boolean requierePolicia;
    private boolean requiereBombero;
    private String descriptionSolucion;

    // Constructor
    public Incidencia() {
    }

    // Getters y Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getVictima() {
        return victima;
    }

    public void setVictima(String victima) {
        this.victima = victima;
    }

    public int getContacto() {
        return contacto;
    }

    public void setContacto(int contacto) {
        this.contacto = contacto;
    }

    public boolean isRequiereAmbulancia() {
        return requiereAmbulancia;
    }

    public void setRequiereAmbulancia(boolean requiereAmbulancia) {
        this.requiereAmbulancia = requiereAmbulancia;
    }

    public boolean isRequierePolicia() {
        return requierePolicia;
    }

    public void setRequierePolicia(boolean requierePolicia) {
        this.requierePolicia = requierePolicia;
    }

    public boolean isRequiereBombero() {
        return requiereBombero;
    }

    public void setRequiereBombero(boolean requiereBombero) {
        this.requiereBombero = requiereBombero;
    }

    public String getdescriptionSolucion() {
        return descriptionSolucion;
    }

    public void setDescripcionSolucion(String descriptionSolucion) {
        this.descriptionSolucion = descriptionSolucion;
    }
}

