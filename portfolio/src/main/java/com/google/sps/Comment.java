package com.google.sps;
public class Comment{
    private String commenter;
    private String comment;

    public Comment(String commenter, String comment) {
        this.commenter = commenter;
        this.comment = comment;
    }

    public String getComment(){
        return comment;
    }
    public String getCommenter(){
        return commenter;
    }
}