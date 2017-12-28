package models;

import play.db.jpa.Model;
import javax.persistence.*;


@Entity
public class lampu extends Model {
	public boolean status;
	
	@ManyToOne
	public lampu llampu;

	public lampu(boolean status) {
		super();
		this.status = status;
	}
	
	
}
