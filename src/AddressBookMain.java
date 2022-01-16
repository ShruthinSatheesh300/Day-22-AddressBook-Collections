
public class AddressBookMain {
    public static void main(String[] args) {

        Interface person = new Person();
        person.createContact();
        person.addContact();
        person.editContact();
        person.deleteContact();
        person.display();
        person.addToBook();
        person.operation();
        person.displayBook();
        person.searchPerson();
        person.addContactByCity();
        person.viewByCity();
        person.addContactByState();
        person.viewByState();
        person.sortAddressBook();
        person.sortByCity();
        person.sortByState();
    }
}