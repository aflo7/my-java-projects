// Project:		Final
// Class:               ContactFamily.java
// Date:                November 30, 2021
// Author:              Flores
// Description:         final

package Flores;

public class ContactFamily extends Contact
{
    // private field
    private String relationship;

    // constructor. Parameters for all fields
    public ContactFamily(String name, String email, String phone, 
            String street, String city, String state, String zip, 
            Contact.ContactType type, String relationship) throws ContactException
    {
        // call the superclass constructor
        super(name, email, phone, street, city, state, zip, type);
        
        // assign the field
        this.relationship = relationship;
    }
    
    // toString method
    @Override
    public String toString()
    {
        return super.toString() + ", " + relationship;
    }
}
