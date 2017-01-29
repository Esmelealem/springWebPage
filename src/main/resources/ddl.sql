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
#########################002
CREATE TABLE `seller`.`country` (
    `id` INT NOT NULL AUTO_INCREMENT,
    `name` VARCHAR(255) NULL,
    `added` DATETIME NULL DEFAULT CURRENT_TIMESTAMP,
    `modified` DATETIME NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    `deleted` DATETIME NULL,
    PRIMARY KEY (`id`))
    ENGINE = InnoDB
    DEFAULT CHARACTER SET = utf8;

INSERT INTO `seller`.`country` (`name`) VALUES ('Abchazja');
INSERT INTO `seller`.`country` (`name`) VALUES ('Afganistan');
INSERT INTO `seller`.`country` (`name`) VALUES ('Albania');
INSERT INTO `seller`.`country` (`name`) VALUES ('Algieria');
INSERT INTO `seller`.`country` (`name`) VALUES ('Andora');
INSERT INTO `seller`.`country` (`name`) VALUES ('Angola');
INSERT INTO `seller`.`country` (`name`) VALUES ('Antigua I Barbuda');
INSERT INTO `seller`.`country` (`name`) VALUES ('Arabia Saudyjska');
INSERT INTO `seller`.`country` (`name`) VALUES ('Argentyna');
INSERT INTO `seller`.`country` (`name`) VALUES ('Armenia');
INSERT INTO `seller`.`country` (`name`) VALUES ('Australia');
INSERT INTO `seller`.`country` (`name`) VALUES ('Austria');
INSERT INTO `seller`.`country` (`name`) VALUES ('Azerbejdżan');
INSERT INTO `seller`.`country` (`name`) VALUES ('Bahamy');
INSERT INTO `seller`.`country` (`name`) VALUES ('Bahrajn');
INSERT INTO `seller`.`country` (`name`) VALUES ('Bangladesz');
INSERT INTO `seller`.`country` (`name`) VALUES ('Barbados');
INSERT INTO `seller`.`country` (`name`) VALUES ('Belgia');
INSERT INTO `seller`.`country` (`name`) VALUES ('Belize');
INSERT INTO `seller`.`country` (`name`) VALUES ('Benin');
INSERT INTO `seller`.`country` (`name`) VALUES ('Bhutan');
INSERT INTO `seller`.`country` (`name`) VALUES ('Białoruś');
INSERT INTO `seller`.`country` (`name`) VALUES ('Birma');
INSERT INTO `seller`.`country` (`name`) VALUES ('Boliwia');
INSERT INTO `seller`.`country` (`name`) VALUES ('Bośnia I Hercegowina');
INSERT INTO `seller`.`country` (`name`) VALUES ('Botswana');
INSERT INTO `seller`.`country` (`name`) VALUES ('Brazylia');
INSERT INTO `seller`.`country` (`name`) VALUES ('Brunei');
INSERT INTO `seller`.`country` (`name`) VALUES ('Bułgaria');
INSERT INTO `seller`.`country` (`name`) VALUES ('Burkina Faso');
INSERT INTO `seller`.`country` (`name`) VALUES ('Burundi');
INSERT INTO `seller`.`country` (`name`) VALUES ('Chile');
INSERT INTO `seller`.`country` (`name`) VALUES ('Chińska Republika Ludowa');
INSERT INTO `seller`.`country` (`name`) VALUES ('Chorwacja');
INSERT INTO `seller`.`country` (`name`) VALUES ('Cypr');
INSERT INTO `seller`.`country` (`name`) VALUES ('Cypr Północny');
INSERT INTO `seller`.`country` (`name`) VALUES ('Czad');
INSERT INTO `seller`.`country` (`name`) VALUES ('Czarnogóra');
INSERT INTO `seller`.`country` (`name`) VALUES ('Dania');
INSERT INTO `seller`.`country` (`name`) VALUES ('Demokratyczna Republika Konga');
INSERT INTO `seller`.`country` (`name`) VALUES ('Dominika');
INSERT INTO `seller`.`country` (`name`) VALUES ('Dominikana');
INSERT INTO `seller`.`country` (`name`) VALUES ('Dżibuti');
INSERT INTO `seller`.`country` (`name`) VALUES ('Egipt');
INSERT INTO `seller`.`country` (`name`) VALUES ('Ekwador');
INSERT INTO `seller`.`country` (`name`) VALUES ('Erytrea');
INSERT INTO `seller`.`country` (`name`) VALUES ('Estonia');
INSERT INTO `seller`.`country` (`name`) VALUES ('Etiopia');
INSERT INTO `seller`.`country` (`name`) VALUES ('Fidżi');
INSERT INTO `seller`.`country` (`name`) VALUES ('Filipiny');
INSERT INTO `seller`.`country` (`name`) VALUES ('Finlandia');
INSERT INTO `seller`.`country` (`name`) VALUES ('Francja');
INSERT INTO `seller`.`country` (`name`) VALUES ('Gabon');
INSERT INTO `seller`.`country` (`name`) VALUES ('Gambia');
INSERT INTO `seller`.`country` (`name`) VALUES ('Ghana');
INSERT INTO `seller`.`country` (`name`) VALUES ('Górski Karabach');
INSERT INTO `seller`.`country` (`name`) VALUES ('Grecja');
INSERT INTO `seller`.`country` (`name`) VALUES ('Grenada');
INSERT INTO `seller`.`country` (`name`) VALUES ('Gruzja');
INSERT INTO `seller`.`country` (`name`) VALUES ('Gujana');
INSERT INTO `seller`.`country` (`name`) VALUES ('Gwatemala');
INSERT INTO `seller`.`country` (`name`) VALUES ('Gwinea');
INSERT INTO `seller`.`country` (`name`) VALUES ('Gwinea Bissau');
INSERT INTO `seller`.`country` (`name`) VALUES ('Gwinea Równikowa');
INSERT INTO `seller`.`country` (`name`) VALUES ('Haiti');
INSERT INTO `seller`.`country` (`name`) VALUES ('Hiszpania');
INSERT INTO `seller`.`country` (`name`) VALUES ('Holandia');
INSERT INTO `seller`.`country` (`name`) VALUES ('Honduras');
INSERT INTO `seller`.`country` (`name`) VALUES ('Indie');
INSERT INTO `seller`.`country` (`name`) VALUES ('Indonezja');
INSERT INTO `seller`.`country` (`name`) VALUES ('Irak');
INSERT INTO `seller`.`country` (`name`) VALUES ('Iran');
INSERT INTO `seller`.`country` (`name`) VALUES ('Irlandia');
INSERT INTO `seller`.`country` (`name`) VALUES ('Islandia');
INSERT INTO `seller`.`country` (`name`) VALUES ('Izrael');
INSERT INTO `seller`.`country` (`name`) VALUES ('Jamajka');
INSERT INTO `seller`.`country` (`name`) VALUES ('Japonia');
INSERT INTO `seller`.`country` (`name`) VALUES ('Jemen');
INSERT INTO `seller`.`country` (`name`) VALUES ('Jordania');
INSERT INTO `seller`.`country` (`name`) VALUES ('Kambodża');
INSERT INTO `seller`.`country` (`name`) VALUES ('Kamerun');
INSERT INTO `seller`.`country` (`name`) VALUES ('Kanada');
INSERT INTO `seller`.`country` (`name`) VALUES ('Katar');
INSERT INTO `seller`.`country` (`name`) VALUES ('Kazachstan');
INSERT INTO `seller`.`country` (`name`) VALUES ('Kenia');
INSERT INTO `seller`.`country` (`name`) VALUES ('Kirgistan');
INSERT INTO `seller`.`country` (`name`) VALUES ('Kiribati');
INSERT INTO `seller`.`country` (`name`) VALUES ('Kolumbia');
INSERT INTO `seller`.`country` (`name`) VALUES ('Komory');
INSERT INTO `seller`.`country` (`name`) VALUES ('Kongo');
INSERT INTO `seller`.`country` (`name`) VALUES ('Korea Południowa');
INSERT INTO `seller`.`country` (`name`) VALUES ('Korea Północna');
INSERT INTO `seller`.`country` (`name`) VALUES ('Kosowo');
INSERT INTO `seller`.`country` (`name`) VALUES ('Kostaryka');
INSERT INTO `seller`.`country` (`name`) VALUES ('Kuba');
INSERT INTO `seller`.`country` (`name`) VALUES ('Kuwejt');
INSERT INTO `seller`.`country` (`name`) VALUES ('Laos');
INSERT INTO `seller`.`country` (`name`) VALUES ('Lesotho');
INSERT INTO `seller`.`country` (`name`) VALUES ('Liban');
INSERT INTO `seller`.`country` (`name`) VALUES ('Liberia');
INSERT INTO `seller`.`country` (`name`) VALUES ('Libia');
INSERT INTO `seller`.`country` (`name`) VALUES ('Liechtenstein');
INSERT INTO `seller`.`country` (`name`) VALUES ('Litwa');
INSERT INTO `seller`.`country` (`name`) VALUES ('Luksemburg');
INSERT INTO `seller`.`country` (`name`) VALUES ('Łotwa');
INSERT INTO `seller`.`country` (`name`) VALUES ('Macedonia');
INSERT INTO `seller`.`country` (`name`) VALUES ('Madagaskar');
INSERT INTO `seller`.`country` (`name`) VALUES ('Malawi');
INSERT INTO `seller`.`country` (`name`) VALUES ('Malediwy');
INSERT INTO `seller`.`country` (`name`) VALUES ('Malezja');
INSERT INTO `seller`.`country` (`name`) VALUES ('Mali');
INSERT INTO `seller`.`country` (`name`) VALUES ('Malta');
INSERT INTO `seller`.`country` (`name`) VALUES ('Maroko');
INSERT INTO `seller`.`country` (`name`) VALUES ('Mauretania');
INSERT INTO `seller`.`country` (`name`) VALUES ('Mauritius');
INSERT INTO `seller`.`country` (`name`) VALUES ('Meksyk');
INSERT INTO `seller`.`country` (`name`) VALUES ('Mikronezja');
INSERT INTO `seller`.`country` (`name`) VALUES ('Mołdawia');
INSERT INTO `seller`.`country` (`name`) VALUES ('Monako');
INSERT INTO `seller`.`country` (`name`) VALUES ('Mongolia');
INSERT INTO `seller`.`country` (`name`) VALUES ('Mozambik');
INSERT INTO `seller`.`country` (`name`) VALUES ('Naddniestrze');
INSERT INTO `seller`.`country` (`name`) VALUES ('Namibia');
INSERT INTO `seller`.`country` (`name`) VALUES ('Nauru');
INSERT INTO `seller`.`country` (`name`) VALUES ('Nepal');
INSERT INTO `seller`.`country` (`name`) VALUES ('Niemcy');
INSERT INTO `seller`.`country` (`name`) VALUES ('Niger');
INSERT INTO `seller`.`country` (`name`) VALUES ('Nigeria');
INSERT INTO `seller`.`country` (`name`) VALUES ('Nikaragua');
INSERT INTO `seller`.`country` (`name`) VALUES ('Norwegia');
INSERT INTO `seller`.`country` (`name`) VALUES ('Nowa Zelandia');
INSERT INTO `seller`.`country` (`name`) VALUES ('Oman');
INSERT INTO `seller`.`country` (`name`) VALUES ('Osetia Południowa');
INSERT INTO `seller`.`country` (`name`) VALUES ('Pakistan');
INSERT INTO `seller`.`country` (`name`) VALUES ('Palau');
INSERT INTO `seller`.`country` (`name`) VALUES ('Palestyna');
INSERT INTO `seller`.`country` (`name`) VALUES ('Panama');
INSERT INTO `seller`.`country` (`name`) VALUES ('Papua Nowa Gwinea');
INSERT INTO `seller`.`country` (`name`) VALUES ('Paragwaj');
INSERT INTO `seller`.`country` (`name`) VALUES ('Peru');
INSERT INTO `seller`.`country` (`name`) VALUES ('Polska');
INSERT INTO `seller`.`country` (`name`) VALUES ('Portugalia');
INSERT INTO `seller`.`country` (`name`) VALUES ('Republika Czeska');
INSERT INTO `seller`.`country` (`name`) VALUES ('Republika Południowej Afryki');
INSERT INTO `seller`.`country` (`name`) VALUES ('Republika Środkowoafrykańska');
INSERT INTO `seller`.`country` (`name`) VALUES ('Republika Zielonego Przylądka');
INSERT INTO `seller`.`country` (`name`) VALUES ('Rosja');
INSERT INTO `seller`.`country` (`name`) VALUES ('Rumunia');
INSERT INTO `seller`.`country` (`name`) VALUES ('Rwanda');
INSERT INTO `seller`.`country` (`name`) VALUES ('Sahara Zachodnia');
INSERT INTO `seller`.`country` (`name`) VALUES ('Saint Kitts I Nevis');
INSERT INTO `seller`.`country` (`name`) VALUES ('Saint Lucia');
INSERT INTO `seller`.`country` (`name`) VALUES ('Saint Vincent I Grenadyny');
INSERT INTO `seller`.`country` (`name`) VALUES ('Salwador');
INSERT INTO `seller`.`country` (`name`) VALUES ('Samoa');
INSERT INTO `seller`.`country` (`name`) VALUES ('San Marino');
INSERT INTO `seller`.`country` (`name`) VALUES ('Senegal');
INSERT INTO `seller`.`country` (`name`) VALUES ('Serbia');
INSERT INTO `seller`.`country` (`name`) VALUES ('Seszele');
INSERT INTO `seller`.`country` (`name`) VALUES ('Sierra Leone');
INSERT INTO `seller`.`country` (`name`) VALUES ('Singapur');
INSERT INTO `seller`.`country` (`name`) VALUES ('Słowacja');
INSERT INTO `seller`.`country` (`name`) VALUES ('Słowenia');
INSERT INTO `seller`.`country` (`name`) VALUES ('Somalia');
INSERT INTO `seller`.`country` (`name`) VALUES ('Somaliland');
INSERT INTO `seller`.`country` (`name`) VALUES ('Sri Lanka');
INSERT INTO `seller`.`country` (`name`) VALUES ('Stany Zjednoczone');
INSERT INTO `seller`.`country` (`name`) VALUES ('Suazi');
INSERT INTO `seller`.`country` (`name`) VALUES ('Sudan');
INSERT INTO `seller`.`country` (`name`) VALUES ('Surinam');
INSERT INTO `seller`.`country` (`name`) VALUES ('Syria');
INSERT INTO `seller`.`country` (`name`) VALUES ('Szwajcaria');
INSERT INTO `seller`.`country` (`name`) VALUES ('Szwecja');
INSERT INTO `seller`.`country` (`name`) VALUES ('Tadżykistan');
INSERT INTO `seller`.`country` (`name`) VALUES ('Tajlandia');
INSERT INTO `seller`.`country` (`name`) VALUES ('Tajwan');
INSERT INTO `seller`.`country` (`name`) VALUES ('Tanzania');
INSERT INTO `seller`.`country` (`name`) VALUES ('Timor Wschodni');
INSERT INTO `seller`.`country` (`name`) VALUES ('Togo');
INSERT INTO `seller`.`country` (`name`) VALUES ('Tonga');
INSERT INTO `seller`.`country` (`name`) VALUES ('Trynidad I Tobago');
INSERT INTO `seller`.`country` (`name`) VALUES ('Tunezja');
INSERT INTO `seller`.`country` (`name`) VALUES ('Turcja');
INSERT INTO `seller`.`country` (`name`) VALUES ('Turkmenistan');
INSERT INTO `seller`.`country` (`name`) VALUES ('Tuvalu');
INSERT INTO `seller`.`country` (`name`) VALUES ('Uganda');
INSERT INTO `seller`.`country` (`name`) VALUES ('Ukraina');
INSERT INTO `seller`.`country` (`name`) VALUES ('Urugwaj');
INSERT INTO `seller`.`country` (`name`) VALUES ('Uzbekistan');
INSERT INTO `seller`.`country` (`name`) VALUES ('Vanuatu');
INSERT INTO `seller`.`country` (`name`) VALUES ('Watykan');
INSERT INTO `seller`.`country` (`name`) VALUES ('Wenezuela');
INSERT INTO `seller`.`country` (`name`) VALUES ('Węgry');
INSERT INTO `seller`.`country` (`name`) VALUES ('Wielka Brytania');
INSERT INTO `seller`.`country` (`name`) VALUES ('Wietnam');
INSERT INTO `seller`.`country` (`name`) VALUES ('Włochy');
INSERT INTO `seller`.`country` (`name`) VALUES ('Wybrzeże Kości Słoniowej');
INSERT INTO `seller`.`country` (`name`) VALUES ('Wyspy Marshalla');
INSERT INTO `seller`.`country` (`name`) VALUES ('Wyspy Salomona');
INSERT INTO `seller`.`country` (`name`) VALUES ('Wyspy Świętego Tomasza I Książęca');
INSERT INTO `seller`.`country` (`name`) VALUES ('Zambia');
INSERT INTO `seller`.`country` (`name`) VALUES ('Zimbabwe');
INSERT INTO `seller`.`country` (`name`) VALUES ('Zjednoczone Emiraty Arabskie');
