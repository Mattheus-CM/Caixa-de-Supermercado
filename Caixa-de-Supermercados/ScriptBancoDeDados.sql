CREATE DATABASE Supermercado_MM;

USE Supermercado_MM;

CREATE TABLE Usuario (
	idUsuario INT NOT NULL,
	Usuario VARCHAR(45) NOT NULL,
	Senha VARCHAR(45) NOT NULL,
	PRIMARY KEY (idUsuario)
);

CREATE TABLE Endereco (
	idEndereco INT NOT NULL,
	Rua VARCHAR(45) NOT NULL,
	Numero VARCHAR(45) NOT NULL,
	Bairro VARCHAR(45) NOT NULL,
	Cidade VARCHAR(45) NOT NULL,
	CEP VARCHAR(45) NOT NULL,
	PRIMARY KEY (idEndereco)
);

CREATE TABLE Funcionario (
	idFuncionario INT NOT NULL,
	Nome VARCHAR(45) NOT NULL,
	Cargo VARCHAR(45) NOT NULL,
	CPF VARCHAR(45) NOT NULL,
	Usuario_idUsuario INT,
	Endereco_idEndereco INT,
	PRIMARY KEY (idFuncionario),
	FOREIGN KEY (Usuario_idUsuario) REFERENCES Usuario (idUsuario)
		ON DELETE NO ACTION
		ON UPDATE NO ACTION,
	FOREIGN KEY (Endereco_idEndereco) REFERENCES Endereco (idEndereco)
		ON DELETE NO ACTION
		ON UPDATE NO ACTION
);

CREATE TABLE Produto (
	idProduto INT NOT NULL,
	Nome VARCHAR(45) NOT NULL,
	Preco DOUBLE NOT NULL,
	Marca VARCHAR(45) NOT NULL,
	PRIMARY KEY (idProduto)
);

CREATE TABLE EnderecoSupermercado (
	idEnderecoSupermercado INT NOT NULL,
	Rua VARCHAR(45) NOT NULL,
	Numero VARCHAR(45) NOT NULL,
	Bairro VARCHAR(45) NOT NULL,
	Cidade VARCHAR(45) NOT NULL,
	CEP VARCHAR(45) NOT NULL,
	PRIMARY KEY (idEnderecoSupermercado)
);

CREATE TABLE NotaFiscal (
	idNotaFiscal INT NOT NULL,
	DataDaCompra DATE NOT NULL,
	Supermercado VARCHAR(45) NOT NULL,
	Endereco_idEndereco INT,
	PRIMARY KEY (idNotaFiscal),
	FOREIGN KEY (Endereco_idEndereco) REFERENCES EnderecoSupermercado (idEnderecoSupermercado)
		ON DELETE NO ACTION
		ON UPDATE NO ACTION
);

CREATE TABLE DetalheVenda (
	idDetalheVenda INT NOT NULL,
	PrecoUnitario DOUBLE NOT NULL,
	PrecoTotal DOUBLE NOT NULL,
	Quantidade INT NOT NULL,
	Data DATE NOT NULL,
	Funcionario_idFuncionario INT,
	NotaFiscal_idNotaFiscal INT,
	PRIMARY KEY (idDetalheVenda),
	FOREIGN KEY (Funcionario_idFuncionario) REFERENCES Funcionario (idFuncionario)
		ON DELETE NO ACTION
		ON UPDATE NO ACTION,
	FOREIGN KEY (NotaFiscal_idNotaFiscal) REFERENCES NotaFiscal (idNotaFiscal)
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