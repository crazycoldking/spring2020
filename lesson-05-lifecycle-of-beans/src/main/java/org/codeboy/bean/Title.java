package org.codeboy.bean;

public class Title {
    private String str = "No title";

    public Title(String str) {
        this.str = str;
    }

    public Title() {
    }

    @Override
    public String toString() {
        return "Title{" +
                "str='" + str + '\'' +
                '}';
    }
}
