public class Gamer {
        private long identificationNumber;
        private String firstName;
        private String lastName;
        private String birthDate;

    public Gamer(long identificationNumber, String firstName, String lastName,
                 String birthDate){
        this.identificationNumber=identificationNumber;
        this.firstName=firstName;
        this.lastName=lastName;
        this.birthDate=birthDate;

    }

    public long getIdentificationNumber() {
        return identificationNumber;
    }

    public void setIdentificationNumber(long identificationNumber) {
        this.identificationNumber = identificationNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }
}
