CREATE TABLE customers
(
    property_id      VARCHAR(80)  NOT NULL,
    customer_id      VARCHAR(40)  NOT NULL,
    customer_email   VARCHAR(100) NOT NULL,
    customer_phone   VARCHAR(20)  NOT NULL,
    customer_address VARCHAR(200) NOT NULL,
    is_active        TINYINT NULL,
    CONSTRAINT pk_customers PRIMARY KEY (property_id)
);

ALTER TABLE customers
    ADD CONSTRAINT uc_customers_customer_email UNIQUE (customer_email);