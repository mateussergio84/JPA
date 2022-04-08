package aplicacao;

import dominio.Pessoa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Programa {
	
	public static void main(String[] args) {
		Pessoa p1 = new Pessoa( "teste");
		Pessoa p2 = new Pessoa("teste1");
		Pessoa p3 = new Pessoa( "teste2");

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();
		em.persist(p1);
		em.persist(p2);
		em.persist(p3);
		em.getTransaction().commit();




	}
	
	

}
