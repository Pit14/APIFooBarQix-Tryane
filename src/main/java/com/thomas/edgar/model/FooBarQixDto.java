package com.thomas.edgar.model;

/**
 * This class will be used as a Data Transfer Object of a FooBarQix
 * Each object have two fields, an input and an output
 */
public class FooBarQixDto {

    private String input;
    private String output;

    public FooBarQixDto(String input, String output) {
        this.input = input;
        this.output = output;
    }

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    public String getOutput() {
        return output;
    }

    public void setOutput(String output) {
        this.output = output;
    }
}