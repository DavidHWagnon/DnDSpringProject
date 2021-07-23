package com.DnDSpringProject.models;

import javax.persistence.*;

@Entity
@Table(name="Characters")
public class Character {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    
//    @OneToOne(cascade = CascadeType.ALL, optional = false)
//    @JoinColumn(name = "user_id")
//    private long user_id;


    @Column(nullable = false, length = 140)
    private String title;

    @Column(nullable = false)
    private String description;
    
    @Column(nullable = false)
    private int strength;
    
    @Column(nullable = false)
    private int dexterity;

    @Column(nullable = false)
    private int constitution;
    
    @Column(nullable = false)
    private int intelligence;
    
    @Column(nullable = false)
    private int wisdom;
    
    @Column(nullable = false)
    private int charisma;

	public Character(long id, long user_id, String title, String description, int strength, int dexterity,
			int constitution, int intelligence, int wisdom, int charisma) {
		super();
		this.id = id;
//		this.user_id = user_id;
		this.title = title;
		this.description = description;
		this.strength = strength;
		this.dexterity = dexterity;
		this.constitution = constitution;
		this.intelligence = intelligence;
		this.wisdom = wisdom;
		this.charisma = charisma;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

//	public long getUser_id() {
//		return user_id;
//	}
//
//	public void setUser_id(long user_id) {
//		this.user_id = user_id;
//	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	public int getDexterity() {
		return dexterity;
	}

	public void setDexterity(int dexterity) {
		this.dexterity = dexterity;
	}

	public int getConstitution() {
		return constitution;
	}

	public void setConstitution(int constitution) {
		this.constitution = constitution;
	}

	public int getIntelligence() {
		return intelligence;
	}

	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}

	public int getWisdom() {
		return wisdom;
	}

	public void setWisdom(int wisdom) {
		this.wisdom = wisdom;
	}

	public int getCharisma() {
		return charisma;
	}

	public void setCharisma(int charisma) {
		this.charisma = charisma;
	}
    

    
    

   
}