package com.project.creational_design_pattern.abstrct_factory_design_pattern;

public class SMS implements NotificationService {

    @Override
    public void sendNotification() {
        System.out.println("Notification is sent through SMS");
    }
}
