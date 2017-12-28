package models;

import play.data.validation.Required;
import play.db.jpa.Model;

import javax.persistence.*;



@Entity
public class sensor extends Model{

	
	@Required
	@OneToOne @MapsId
	public ruangan objruang;
	
	public String toString(){
		return "Sensor Ruangan " + objruang.nama;
	}
	/*

	public boolean baca(boolean nilai){	
		return nilai;
	}*/
	
	
}
