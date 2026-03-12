package com.project.creational_design_pattern.factory_design_pattern;

public class NotificationFactory {

    public static  NotificationService getServiceType(ServiceType type){
        if(type==ServiceType.SMS){
            return new SMS();
        }
        else if(type==ServiceType.EMAIL){
            return new Email();
        }
        else{
            throw new IllegalArgumentException("Unknown Notification type");
        }
    }
}
