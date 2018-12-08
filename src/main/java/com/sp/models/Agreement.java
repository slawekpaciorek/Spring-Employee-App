package com.sp.models;

import com.sp.utils.AgreementType;
import com.sp.utils.DocumentState;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.time.LocalDate;

@Component
@Entity
@Table(name = "agreements")
public class Agreement extends Document {


    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private AgreementType agreementType;

    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    private String role;

    public Agreement() {

    }

    public Agreement(LocalDate creationTime, DocumentState state, AgreementType type, String description, String role, int length) {

        super(creationTime, state);

        this.agreementType = type;
        this.description = description;
        this.role = role;
    }


    public AgreementType getAgreementType() {
        return agreementType;
    }

    public void setAgreementType(AgreementType type) {
        this.agreementType = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

}
