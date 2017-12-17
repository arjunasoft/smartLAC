package models;

import play.db.jpa.Model;
import javax.persistence.*;

@Entity
public class Gedung extends Model {
	public String namagedung;
	public String toString(){
		return this.namagedung;
	}
}
