package com.makos.mvctodolist.domain;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

@Entity
@Table(name = "task")
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Size(max = 100, message = "description should be max 100 characters")
    @Column(name = "description")
    private String description;

    @Enumerated
    @Column(name = "status")
    private Status status;

}
