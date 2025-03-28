package ec.edu.ups.poo.principal;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class pruebas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calendar fechaDeNacimiento = new GregorianCalendar();
        fechaDeNacimiento.setTime(fechaDeNacimiento.getTime());
        System.out.println(fechaDeNacimiento.getWeekYear());
    }
}
