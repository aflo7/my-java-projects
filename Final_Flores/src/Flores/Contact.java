// Project:		Final
// Class:               Contact.java
// Date:                November 30, 2021
// Author:              Flores
// Description:         final                
package Flores;

public abstract class Contact implements Comparable<Contact>
{

    // private instance fields
    private String name;
    private String email;
    private String phone;
    private Address address;
    private ContactType type;

    // private static class field
    private static int count;

    public Contact(String name, String email, String phone,
            String street, String city, String state, String zip,
            ContactType type) throws ContactException
    {
        this.name = name;
        this.email = email;
        this.phone = phone;

        // create the inner Address object
        this.address = new Address(street, city, state, zip);
        this.type = type;

        ++count;
    }

    public static int getCount()
    {
        return count;
    }

    public static void decrementCount()
    {
        --count;
    }
    
    public static void setCount(int c) {
        count = c;
    }

    public Address getAddress()
    {
        return address;
    }

    public void setAddress(Address address)
    {
        this.address = address;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public String getPhone()
    {
        return phone;
    }

    public void setPhone(String phone)
    {
        this.phone = phone;
    }

    @Override
    public String toString()
    {
        return name + ", " + phone + ", " + email + ", "
                + address.toString() + ", " + type;
    }

    public String toFile()
    {
        return name + "," + phone + "," + email + ","
                + address.toFile() + "," + type;
    }

    @Override
    public int compareTo(Contact contactObj)
    {
        return this.name.compareTo(contactObj.getName());
    }

    private class Address
    {

        // private fields
        private String street;
        private String city;
        private String state;
        private String zip;

        // public constructor
        public Address(String street, String city, String state, String zip) throws ContactException
        {
            this.street = street;
            this.city = city;
            this.state = state;
            this.zip = zip;

            // call validate methods
            validateStreet();
            validateCity();
            validateState();
            validateZip();
        }

        // public get/set methods.
        public String getStreet()
        {
            return street;
        }

        public void setStreet(String street)
        {
            this.street = street;
            validateStreet();
        }

        public String getCity()
        {
            return city;
        }

        public void setCity(String city)
        {
            this.city = city;
            validateCity();
        }

        public String getState()
        {
            return state;
        }

        public void setState(String state) throws ContactException
        {
            this.state = state;
            validateState();
        }

        public String getZip()
        {
            return zip;
        }

        public void setZip(String zip) throws ContactException
        {
            this.zip = zip;
            validateZip();
        }

        // toString method to display the fields in the class
        public String toString()
        {
            return street + ", " + city + ", " + state + ", " + zip;
        }

        public String toFile()
        {
            return street + "," + city + "," + state + "," + zip;
        }

        // validate methods added for Lab 7
        public final void validateStreet()
        {
            // if length longer than 10 characters, truncate it.
            street = street.length() <= 10 ? street : street.substring(0, 10);
        }

        public final void validateCity()
        {
            // make the first letter uppercase
            city = city.substring(0, 1).toUpperCase() + city.substring(1);
        }

        public final void validateState() throws ContactException
        {
            // change to uppercase
            state = state.toUpperCase();
            if (state.length() != 2)
            {
                throw new ContactException("State: Not 2 characters");
            }
        }

        public final void validateZip() throws ContactException
        {
            //use regex for match zip code
            if (!zip.matches("^\\d{5}$"))
            {
                throw new ContactException("Zip: Incorrect format");
//                zip = "Error";
            }
        }
    }

    public static enum ContactType
    {
        BUSINESS, FAMILY, FRIEND
    }

}
