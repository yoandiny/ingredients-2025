CREATE TYPE payment_status AS ENUM ('UNPAID', 'PAID');

ALTER TABLE "order"
    ADD COLUMN payment_status payment_status NOT NULL DEFAULT 'UNPAID';

CREATE TABLE sale (
                      id serial PRIMARY KEY,
                      creation_datetime timestamp without time zone NOT NULL
);

ALTER TABLE "order"
    ADD COLUMN id_sale int UNIQUE,
  ADD CONSTRAINT order_id_sale_fkey FOREIGN KEY (id_sale) REFERENCES sale(id);