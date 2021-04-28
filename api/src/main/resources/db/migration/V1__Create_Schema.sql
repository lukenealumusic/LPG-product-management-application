create table category
(
    id          bigint not null
        primary key,
    name        varchar(255) not null
);


create table product
(
    id          bigint not null
        primary key,
    name        varchar(255) null,
    description varchar(255) null,
    category_id bigint not null,
    creation_date        varchar(255) null,
    updated_date         varchar(255) null,
    last_purchased_date         varchar(255) null,
    constraint Product_CategoryId
        foreign key (category_id) references category (id)
);
