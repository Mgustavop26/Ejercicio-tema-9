public class Persona {
    private String Nombre;
    private Integer Edad;
    private String  Telefono;

    public Persona(){
        Nombre="juan";
        Edad=23;
        Telefono= "1122334455";
    }
    public Persona(String nom,int edad, String tel){
        this.Nombre= nom;
        this.Edad= edad;
        this.Telefono= tel;


    }
    public String getNombre() {
        return Nombre;
    }

    public Integer getEdad() {
        return Edad;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public void setEdad(Integer edad) {
        Edad = edad;
    }

    public void setTelefono(String telefono) {
        Telefono = telefono;
    }

}

