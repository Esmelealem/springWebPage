CREATE TABLE contrahent
(
    id BIGINT(20) PRIMARY KEY NOT NULL AUTO_INCREMENT,
    address VARCHAR(255) NOT NULL,
    joined DATETIME,
    name VARCHAR(255),
    nip VARCHAR(255),
    pesel VARCHAR(255),
    regon VARCHAR(255)
);
CREATE TABLE court
(
    id INT(11) PRIMARY KEY NOT NULL AUTO_INCREMENT,
    email VARCHAR(255),
    password VARCHAR(255),
    role VARCHAR(255)
);
CREATE TABLE document
(
    id BIGINT(20) PRIMARY KEY NOT NULL AUTO_INCREMENT,
    created DATETIME,
    payedby INT(11),
    contrahent_id BIGINT(20)
);
CREATE TABLE documentline
(
    id BIGINT(20) PRIMARY KEY NOT NULL AUTO_INCREMENT,
    discount DOUBLE,
    quantity INT(11),
    document_id BIGINT(20),
    item_id BIGINT(20)
);
CREATE TABLE item
(
    id BIGINT(20) PRIMARY KEY NOT NULL AUTO_INCREMENT,
    added DATETIME,
    buyPrice DECIMAL(19,2),
    ean VARCHAR(255),
    itemNote VARCHAR(255),
    name VARCHAR(255) NOT NULL,
    netPrice DECIMAL(19,2),
    photoPath VARCHAR(255),
    pkw VARCHAR(255),
    serialNumber VARCHAR(255),
    tax DECIMAL(19,2),
    unit VARCHAR(255)
);
CREATE TABLE mainmenuitem
(
    id INT(11) PRIMARY KEY NOT NULL AUTO_INCREMENT,
    cssClass VARCHAR(255),
    href VARCHAR(255),
    image VARCHAR(255),
    name VARCHAR(255),
    parent INT(11)
);
CREATE TABLE session
(
    id BIGINT(20) PRIMARY KEY NOT NULL AUTO_INCREMENT,
    expirationTime BIGINT(20),
    time BIGINT(20),
    userId BIGINT(20)
);
CREATE TABLE setting
(
    id INT(11) PRIMARY KEY NOT NULL AUTO_INCREMENT,
    added DATETIME,
    modified DATETIME,
    setingKey VARCHAR(255),
    settingValue VARCHAR(255)
);
CREATE TABLE test
(
    id INT(11) NOT NULL
);
CREATE TABLE user
(
    id BIGINT(20) PRIMARY KEY NOT NULL AUTO_INCREMENT,
    address VARCHAR(255),
    email VARCHAR(255),
    login VARCHAR(255),
    name VARCHAR(255),
    nip VARCHAR(255),
    password VARCHAR(255),
    pesel VARCHAR(255),
    surname VARCHAR(255)
);
ALTER TABLE document ADD FOREIGN KEY (contrahent_id) REFERENCES contrahent (id);
CREATE INDEX FK_fa5vkb0w25y0wvn82wogm825x ON document (contrahent_id);
ALTER TABLE documentline ADD FOREIGN KEY (document_id) REFERENCES document (id);
ALTER TABLE documentline ADD FOREIGN KEY (item_id) REFERENCES item (id);
CREATE INDEX FK_7u4abyjwf2ac41o9pug2ato35 ON documentline (item_id);
CREATE INDEX FK_c3nhnwwn7u743xc3fa50rec50 ON documentline (document_id);