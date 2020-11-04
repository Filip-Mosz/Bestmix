package com.filipmoszczynski.module.references.reference;

public class ReferenceDto {

    private String author;
    private String link;
    private String content;
    private String photo;

    public String getAuthor() {
        return author;
    }

    public ReferenceDto setAuthor(String author) {
        this.author = author;
        return this;
    }

    public String getLink() {
        return link;
    }

    public ReferenceDto setLink(String link) {
        this.link = link;
        return this;
    }

    public String getContent() {
        return content;
    }

    public ReferenceDto setContent(String content) {
        this.content = content;
        return this;
    }

    public String getPhoto() {
        return photo;
    }

    public ReferenceDto setPhoto(String photo) {
        this.photo = photo;
        return this;
    }
}
