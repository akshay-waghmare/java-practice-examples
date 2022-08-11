package com.example.demo;


import java.util.HashMap;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ProductUnitTests {

	@Test
	public void getExistingValue() {
		HashMap<String,Product> producyByname = new HashMap<>();

		Product lorealShampoo = new Product("Loreal shampoo" , "Loreal brand");
		Product ogxShampoo = new Product("OGX shampoo" , "OGX brand");

		producyByname.put(lorealShampoo.getName(), lorealShampoo);
		producyByname.put(ogxShampoo.getName(), ogxShampoo);

		Product productPurchase = producyByname.get(lorealShampoo.getName());

		assertArrayEquals("Loreal brand".toCharArray(), productPurchase.getDescription().toCharArray());
	}

}
