package com.sp.models;

import com.sp.utils.DocumentState;
import org.springframework.stereotype.Component;

import javax.ejb.Local;
import javax.persistence.*;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

@Component
@MappedSuperclass
public class Document {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(unique = true,nullable = false)
    private String number;

    @Column(nullable = false)
    private LocalDate creationDate;

    @Column()
    private LocalDate updateDate;

    @Column()
    private LocalDate expiryDate;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private DocumentState state;

    @Column(nullable = false)
    private int lengthInMonth;

    public Document(){

    }

    public Document(LocalDate creationTime, DocumentState state) {

        this.creationDate = creationTime;
        this.state = state;
        this.number = numberCreation();
        this.lengthInMonth = calculateLength();


    }

    private int calculateLength() {
        LocalDate startingDate = getCreationDate();
        LocalDate now = LocalDate.now();

        int length = Period.between(now, startingDate).getMonths();

        return length;

    }

    private String numberCreation() {

        String idPart = String.valueOf(id);
        String dayPart = String.valueOf(creationDate.getMonthValue());
        String monthPart = String.valueOf(creationDate.getDayOfMonth());
        String yearPart = String.valueOf(creationDate.getYear());

        return idPart + "/" + yearPart + monthPart + dayPart;

    }


    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }

    public LocalDate getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(LocalDate updateDate) {
        this.updateDate = updateDate;
    }

    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(LocalDate expiryDate) {
        this.expiryDate = expiryDate;
    }

    public DocumentState getState() {
        return state;
    }

    public void setState(DocumentState state) {
        this.state = state;
    }

    public int getLengthInMonth() {
        return lengthInMonth;
    }

    public void setLengthInMonth(int lengthInMonth) {
        this.lengthInMonth = lengthInMonth;
    }

    public int getId() {
        return id;
    }
}
