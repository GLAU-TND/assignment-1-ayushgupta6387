package fields;

import node.MyLinkedList;

public class Person {
    private String firstName;
    private String lastName;
    private String emailId;
    private MyLinkedList<Long> contactNumber;

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

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public MyLinkedList<Long> getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(MyLinkedList<Long> contactNumber) {
        this.contactNumber = contactNumber;
    }
}
