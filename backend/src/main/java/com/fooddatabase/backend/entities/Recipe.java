package com.fooddatabase.backend.entities;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "recipe")
public class Recipe {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "id")
    private UUID id;

    @Column(name = "title")
    private String title;

    @Column(name = "image_url")
    private String imageUrl;

    @Column(name = "reference")
    private String reference;

    @Column(name = "portions")
    private int portions;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "ingredients_id", referencedColumnName = "id", nullable = false)
    @Fetch(FetchMode.SUBSELECT)
    private List<Ingredient> ingredients;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "steps_id", referencedColumnName = "id", nullable = false)
    @Fetch(FetchMode.SUBSELECT)
    private List<Step> steps;
}
