package DsAppl;

import java.sql.SQLException;
import java.util.List;

import javafx.collections.ObservableList;

public interface DaoCandidat<T> {
	    public boolean Create (Candidat cand);
		public boolean Update (int Id, Candidat cand);
		public boolean Delete (int Id, Candidat cand);
	 ObservableList<Candidat> getCandidatList();
		List <T> getAll() throws SQLException;

		// TODO Auto-generated method stub
		
	}
		
