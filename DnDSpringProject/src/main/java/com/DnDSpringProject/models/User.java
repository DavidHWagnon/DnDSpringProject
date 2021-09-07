package com.DnDSpringProject.models;

import javax.persistence.*;



import java.util.List;

@Entity
@Table(name="Users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(nullable = false, length = 25)
    private String username;
    @Column(nullable = false)
    private String email;
    @Column(nullable = false)
    private String password;
    // @OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
    // private List<Character> characters;
    
    public User(){

    }

    public User(long id, String username, String email, String password){
        this.id=id;
        this.username = username;
        this.email=email;
        this.password=password;
    }

    // public User(long id, String username, String email, String password, List<Character> characters){
    //     this.id=id;
    //     this.username = username;
    //     this.email=email;
    //     this.password=password;
    //     this.characters=characters;
    // }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // public List<Character> getCharacters() {
    //     return characters;
    // }

    // public void setAds(List<Character> characters) {
    //     this.characters = characters;
    // }

    

}
