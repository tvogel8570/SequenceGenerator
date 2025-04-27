create sequence descendant_one_id_seq minvalue 1 increment 1;
create sequence descendant_two_id_seq minvalue 1 increment 1;

CREATE TABLE descendant_one
(
    id      bigint,
    version integer,
    name    varchar
);

CREATE TABLE descendant_two
(
    id      bigint,
    version integer,
    model    varchar
);
