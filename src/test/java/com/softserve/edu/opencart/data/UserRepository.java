package com.softserve.edu.opencart.data;

import java.util.List;

public final class UserRepository {
    private static volatile UserRepository instance = null;
    
    private UserRepository() {
    }
    
    public static UserRepository get() {
        if (instance == null) {
            synchronized (UserRepository.class) {
                if (instance == null) {
                    instance = new UserRepository();
                }
            }
        }
        return instance;
    }
    
    public IUser getDefault() {
        return getHahaha();
    }
    
    public IUser getHahaha() {
//      return new User("hahaha@gmail.com", "hahaha",
//              System.getenv().get("MY_PASSWORD"));
        return User.get()
                .setFirstname("hahaha")
                .setLastname("hahaha")
                .setEmail("hahaha@gmail.com")
                .setTelephone("telephone_7")
                .setAddress1("address1_7")
                .setCity("city_7")
                .setPostCode("postCode_7")
                .setCountry("country_7")
                .setRegion("regionState_7")
                .setPassword("qwerty")
                //.setPassword(System.getenv().get("MY_PASSWORD"))
                .setNewsletter(true)
                .setFax("fax_7")
                .setCompany("company_7")
                .setAddress2("address2_7")
                .build();
    }
    
    public IUser getAdmin() {
//      return new User("hahaha@gmail.com", "123",
//              System.getenv().get("MY_PASSWORD"));
        return User.get()
                .setFirstname("admin")
                .setLastname("hahaha")
                .setEmail("hahaha@gmail.com")
                .setTelephone("telephone_5")
                .setAddress1("address1_5")
                .setCity("city_5")
                .setPostCode("postCode_5")
                .setCountry("country_5")
                .setRegion("regionState_5")
                .setPassword(System.getenv().get("ADMIN_PASSWORD"))
                .setNewsletter(true)
                .setFax("fax_5")
                .setCompany("company_5")
                .setAddress2("address2_5")
                .build();
    }

    public IUser getInvalid() {
        return User.get()
                .setFirstname("hahaha1")
                .setLastname("hahaha1")
                .setEmail("hahaha1@gmail.com")
                .setTelephone("telephone_5")
                .setAddress1("address1_5")
                .setCity("city_5")
                .setPostCode("postCode_5")
                .setCountry("country_5")
                .setRegion("regionState_5")
                .setPassword(System.getenv().get("MY_PASSWORD"))
                .setNewsletter(true)
                .setFax("fax_5")
                .setCompany("company_5")
                .setAddress2("address2_5")
                .build();
    }

    /*-
    public List<IUser> fromCsv(String filename) {
        return User.getByLists(new CSVReader(filename).getAllCells());
    }

    public List<IUser> fromCsv() {
        return fromCsv("users.csv");
    }

    public List<IUser> fromExcel(String filename) {
        return User.getByLists(new ExcelReader(filename).getAllCells());
    }

    public List<IUser> fromExcel() {
        return fromExcel("users.xlsx");
    }
    */
    
}
