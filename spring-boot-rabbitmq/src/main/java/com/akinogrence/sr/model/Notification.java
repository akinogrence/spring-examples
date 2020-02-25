package com.akinogrence.sr.model;

import javax.xml.crypto.Data;
import java.io.Serializable;
import java.util.Date;

public class Notification implements Serializable {


    private String id;
    private Date CreatedAt;
    private Boolean seen;
    private String message;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getCreatedAt() {
        return CreatedAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.CreatedAt = createdAt;
    }

    public Boolean getSeen() {
        return seen;
    }

    public void setSeen(Boolean seen) {
        this.seen = seen;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "Notification{" +
                "id='" + id + '\'' +
                ", createdAd=" + CreatedAt +
                ", seen=" + seen +
                ", message='" + message + '\'' +
                '}';
    }
}
