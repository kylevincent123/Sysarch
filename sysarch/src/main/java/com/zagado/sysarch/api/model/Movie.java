package com.zagado.sysarch.api.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Movie")
public class Movie {

    private String title;
    private String url;

    public Movie() {

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}