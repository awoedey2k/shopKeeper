package ng.com.cc.app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class SampleModel extends BaseModel {

    private static final long serialVersionUID = 4997679310904424279L;

    private String name;

    private String code;


    public SampleModel() {
        super();
    }


    public SampleModel(String name, String code) {
        this();
        setName(name);
        setCode(code);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Column(unique = true)
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

}
