package br.com.arturemilcorp.DashCard.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl_user")
public class Usuario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_user")
	private int id;
	
	@Column(name="name_user" , length = 100 , nullable = false, unique = false)
	private String name;
	
	@Column(name="email_user", length = 100 , nullable = false, unique = true)
	private String email;
	
	@Column(name="racf_user", length=7 , nullable = true)
	private String racf;
	
	@Column(name="password_user" , length = 50 , nullable = false)
	private String password;
	
	@Column(name="Link_Photo", length = 255 )
	private String LinkPhoto;

	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRacf() {
		return racf;
	}

	public void setRacf(String racf) {
		this.racf = racf;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getLinkPhoto() {
		return LinkPhoto;
	}

	public void setLinkPhoto(String linkPhoto) {
		LinkPhoto = linkPhoto;
	}
	
	
	
}
