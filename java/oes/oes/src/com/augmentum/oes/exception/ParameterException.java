package com.augmentum.oes.exception;

import java.util.HashMap;
import java.util.Map;

public class ParameterException extends Exception{
    private static final long serialVersionUID = 4901092369474213036L;

    //create a Map to storage error message about userName and password
    Map<String, String> errorMap = new HashMap<String, String>();

    public Map<String, String> getMap() {
        return errorMap;
    }

    public Map<String, String> getErrorMap() {
        return errorMap;
    }

    public void setErrorMap(Map<String, String> errorMap) {
        this.errorMap = errorMap;
    }

    public void addErrorMessage(String errorName, String errorValue) {
        errorMap.put(errorName, errorValue);
    }

    public boolean isFiledError() {
        return !errorMap.isEmpty();
    }
}
