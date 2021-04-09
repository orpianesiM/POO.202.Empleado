package org.example;

public class Empleado {
    private long dni;
    String nombre;
    String apellido;
    float salario;

    public Empleado(long dni, String nombre, String apellido, float salario) { //Constructor
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.salario = salario;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public String verDetalle(){
        StringBuilder sb = new StringBuilder();
        sb.append("Empleadx: ");
        sb.append("\tDNI: " + this.dni);
        sb.append("\tNombre: " + this.nombre);
        sb.append("\tApellido: " + this.apellido);
        sb.append("\tSalario: " + this.salario);
        return sb.toString();
    }
    public float calcularSalarioAnual(){
        float salarioAnual = this.salario*12;
        return salarioAnual;
    }

    public void aumentarSalario(float cantidadAumentar){
        this.salario += this.salario * cantidadAumentar / 100;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "dni=" + dni +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", salario=" + salario +
                '}';
    }
}
