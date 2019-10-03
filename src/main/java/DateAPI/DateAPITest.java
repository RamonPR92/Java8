package DateAPI;

import java.text.*;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class DateAPITest {

    public void compararFechas(int version){
        if(version == 7){
            Calendar fechaUno = Calendar.getInstance();
            Calendar fechaDos = Calendar.getInstance();
            fechaUno.set(1992, 4, 13);
            System.out.println(fechaUno.after(fechaDos));
        }else{
            LocalDate fechaUno = LocalDate.of(1992, 5, 13);
            LocalDate fechaDos = LocalDate.now();
            System.out.println(fechaUno.isAfter(fechaDos));

            LocalTime localTimeUno = LocalTime.of(10, 30, 20);
            LocalTime localTimeDos = LocalTime.now();
            System.out.println(localTimeUno.isAfter(localTimeDos));

            LocalDateTime localDateTimeUno = LocalDateTime.of(1992, 5, 13, 10, 30, 20);
            LocalDateTime localDateTimeDos = LocalDateTime.now();
            System.out.println(localDateTimeUno.isAfter(localDateTimeDos));
            System.out.println(localDateTimeUno + "------" + localDateTimeDos);

        }
    }

    public void medirTiempo(int version)throws InterruptedException{
        if(version == 7){
            long inicio = System.currentTimeMillis();
            Thread.sleep(1000);
            long fin = System.currentTimeMillis();
            System.out.println(fin - inicio);
        }else{
            Instant inicio = Instant.now();
            Thread.sleep(1000);
            Instant fin = Instant.now();
            System.out.println(Duration.between(inicio, fin).toMillis());
        }
    }

    public void periodoEntreFechas(int version){
        if(version == 7){
            Calendar nacimiento = Calendar.getInstance();
            Calendar actual = Calendar.getInstance();

            nacimiento.set(1992, 4, 13);
            int anios = 0;
            while(nacimiento.before(actual)){
                nacimiento.add(Calendar.YEAR, 1);
                if(nacimiento.before(actual)){
                    anios++;
                }
            }

            System.out.println("Años " + anios);
        }else{
            LocalDate nacimiento = LocalDate.of(1992, 5, 13);
            LocalDate ahora = LocalDate.now();
            Period period = Period.between(nacimiento, ahora);

            System.out.println("Años " + period.getYears() + " Meses " + period.getMonths() + " Dias " + period.getDays());
        }
    }

    public void convertir(int version)throws ParseException {
        if(version == 7){
            String fecha = "13/05/1992";
            DateFormat dateFormat = new SimpleDateFormat("dd/MM/YYYY");
            Date fechaConvertida = dateFormat.parse(fecha);

            Date fechaActual = Calendar.getInstance().getTime();
            dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss a");
            String fechaCadena = dateFormat.format(fechaActual);
            System.out.println(fechaCadena);
        }else{
            String fecha = "12/05/1992";
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate localDate = LocalDate.parse(fecha, formatter);
            System.out.println(localDate);
        }
    }
}
