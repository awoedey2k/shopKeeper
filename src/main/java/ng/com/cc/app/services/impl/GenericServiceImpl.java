package ng.com.cc.app.services.impl;

import ng.com.cc.app.dao.Dao;
import ng.com.cc.app.entity.BaseModel;
import ng.com.cc.app.services.GenericService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service("genericService")
@Transactional
public class GenericServiceImpl implements GenericService {

    @Autowired
    protected Dao dao;


    @Override
    public <T extends BaseModel> T findEntityById(Class<T> clazz, Long id) {
        return dao.findEntityById(clazz, id);
    }


    @Override
    public <T extends BaseModel> void deleteEntity(T t) {
        dao.deleteEntity(t);
    }


    @Override
    public <T extends BaseModel> T saveEntity(T t) {
        return dao.saveEntity(t);
    }
}
