package org.example.plainObjects;

import lombok.Data;

@Data
public class Manual {

    String description = "";

    public void appendDescription(String str) {
        description += str;
    }

    @Override
    public String toString() {
        return description;
    }
}
