package com.payme.paymeApi.model;

import javax.validation.constraints.Size;

public class ShortBio {

    @Size(max = 500)
    String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

}
