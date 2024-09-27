CREATE TABLE IF NOT EXISTS exchange
(
    id    BIGSERIAL PRIMARY KEY ,
    exchange_from  VARCHAR(200) NOT NULL ,
    exchange_to VARCHAR(254) NOT NULL ,
    exchange_rate decimal  NOT NULL
);