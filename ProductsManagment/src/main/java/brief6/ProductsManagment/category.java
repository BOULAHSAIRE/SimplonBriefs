package brief6.ProductsManagment;

public class category {

	public class Category {
		       private int id ;
			   private String article;
			   
			  
		
			   Category(int id , String article) {
				   this.id=id;
				   this.article = article;
			     
			   }
			   public int getId() {
					return id;
				}


				public void setId(int id) {
					this.id = id;
				}
				
			public String getArticle() {
				return article;
			}

			public void setArticle(String article) {
				this.article = article;
			}

	}

	
	public static String getarticle() {
		// TODO Auto-generated method stub
		return null;
	}

	
	

}
