package com.project.behavioural_design_pattern.strategy_design_pattern;

public class Mac implements UiService{

    @Override
    public void createButton() {
           System.out.println("Button for the Mac is created.");
    }

    @Override
    public void createCheckBox() {
        System.out.println("CheckBox for the Mac is created.");
    }
}
