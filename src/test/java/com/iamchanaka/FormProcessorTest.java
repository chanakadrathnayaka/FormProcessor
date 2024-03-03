package com.iamchanaka;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FormProcessorTest {

  @Test
  public void createExistingFormFields() {
    List<String> formFields = Arrays.asList("TEXT", "SELECT", "NUMBER");
    for (String formField : formFields) {
      FormProcessor.processFormField(formField);
    }
  }

  @Test
  public void createNonExistingFormFields() {
    Assertions.assertThrows(IllegalArgumentException.class,
        () -> FormProcessor.processFormField("DATE"));
  }
}