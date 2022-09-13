create table
    recipe
(
    id binary(16) primary key not null,
    title varchar(50) not null,
    image_url varchar(1000) not null,
    reference varchar(100),
    portions int,
    ingredients_id binary(16) not null,
    steps_id binary(16) not null,
    nutrition_id binary(16) not null,
    tags_id binary(16) not null
);

create table
    recipe_ingredient
(
    id binary(16) primary key not null,
    name varchar(50) not null,
    type varchar(50) not null,
    quantity decimal(9,2) not null,
    measure_unit varchar(50) not null
);

create table
    recipe_step
(
    id binary(16) primary key not null,
    step_number int not null,
    step_description varchar(1000) not null
);

create table
    tag
(
    id binary(16) primary key not null,
    tag_name varchar(50)
);

alter table
    recipe
    add constraint
        fk__recipe__recipe_ingredient
        foreign key
            (ingredients_id)
            references
                recipe_ingredient(id)
            on update cascade
            on delete cascade,
add constraint
    fk__recipe__recipe_step
foreign key
    (steps_id)
references
    recipe_step(id)
on update cascade
   on delete cascade;