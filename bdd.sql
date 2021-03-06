CREATE TABLE Tapas
(
	idTapas INT(11),
	nomTapas VARCHAR(64),
	idCommande INT(11),
	idCategorie INT(11),
	PRIMARY KEY (idTapas)
);

CREATE TABLE Categorie
(
	idCategorie INT(11),
	nomCategorie VARCHAR(64),
	PRIMARY KEY (idCategorie)
);

CREATE TABLE Commande
(
	idCommande INT(11), 
	heure DATE,
	idTable INT(11),
	PRIMARY KEY (idCommande)
);

CREATE TABLE Tables
(
	idTable INT(11), 
	nombrePersonne INT(11),
	idCommande INT(11),
	PRIMARY KEY (idTable)
);

ALTER TABLE Tapas
ADD CONSTRAINT Tapas_idCategorie
FOREIGN KEY (idCategorie)
REFERENCES Categorie(idCategorie);

ALTER TABLE Tables 
ADD CONSTRAINT Tables_idCommande
FOREIGN KEY (idCommande)
REFERENCES Commande(idCommande);

ALTER TABLE Commande
ADD CONSTRAINT Commande_idTable
FOREIGN KEY (idTable)
REFERENCES Tables(idTable);


