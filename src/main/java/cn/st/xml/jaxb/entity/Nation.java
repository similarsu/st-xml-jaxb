package cn.st.xml.jaxb.entity;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "nation")
@XmlType(name = "nation", propOrder = {"name", "provinceList"})
// propOrder 为 class的属性名
public class Nation {
    @XmlElement(name = "name")
    private String name;
    @XmlElementWrapper(name = "provices")
    @XmlElement(name = "province")
    private List<Province> provinceList;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Province> getProvinceList() {
        return provinceList;
    }

    public void setProvinceList(List<Province> provinceList) {
        this.provinceList = provinceList;
    }

    @Override
    public String toString() {
        return "Nation [name=" + name + ", provinceList=" + provinceList + "]";
    }

}
