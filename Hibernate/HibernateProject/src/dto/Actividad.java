package dto;
// Generated 31-ene-2017 13:00:46 by Hibernate Tools 4.3.1



/**
 * Actividad generated by hbm2java
 */
public class Actividad  implements java.io.Serializable {


     private int idActividad;
     private String nombre;
     private String descripcion;
     private Integer dificultad;
     private String capacidad;
     private String diaRealizacion;
     private String horaInicio;
     private String horaFin;
     private String nombreGuia;
     private String localizacion;
     private String diaSemana;

    public Actividad() {
    }

	
    public Actividad(int idActividad) {
        this.idActividad = idActividad;
    }
    public Actividad(int idActividad, String nombre, String descripcion, Integer dificultad, String capacidad, String diaRealizacion, String horaInicio, String horaFin, String nombreGuia, String localizacion, String diaSemana) {
       this.idActividad = idActividad;
       this.nombre = nombre;
       this.descripcion = descripcion;
       this.dificultad = dificultad;
       this.capacidad = capacidad;
       this.diaRealizacion = diaRealizacion;
       this.horaInicio = horaInicio;
       this.horaFin = horaFin;
       this.nombreGuia = nombreGuia;
       this.localizacion = localizacion;
       this.diaSemana = diaSemana;
    }
   
    public int getIdActividad() {
        return this.idActividad;
    }
    
    public void setIdActividad(int idActividad) {
        this.idActividad = idActividad;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public Integer getDificultad() {
        return this.dificultad;
    }
    
    public void setDificultad(Integer dificultad) {
        this.dificultad = dificultad;
    }
    public String getCapacidad() {
        return this.capacidad;
    }
    
    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }
    public String getDiaRealizacion() {
        return this.diaRealizacion;
    }
    
    public void setDiaRealizacion(String diaRealizacion) {
        this.diaRealizacion = diaRealizacion;
    }
    public String getHoraInicio() {
        return this.horaInicio;
    }
    
    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }
    public String getHoraFin() {
        return this.horaFin;
    }
    
    public void setHoraFin(String horaFin) {
        this.horaFin = horaFin;
    }
    public String getNombreGuia() {
        return this.nombreGuia;
    }
    
    public void setNombreGuia(String nombreGuia) {
        this.nombreGuia = nombreGuia;
    }
    public String getLocalizacion() {
        return this.localizacion;
    }
    
    public void setLocalizacion(String localizacion) {
        this.localizacion = localizacion;
    }
    public String getDiaSemana() {
        return this.diaSemana;
    }
    
    public void setDiaSemana(String diaSemana) {
        this.diaSemana = diaSemana;
    }




}

