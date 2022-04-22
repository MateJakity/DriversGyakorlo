import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class DriversMain {
    public static void main(String[] args) {
        List<Driver> driversList = new ArrayList<>();

        try {
            BufferedReader br = new BufferedReader(new FileReader("resources\\drivers.csv"));
            String line = "";
            br.readLine();
            while((line = br.readLine()) != null){
                String[] sorDarabok = line.split(";");

                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                LocalDate date;
                date = LocalDate.parse(sorDarabok[1], formatter);

                String codedName;
                if(sorDarabok.length < 4) codedName = "";
                else{
                    codedName = sorDarabok[3];
                }
                Driver driver = new Driver(sorDarabok[0], date, sorDarabok[2], codedName);
                driversList.add(driver);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (Driver driver : driversList){
            System.out.println(driver.getName() + " " + driver.getBirthdate() + " " + driver.getNationality() + " " + driver.getCode());
        }
    }
}
