package main;
import Brief_6.CategroyDao;
import Brief_6.ProductDao;
import entite.Category;
import entite.Produit;
public class Main {
	public static void main(String[] args) {
		
		//insert category 
		CategroyDao Cat = new CategroyDao();
		Category cat1 = new Category(4, "informatique");
		Category cat2 = new Category(3, "Smartphone");
	    Cat.insert(cat1);
	    
     	//update category
		CategroyDao Categ = new CategroyDao();
		Category cate  =new Category(4,"informatique");
		Categ.update(cate);
	   System.out.println(cat2);
	   //delete Category 
		CategroyDao categ = new CategroyDao();
        System.out.println(categ.delete(2));

		
		//insertProduit
		ProductDao product = new ProductDao();
	    Produit prod = new Produit(1,"Smartphone",7865,2);
	    product.insert(prod);
	// updatePproduit 
		   ProductDao produc = new ProductDao();
           Produit prodc =new Produit(2, "webcam", 7896, 4);
           produc.update(prodc);	    
	    // deleteProduit 
		   ProductDao produ = new ProductDao();
	        System.out.println(produ.delete(1));


           
	}
	
	
	
	
	}
    