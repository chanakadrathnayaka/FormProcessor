package com.iamchanaka;

public class FormProcessor {

  public static void processForm(String type) {
    FormFieldType formType = FormFieldType.getType(type);
    formType.process();
  }
}
