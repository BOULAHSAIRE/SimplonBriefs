package main;

import java.sql.Connection;

public interface DAO<T> {
	
	Connection sqlConnect =  DBConnexion.getConnection();
	
	public  boolean insert( T o  );
       
	public boolean update(T o); 
	
	 boolean delete(int id );
	
	public T findById(int id);
}