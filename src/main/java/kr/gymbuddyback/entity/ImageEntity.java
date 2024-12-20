package kr.gymbuddyback.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class ImageEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "original_filename")
    private String originalFilename;

    @Column(name = "stored_filename")
    private String storedFilename;

    @Column(name = "extend")
    private String extend;

    @Column(name = "file_path")
    private String filePath;
}
