public class Persona {
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

class Main {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setNombre("Alfredo");
        persona.setTelefono("1122334455");
        persona.setEdad(32);

        System.out.println("Nombre: " + persona.getNombre() +
                "\nTelefono: " + persona.getTelefono() +
                "\nEdad: " + persona.getEdad());
    }
}