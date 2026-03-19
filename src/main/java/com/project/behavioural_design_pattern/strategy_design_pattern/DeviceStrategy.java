package com.project.behavioural_design_pattern.strategy_design_pattern;

public class DeviceStrategy {

    public UiService uiService;

    public DeviceStrategy(UiService uiService) {
        this.uiService = uiService;
    }

    public void renderUi(){
        uiService.createButton();
        uiService.createCheckBox();
    }

}
