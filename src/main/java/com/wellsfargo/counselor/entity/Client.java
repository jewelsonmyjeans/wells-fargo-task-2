package com.wellsfargo.counselor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Client {

    
    @Id
    @GeneratedValue()
    private long clientId;

    @Column(nullable=false)
    private String firstName;

    @Column(nullable= false)
    private String lastName;

    @Column(nullable=false)
    private String email;

    @Column(nullable=false)
    private String phoneNumber;

    
    @Column(nullable=false)
    private String address;


    @ManyToOne
    private Advisor advisor;


// Constructors
    protected Client(){
    }

   public Client(long clientId, String firstName, String lastName, String email, String phoneNumber, String address, Advisor advisor) {
        this.clientId = clientId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.advisor = advisor;
    }

//Getter and setters
public long getId(){
    return this.clientId;
}


        public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
      public String getLastName() {
        return lastName;
    }


    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
        public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }



    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getAddress() {
        return address;
    }


    public void setAddress(String address) {
        this.address = address;
    }
    public Advisor getAdvisor() {
        return advisor;
    }

    public void setAdvisor(Advisor advisor) {
        this.advisor = advisor;
    }
}