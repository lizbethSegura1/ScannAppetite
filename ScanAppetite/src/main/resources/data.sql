CREATE TABLE Catalogo (Id varchar(255) NOT NULL, Descripcion varchar(255), Horario varchar(255), RestauranteID varchar(255) NOT NULL, PRIMARY KEY (Id));
CREATE TABLE Mesa (ID varchar(255) NOT NULL, Ubicacion varchar(255), Estado char(255), RestauranteID varchar(255) NOT NULL, PRIMARY KEY (ID));
CREATE TABLE Pedido (Id int(10) NOT NULL AUTO_INCREMENT, Estado int(10), TipoPago varchar(255), Hora datetime NULL, MesaID varchar(255) NOT NULL, PRIMARY KEY (Id));
CREATE TABLE Plato (ID varchar(255) NOT NULL, Precio double, Stock int(10), Descripcion varchar(255), CatalogoId varchar(255) NOT NULL, PRIMARY KEY (ID));
CREATE TABLE Plato_Pedido (PlatoID varchar(255) NOT NULL, PedidoId int(10) NOT NULL, PRIMARY KEY (PlatoID, PedidoId));
CREATE TABLE Restaurante (ID varchar(255) NOT NULL, Direccion varchar(255), HoraApertura time, HoraCierre time, Denominacion varchar(120), PRIMARY KEY (ID));
ALTER TABLE Plato_Pedido ADD CONSTRAINT FKPlato_Pedi962514 FOREIGN KEY (PlatoID) REFERENCES Plato (ID);
ALTER TABLE Plato_Pedido ADD CONSTRAINT FKPlato_Pedi20438 FOREIGN KEY (PedidoId) REFERENCES Pedido (Id);
ALTER TABLE Pedido ADD CONSTRAINT FKPedido362738 FOREIGN KEY (MesaID) REFERENCES Mesa (ID);
ALTER TABLE Mesa ADD CONSTRAINT FKMesa187017 FOREIGN KEY (RestauranteID) REFERENCES Restaurante (ID);
ALTER TABLE Plato ADD CONSTRAINT FKPlato597929 FOREIGN KEY (CatalogoId) REFERENCES Catalogo (Id);
ALTER TABLE Catalogo ADD CONSTRAINT `1:N` FOREIGN KEY (RestauranteID) REFERENCES Restaurante (ID);
-- Insertar datos en la tabla Restaurante
INSERT INTO Restaurante (Direccion, HoraApertura, HoraCierre, Title, MesaID)
VALUES ('Calle Ejemplo 123', '2023-11-20 08:00:00', '2023-11-20 22:00:00', 'Rana Verde', 'Mesa1');
     INSERT INTO Catalogo (Id, Descripcion, Horario, RestauranteID)
VALUES ('Desayuno', 'Menú de desayuno con opciones variadas', '2023-11-20 08:00:00',  'Rana verde');

ALTER TABLE catalogo
ADD COLUMN horario_inicio TIME,
ADD COLUMN horario_fin TIME;

UPDATE Catalogo
SET horario_inicio = '08:00:00', horario_fin = '10:00:00'
WHERE Id = 'Desayuno' AND RestauranteID = 'Rana Verde';
UPDATE Catalogo
SET horario_fin = '16:00:00'
WHERE Id = 'Desayuno' AND RestauranteID = 'Rana Verde';

INSERT INTO Plato (ID, Precio, Stock, Descripcion, CatalogoId)
VALUES ('TOSTADA DE JAMÓN IBÉRICO CON TOMATE', 2.99, 20, 'Desayuno Iberico', 'Desayuno');

INSERT INTO Plato (ID, Precio, Stock, Descripcion, CatalogoId)
VALUES ('TORTILLA DE PATATAE', 2.99, 20, 'Desayuno Iberico', 'Desayuno');

INSERT INTO Plato (ID, Precio, Stock, Descripcion, CatalogoId)
VALUES (' ZUMO DE NARANJA NATURAL', 2.99, 20, 'Desayuno Iberico', 'Desayuno');

-- Crear la tabla intermedia Catalogo_Plato
CREATE TABLE Catalogo_Plato (
  CatalogoId varchar(255) NOT NULL,
  PlatoId varchar(255) NOT NULL,
  PRIMARY KEY (CatalogoId, PlatoId),
  FOREIGN KEY (CatalogoId) REFERENCES Catalogo(Id),
  FOREIGN KEY (PlatoId) REFERENCES Plato(ID)
);

-- Insertar relaciones entre Catalogo y Plato
INSERT INTO Catalogo_Plato (CatalogoId, PlatoId)
VALUES ('Desayuno', 'TOSTADA DE JAMÓN IBÉRICO CON TOMATE');

INSERT INTO Catalogo_Plato (CatalogoId, PlatoId)	
VALUES ('Desayuno', 'TORTILLA DE PATATAE');

INSERT INTO Catalogo_Plato (CatalogoId, PlatoId)
VALUES ('Desayuno', 'ZUMO DE NARANJA NATURAL');
