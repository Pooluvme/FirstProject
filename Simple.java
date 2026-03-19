import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

class Simple {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");

        System.out.println("Arkadiy Blokhin " + today.format(formatter));
    }
}
