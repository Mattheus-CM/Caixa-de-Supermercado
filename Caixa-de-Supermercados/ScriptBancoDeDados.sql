CREATE DATABASE Supermercado_MM;

USE Supermercado_MM;

CREATE TABLE Endereco (
	idEndereco INT NOT NULL AUTO_INCREMENT,
	Rua VARCHAR(45) NOT NULL,
	Numero VARCHAR(45) NOT NULL,
	Bairro VARCHAR(45) NOT NULL,
	Cidade VARCHAR(45) NOT NULL,
	CEP VARCHAR(45) NOT NULL,
	PRIMARY KEY (idEndereco)
);

CREATE TABLE Funcionario (
	idFuncionario INT NOT NULL AUTO_INCREMENT,
	Nome VARCHAR(45) NOT NULL,
	Cargo VARCHAR(45) NOT NULL,
	CPF VARCHAR(45) NOT NULL,
	Usuario VARCHAR(45) NOT NULL,
	Senha VARCHAR(45) NOT NULL,
	Endereco_idEndereco INT NOT NULL,
	PRIMARY KEY (idFuncionario),
	FOREIGN KEY (Endereco_idEndereco) REFERENCES Endereco (idEndereco)
		ON DELETE NO ACTION
		ON UPDATE NO ACTION
);

CREATE TABLE Produto (
	idProduto INT NOT NULL AUTO_INCREMENT,
	Nome VARCHAR(45) NOT NULL,
	Preco DOUBLE NOT NULL,
	Marca VARCHAR(45) NOT NULL,
	Codigo VARCHAR(45) NOT NULL,
	PRIMARY KEY (idProduto)
);

CREATE TABLE DetalheVenda (
	idDetalheVenda INT NOT NULL AUTO_INCREMENT,
	PrecoUnitario DOUBLE NOT NULL,
	PrecoTotal DOUBLE NOT NULL,
	Quantidade INT NOT NULL,
	Data DATE NOT NULL,
	Funcionario_idFuncionario INT NOT NULL,
	NotaFiscal_idNotaFiscal INT NOT NULL,
	PRIMARY KEY (idDetalheVenda),
	FOREIGN KEY (Funcionario_idFuncionario) REFERENCES Funcionario (idFuncionario)
		ON DELETE NO ACTION
		ON UPDATE NO ACTION
);

CREATE TABLE Produto_has_DetalheVenda (
	Produto_idProduto INT NOT NULL,
	DetalheVenda_idDetalheVenda INT NOT NULL,
	CONSTRAINT PK_Produto_has_DetalheVenda PRIMARY KEY (Produto_idProduto, DetalheVenda_idDetalheVenda),
	FOREIGN KEY (Produto_idProduto) REFERENCES Produto (idProduto)
		ON DELETE NO ACTION
		ON UPDATE NO ACTION,
	FOREIGN KEY (DetalheVenda_idDetalheVenda) REFERENCES DetalheVenda (idDetalheVenda)
		ON DELETE NO ACTION
		ON UPDATE NO ACTION
);

INSERT INTO ENDERECO (Rua, Numero, Bairro, Cidade, CEP) VALUES ('Rua dos Bobos','0','Centro','Rubim','39950000');
INSERT INTO funcionario (Nome, Cargo, CPF, Usuario, Senha, Endereco_idEndereco) VALUES ('Mattheus','Gerente','00000000000','admin00','admin00',1);