import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main{
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.of("UTC"));

        System.out.print("Data-hora desejada: ");
        Instant datahora = Instant.parse(scanner.nextLine());
        LocalDateTime localDateTime = LocalDateTime.ofInstant(datahora, ZoneId.systemDefault());
        LocalDateTime t1 = localDateTime.plusHours(2);
        LocalDateTime t2 = localDateTime.plusDays(3);
        System.out.print("Data-hora Global: "+ formatter2.format(datahora));
        System.out.println();
        System.out.print("Data-hora Local: "+localDateTime.format(formatter));
        System.out.println();
        System.out.print("Data-hora Local 2 horas adiantadas: "+t1.format(formatter));
       System.out.println();
        System.out.print("Data-hora Local 3 dias adiantados: "+t2.format(formatter));

        scanner.close();
    }
}
