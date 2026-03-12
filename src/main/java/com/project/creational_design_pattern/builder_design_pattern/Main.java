package com.project.creational_design_pattern.builder_design_pattern;

public class Main {

    public static void main(String[] args) {
        User userObj = new User.Builder(1,"Suraj")
                .setEmail("roysuraj365.5@gmail.com")
                .setAge(24)
                .build();

        System.out.println(userObj);

    }
}
