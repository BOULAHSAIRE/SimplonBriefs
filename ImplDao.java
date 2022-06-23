package DsAppl;
import java.sql.ResultSet;
import java.sql.SQLException;
import application.ConBD;
import javafx.collections.ObservableList;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
	     public class ImplDao<T> implements DaoCandidat<T> {
	    	 
		ConBD cn = new ConBD().get_connection();
		
			public ImplDao(int id, String firstName, String lastName, String email, String adresse, 
					String city,String country){
			}
			public boolean Create (Candidat cand) {
				
					try {

				           String sql ="insert into Candidat (id,  firstName, lastName,email, adresse, city ,country))"
				           		+ "values (?,?,?,?,?,?,?)";
						      PreparedStatement PS = cn.prepareStatement(sql);
						    		 
					            PS.setInt(1, cand.getId());
							    PS.setString(2, cand.getFirstName());
						        PS.setString(3, cand.getLastName());
						        PS.setString(4, cand.getEmail());
					            PS.setString(5, cand.getAdresse());
				                PS.setString(6, cand.getCity());
				                PS.setString(7, cand.getCountry());
						        int i = PS.executeUpdate();
			                    if(i ==  1) {
			        				return true;	
			                    }
	                  }catch(Exception e ) {
							System.out.println(e);
						}
					return false;
				}
			
	    
			public boolean Update(int Id, Candidat cand) {
	    			
				 try {
			           String sql ="Update etudiant SET id,  firstName, lastName,email,"
			           		+ " adresse, city ,country))" + "values (?,?,?,?,?,?,?)";
			           PreparedStatement rs = cn.prepareStatement(sql);
					     rs.setInt(1, cand.getId());
						    rs.setString(2, cand.getFirstName());
					        rs.setString(3, cand.getLastName());
					        rs.setString(4, cand.getEmail());
				            rs.setString(5, cand.getAdresse());
			                rs.setString(6, cand.getCity());
			                rs.setString(7, cand.getCountry());
					        int i = rs.executeUpdate();
					      if(i == 1) {
					  	    return true;
					      }

					    } catch (Exception e) {
			            System.out.println(e);    
					    }
					    return false;
			}
		
			public boolean Delete(int Id, Candidat cand) {
					try {
						    	String sql =("DELETE FROM candidat id=?, prenom=?,nom=?, email =?,adress=?"
						    			+ ",ville=?,pays=? WHERE id="+Id);
							      PreparedStatement stm= cn.prepareStatement(sql);
						    	  stm.setInt(1, cand.getId());
						    	  stm.setString(2, cand.getFirstName());
							        stm.setString(3, cand.getLastName());
							        stm.setString(4, cand.getEmail());
						            stm.setString(5, cand.getAdresse());
					                stm.setString(6, cand.getCity());
					                stm.setString(7, cand.getCountry());
							        int i = stm.executeUpdate();
					     	    
						       if(i == 1) {
						        return true;
						      }
						    }catch(Exception e) {
								   System.out.println(e);
							   }
							return false;
			}
			
			@Override
			public List<T> getAll() throws SQLException {
				List<T> ListerCandidats = new ArrayList<>();
				try {
				String sql ="SELECT * FROM Candidat";
									Statement stmt = null;
									try {
										stmt = ConBD.prepareStatement(sql);
									} catch (Exception e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}
									ResultSet rs = stmt.executeQuery(sql);
										
										while(rs.next()){
											Candidat candidat = new Candidat(0, sql, sql, sql, sql, sql, sql);
											candidat.setId(rs.getInt("IdCandidat"));
											candidat.setFirstName(rs.getString("firstnameCandidat"));
											candidat.setLastName(rs.getString("lastnameCandidat"));
											candidat.setEmail(rs.getString("EmailCandidat"));
											candidat.setAdresse(rs.getString("AdresseCandidat"));
											candidat.setCity(rs.getString("cityCandidat"));
											candidat.setCountry(rs.getString("counttryCandidat"));
											ListerCandidats.add((T) candidat);
										}

				}catch (Exception e) {
					e.printStackTrace();
				}
				return ListerCandidats;
				}
			@Override
			public ObservableList<Candidat> getCandidatList() {
				// TODO Auto-generated method stub
				return null;
			}



				
	     }		