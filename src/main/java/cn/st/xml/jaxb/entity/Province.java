package cn.st.xml.jaxb.entity;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
@XmlType(name="province",propOrder={"name","cityList"})
public class Province {
	@XmlElement(name="name")
	private String name;
	@XmlElementWrapper(name="citys")
	@XmlElement(name="city")
	private List<City> cityList;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<City> getCityList() {
		return cityList;
	}
	public void setCityList(List<City> cityList) {
		this.cityList = cityList;
	}
	@Override
	public String toString() {
		return "Province [name=" + name + ", cityList=" + cityList + "]";
	}
	
}
