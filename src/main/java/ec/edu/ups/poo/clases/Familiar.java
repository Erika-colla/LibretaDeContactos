package ec.edu.ups.poo.clases;

import java.util.Calendar;
import java.util.GregorianCalendar;
//metodo calcular edad por la fecha de naciemiento en el to string llamar y en vez de la fecha imprime la edad
public class Familiar extends Persona{
    private String parentesco;
    private String tipoDeSangre;
    private GregorianCalendar fechaDeNacimiento;

    public Familiar(String cedula, String nombre, String apellido, String direccion, String parentesco, String tipoDeSangre, int añoNacimiento) {
    }

    public int calcularEdad(GregorianCalendar fechaDeNacimiento) {
        if(fechaDeNacimiento==null){
            return -1;
        }
        int anioNacimiento = fechaDeNacimiento.getWeekYear();
        int anioActual=Calendar.getInstance().get(Calendar.YEAR);
        return anioActual - anioNacimiento;

    }

    public Familiar() {}

    public Familiar(String nombre, String apellido, String cedula, String direccion, String parentesco, String tipoDeSangre, GregorianCalendar fechaDeNacimiento) {
        super(nombre, apellido, cedula, direccion);
        this.parentesco = parentesco;
        this.tipoDeSangre = tipoDeSangre;
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public String getParentesco() {
        return parentesco;

    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }

    public String getTipoDeSangre() {
        return tipoDeSangre;
    }

    public void setTipoDeSangre(String tipoDeSangre) {
        this.tipoDeSangre = tipoDeSangre;
    }

    public Calendar getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(GregorianCalendar fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    @Override
    public String toString() {
        return "Familiar{\n" +
                super.toString() +
                "\n parentesco='" + parentesco + '\'' +
                ", \ntipoDeSangre='" + tipoDeSangre + '\'' +
                ", \nedad=" + calcularEdad(fechaDeNacimiento) +
                '}';
    }
}
