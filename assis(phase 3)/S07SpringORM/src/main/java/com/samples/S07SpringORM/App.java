package com.samples.S07SpringORM;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.samples.S07SpringORM.Dao.ProductDAO;
import com.samples.S07SpringORM.entity.Product;

public class App {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext springContainer = new ClassPathXmlApplicationContext(
				"com/samples/S07SpringORM/SpringConfig.xml");

		ProductDAO productDAO = (ProductDAO) springContainer.getBean("productdao");

		 create(productDAO);
		// update(productDAO);

		// delete(productDAO);

		//findProduct(productDAO, 1);

		// findAll(productDAO);
	}

	private static void findProduct(ProductDAO productDAO, int id) {
		Product product = productDAO.find(id);
		System.out.println(product);

	}

	private static void findAll(ProductDAO productDAO) {
		List<Product> products = productDAO.findAll();
		System.out.println(products);

	}

	private static void delete(ProductDAO productDAO) {
		Product product = new Product();
		product.setId(1);
		product.setName("Mobile");
		product.setDescription("Vivo");
		product.setPrice(30000);

		productDAO.delete(product);
	}

	private static void update(ProductDAO productDAO) {
		Product product = new Product();
		product.setId(1);
		product.setName("Furniture");
		product.setDescription("rose wood");
		product.setPrice(6000);

		productDAO.update(product);
	}

	private static void create(ProductDAO productDAO) {
		Product product = new Product();
		product.setId(2);
		product.setName("Furniture");
		product.setDescription("rose wood");
		product.setPrice(6000);

		productDAO.create(product);
	}
}
