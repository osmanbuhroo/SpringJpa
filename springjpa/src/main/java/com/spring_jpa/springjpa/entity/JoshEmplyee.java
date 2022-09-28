package com.spring_jpa.springjpa.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class JoshEmplyee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long joshId;

    private  String Name;

    @Embedded
    private  PersonalInformation personalInformation;


    @OneToOne(
//            mappedBy = "joshEmplyee"
    )
    @JoinColumn(

            name = "laptop_Id",
            referencedColumnName = "laptopId"
    )
    private Laptop laptop;


}
