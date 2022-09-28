package com.spring_jpa.springjpa.entity;

import lombok.*;

import javax.persistence.Embeddable;

@Embeddable
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class PersonalInformation {

    private  String email;
    private  String address;
    private  Long phoneno;

}
