CREATE TABLE Catalogo (
  Id            varchar(255) NOT NULL, 
  Descripcion   varchar(255), 
  Horario       timestamp NULL, 
  PlatoID       varchar(255) NOT NULL, 
  RestauranteID int(255) NOT NULL, 
  PRIMARY KEY (Id));
CREATE TABLE Mesa (
  ID        varchar(255) NOT NULL, 
  Ubicacion varchar(255), 
  Estado    char(255), 
  PRIMARY KEY (ID));
CREATE TABLE Pedido (
  Id       int(10) NOT NULL AUTO_INCREMENT, 
  Estado   int(10), 
  TipoPago varchar(255), 
  Hora     DATETIME , 
  MesaID   varchar(255) NOT NULL, 
  PRIMARY KEY (Id));
CREATE TABLE Plato (
  ID          varchar(255) NOT NULL, 
  Precio      double, 
  Stock       int(10), 
  Descripcion varchar(255), 
  CatalogoId  varchar(255) NOT NULL, 
  PRIMARY KEY (ID));
CREATE TABLE Plato_Pedido (
  PlatoID  varchar(255) NOT NULL, 
  PedidoId int(10) NOT NULL, 
  PRIMARY KEY (PlatoID, 
  PedidoId));
CREATE TABLE Restaurante (
  ID           int(255) NOT NULL AUTO_INCREMENT, 
  Direccion    varchar(255), 
  HoraApertura DATETIME  NULL, 
  HoraCierre   DATETIME  NULL, 
  Title        varchar(120), 
  MesaID       varchar(255) NOT NULL, 
  PRIMARY KEY (ID));
ALTER TABLE Restaurante ADD CONSTRAINT FKRestaurant626334 FOREIGN KEY (MesaID) REFERENCES Mesa (ID);
ALTER TABLE Plato_Pedido ADD CONSTRAINT FKPlato_Pedi962514 FOREIGN KEY (PlatoID) REFERENCES Plato (ID);
ALTER TABLE Plato_Pedido ADD CONSTRAINT FKPlato_Pedi20438 FOREIGN KEY (PedidoId) REFERENCES Pedido (Id);
ALTER TABLE Pedido ADD CONSTRAINT FKPedido362738 FOREIGN KEY (MesaID) REFERENCES Mesa (ID);
ALTER TABLE Catalogo ADD CONSTRAINT FKCatalogo569344 FOREIGN KEY (RestauranteID) REFERENCES Restaurante (ID);
ALTER TABLE Plato ADD CONSTRAINT FKPlato597929 FOREIGN KEY (CatalogoId) REFERENCES Catalogo (Id);