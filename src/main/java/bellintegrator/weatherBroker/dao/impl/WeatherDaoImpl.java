package bellintegrator.weatherBroker.dao.impl;

import bellintegrator.weatherBroker.dao.WeatherDao;
import bellintegrator.weatherBroker.model.WeatherEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.List;

@Repository
public class WeatherDaoImpl implements WeatherDao {

    @PersistenceContext(unitName = "manager")
    private  EntityManager em;


    @Override
    public void save(WeatherEntity we) {
        em.persist(we);
    }

    @Override
    public List<WeatherEntity> loadByCity(String city) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery cq = cb.createQuery(WeatherEntity.class);
        Root<WeatherEntity> weatherRoot = cq.from(WeatherEntity.class);
        Predicate predicate = cb.conjunction();
        Predicate p = cb.equal(weatherRoot.get("city"), city);
        predicate = cb.and(predicate, p);
        cq.where(predicate);
        TypedQuery<WeatherEntity> query = em.createQuery(cq);
        List<WeatherEntity> result = query.getResultList();
        return result;
    }
}
