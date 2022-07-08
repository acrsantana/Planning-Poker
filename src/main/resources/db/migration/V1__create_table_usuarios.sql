CREATE TABLE usuarios
(
    id              serial4        NOT NULL,
    nome            varchar        NOT NULL,
    email           varchar UNIQUE NOT NULL,
    data_nascimento date,
    senha           varchar        NOT NULL,
    visivel         bool           NOT NULL,
    data_criacao    date           NOT NULL,
    CONSTRAINT usuarios_pk
        PRIMARY KEY (id)
);
