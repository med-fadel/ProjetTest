package com.polytech.business;

/**
 * Created by dev on 3/13/17.
 */
public class Post {

    private String content;

    public Post(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return content;
    }
}
