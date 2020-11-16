CREATE TABLE fabricantes(
	fab_iden SERIAL PRIMARY KEY,
	fab_nome VARCHAR(50)
);

CREATE TABLE tip_miniaturas(
	tm_iden SERIAL PRIMARY KEY,
	tm_tipo VARCHAR(25)
);

CREATE TABLE temas(
	tem_iden SERIAL PRIMARY KEY,
	tem_nome VARCHAR(50)
);

CREATE TABLE miniaturas(
	min_iden SERIAL PRIMARY KEY,
	min_modelo VARCHAR(50),
	min_ano DATE,
	min_observacoes VARCHAR(100),
	min_edicao INTEGER,
	min_valor NUMERIC(6,2),
	min_fab_iden INTEGER,
	min_tm_iden INTEGER,
	min_tem_iden INTEGER,
	FOREIGN KEY(min_fab_iden) REFERENCES fabricantes(fab_iden),
	FOREIGN KEY(min_tm_iden) REFERENCES tip_miniaturas(tm_iden),
	FOREIGN KEY(min_tem_iden) REFERENCES temas(tem_iden)
);

CREATE TABLE fotos(
	fot_iden SERIAL PRIMARY KEY,
	fot_caminho VARCHAR(200),
	fot_descricao VARCHAR(200),
	fot_min_iden INTEGER,
	FOREIGN KEY(fot_min_iden) REFERENCES miniaturas(min_iden)
);
SELECT * FROM miniaturas

SELECT distinct min_iden,min_modelo,min_ano,min_observacoes,min_modelo FROM miniaturas


INSERT INTO miniaturas(min_iden,min_modelo,min_ano ) VALUES (default ,'carro','03/08/2020');
INSERT INTO miniaturas(min_iden,min_modelo,min_ano ) VALUES (default ,'moto','03/08/2020');
INSERT INTO miniaturas(min_iden,min_modelo,min_ano ) VALUES (default ,'moto','03/08/2020');
INSERT INTO miniaturas(min_iden,min_observacoes ) VALUES (default,'CUIDADO MODELO FRAGIU');

