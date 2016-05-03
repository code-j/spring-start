package com.myspring.ruby.model;

/**
 * Created by woohyunjo on 2016-05-03.
 */
public class TemplateModel {
    String templateName;

    public TemplateModel(String templateName) {
        this.templateName = templateName;
    }

    public String getTemplateName() {
        return templateName;
    }

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }
}
