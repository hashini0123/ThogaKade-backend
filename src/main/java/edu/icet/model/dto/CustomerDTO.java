package edu.icet.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CustomerDTO {
    private String custID;
    private String custName;
    private String custTitle;
    private LocalDate DOB;
    private double salary;
    private String custAddress;
    private String city;
    private String province;
    private String postalcode;
}
