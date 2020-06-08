package br.maua.models;

public abstract class Membro {
    private String username;
    private String rank;

    @Override
    public String toString() {
        return "Member{" +
                "username='" + username + '\'' +
                ", rank='" + rank + '\'' +
                '}';
    }

    public Membro(String username, String rank) {
        this.username = username;
        this.rank = rank;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
