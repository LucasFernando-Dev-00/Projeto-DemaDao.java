package application;

import db.DB;
import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;

public class Program {
    public static void main(String[]args) {

        //System.out.println("O Java está procurando arquivos em: " + new java.io.File(".").getAbsolutePath());

       SellerDao sellerDao = DaoFactory.createSellerDao();

       Seller seller = sellerDao.findById(3);

        System.out.println(seller);


    }
}
