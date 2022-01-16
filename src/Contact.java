public class Contact {
    private final String firstName;
    private final String lastName;
    private final String address;
    private final String state;
    private final String email;
    private final String city;
    private final int zip;
    private final long phoneNumber;

    Contact(String firstName, String lastName, String address, String city, String state, int zip, long phoneNumber, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return address;
    }

    public String getState() {
        return state;
    }

    public String getEmail() {
        return email;
    }

    public String getCity() {
        return city;
    }

    public int getZip() {
        return zip;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }
}