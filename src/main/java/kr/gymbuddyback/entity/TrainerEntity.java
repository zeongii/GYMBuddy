package kr.gymbuddyback.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class TrainerEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "user_id")
    private Long userId;

    @Column(name = "team")
    private String team;

    @Column(name = "position")
    private String position;

    @Column(name = "history")
    private String history;

    @Column(name = "career")
    private String career;

}
