package kr.gymbuddyback.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class InterestedEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

}
