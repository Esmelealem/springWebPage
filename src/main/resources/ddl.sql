CREATE TABLE account_document
(
    dtype VARCHAR(31) NOT NULL,
    id INT(11) PRIMARY KEY NOT NULL AUTO_INCREMENT,
    added DATETIME DEFAULT CURRENT_TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    modified DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    date DATETIME,
    number VARCHAR(255),
    gross_value DECIMAL(19,2),
    corrected_value DECIMAL(19,2),
    deliver_date DATE,
    discount_total DECIMAL(19,2),
    net DECIMAL(19,2),
    payment_term DATETIME,
    total DECIMAL(19,2),
    seller_id INT(11),
    return_contact_id INT(11),
    buyer_id INT(11),
    payment_type_id INT(11)
);
CREATE TABLE account_document_items
(
    accounting_document_id INT(11) NOT NULL,
    items_id INT(11) NOT NULL
);
CREATE TABLE address
(
    id INT(11) PRIMARY KEY NOT NULL AUTO_INCREMENT,
    added DATETIME DEFAULT CURRENT_TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    modified DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    city VARCHAR(255),
    flat_number VARCHAR(255),
    house_number VARCHAR(255),
    street VARCHAR(255),
    zip_code VARCHAR(255)
);
CREATE TABLE address_type
(
    id INT(11) PRIMARY KEY NOT NULL AUTO_INCREMENT,
    added DATETIME DEFAULT CURRENT_TIMESTAMP,
    modified DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    deleted DATETIME DEFAULT NULL,
    name VARCHAR(255)
);
CREATE TABLE contact
(
    id INT(11) PRIMARY KEY NOT NULL AUTO_INCREMENT,
    added DATETIME DEFAULT CURRENT_TIMESTAMP,
    modified DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    birth_date DATETIME,
    first_name VARCHAR(255),
    found_date DATETIME,
    last_name VARCHAR(255) NOT NULL,
    middle_name VARCHAR(255)
);
CREATE TABLE contact_address
(
    id INT(11) PRIMARY KEY NOT NULL AUTO_INCREMENT,
    added DATETIME DEFAULT CURRENT_TIMESTAMP,
    modified DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    address_id INT(11),
    address_type_id INT(11),
    contact_id INT(11)
);
CREATE TABLE contact_type
(
    id INT(11) PRIMARY KEY NOT NULL AUTO_INCREMENT,
    added DATETIME DEFAULT CURRENT_TIMESTAMP,
    modified DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    deleted DATETIME DEFAULT NULL,
    name VARCHAR(255)
);
CREATE TABLE item
(
    id INT(11) PRIMARY KEY NOT NULL AUTO_INCREMENT,
    added DATETIME DEFAULT CURRENT_TIMESTAMP,
    modified DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    discount DECIMAL(19,2),
    price DECIMAL(19,2),
    tax DECIMAL(19,2),
    unit_id INT(11)
);
CREATE TABLE menu
(
    id INT(11) PRIMARY KEY NOT NULL AUTO_INCREMENT,
    added DATETIME DEFAULT CURRENT_TIMESTAMP,
    modified DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    deleted DATETIME DEFAULT NULL,
    name VARCHAR(255),
    pos VARCHAR(255)
);
CREATE TABLE menu_item
(
    id INT(11) PRIMARY KEY NOT NULL AUTO_INCREMENT,
    added DATETIME DEFAULT CURRENT_TIMESTAMP,
    modified DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    deleted DATETIME DEFAULT NULL,
    name VARCHAR(255),
    display_name VARCHAR(255),
    href VARCHAR(255),
    menu_id INT(11)
);
CREATE TABLE payment_type
(
    id INT(11) PRIMARY KEY NOT NULL AUTO_INCREMENT,
    added DATETIME DEFAULT CURRENT_TIMESTAMP,
    modified DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    deleted DATETIME DEFAULT NULL,
    name VARCHAR(255)
);
CREATE TABLE post
(
    id INT(11) PRIMARY KEY NOT NULL AUTO_INCREMENT,
    added DATETIME DEFAULT CURRENT_TIMESTAMP,
    modified DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    place_holder VARCHAR(255),
    state INT(11),
    text VARCHAR(255),
    title VARCHAR(255)
);
CREATE TABLE section
(
    id INT(11) PRIMARY KEY NOT NULL AUTO_INCREMENT,
    added DATETIME DEFAULT CURRENT_TIMESTAMP,
    modified DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    name VARCHAR(255)
);
CREATE TABLE unit
(
    id INT(11) PRIMARY KEY NOT NULL AUTO_INCREMENT,
    added DATETIME DEFAULT CURRENT_TIMESTAMP,
    modified DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    deleted DATETIME DEFAULT NULL,
    name VARCHAR(255)
);
CREATE TABLE user
(
    id INT(11) PRIMARY KEY NOT NULL AUTO_INCREMENT,
    added DATETIME DEFAULT CURRENT_TIMESTAMP,
    modified DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    avatar VARCHAR(255),
    password VARCHAR(255),
    username VARCHAR(255)
);
ALTER TABLE account_document ADD FOREIGN KEY (seller_id) REFERENCES contact (id);
ALTER TABLE account_document ADD FOREIGN KEY (return_contact_id) REFERENCES contact (id);
ALTER TABLE account_document ADD FOREIGN KEY (buyer_id) REFERENCES contact (id);
ALTER TABLE account_document ADD FOREIGN KEY (payment_type_id) REFERENCES payment_type (id);
CREATE INDEX FK3e757gkrii9x2oicxo80fvo5a ON account_document (seller_id);
CREATE INDEX FKniiboshwdv9u3r69277iqkdn8 ON account_document (payment_type_id);
CREATE INDEX FKpwt08l1fohbgddtnf64951a7r ON account_document (buyer_id);
CREATE INDEX FKretbxu9jy6c0bvk11e6eoxaij ON account_document (return_contact_id);
ALTER TABLE account_document_items ADD FOREIGN KEY (accounting_document_id) REFERENCES account_document (id);
ALTER TABLE account_document_items ADD FOREIGN KEY (items_id) REFERENCES item (id);
CREATE INDEX FKm9i20pjrquq01h83q6gwj5qou ON account_document_items (accounting_document_id);
CREATE UNIQUE INDEX UK_ld14vgsx0h2olgfrw1shbkwa4 ON account_document_items (items_id);
ALTER TABLE contact_address ADD FOREIGN KEY (address_id) REFERENCES address (id);
ALTER TABLE contact_address ADD FOREIGN KEY (address_type_id) REFERENCES address_type (id);
ALTER TABLE contact_address ADD FOREIGN KEY (contact_id) REFERENCES contact (id);
CREATE INDEX FKa63wvjlxiwgo0098siqj9kjav ON contact_address (address_id);
CREATE INDEX FKqqxykpjj1qrgxle7cpp0txicc ON contact_address (contact_id);
CREATE INDEX FKt4o7iroammmtmat04ov3x6fc8 ON contact_address (address_type_id);
ALTER TABLE item ADD FOREIGN KEY (unit_id) REFERENCES unit (id);
CREATE INDEX FKdslletxhla0nehtlnmh63m2sj ON item (unit_id);
ALTER TABLE menu_item ADD FOREIGN KEY (menu_id) REFERENCES menu (id);
CREATE INDEX FKcdkmv42yhn6udah6ug8rsymfl ON menu_item (menu_id);

#########################001
ALTER TABLE seller.contact ADD PESEL VARCHAR(11) NULL;
CREATE UNIQUE INDEX contact_PESEL_uindex ON seller.contact (PESEL);
ALTER TABLE seller.contact ADD REGON VARCHAR(26) NULL;
CREATE UNIQUE INDEX contact_REGON_uindex ON seller.contact (REGON);
ALTER TABLE seller.contact ADD NIP VARCHAR(15) NULL;
CREATE UNIQUE INDEX contact_NIP_uindex ON seller.contact (NIP);
ALTER TABLE seller.contact ADD CONTACT_TYPE_ID INT NOT NULL;
ALTER TABLE seller.contact
    ADD CONSTRAINT contact_contact_type_id_fk
FOREIGN KEY (CONTACT_TYPE_ID) REFERENCES contact_type (id);
ALTER TABLE seller.contact
    MODIFY COLUMN added DATETIME AFTER birth_date;
ALTER TABLE seller.menu_item ADD SUBMENU_OF_ID INT NULL;