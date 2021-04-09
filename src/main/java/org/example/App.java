package org.example;

public class App 
{
    public static void main( String[] args )
    {
        Empleado rrhh = new Empleado(23456345, "Carlos", "Gutiérrez", 25000);
        Empleado developer = new Empleado(34234123, "Ana", "Sanchez", 27500);

        //Mostrando con metodo verDetalle con stringBuilder
        System.out.println(rrhh.verDetalle());
        System.out.println(developer.verDetalle());

        //Mostrando con metodo toString override
        System.out.println(rrhh.toString());
        System.out.println(developer.toString());

        developer.aumentarSalario(15);
        System.out.println("Salario de Carlos aumentado: " + developer.salario);
        System.out.println("Salario anual: " + developer.calcularSalarioAnual());

    }
}
