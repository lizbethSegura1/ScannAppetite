package prueba;
// Generated 18 dic 2023 23:11:31 by Hibernate Tools 4.3.6.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Categories generated by hbm2java
 */
@Entity
@Table(name = "categories", catalog = "restaurant")
public class Categories implements java.io.Serializable {

	private Long id;
	private String categoryEn;
	private String categoryUa;
	private Set disheses = new HashSet(0);

	public Categories() {
	}

	public Categories(String categoryEn, String categoryUa, Set disheses) {
		this.categoryEn = categoryEn;
		this.categoryUa = categoryUa;
		this.disheses = disheses;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id", unique = true, nullable = false)
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column(name = "category_en")
	public String getCategoryEn() {
		return this.categoryEn;
	}

	public void setCategoryEn(String categoryEn) {
		this.categoryEn = categoryEn;
	}

	@Column(name = "category_ua")
	public String getCategoryUa() {
		return this.categoryUa;
	}

	public void setCategoryUa(String categoryUa) {
		this.categoryUa = categoryUa;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "categories")
	public Set getDisheses() {
		return this.disheses;
	}

	public void setDisheses(Set disheses) {
		this.disheses = disheses;
	}

}