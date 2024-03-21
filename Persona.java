
package persona;

import java.util.Random;

public class Persona {
    
    
    
    public static final int BAJO_PESO = -1;
    public static final int PESO_IDEAL = 0;
    public static final int SOBREPESO = 1;
    

    
    private String nombre;
    private int edad;
    private String cedula;
    private char sexo;
    private double peso;
    private double altura;
    
    // Constructor por defecto
    public Persona() {
        this.nombre = "cristian";
        this.edad = 16;
        this.cedula = generaCedula();
        this.sexo = 'H';
        this.peso = 80;
        this.altura = 1.74;
    }
    
    // Constructor con nombre, edad y sexo
    public Persona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = 16;
        this.cedula = generaCedula();
        this.sexo = sexo;
        this.peso = 80;
        this.altura = 1.74;
    }
    
    // Constructor con todos los atributos
    public Persona(String nombre, int edad, String cedula, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.cedula = cedula;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }
    
    // Métodos
    public int calcularIMC() {
        double imc = peso / (altura * altura);
        if (imc < 20) {
            return BAJO_PESO;
        } else if (imc >= 20 && imc <= 25) {
            return PESO_IDEAL;
        } else {
            return SOBREPESO;
        }
    }
    
    public boolean esMayorDeEdad() {
        return edad >= 18;
    }
    
    public char comprobarSexo(char sexo) {
        if (sexo == 'H' || sexo == 'M') {
            return sexo;
        } else {
            return 'H';
        }
    }
    
    public String toString() {
        return "Nombre: " + nombre + "\n" +
               "Edad: " + edad + "\n" +
               "Cédula: " + cedula + "\n" +
               "Sexo: " + sexo + "\n" +
               "Peso: " + peso + "\n" +
               "Altura: " + altura;
    }
    
    // Método para generar una cédula aleatoria de 10 dígitos
    private String generaCedula() {
        Random rnd = new Random();
        StringBuilder cedula = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            cedula.append(rnd.nextInt(10));
        }
        return cedula.toString();
    }
    
    // Métodos getter y setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
