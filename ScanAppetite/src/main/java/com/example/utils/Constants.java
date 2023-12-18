package com.example.utils;

public interface Constants {
    // for pagination only
    String NULL = "null";
    String NAME = "name";

    // for logging
    String CATALOGO_ALL = "select.all.catalogo.log";

    String PLATO_ALL_PAGE = "select.all.plato.page.log";
    String PLATO_ALL = "select.all.plato.log";
    String PLATO_CREATE = "create.plato.log";
    String PLATO_CREATE_DBE = "create.plato.dbe";
    String PLATO_ONE = "select.plato.log";
    String PLATO_ONE_DBE = "select.plato.dbe";
    String PLATO_UPDATE = "update.plato.log";
    String PLATO_UPDATE_DBE = "update.plato.dbe";
    String PLATO_DELETE = "delete.plato.log";
    String PLATO_DELETE_DBE = "delete.plato.dbe";

    String CESTA_ALL = "select.all.cesta.log";
    String CESTA_ALL_EMPTY = "select.all.cesta.empty";
    String CESTA_CREATE = "create.cesta.log";
    String CESTA_CREATE_DBE = "create.cesta.dbe";
    String CESTA_DELETE = "delete.cesta.log";
    String CESTA_DELETE_DBE = "delete.cesta.dbe";
    String CESTA_DELETE_ALL = "delete.all.cesta.log";
    String CESTA_DELETE_ALL_DBE = "delete.all.cesta.dbe";

    String ORDERS_ALL = "select.all.orders.log";
    String ORDERS_ALL_MANAGER = "select.all.orders.manager.log";
//    String ORDERS_ONE = "select.orders.log";
    String ORDERS_NOT_FOUND = "select.orders.dbe";
    String ORDERS_CREATE = "create.order.log";
    String ORDERS_UPDATE = "update.orders.log";

}
