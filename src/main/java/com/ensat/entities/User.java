package com.ensat.entities;


        import lombok.AllArgsConstructor;
        import lombok.Getter;
        import lombok.NoArgsConstructor;
        import lombok.Setter;
        import javax.persistence.Entity;
        import java.util.ArrayList;
        import javax.persistence.GeneratedValue;
        import javax.persistence.GenerationType;
        import javax.persistence.Id;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class User
{
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private String email;

    private String password;

}
