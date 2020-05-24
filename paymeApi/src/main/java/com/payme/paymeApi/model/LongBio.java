package com.payme.paymeApi.model;

import javax.validation.constraints.Size;

public class LongBio {

    @Size(max = 2000)
    String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
