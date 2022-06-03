package simplon.co.simplon.brief5;

public interface Dao_etudiant<T> {
	
	 public  boolean insertEtudiante(Etudiante Etud);
	 
        public boolean  UpdateEtudiante(int id, Etudiante Etud);
        
      public boolean deleteEtudiante  (int id ,Etudiante Etud);
  
}

