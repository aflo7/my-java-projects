// Project:		Final
// Class:               ContactFriend.java
// Date:                November 30, 2021
// Author:              Flores
// Description:         final

package Flores;

public class ContactFriend extends Contact
{
    // private field
    private int yearMet;

    // constructor. Parameters for all fields
    public ContactFriend(String name, String email, String phone, 
            String street, String city, String state, String zip, 
            ContactType type, int yearMet) throws ContactException
    {
        // call the superclass constructor
        super(name, email, phone, street, city, state, zip, type);
        
        // assign the field
        this.yearMet = yearMet;
    }
    
    // toString method
    @Override
    public String toString()
    {
        return super.toString() + ", " + yearMet;
    }
}
