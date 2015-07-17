package ng.com.cc.app.services;

import ng.com.cc.app.entity.BaseModel;


public interface GenericService {

    <T extends BaseModel> T findEntityById(Class<T> clazz, Long id);


    <T extends BaseModel> void deleteEntity(T t);


    <T extends BaseModel> T saveEntity(T t);
}
