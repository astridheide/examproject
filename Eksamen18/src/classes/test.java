package classes;


import java.sql.ResultSet;
import classes.*;
import daos.*;

import java.sql.SQLException;
import java.util.ArrayList;


import java.sql.Connection;
import java.sql.PreparedStatement;

import dk.au.hum.imv.persistence.db.JDBCConnectionFactory;


public class test {

	public static void main(String[] args) {
		
		
	Product product = new Product ("Wunderbaum", 1342, "Lækkert");
		
	ProductDao.createAccess(product);
		
	}

}
