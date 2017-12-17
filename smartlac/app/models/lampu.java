package models;

import play.db.jpa.Model;
import javax.persistence.*;

@Entity
public class lampu extends Model {
	//public int id;
	public boolean status;
	//public enum status{menyala,mati};
	
}
