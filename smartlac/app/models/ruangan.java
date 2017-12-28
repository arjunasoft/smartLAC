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
	
	/*


	public ruangan(String nama, int jmlkursi, int jmllampu, Gedung objgedung) {
		super();
		this.nama = nama;
		this.jmlkursi = jmlkursi;
		this.jmllampu = jmllampu;
		this.objgedung = objgedung;
	}
	*/

    @Required
	@ManyToOne
	public Gedung objgedung;
	
	
	
}
