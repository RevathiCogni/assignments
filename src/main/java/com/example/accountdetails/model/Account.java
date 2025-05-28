package com.example.accountdetails.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="account")
@Data
@Getter
@Setter
public class Account {
    @Id
    private String accountNumber;
    private String accountHolderName;
    private String currency;
    private String branch;
}
