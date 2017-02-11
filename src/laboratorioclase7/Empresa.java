package laboratorioclase7;

import java.util.ArrayList;

public class Empresa {

    public static void main(String[] args) {
    //Punto a    
    Empleado e1 = new Empleado("juan","10",20);
    Empleado e2 = new Empleado("carlos","11",25);
    Empleado e3 = new Empleado("pepe","12",35);
    Empleado e4 = new Empleado("martin","13",40);
    Empleado e5 = new Empleado("pier","14",25);
    Empleado e6 = new Empleado("agus","15",4);
    
    //Punto b
    ArrayList<Empleado> losEmpleados = new ArrayList();
        losEmpleados.add(e1);
        losEmpleados.add(e2);
        losEmpleados.add(e3);
        losEmpleados.add(e4);
        losEmpleados.add(e5);
        losEmpleados.add(e6);
        
    //Punto c    
    for(Empleado e: losEmpleados){
        System.out.println(
                "nombre: "+e.getNombre()+", "+
                "apellido: "+e.getDni()+", "+
                "edad: "+e.getEdad());
    }
    
    //Punto d
    System.out.println("La cantidad de empleados son: "+losEmpleados.size());
    
    //Punto e
    for(Empleado e: losEmpleados){
        if(e.getEdad()<30){
        System.out.println(
                "nombre: "+e.getNombre()+", "+
                "apellido: "+e.getDni()+", "+
                "edad: "+e.getEdad());
        }
    }
    System.out.println("---------------------------------");
    System.out.println("Punto f");
    informarDatosDeEmpleados(losEmpleados);
    
    System.out.println("---------------------------------");
    System.out.println("Punto g");
    obtenerDatosDeEmpleadosMenosDe30(losEmpleados);
    }
    public static void informarDatosDeEmpleados (ArrayList<Empleado> losEmpleados){
        
        for(Empleado e: losEmpleados){
        System.out.println(
                "nombre: "+e.getNombre()+", "+
                "apellido: "+e.getDni()+", "+
                "edad: "+e.getEdad());
        }
    
    }
    public static void obtenerDatosDeEmpleadosMenosDe30(ArrayList<Empleado> losEmpleados){
        for(Empleado e: losEmpleados){
            if(e.getEdad()<30){
                informarDatosDeEmpleados(losEmpleados);
            }
        }
    }
}