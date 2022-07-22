public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setNombre("Brayan Peña");
        cliente.setEdad(28);
        cliente.setTelefono("963828463");
        cliente.setCredito(2000.00);

        System.out.println(cliente.getNombre());
        System.out.println(cliente.getEdad());
        System.out.println(cliente.getTelefono());
        System.out.println(cliente.getCredito());

        Trabajador trabajador = new Trabajador();
        trabajador.setNombre("Karolin");
        trabajador.setEdad(28);
        trabajador.setTelefono("963828463");
        trabajador.setSalario(1500.00);

        System.out.println(trabajador.getNombre());
        System.out.println(trabajador.getEdad());
        System.out.println(trabajador.getTelefono());
        System.out.println(trabajador.getSalario());

    }

 static class Persona{
         String nombre;
         int edad;
         String telefono;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getTelefono() {
        return this.telefono;
    }
}

 static class Cliente extends Persona{
         double credito;

    public void setCredito(double credito) {
        this.credito = credito;
    }

    public double getCredito() {
        return credito;
    }
}
    static class Trabajador extends Persona{
        double salario;

        public void setSalario(double salario) {
            this.salario = salario;
        }

        public double getSalario() {
            return salario;
        }
    }
}