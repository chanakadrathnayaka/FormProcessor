package com.iamchanaka;

public class FormProcessor {

  public static void processFormField(String type) {
    FormFieldType formType = FormFieldType.getType(type);
    formType.process();
  }
}
