public class Trabajador extends Persona{
    double Salario;
    public Trabajador(String nom, int edad, String tel,double salario){
        super(nom,edad,tel);
        this.Salario=salario;


    }

    public double getSalario() {
        return Salario;
    }

    public void setSalario(double salario) {
        Salario = salario;
    }
    public void mostrardatos(){
        System.out.println("Datos de Trabajador");
        System.out.println("Nombre: "+ getNombre()+"\nEdad: "+ getEdad()+"\nTelefono: "+ getTelefono()+"\nSalario: "+ getSalario()
        );
    }
}
