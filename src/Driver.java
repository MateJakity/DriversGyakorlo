import java.time.LocalDate;

public class Driver {
    private String name;
    private LocalDate birthdate;
    private String nationality;
    private String code;

    public Driver(String name, LocalDate birthdate, String nationality, String code) {
        this.name = name;
        this.birthdate = birthdate;
        this.nationality = nationality;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
