package example.model;



import javax.persistence.*;

@Entity
@Table(name = "users")
public class User{

	@Id
	@GeneratedValue
	@Column(name = "id")
	private Long id;

    @Column(name = "login",  nullable = false, unique = true)
    private String login;

    @Column(name = "password", length = 30)
    private String password;

    @Column(name = "role", length = 30)
    private String role;

    public User() {
    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
}
