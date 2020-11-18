--DDL
CREATE TABLE alunos (
	alu_iden SERIAL PRIMARY KEY,
	alu_nome VARCHAR(100),
	alu_cpf VARCHAR(12)
);

CREATE TABLE disciplinas (
	dis_iden SERIAL PRIMARY KEY,
	dis_nome VARCHAR(80)
);

CREATE TABLE contatos (
	con_iden SERIAL PRIMARY KEY,
	con_telefone VARCHAR(80),
	con_alu_iden INTEGER,
	FOREIGN KEY (con_alu_iden) REFERENCES alunos (alu_iden)
);

CREATE TABLE alunos_disciplinas (
 	adi_iden SERIAL PRIMARY KEY,
	adi_carga_horaria INTEGER,
	adi_alu_iden INTEGER,
	adi_dis_iden INTEGER,
	FOREIGN KEY (adi_alu_iden) REFERENCES alunos (alu_iden),
	FOREIGN KEY (adi_dis_iden) REFERENCES disciplinas (dis_iden)
);


--ALUNOS
SELECT * FROM alunos

SELECT distinct alu_nome  FROM alunos


INSERT INTO alunos(alu_iden,alu_nome,alu_cpf) VALUES (DEFAULT , 'lucas de malmeida da leste' ,'223.444.44');
INSERT INTO alunos(alu_iden,alu_nome,alu_cpf) VALUES (DEFAULT , 'vinicios araujo da couve' ,'222444.44');
INSERT INTO alunos(alu_iden,alu_nome,alu_cpf) VALUES (DEFAULT , 'lucas araujo da moita ' ,'222.666.66');
INSERT INTO alunos(alu_iden,alu_nome,alu_cpf) VALUES (DEFAULT , 'marocs araujo da silva ' ,'222.333.33');
INSERT INTO alunos(alu_iden,alu_nome,alu_cpf) VALUES (DEFAULT, 'sheyla pereira alves'  ,'222.2222.22');
INSERT INTO alunos(alu_iden,alu_nome,alu_cpf) VALUES (DEFAULT, 'sheyla pereira alves'  ,'22.2222.22');

---CONTATOS 

SELECT * FROM contatos

INSERT INTO contatos VALUES (DEFAULT , '62344535656', 1);
INSERT INTO contatos VALUES (DEFAULT, '44335656', 2);
INSERT INTO contatos VALUES (DEFAULT , '(62344335656', 3);
INSERT INTO contatos VALUES (DEFAULT , '(62344335656', 4);
INSERT INTO contatos VALUES (DEFAULT, '(62344335656', 5);
INSERT INTO contatos VALUES (DEFAULT , '(62344335656', 6);

---DISCIPLINA 
SELECT * FROM disciplinas 
--join
SELECT  * from alunos_disciplinas 
SELECT alu.alu_nome,con.con_telefone, dis.dis_nome
                         FROM alunos alu 
						 JOIN contatos con ON alu.alu_iden = con.con_alu_iden
                         JOIN alunos_disciplinas ad ON alu.alu_iden = ad.adi_alu_iden
						 JOIN disciplinas dis ON ad.adi_dis_iden = dis.dis_iden
--insert alunos_disciplinas 
INSERT INTO alunos_disciplinas VALUES(1 , 10, 1 , 1);
INSERT INTO alunos_disciplinas VALUES(4, 10, 4, 2);
INSERT INTO alunos_disciplinas VALUES(3 , 10, 3, 3);

--inserte discipllinas 
INSERT into disciplinas values(default , 'matematica'); 
INSERT INTO disciplinas VALUES (DEFAULT , 'portugues');
INSERT INTO disciplinas VALUES (DEFAULT , 'biologia');
INSERT INTO disciplinas VALUES (DEFAULT , 'filosofia');
INSERT INTO disciplinas VALUES (DEFAULT , 'educaçao fisisca ')
INSERT INTO disciplinas VALUES (DEFAULT , 'artes');


------------------------------------------------------------------
--Comparaçao de dados , e o metdo join 
--junçao sem comando  join------------
SELECT * FROM alunos, contatos--------
WHERE alunos.alu_iden = contatos.con_alu_iden
--usando join---------------------------------
SELECT * FROM alunos alu join contatos con ON alu_iden = con_alu_iden
------------------------------------------------------------------                          
SELECT * FROM alunos
--REMOVER ALUNO;
DELETE FROM alunos WHERE
DELETE FROM contatos WHERE contatos.con_alu_iden is null 
--REMPVER TODOOS OS ALUNOS;
DELETE FROM alunos WHERE alunos.alu_iden = 2;
--REMOVER USANSO FILTROS;

