package com.softserve.edu.opencart.data;

interface IFirstname {
    ILastname setFirstname(String firstname);
}

interface ILastname {
    IEmail setLastname(String lastname);
}

interface IEmail {
    ITelephone setEmail(String email);
}

interface ITelephone {
    IAddress1 setTelephone(String telephone);
}

interface IAddress1 {
    ICity setAddress1(String address1);
}

interface ICity {
    IPostCode setCity(String city);
}

interface IPostCode {
    ICountry setPostCode(String postCode);
}

interface ICountry {
    IRegion setCountry(String country);
}

interface IRegion {
    IPassword setRegion(String region);
}

interface IPassword {
    INewsletter setPassword(String password);
}

interface INewsletter {
    IBuildUser setNewsletter(boolean newsletter);
}

interface IBuildUser {
    IBuildUser setFax(String fax);

    IBuildUser setCompany(String company);

    IBuildUser setAddress2(String address2);

    IUser build();
}

public class User implements IFirstname, ILastname, IEmail,
                    ITelephone, IAddress1, ICity, IPostCode,
                    ICountry, IRegion, IPassword, INewsletter,
                    IBuildUser, IUser {

    private String firstname;
    private String lastname;
    private String email;
    private String telephone;
    private String fax;
    private String company;
    private String address1;
    private String address2;
    private String city;
    private String postCode;
    private String country;
    private String region;
    private String password;
    private boolean newsletter;

    /*-
    public User(String firstname, String lastname, String email, String telephone, String fax, String company,
            String address1, String address2, String city, String postCode, String country, String region,
            String password, boolean newsletter) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.telephone = telephone;
        this.fax = fax;
        this.company = company;
        this.address1 = address1;
        this.address2 = address2;
        this.city = city;
        this.postCode = postCode;
        this.country = country;
        this.region = region;
        this.password = password;
        this.newsletter = newsletter;
    }
    //
    
    public User() {
    }
    */

    private User() {
        fax = "";
        company = "";
        address2 = "";
    }

    //public static User get() {
    public static IFirstname get() {
        return new User();
    }

    // setters

    //public void setFirstname(String firstname) {
    //public User setFirstname(String firstname) {
    public ILastname setFirstname(String firstname) {
        this.firstname = firstname;
        return this;
    }

    public IEmail setLastname(String lastname) {
        this.lastname = lastname;
        return this;
    }

    public ITelephone setEmail(String email) {
        this.email = email;
        return this;
    }

    public IAddress1 setTelephone(String telephone) {
        this.telephone = telephone;
        return this;
    }

    public IBuildUser setFax(String fax) {
        this.fax = fax;
        return this;
    }

    public IBuildUser setCompany(String company) {
        this.company = company;
        return this;
    }

    public ICity setAddress1(String address1) {
        this.address1 = address1;
        return this;
    }

    public IBuildUser setAddress2(String address2) {
        this.address2 = address2;
        return this;
    }

    public IPostCode setCity(String city) {
        this.city = city;
        return this;
    }

    public ICountry setPostCode(String postCode) {
        this.postCode = postCode;
        return this;
    }

    public IRegion setCountry(String country) {
        this.country = country;
        return this;
    }

    public IPassword setRegion(String region) {
        this.region = region;
        return this;
    }

    public INewsletter setPassword(String password) {
        this.password = password;
        return this;
    }

    public IBuildUser setNewsletter(boolean newsletter) {
        this.newsletter = newsletter;
        return this;
    }

    public IUser build() {
        return this;
    }

    // getters

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getEmail() {
        return email;
    }

    public String getTelephone() {
        return telephone;
    }

    public String getFax() {
        return fax;
    }

    public String getCompany() {
        return company;
    }

    public String getAddress1() {
        return address1;
    }

    public String getAddress2() {
        return address2;
    }

    public String getCity() {
        return city;
    }

    public String getPostCode() {
        return postCode;
    }

    public String getCountry() {
        return country;
    }

    public String getRegion() {
        return region;
    }

    public String getPassword() {
        return password;
    }

    public boolean isNewsletter() {
        return newsletter;
    }

}
