package com.project.creational_design_pattern.abstrct_factory_design_pattern;

import com.project.creational_design_pattern.factory_design_pattern.NotificationService;

public class Main {

    public static void main(String[] args) {
        //abstract factory decouples object creation as changes in one requires changes
        // its specific class not where every one is present
        NotificationFactory smsFactoryObj = new SMSFactory();
        NotificationFactory EmailFactoryObj = new EmailFactory();


        NotificationService smsObj = smsFactoryObj.getObject();
        NotificationService emailObj = EmailFactoryObj.getObject();


        smsObj.sendNotification();

        emailObj.sendNotification();



    }
}
