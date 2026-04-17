package model.dao;

import model.dao.impl.SellerDaoJDBC;

public class DaoFactory {

    public static crateSellerDao() {
        return new SellerDaoJDBC();
    }

}
