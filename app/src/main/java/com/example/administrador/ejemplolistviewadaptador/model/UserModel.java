package com.example.administrador.ejemplolistviewadaptador.model;

/**
 * Created by Administrador on 16/05/2017.
 */

public class UserModel {

    public UserModel(int userId, int id, String title, String body) {
        this.userId = userId;
        this.id = id;
        this.title = title;
        this.body = body;
    }

    public UserModel() {
    }

    private int id;
    private int userId;
    private String title;
    private String body;

    public int getUserId() { return this.userId; }

    public void setUserId(int userId) { this.userId = userId; }

    public int getId() { return this.id; }

    public void setId(int id) { this.id = id; }

    public String getTitle() { return this.title; }

    public void setTitle(String title) { this.title = title; }

    public String getBody() { return this.body; }

    public void setBody(String body) { this.body = body; }

}
