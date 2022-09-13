alter table
    recipe_ingredient
drop column
    name,
drop column
    type;

create table ingredient_food(
   id binary(16) primary key not null,
   name varchar(100) not null,
   brand varchar(100),
   from_store varchar(100),
   food_type varchar(100) not null,
   kcal_pr_hundred_g decimal(9,2),
   protein decimal(9,2),
   fat decimal(9,2),
   carbohydrates decimal(9,2)
);

alter table
    recipe_ingredient
add column
    food_id binary(16) not null,
add constraint
    fk__recipe_ingredient__ingredient_food
foreign key
    (food_id)
references
    ingredient_food(id)
on update no action
on delete no action;
