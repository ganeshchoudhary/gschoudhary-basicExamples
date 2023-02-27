package com.gschoudhary.design.patterns.structural.pipe_filters;

public class StringFilter implements Filter<String, String> {

    @Override
    public String execute(String input) {
        return input.replaceAll("\\s","");
    }

}