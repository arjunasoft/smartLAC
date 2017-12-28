package models;

import play.data.validation.Required;
import play.db.jpa.Model;

import javax.persistence.*;

@Entity
public class Gedung extends Model {
	@Required
	public String namagedung;
	
	public String toString(){
		return this.namagedung;
	}
}
