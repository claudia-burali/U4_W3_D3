package claudia_burali.dao;

import claudia_burali.entities.Location;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

public class LocationDAO {
    private EntityManager em;

    public LocationDAO(EntityManager em) {
        this.em = em;
    }


    public void save(Location location) {
        try {
            EntityTransaction t = em.getTransaction();
            t.begin();
            em.persist(location);
            t.commit();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public Location getById(long id) {
        return em.find(Location.class, id);
    }

    public void delete(long id) {
        try {
            EntityTransaction t = em.getTransaction();
            Location found = em.find(Location.class, id);
            if (found != null) {
                t.begin();
                em.remove(found);
                t.commit();
                System.out.println("Elemento eliminato");
            } else System.out.println("Elemento non trovato");


        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}