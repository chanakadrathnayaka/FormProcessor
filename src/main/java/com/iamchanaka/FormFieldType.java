package com.iamchanaka;

import java.util.HashMap;
import java.util.Map;

public enum FormFieldType implements Processable {
  TEXT() {
    @Override
    public void process() {
      System.out.println("Processing TEXT input");
    }
  },
  NUMBER() {
    @Override
    public void process() {
      System.out.println("Processing NUMBER input");
    }
  },
  SELECT() {
    @Override
    public void process() {
      System.out.println("Processing SELECT input");
    }
  };

  private final static Map<String, FormFieldType> forms = new HashMap<>();

  static {
    for (FormFieldType type : FormFieldType.values()) {
      forms.put(type.name(), type);
    }
  }

  public static FormFieldType getType(String type) {
    FormFieldType formType = forms.get(type);
    if (formType == null) {
      throw new IllegalArgumentException("Form type: " + type + "doesn't exist");
    }
    return formType;
  }
}
