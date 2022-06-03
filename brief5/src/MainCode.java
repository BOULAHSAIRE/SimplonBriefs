package simplon.co.simplon.brief5;

public class MainCode {

	public static void main(String[] args) {
		
		
		Implement_dao  implement_dao = new Implement_dao();
		
      Etudiante nawal = new Etudiante(12,"boulahsaire","nawal","nawalnawalniiiiawl@gmail.com","Rue657N79","Agadir","Maroc");
       System.out.print(implement_dao.insertEtudiante(nawal));
	


       Etudiante iman = new Etudiante(5,"Ahmed","Bina","AhmedBina@gmail.ma","Rue908 Jerff","Rabat","Maroc");
 
       System.out.print(implement_dao.UpdateEtudiante(5, iman));

      
       @SuppressWarnings("unused")
	Etudiante Nouri = new Etudiante(5,"Ahmed","Bina","AhmedBina@gmail.ma","Rue908 Jerff","Rabat","Maroc");
       System.out.print(implement_dao.deleteEtudiante(5, iman));

 
	}
	
}