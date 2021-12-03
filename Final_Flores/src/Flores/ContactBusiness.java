// Project:		Final
// Class:               ContactBusiness.java
// Date:                November 30, 2021
// Author:              Flores
// Description:         Final

package Flores;

public class ContactBusiness extends Contact
{
    // private field
    private String company;

    // constructor. Parameters for all fields
    public ContactBusiness(String name, String email, String phone, 
            String street, String city, String state, String zip, 
            Contact.ContactType type, String company) throws ContactException
    {
        // call the superclass constructor
        super(name, email, phone, street, city, state, zip, type);
        
        // assign the field
        this.company = company;
    }
    
    // toString method
    @Override
    public String toString()
    {
        return super.toString() + ", " + company;
    }
    
    @Override
    public String toFile()
    {
        return super.toFile() + ", " + company;
    }
}

