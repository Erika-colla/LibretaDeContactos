package ec.edu.ups.poo.clases;

//CONTRUCTORES
//Inicializar un objeto con datos
//Tienen que ser publicos
//No retornan nada
//Tiene que tener el  mismo  nombre de la clase
//Una clase puede tener mas de un constructor


public class Persona {
    private String cedula;
    private String nombre;
    private String apellido;
    private String direccion;

    public Persona(String cedula) {
        this.cedula = cedula;
    }
    public Persona(){

    }
    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Persona(String nombre, String apellido, String cedula, String direccion){
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.direccion = direccion;

    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getCedula() {
        return cedula;
    }

    // Setters (para modificar los atributos después de la creación del objeto)
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    //toString va despues de get and set
    //metodo sobre escrito (puedo sobre escribir el metodo de la clase padre
    //@override para saber que es un metodo sobre escrito

    @Override
    public String toString() {
        return"\t Cedula: " + cedula +
                ",\n\t nombre" + nombre +
                ",\n\t Apellido" + apellido +
                ",\n\t direccion" + direccion;
    }
}



//CONTRUCTORES
    //inicializar un objeto con datos
    //Tienen que ser publicos
    //No retornan nada
    //Tiene que tener el  mismo  nombre de la clase
    //Una clase puede tener mas de un constructor
/*
    public Persona(String cedula) {
        this.cedula = cedula;
    }
    public Persona(){

    }
    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Persona(String nombre, String apellido, String cedula, String direccion){
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.direccion = direccion;

    }
    //
    public void setCedula(String cedula){
        this.cedula = cedula;
    }
    public String getCedula(){
        return cedula;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getApellido() {
        return apellido;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDireccion() {
        return direccion;
    }


}
*/


