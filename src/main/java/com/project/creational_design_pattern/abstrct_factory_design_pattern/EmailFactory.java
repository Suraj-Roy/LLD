package com.project.creational_design_pattern.abstrct_factory_design_pattern;


import com.project.creational_design_pattern.factory_design_pattern.Email;
import com.project.creational_design_pattern.factory_design_pattern.NotificationService;

public class EmailFactory implements NotificationFactory {
    @Override
    public NotificationService getObject() {
        return new Email();
    }
}
