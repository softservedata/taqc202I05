package com.softserve.edu.opencart.data;

public class AppData {

    public static void main(String[] args) {
        /*-
        // 1. Use Constructor
        User user = new User("firstname_1", "lastname_1", "email_1",
                "telephone_1",  "fax_1", "company_1",
                "address1_1", "address2_1", "city_1",
                "postCode_1", "country_1", "region_1",
                "password_1", true);
        System.out.println("email = " + user.getEmail());
        //
        // 2. Default Constructor & setters
        User user = new User();
        user.setFirstname("firstname_2");
        user.setLastname("lastname_2");
        user.setEmail("email_2");
        user.setTelephone("telephone_2");
        user.setFax("fax_2");
        user.setCompany("company_2");
        user.setAddress1("address1_2");
        user.setAddress2("address2_2");
        user.setCity("city_2");
        user.setPostCode("postCode_2");
        user.setCountry("country_2");
        user.setRegion("region_2");
        user.setPassword("password_2");
        user.setNewsletter(true);
        System.out.println("email = " + user.getEmail());
        //
        // 3. Add Fluent Interface
        User user = new User()
            .setFirstname("firstname_3")
            .setLastname("lastname_3")
            .setEmail("email_3")
            .setTelephone("telephone_3")
            .setFax("fax_3")
            .setCompany("company_3")
            .setAddress1("address1_3")
            .setAddress2("address2_3")
            .setCity("city_3")
            .setPostCode("postCode_3")
            .setCountry("country_3")
            .setRegion("region_3")
            .setPassword("password_3")
            .setNewsletter(true);
        System.out.println("email = " + user.getEmail());
        //
        // 4. Add Static Factory
        User user = User.get()
                .setFirstname("firstname_4")
                .setLastname("lastname_4")
                .setEmail("email_4")
                .setTelephone("telephone_4")
                .setFax("fax_4")
                .setCompany("company_4")
                .setAddress1("address1_4")
                .setAddress2("address2_4")
                .setCity("city_4")
                .setPostCode("postCode_4")
                .setCountry("country_4")
                .setRegion("region_4")
                .setPassword("password_4")
                .setNewsletter(true);
            System.out.println("email = " + user.getEmail());
        //
        // 5. Add Builder
        User user = User.get()
                .setFirstname("firstname_5")
                .setLastname("lastname_5")
                .setEmail("email_5")
                .setTelephone("telephone_5")
                .setAddress1("address1_5")
                .setCity("city_5")
                .setPostCode("postCode_5")
                .setCountry("country_5")
                .setRegion("region_5")
                .setPassword("password_5")
                .setNewsletter(true)
                .setFax("fax_5")
                .build();
        System.out.println("email = " + user.getEmail());
        //
        System.out.println("email = " + user.setEmail(""));
        //
        System.out.println("email = " + user.getEmail());
        //
        // 6. Dependecy Inversion
        IUser user = User.get()
                .setFirstname("firstname_6")
                .setLastname("lastname_6")
                .setEmail("email_6")
                .setTelephone("telephone_6")
                .setAddress1("address1_6")
                .setCity("city_6")
                .setPostCode("postCode_6")
                .setCountry("country_6")
                .setRegion("region_6")
                .setPassword("password_6")
                .setNewsletter(true)
                .setFax("fax_6")
                .build();
        System.out.println("email = " + user.getEmail());
        //
        // System.out.println("email = " + user.setEmail("")); // Compile Error
        System.out.println("email = " + ((User) user).setEmail("")); // Code Smell
        //
        System.out.println("email = " + user.getEmail());
        */
        // 7. Add Repository & Singletone
        IUser user = UserRepository.get().getDefault();
        System.out.println("email = " + user.getEmail());
    }

}
