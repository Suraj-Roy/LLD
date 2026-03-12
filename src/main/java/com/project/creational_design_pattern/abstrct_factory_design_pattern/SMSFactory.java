package com.project.creational_design_pattern.abstrct_factory_design_pattern;

import com.project.creational_design_pattern.factory_design_pattern.NotificationService;
import com.project.creational_design_pattern.factory_design_pattern.SMS;

public class SMSFactory implements NotificationFactory{

    @Override
    public NotificationService getObject() {
        return new SMS();
    }

}
