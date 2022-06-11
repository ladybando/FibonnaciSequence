CREATE TABLE IF NOT EXISTS items (
  id                     VARCHAR(60)  DEFAULT RANDOM_UUID() PRIMARY KEY,
  name                   VARCHAR      NOT NULL
    price                VARCHAR      NOT NULL
    quantity             VARCHAR      NOT NULL
);