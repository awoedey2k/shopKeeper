package ng.com.cc.app.dao;


import java.util.List;

import ng.com.cc.app.entity.SampleModel;

import org.springframework.data.repository.CrudRepository;



public interface SampleRepository extends CrudRepository<SampleModel, Long> {


    List<SampleModel> findByName(String name);
}
