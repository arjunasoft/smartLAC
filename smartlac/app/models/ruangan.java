package models;

import play.db.jpa.Model;
import javax.persistence.*;

@Entity
public class ruangan extends Model {
	
	public String nama;
	public int jmlkursi;
	public int jmllampu;
	
	
	public String toString(){
		return nama;
	}
	
	
	@ManyToOne
	public Gedung objgedung;
	
	
}
