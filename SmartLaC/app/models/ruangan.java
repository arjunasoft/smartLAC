package models;

import java.util.List;

import play.data.validation.Required;
import play.db.jpa.Model;

import javax.persistence.*;

@Entity
public class ruangan extends Model {
	@Required
	public String nama;
	@Required
	public int jmlkursi;
	@Required
	public int jmllampu;
	
	
	public String toString(){
		return nama;
	}
	
	
	@OneToMany(mappedBy="llampu", cascade=CascadeType.ALL)
    public List<lampu> listlampu;
	

    @Required
	@ManyToOne
	public Gedung objgedung;
	
	
	
}
