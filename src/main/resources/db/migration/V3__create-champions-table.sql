CREATE EXTENSION IF NOT EXISTS "uuid-ossp";

CREATE TABLE champions(
    id UUID PRIMARY KEY DEFAULT uuid_generate_v4(),
    city_id INTEGER NOT NULL,
    name varchar(255) NOT NULL,
    class varchar(50) NOT NULL,
    lane TEXT[] NOT NULL,
    tier varchar(1) NOT NULL,
    FOREIGN KEY (city_id) REFERENCES cities(id) ON DELETE CASCADE
);