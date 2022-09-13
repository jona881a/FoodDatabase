package com.fooddatabase.backend.entities;

import com.fooddatabase.backend.enums.MeasureUnit;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "recipe_ingredient")
public class Ingredient {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator( name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "id")
    private UUID id;

    @OneToOne
    @JoinColumn(name = "food_id", referencedColumnName = "id")
    private IngredientFood ingredientFood;

    @Column(name = "quantity")
    private BigDecimal quantity;

    @Column(name = "measure_unit")
    @Enumerated(value = EnumType.STRING)
    private MeasureUnit measureUnitType;
}
