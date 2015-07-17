package ng.com.cc.app.dao.impl;

import javax.annotation.PostConstruct;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.sql.DataSource;

import ng.com.cc.app.dao.Dao;
import ng.com.cc.app.entity.BaseModel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcDaoSupport;
import org.springframework.stereotype.Repository;


@Repository("dao")
public class DefaultDao extends NamedParameterJdbcDaoSupport implements Dao {

    @Autowired
    private DataSource dataSource;


    // FIXME very important!
    @PostConstruct
    private void initialize() {
        setDataSource(dataSource);
    }


    @PersistenceContext
    protected EntityManager entityManager;

    @Override
    public <T extends BaseModel> T findEntityById(Class<T> clazz, Long id) {
        return entityManager.find(clazz, id);
    }


    @Override
    public <T extends BaseModel> void deleteEntity(T t) {
        entityManager.remove(t);
    }


    @Override
    public <T extends BaseModel> T saveEntity(T t) {
        if (t.getId() != null) {
            t = entityManager.merge(t);
        } else {
            entityManager.persist(t);
        }
        return t;
    }
}
