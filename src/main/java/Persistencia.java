import com.sales4agro.Pessoa;

import javax.persistence.*;

public class Persistencia {
    public static void main(String... args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("salesagro");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        Pessoa pessoa = new Pessoa();

        pessoa.setAtivo(true);
        pessoa.setBairro("Centro");
        pessoa.setCep("87005040");
        pessoa.setTipoUsuario("1");
        pessoa.setCidade("Maringá");
        pessoa.setComplementoEndereco("tes");
        pessoa.setEmail("lucas@gmail.com");
        pessoa.setLogradouroEndereco("av sp");
        pessoa.setNomeSocial("TEste");
        pessoa.setUf(5);

        entityManager.getTransaction().begin();

        entityManager.persist(pessoa);

        entityManager.getTransaction().commit();

        entityManager.close();
        entityManagerFactory.close();


    }
}