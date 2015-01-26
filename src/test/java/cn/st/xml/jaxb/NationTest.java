package cn.st.xml.jaxb;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import cn.st.xml.jaxb.entity.City;
import cn.st.xml.jaxb.entity.Nation;
import cn.st.xml.jaxb.entity.Province;
import cn.st.xml.jaxb.util.JaxbUtil;

public class NationTest {
    @Test
    public void java2xml() {
        City city1 = new City();
        city1.setName("温州市");
        City city2 = new City();
        city2.setName("杭州市");
        City city3 = new City();
        city3.setName("南京市");
        City city4 = new City();
        city4.setName("无锡市");
        Province province1 = new Province();
        province1.setName("浙江省");
        List<City> citys = new ArrayList<City>();
        citys.add(city1);
        citys.add(city2);
        province1.setCityList(citys);
        Province province2 = new Province();
        province2.setName("江苏省");
        citys = new ArrayList<City>();
        citys.add(city3);
        citys.add(city4);
        province2.setCityList(citys);
        Nation nation = new Nation();
        nation.setName("中国");
        List<Province> provinces = new ArrayList<Province>();
        provinces.add(province1);
        provinces.add(province2);
        nation.setProvinceList(provinces);
        String xml = JaxbUtil.convertToXml(nation);
        System.out.println(xml);
    }

    @Test
    public void xml2java() {
        String xml =
                "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>" + "<nation>"
                        + "<name>中国</name>" + "<provices>" + "<province>" + "<name>浙江省</name>"
                        + "<citys>" + "<city>" + "<name>温州市</name>" + "</city>" + "<city>"
                        + "<name>杭州市</name>" + "</city>" + "</citys>" + "</province>"
                        + "<province>" + "<name>江苏省</name>" + "<citys>" + " <city>"
                        + "<name>南京市</name>" + "</city>" + "<city>" + "<name>无锡市</name>"
                        + "</city>" + "</citys>" + "</province>" + "</provices>" + "</nation>";
        Nation nation = JaxbUtil.converyToJavaBean(xml, Nation.class);
        System.out.println(nation);
    }
}
