public class HPersona {
    private String nombre, telefono;
    private int edad;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return this.nombre;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getTelefono() {
        return this.telefono;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    public int getEdad() {
        return this.edad;
    }
}

class Cliente extends HPersona {
    private int credito;

    public void setCredito(int credito) {
        this.credito = credito;
    }
    public int getCredito(){
        return this.credito;
    }

}

class Trabajador extends HPersona {
    private int salario;

    public void setSalario(int salario) {
        this.salario = salario;
    }
    public int getSalario(){
        return this.salario;
    }
}

class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente();
        cliente1.setEdad(25);
        cliente1.setNombre("Ramiro");
        cliente1.setTelefono("1133456678");
        cliente1.setCredito(10000);


        System.out.println("Nombre: " + cliente1.getNombre() +
                "\nTelefono: " + cliente1.getTelefono() +
                "\nEdad: " + cliente1.getEdad() +
                "\nCredito: $" + cliente1.getCredito());
        System.out.println();

        Trabajador trabajador1 = new Trabajador();
        trabajador1.setEdad(19);
        trabajador1.setNombre("Sabrina");
        trabajador1.setTelefono("1166787656");
        trabajador1.setSalario(80000);

        System.out.println("Nombre: " + trabajador1.getNombre() +
                "\nTelefono: " + trabajador1.getTelefono() +
                "\nEdad: " + trabajador1.getEdad() +
                "\nSalario: $" + trabajador1.getSalario());
    }
}


