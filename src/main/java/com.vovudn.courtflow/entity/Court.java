package com.vovudn.courtflow.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Getter
@Setter
@Entity
@Table(name = "courts")
public class Court {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "venue_id", nullable = false)
    private Venue venue;

    @Size(max = 50)
    @NotNull
    @Column(name = "court_name", nullable = false, length = 50)
    private String courtName;

    @NotNull
    @Lob
    @Column(name = "sport_type", nullable = false)
    private String sportType;

    @ColumnDefault("'AVAILABLE'")
    @Lob
    @Column(name = "status")
    private String status;

}