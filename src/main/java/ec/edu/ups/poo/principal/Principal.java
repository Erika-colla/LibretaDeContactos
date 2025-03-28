package ec.edu.ups.poo.principal;

import ec.edu.ups.poo.clases.Familiar;
import ec.edu.ups.poo.clases.Persona;

import java.time.LocalDate;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Familiar familiar = new Familiar();
        familiar.setCedula("1010101");
        familiar.setNombre("Familiar Nombre 1");
        familiar.setApellido("Familiar Apellido 1");
        familiar.setDireccion("Familiar Direccion 1");
        //establecemos los valores de los atributos de la clase hija
        familiar.setParentesco("Familiar Parentesco 1");
        familiar.setTipoDeSangre("Familiar Tipo de Sangre 1");
        // Instanciamos un objeto de tipo calendar
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(2006,9,28);
        familiar.setFechaDeNacimiento(gregorianCalendar);
        System.out.println(familiar.toString());

        //FAMILIARESSSSS
        int cantidadFamiliares = 10;
        Familiar[] listaFamiliares = new Familiar[cantidadFamiliares];

        // Datos predefinidos
        String[] idFamiliares = {"1010101", "2020202", "3030303", "4040404", "5050505",
                "6060606", "7070707", "8080808", "9090909", "1011121"};
        String[] nombresFamiliares = {"Luis", "Ana", "Carlos", "Sofía", "Pedro",
                "María", "Javier", "Elena", "José", "Laura"};
        String[] apellidosFamiliares = {"Gómez", "Pérez", "Rodríguez", "Fernández", "Martínez",
                "López", "Hernández", "Díaz", "Torres", "Ramírez"};
        String[] domicilios = {"Av. Central 123", "Calle Falsa 456", "Plaza Mayor 789",
                "Carrera 12 #34-56", "Sector 5, Casa 10", "Barrio Azul 321",
                "Callejón 7", "Vía Principal 890", "Esquina Roja 567", "Paseo del Río 234"};
        String[] relaciones = {"Hermano", "Hermana", "Padre", "Madre", "Tío",
                "Tía", "Abuelo", "Abuela", "Primo", "Prima"};
        String[] gruposSanguineos = {"O+", "A-", "B+", "AB+", "O-", "A+", "B-", "AB-", "O+", "A-"};

        for (int i = 0; i < cantidadFamiliares; i++) {
            GregorianCalendar fechaNac = new GregorianCalendar(2006 + i, 9, 28); // Años diferentes para cada uno

            listaFamiliares[i] = new Familiar();
            listaFamiliares[i].setCedula(idFamiliares[i]);
            listaFamiliares[i].setNombre(nombresFamiliares[i]);
            listaFamiliares[i].setApellido(apellidosFamiliares[i]);
            listaFamiliares[i].setDireccion(domicilios[i]);
            listaFamiliares[i].setParentesco(relaciones[i]);
            listaFamiliares[i].setTipoDeSangre(gruposSanguineos[i]);
            listaFamiliares[i].setFechaDeNacimiento(fechaNac);

            System.out.println(listaFamiliares[i]);
        }


        Scanner leer = new Scanner(System.in);


        int numeroDePersona = 10;
        Persona[] personas = new Persona[numeroDePersona];

        // Datos estáticos
        String[] cedulas = {"1234567890", "0987654321", "1122334455", "5566778899", "6677889900",
                "3344556677", "4455667788", "5566778899", "6677889900", "7788990011"};
        String[] nombres = {"Juan", "Ana", "Carlos", "María", "Pedro", "Sofía", "Luis", "Elena", "José", "Laura"};
        String[] apellidos = {"Pérez", "Gómez", "Rodríguez", "Fernández", "Martínez",
                "López", "Hernández", "Díaz", "Torres", "Ramírez"};
        String[] direcciones = {"Calle 1", "Calle 2", "Calle 3", "Calle 4", "Calle 5",
                "Calle 6", "Calle 7", "Calle 8", "Calle 9", "Calle 10"};
        LocalDate[] fechasNacimiento = {
                LocalDate.of(1990, 5, 15), LocalDate.of(1985, 8, 22), LocalDate.of(1995, 3, 10),
                LocalDate.of(2000, 12, 5), LocalDate.of(1992, 7, 18), LocalDate.of(1988, 9, 30),
                LocalDate.of(1997, 6, 25), LocalDate.of(1993, 11, 14), LocalDate.of(2001, 2, 8),
                LocalDate.of(1983, 4, 20)
        };

        for (int i = 0; i < numeroDePersona; i++) {
            personas[i] = new Persona(nombres[i], apellidos[i], cedulas[i], direcciones[i]);
            System.out.println(personas[i]);
        }


        System.out.println("\nLista de personas ingresadas:");
        for (int i = 0; i < numeroDePersona; i++) {
            System.out.println("Persona " + (i + 1) + ":");
            System.out.println("Cédula: " + personas[i].getCedula());
            System.out.println("Nombre: " + personas[i].getNombre());
            System.out.println("Apellido: " + personas[i].getApellido());
            System.out.println("Dirección: " + personas[i].getDireccion());
            System.out.println("----------------------------");
        }

        System.out.println("\nLista de Familiares  ingresadas:");
        for (int i = 0; i < numeroDePersona; i++) {
            System.out.println("Familiar " + (i + 1) + ":");
            System.out.println("Cédula: " + familiar.getCedula());
            System.out.println("Nombre: " + familiar.getNombre());
            System.out.println("Apellido: " + familiar.getApellido());
            System.out.println("Dirección: " + familiar.getDireccion());
            System.out.println("Parentesco " + familiar.getParentesco());
            System.out.println("TipoDeSnagre " + familiar.getTipoDeSangre());
            System.out.println("Edad: " + familiar.getFechaDeNacimiento());
            System.out.println("----------------------------");
        }

        System.out.println("\nLista de Familiares  ingresadas: to String");
        for (Familiar familiarE : listaFamiliares) {
            System.out.println(familiarE.toString());
        }


        leer.close();
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