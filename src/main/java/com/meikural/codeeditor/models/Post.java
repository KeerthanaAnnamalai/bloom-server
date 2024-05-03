package com.meikural.codeeditor.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.UuidGenerator;

import java.util.Date;
import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "posts", uniqueConstraints = {
        @UniqueConstraint(columnNames = "url")
})
public class Post {

    @Id
    @GeneratedValue(generator = "UUID", strategy = GenerationType.UUID)
    @UuidGenerator
    private UUID id;

    private String context;

    @Column(unique = true)
    private String url;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "created_at")
    private Date createdAt;

    @ManyToOne
    @JoinColumn(name = "author_id", referencedColumnName = "id")
    private User author;
}
