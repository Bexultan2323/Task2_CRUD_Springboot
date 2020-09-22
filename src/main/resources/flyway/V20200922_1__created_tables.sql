DROP TABLE IF EXISTS Fond;
DROP TABLE IF EXISTS Company;
create table Fond(
    id int8 PRIMARY KEY,
    fond_number varchar(128),
    created_timestamp int8,
    created_by int8,
    updated_timestamp int8,
    updated_by int8
);

create table Company(
    id int8 PRIMARY KEY,
    name_ru varchar(128),
    name_kz varchar(128),
    name_en varchar(128),
    BIN varchar(32),
    Parent_id int8,
    Fond_id int8 ,
    created_timestamp int8,
    created_by int8,
    updated_timestamp int8,
    updated_by int8
);
CREATE table Company_unit(
    id int8 PRIMARY KEY,
    name_ru varchar(128),
    name_kz varchar(128),
    name_en varchar(128),
    Parent_id int8,
    year int4,
    company_id  int4 ,
    Code_index varchar(16),
    created_timestamp int8,
    created_by int8,
    updated_timestamp int8,
    updated_by int8
);
create table Record(
    id int8 PRIMARY KEY,
    Number varchar(128),
    type varchar(128),
    company_unit_id int8 ,
    created_timestamp int8,
    created_by int8,
    updated_timestamp int8,
    updated_by int8
);



CREATE table Case_index (
    id int8 PRIMARY KEY,
    case_index varchar(128),
    title_ru varchar(128),
    title_kz varchar(128),
    title_en varchar(128),
    storage_type int4,
    storage_year int4,
    note varchar(128),
    company_unit_id int8 ,
    nomenclature_id int8,
    created_timestamp int8,
    created_by int8,
    updated_timestamp int8,
    updated_by int8
);
create table Authentication(
    id int8 PRIMARY KEY,
    username varchar(128),
    email varchar(128),
    password varchar(128),
    role varchar(128),
    forgot_password_key varchar(128),
    forgot_password_key_timestamp int8,
    company_unit_id int8
);

create table Users(
    id int8 PRIMARY KEY,
    auth_id varchar(128),
    name varchar(128),
    fullname varchar(128),
    surname varchar(128),
    secondname varchar(128),
    status varchar(128),
    company_unit_id int8 ,
    password varchar(128),
    last_login_timestamp int8,
    Iin varchar(32),
    is_active bool,
    is_activated bool,
    created_timestamp int8,
    created_by int8,
    updated_timestamp int8,
    updated_by int8
);



create table Request(
    id int8 PRIMARY KEY,
    request_user_id int8,
    response_user_id int8,
    case_id int8,
    case_index_id int8,
    created_type varchar(64),
    comment varchar(128),
    status varchar(64),
    timestamp  int8,
    sharestart int8,
    sharefinish int8,
    favorite bool,
    updated_timestamp int8,
    updated_by int8,
    declinenote varchar(128),
    company_unit_id int8,
    from_request_id int8
);

create table Share(
    id int8 PRIMARY KEY,
    request_id int8 ,
    note varchar(128),
    sender_id int8,
    receiver_id int8,
    share_timestamp int8
);

create table History_request(
    id int8 PRIMARY KEY,
    request_id int8 ,
    status varchar(128),
    created_timestamp int8,
    created_by int8,
    updated_timestamp int8,
    updated_by int8
);

create table Cases(
    id int8 PRIMARY KEY,
    case_number varchar(128),
    number_of_Tom varchar(128),
    case_heading_ru varchar(128),
    case_heading_kz varchar(128),
    case_heading_en varchar(128),
    start_date int8,
    end_date int8,
    nubmer_page int8,
    ESP bool,
    ESP_sign text,
    NAF bool,
    deleting bool,
    access bool,
    hash varchar(128),
    version_activation bool,
    note varchar(255),
    id_location int8 ,
    case_index_id int8 ,
    id_record int8 ,
    company_unit_id int8 ,
    act_id int8 ,
    blockchain varchar(128),
    date_add_blockchain int8,
    created_timestamp int8,
    created_by int8,
    updated_timestamp int8,
    updated_by int8

);

CREATE table locations (
    id int8 PRIMARY KEY,
    row varchar(64),
    line varchar(64),
    columns varchar(64) ,
    box varchar(64),
    company_unit_id int8 ,
    created_timestamp int8,
    created_by int8,
    updated_timestamp int8,
    updated_by int8
);

CREATE table Catalog(
    id int8 PRIMARY KEY,
    name_ru varchar(128),
    name_kz varchar(128),
    name_en varchar(128),
    Parent_id int8,
    company_unit_id int8 ,
    created_timestamp int8,
    created_by int8,
    updated_timestamp int8,
    updated_by int8
);

create table Catalog_case(
    id int8 PRIMARY KEY,
    case_id int8 ,
    catolog_id int8 ,
    company_unit_id int8 ,
    created_timestamp int8,
    created_by int8,
    updated_timestamp int8,
    updated_by int8
);

create table Activity_journal(
    id int8 PRIMARY KEY,
    type varchar(128),
    object_type varchar(255),
    object_id int8,
    created_timestamp int8,
    created_by int8,
    message_level varchar(128),
    message varchar(255)
);

create table Notification (
    id int8 PRIMARY KEY,
    object_type varchar(128),
    object_id int8,
    company_unit_id int8,
    user_id int8,
    created_timestamp int8,
    viewed_timestamp int8,
    is_viewed bool,
    title varchar(255),
    text varchar(255),
    company_id int8
);

create table File(
    id int8 PRIMARY KEY,
    name varchar(128),
    type varchar(128),
    size int8,
    page_count int4,
    hash  varchar(128),
    is_deleted bool,
    file_binary_id int8 ,
    created_timestamp int8,
    created_by int8,
    updated_timestamp int8,
    updated_by int8
);

create table File_routing(
    id int8 PRIMARY KEY,
    file_id int8  ,
    table_name varchar(128),
    table_id int8 ,
    type varchar(128)
);

create table Tempfiles(
    id int8 PRIMARY KEY,
    file_binary text,
    file_binary_byte bytea
);

create table Search_key(
    id int8 PRIMARY KEY,
    name varchar(128),
    company_unit_id int8 ,
    created_timestamp int8,
    created_by int8,
    updated_timestamp int8,
    updated_by int8
);

create table Search_key_routing(
    id int8 PRIMARY KEY,
    search_key_id int8 ,
    table_name varchar(128),
    table_id int8 ,
    type varchar(128)
);





create table Nomenclature(
    id int8 PRIMARY KEY,
    Nomenclature_number varchar(128),
    year int4,
    nomenclatue_summary_id int8,
    company_unit_id int8 ,
    created_timestamp int8,
    created_by int8,
    updated_timestamp int8,
    updated_by int8
);

create table Nomenclature_summary(
    id int8 PRIMARY KEY,
    number varchar(128),
    year int4,
    company_unit_id int8 ,
    created_timestamp int8,
    created_by int8,
    updated_timestamp int8,
    updated_by int8
);





create table Act(
    id int8 PRIMARY KEY,
    number_act varchar(128),
    base varchar(256),
    company_unit_id int8 ,
    created_timestamp int8,
    created_by int8,
    updated_timestamp int8,
    updated_by int8
);


