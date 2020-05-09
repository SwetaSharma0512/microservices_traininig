package com.microservice.CurrencyConversion_Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservice.CurrencyConversion_repo.*;

@Service
public class CurrencyConversionFactorService

{
	@Autowired  
	CurrencyRepository currencyrepo; 
	
	//getting all records  
	public List<CurrencyConversionFactor> getAllConversionfactor()   
	{  
	List<CurrencyConversionFactor> currency = new ArrayList<CurrencyConversionFactor>();  
	currencyrepo.findAll().forEach(currencyrepo -> currency.add(currencyrepo));  
	return currency;  
	} 
	
	
	//getting a specific record  
	public CurrencyConversionFactor getconversionFactor(int id)   
	{  
	return currencyrepo.findById(id).get();  
	}  
	
	//adding a specific record  
		public CurrencyConversionFactor addconversionFactor(int id)   
		{  
		return currencyrepo.findById(id).get();  
		}  
		public void saveData(CurrencyConversionFactor currencyFactor)   
		{  
			currencyrepo.save(currencyFactor);  
		} 
	
	//updating a specific record
	public CurrencyConversionFactor updateconversionFactor(int id)   
	{  
	return currencyrepo.findById(id).get();  
	}  
	public void saveUpdateData(CurrencyConversionFactor currencyFactor)   
	{  
		currencyrepo.save(currencyFactor);  
	} 
	
	
}


BooksRepository booksRepository;  
//getting all books record by using the method findaAll() of CrudRepository  
public List<Books> getAllBooks()   
{  
List<Books> books = new ArrayList<Books>();  
booksRepository.findAll().forEach(books1 -> books.add(books1));  
return books;  
}  
//getting a specific record by using the method findById() of CrudRepository  
public Books getBooksById(int id)   
{  
return booksRepository.findById(id).get();  
}  
//saving a specific record by using the method save() of CrudRepository  
public void saveOrUpdate(Books books)   
{  
booksRepository.save(books);  
}  
//deleting a specific record by using the method deleteById() of CrudRepository  
public void delete(int id)   
{  
booksRepository.deleteById(id);  
}  
//updating a record  
public void update(Books books, int bookid)   
{  
booksRepository.save(books);  
}  