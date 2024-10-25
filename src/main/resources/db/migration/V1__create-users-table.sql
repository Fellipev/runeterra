CREATE EXTENSION IF NOT EXISTS "uuid-ossp";

CREATE TABLE "user" (
    id UUID PRIMARY KEY DEFAULT uuid_generate_v4(),
    login varchar(255) NOT NULL,
    password varchar(255) NOT NULL,
    role varchar(5) NOT NULL
);