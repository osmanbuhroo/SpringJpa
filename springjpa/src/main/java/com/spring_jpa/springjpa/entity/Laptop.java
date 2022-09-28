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


public class Laptop {
    @Id
    @GeneratedValue (strategy =  GenerationType.AUTO)
    private   Long laptopId;

    private  String laptopmodle;
    @OneToOne(
            cascade = CascadeType.ALL
//            mappedBy = "laptop"
    )
    @JoinColumn(
            name = "josh_Id",
            referencedColumnName = "joshId"
    )
    private  JoshEmplyee joshEmplyee;
}
