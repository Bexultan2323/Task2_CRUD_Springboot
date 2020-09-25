INSERT INTO fond (id,fond_number,created_timestamp,created_by,updated_timestamp,updated_by)
VALUES
(1,'+77775556644',1,1,2,3),
(2,'+77775556644',2,1,2,3),
(3,'+77775556644',3,1,2,3);

INSERT INTO company (id,name_ru,name_kz,name_en,bin,parent_id,fond_id,created_timestamp,created_by,updated_timestamp,updated_by)
VALUES
(1,'ааа','аб',',iia','adf',1,2,3,4,5,6),
(2,'ббб','ба',',aa','ad',1,2,3,4,5,6),
(3,'ссс','бс',',aa','adf',1,2,3,4,5,6);

INSERT INTO company_unit (id,name_ru,name_kz,name_en,parent_id,year,company_id,code_index,created_timestamp,created_by,updated_timestamp,updated_by)
VALUES
(1,'ааа','аб',',bim',1,2,3,'123',4,5,6,7),
(2,'ббб','ба',',bim',1,2,3,'123',4,5,6,7),
(3,'ссс','бс',',bim',1,2,3,'123',4,5,6,7);



