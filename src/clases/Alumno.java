package clases;

public class Alumno {



    //Empezamos colocando los atributos
    //1.Atributos
    private String Nombre;
   private String Apellido;
    private int fechadenacimiento;
    private long cuil;
    private String Asignaturas;
    private int Notasdefinales;

    //2.Constructores

    public Alumno(String nombre, String apellido, int fechadenacimiento, long cuil, String asignaturas, int notasdefinales) {
        Nombre = nombre;
        Apellido = apellido;
        this.fechadenacimiento = fechadenacimiento;
        this.cuil = cuil;
        Asignaturas = asignaturas;
        Notasdefinales = notasdefinales;

    }

    //getters y setters


    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public int getFechadenacimiento() {
        return fechadenacimiento;
    }

    public void setFechadenacimiento(int fechadenacimiento) {
        this.fechadenacimiento = fechadenacimiento;
    }

    public long getCuil() {
        return cuil;
    }

    public void setCuil(long cuil) {
        this.cuil = cuil;
    }

    public String getAsignaturas() {
        return Asignaturas;
    }

    public void setAsignaturas(String asignaturas) {
        Asignaturas = asignaturas;
    }

    public int getNotasdefinales() {
        return Notasdefinales;
    }

    public void setNotasdefinales(int notasdefinales) {
        Notasdefinales = notasdefinales;
    }

    //toString para que me muestre los datos

    @Override
    public String toString() {
        return "clases.Alumno:" +
                "/nNombre: '" + Nombre + '\'' +
                ",/nApellido:'" + Apellido + '\'' +
                ",/nfechadenacimiento:" + fechadenacimiento +
                ",/ncuil:" + cuil +
                ",/nAsignaturas:'" + Asignaturas + '\'' +
                ",/nNotasdefinales:" + Notasdefinales +
                 '}';
    }
}
