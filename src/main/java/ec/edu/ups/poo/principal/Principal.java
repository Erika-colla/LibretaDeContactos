package ec.edu.ups.poo.principal;

import ec.edu.ups.poo.clases.Familiar;
import ec.edu.ups.poo.clases.Persona;

import java.util.Calendar;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Cambio de datos estaticos a Pedir que el Usuario Ingrese sus datos.

        System.out.print("¿Cuántas personas desea ingresar? ");
        int numPersonas = scanner.nextInt();
        scanner.nextLine();


        System.out.print("¿Cuántos familiares desea ingresar? ");
        int numFamiliares = scanner.nextInt();
        scanner.nextLine();


        for (int i = 0; i < numPersonas; i++) {
            System.out.println("\nIngrese los datos de la persona #" + (i + 1));
            System.out.print("Cédula: ");
            String cedula = scanner.nextLine();
            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();
            System.out.print("Apellido: ");
            String apellido = scanner.nextLine();
            System.out.print("Dirección: ");
            String direccion = scanner.nextLine();

            Persona persona = new Persona(cedula, nombre, apellido, direccion);


            System.out.println("\nInformación de la Persona #" + (i + 1) + ":");
            System.out.println(persona.toString());
        }


        for (int i = 0; i < numFamiliares; i++) {
            System.out.println("\nIngrese los datos del familiar #" + (i + 1));
            System.out.print("Cédula: ");
            String cedula = scanner.nextLine();
            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();
            System.out.print("Apellido: ");
            String apellido = scanner.nextLine();
            System.out.print("Dirección: ");
            String direccion = scanner.nextLine();
            System.out.print("Parentesco: ");
            String parentesco = scanner.nextLine();
            System.out.print("Tipo de sangre: ");
            String tipoDeSangre = scanner.nextLine();
            System.out.print("Año de nacimiento: ");
            int añoNacimiento = scanner.nextInt();
            scanner.nextLine();


            int añoActual = Calendar.getInstance().get(Calendar.YEAR);
            int edad = añoActual - añoNacimiento;

            Familiar familiar = new Familiar(cedula, nombre, apellido, direccion, parentesco, tipoDeSangre, añoNacimiento);


            System.out.println("\nInformación del Familiar #" + (i + 1) + ":");
            System.out.println(familiar.toString());
            System.out.println("Edad: " + edad + " años");
        }

        scanner.close();
    }
}

/*

        Persona persona11= new Persona();
            persona11.setCedula("0101010");
            persona11.setApellido("Perez");
            persona11.setNombre("juan");
            persona11.setDireccion("calle vieja");

        Persona persona12 = new Persona("juan", "perez");
            persona12.setCedula("010101");
            persona12.setDireccion("calle vieja");


        Persona persona13 = new Persona("JUAN","PEREZ","0101010","CALLE VIEJA");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Cuantas personas ingresara");


        Persona[] personas = new Persona [numeroDePersona];
        //Persona persona = new Persona();
        for (int i = 0; i < numeroDePersona; i++) {
            Persona persona = new Persona();

            System.out.println("Ingrese el numero de cedula");
            String cedula = scanner.next();
            System.out.println("Ingrese su nombre");
            String nombre = Scanner.next();
            System.out.println("Ingrese su Apellido");
            String apellido = scanner.next();
            System.out.println("Ingrese su Direccion");
            String direccion = scanner.next();

            persona.setCedula(cedula);
            persona.setNombre(nombre);
            persona.setDireccion(direccion);
            persona.setApellido(apellido);

            personas[i] = persona;
        }
        for(int = 0; i < numeroDePersona; i++){
            System.out.println(personas[i].getCedula());
            System.out.println(personas[i].getNombre());
            System.out.println(personas[i].getApellido());
            System.out.println(personas[i].getdireccion());
        }


        Persona persona2 = new Persona();
        System.out.println("Persona 2: ");
        System.out.print("Ingrese la cédula: ");
        persona2.setCedula(scanner.next());
        System.out.print("Ingrese el nombre: ");
        persona2.setNombre(scanner.next());
        System.out.print("Ingrese el apellido: ");
        persona2.setApellido(scanner.next());
        System.out.print("Ingrese la dirección: ");
        persona2.setDireccion(scanner.next());

        Persona persona3 = new Persona();
        System.out.println("Persona 3: ");
        System.out.print("Ingrese la cédula: ");
        persona3.setCedula(scanner.next());
        System.out.print("Ingrese el nombre: ");
        persona3.setNombre(scanner.next());
        System.out.print("Ingrese el apellido: ");
        persona3.setApellido(scanner.next());
        System.out.print("Ingrese la dirección: ");
        persona3.setDireccion(scanner.next());



        Persona persona4 = new Persona();
        System.out.println("Persona 4: ");
        System.out.print("Ingrese la cédula: ");
        persona4.setCedula(scanner.next());
        System.out.print("Ingrese el nombre: ");
        persona4.setNombre(scanner.next());
        System.out.print("Ingrese el apellido: ");
        persona4.setApellido(scanner.next());
        System.out.print("Ingrese la dirección: ");
        persona4.setDireccion(scanner.next());

        Persona persona5 = new Persona();
        System.out.println("Persona 5: ");
        System.out.print("Ingrese la cédula: ");
        persona5.setCedula(scanner.next());
        System.out.print("Ingrese el nombre: ");
        persona5.setNombre(scanner.next());
        System.out.print("Ingrese el apellido: ");
        persona5.setApellido(scanner.next());
        System.out.print("Ingrese la dirección: ");
        persona5.setDireccion(scanner.next());

        Persona persona6 = new Persona();
        System.out.println("Persona 6: ");
        System.out.print("Ingrese la cédula: ");
        persona6.setCedula(scanner.next());
        System.out.print("Ingrese el nombre: ");
        persona6.setNombre(scanner.next());
        System.out.print("Ingrese el apellido: ");
        persona6.setApellido(scanner.next());
        System.out.print("Ingrese la dirección: ");
        persona6.setDireccion(scanner.next());

        Persona persona7 = new Persona();
        System.out.println("Persona 7: ");
        System.out.print("Ingrese la cédula: ");
        persona7.setCedula(scanner.next());
        System.out.print("Ingrese el nombre: ");
        persona7.setNombre(scanner.next());
        System.out.print("Ingrese el apellido: ");
        persona7.setApellido(scanner.next());
        System.out.print("Ingrese la dirección: ");
        persona7.setDireccion(scanner.next());

        Persona persona8 = new Persona();
        System.out.println("Persona 8: ");
        System.out.print("Ingrese la cédula: ");
        persona8.setCedula(scanner.next());
        System.out.print("Ingrese el nombre: ");
        persona8.setNombre(scanner.next());
        System.out.print("Ingrese el apellido: ");
        persona8.setApellido(scanner.next());
        System.out.print("Ingrese la dirección: ");
        persona8.setDireccion(scanner.next());

        Persona persona9 = new Persona();
        System.out.println("Persona 9: ");
        System.out.print("Ingrese la cédula: ");
        persona9.setCedula(scanner.next());
        System.out.print("Ingrese el nombre: ");
        persona9.setNombre(scanner.next());
        System.out.print("Ingrese el apellido: ");
        persona9.setApellido(scanner.next());
        System.out.print("Ingrese la dirección: ");
        persona9.setDireccion(scanner.next());

        Persona persona10 = new Persona();
        System.out.println("Persona 10: ");
        System.out.print("Ingrese la cédula: ");
        persona10.setCedula(scanner.next());
        System.out.print("Ingrese el nombre: ");
        persona10.setNombre(scanner.next());
        System.out.print("Ingrese el apellido: ");
        persona10.setApellido(scanner.next());
        System.out.print("Ingrese la dirección: ");
        persona10.setDireccion(scanner.next());

        //Lista de contactod
        System.out.println("Lista de Contactos: ");
        System.out.println("Contacto N-1 = Cédula: " + persona1.getCedula() + ", Nombre: " + persona1.getNombre() + ", Apellido: " + persona1.getApellido() + ", Dirección: " + persona1.getDireccion());
        System.out.println("Contacto N-2 = Cédula: " + persona2.getCedula() + ", Nombre: " + persona2.getNombre() + ", Apellido: " + persona2.getApellido() + ", Dirección: " + persona2.getDireccion());
        System.out.println("Contacto N-3 = Cédula: " + persona3.getCedula() + ", Nombre: " + persona3.getNombre() + ", Apellido: " + persona3.getApellido() + ", Dirección: " + persona3.getDireccion());
        System.out.println("Contacto N-4 = Cédula: " + persona4.getCedula() + ", Nombre: " + persona4.getNombre() + ", Apellido: " + persona4.getApellido() + ", Dirección: " + persona4.getDireccion());
        System.out.println("Contacto N-5 = Cédula: " + persona5.getCedula() + ", Nombre: " + persona5.getNombre() + ", Apellido: " + persona5.getApellido() + ", Dirección: " + persona5.getDireccion());
        System.out.println("Contacto N-6 = Cédula: " + persona6.getCedula() + ", Nombre: " + persona6.getNombre() + ", Apellido: " + persona6.getApellido() + ", Dirección: " + persona6.getDireccion());
        System.out.println("Contacto N-7 = Cédula: " + persona7.getCedula() + ", Nombre: " + persona7.getNombre() + ", Apellido: " + persona7.getApellido() + ", Dirección: " + persona7.getDireccion());
        System.out.println("Contacto N-8 = Cédula: " + persona8.getCedula() + ", Nombre: " + persona8.getNombre() + ", Apellido: " + persona8.getApellido() + ", Dirección: " + persona8.getDireccion());
        System.out.println("Contacto N-9 = Cédula: " + persona9.getCedula() + ", Nombre: " + persona9.getNombre() + ", Apellido: " + persona9.getApellido() + ", Dirección: " + persona9.getDireccion());
        System.out.println("Contacto N-10 =  Cédula: " + persona10.getCedula() + ", Nombre: " + persona10.getNombre() + ", Apellido: " + persona10.getApellido() + ", Dirección: " + persona10.getDireccion());

        scanner.close();
    }
}

 */