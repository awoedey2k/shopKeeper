package ng.com.cc.app.dao;

import ng.com.cc.app.entity.BaseModel;


public interface Dao {

    <T extends BaseModel> T findEntityById(Class<T> clazz, Long id);


    <T extends BaseModel> void deleteEntity(T t);


    <T extends BaseModel> T saveEntity(T t);
}
