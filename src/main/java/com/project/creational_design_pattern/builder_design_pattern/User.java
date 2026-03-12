package com.project.creational_design_pattern.builder_design_pattern;

public class User {

    private Integer id;

    private String name;

    private String email;

    private Integer age;

    private Integer phone;

    private String address;

    private User(Builder builder){
        this.id = builder.id;
        this.name = builder.name;
        this.email = builder.email;
        this.age = builder.age;
        this.phone = builder.phone;
        this.address = builder.address;

    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public Integer getAge() {
        return age;
    }

    public Integer getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", phone=" + phone +
                ", address='" + address + '\'' +
                '}';
    }

    public static class Builder{
        private Integer id;

        private String name;

        private String email;

        private Integer age;

        private Integer phone;

        private String address;

        public Builder(Integer id, String name) {
            this.id = id;
            this.name = name;
        }

        public Builder setEmail(String email){
            this.email = email;
            return this;
        }

        public Builder setAge(Integer age){
            this.age = age;
            return this;
        }

        public Builder setPhone(Integer phone){
            this.phone = phone;
            return this;
        }

        public Builder setAddress(String address){
            this.address = address;
            return this;
        }

        public User build(){
            return new User(this);
        }


    }


}
