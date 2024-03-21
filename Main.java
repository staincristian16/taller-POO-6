package persona;

public class Main {
    public static void main(String[] args) {
        
        Persona persona1 = new Persona();
        System.out.println("Persona 1:");
        System.out.println(persona1);

        Persona persona2 = new Persona("Diego", 25, 'H');
        System.out.println("\nPersona 2:");
        System.out.println(persona2);

        Persona persona3 = new Persona("margarita", 30, "1005784880", 'M', 65, 1.75);
        System.out.println("\nPersona 3:");
        System.out.println(persona3);

        System.out.println("\nPersona 1 IMC: " + persona1.calcularIMC());
        System.out.println("Persona 2 es mayor de edad: " + persona2.esMayorDeEdad());
        System.out.println("Sexo de persona 3: " + persona3.comprobarSexo('F'));
    }
}
