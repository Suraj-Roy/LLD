package com.project.creational_design_pattern.factory_design_pattern;

public class Main {

    public static void main(String[] args) {

//            by using it we get rif od the creating object every where manually,
//                 in case of any changes it wold required lots of effort
            NotificationService smsObj = NotificationFactory.getServiceType(ServiceType.SMS);

            NotificationService emailObj = NotificationFactory.getServiceType(ServiceType.EMAIL);

            smsObj.sendNotification();

            emailObj.sendNotification();



    }
}
