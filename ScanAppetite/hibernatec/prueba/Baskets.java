package prueba;
// Generated 18 dic 2023 23:11:31 by Hibernate Tools 4.3.6.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Baskets generated by hbm2java
 */
@Entity
@Table(name = "baskets", catalog = "restaurant")
public class Baskets implements java.io.Serializable {

	private long id;
	private Dishes dishes;
	private Login login;

	public Baskets() {
	}

	public Baskets(long id) {
		this.id = id;
	}

	public Baskets(long id, Dishes dishes, Login login) {
		this.id = id;
		this.dishes = dishes;
		this.login = login;
	}

	@Id

	@Column(name = "id", unique = true, nullable = false)
	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "dish_id")
	public Dishes getDishes() {
		return this.dishes;
	}

	public void setDishes(Dishes dishes) {
		this.dishes = dishes;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "login_id")
	public Login getLogin() {
		return this.login;
	}

	public void setLogin(Login login) {
		this.login = login;
	}

}