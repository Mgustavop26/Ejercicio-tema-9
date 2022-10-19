public class Cliente extends Persona {
    String Credito;

    public Cliente(String nom, int edad, String tel,String credito){
        super(nom,edad,tel);
        this.Credito= credito;

    }


    public void setCredito(String credito) {
        Credito = credito;
    }

    public String getCredito() {
        return Credito;
    }
    public void mostrardatos(){
        System.out.println("Datos de Cliente");
        System.out.println("Nombre: "+ getNombre()+"\nEdad: "+ getEdad()+"\nTelefono: "+ getTelefono()+"\nCredito: "+ getCredito()
        );
    }

}
