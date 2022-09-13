package com.fooddatabase.backend.entities;

import com.fooddatabase.backend.enums.FoodType;
import com.fooddatabase.backend.enums.StoreName;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "ingredient_food")
public class IngredientFood {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "id")
    private UUID id;

    @Column(name = "name")
    private String name;

    @Column(name = "brand")
    private String brand;

    @Column(name = "from_store")
    @Enumerated(value = EnumType.STRING)
    private StoreName storeName;

    @Column(name = "food_type")
    @Enumerated(value = EnumType.STRING)
    private FoodType foodType;

    @Column(name = "kcal_pr_hundred_g")
    private BigDecimal kcalPrHundredG;

    @Column(name = "protein")
    private BigDecimal protein;

    @Column(name = "fat")
    private BigDecimal fat;

    @Column(name = "carbohydrates")
    private BigDecimal carbohydrates;
}
