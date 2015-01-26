package cn.st.xml.jaxb;

import java.util.Date;

import org.junit.Test;

import cn.st.xml.jaxb.entity.Book;
import cn.st.xml.jaxb.entity.User;
import cn.st.xml.jaxb.util.JaxbUtil;

public class UserTest {
	@Test
	public void java2xml(){
		User user=new User();
		user.setId(1l);
		user.setName("张三");
		user.setAge(22);
		Book book=new Book();
		book.setId(2l);
		book.setAuthor("李四");
		book.setPrice(10.00f);
		book.setCalendar(new Date());
		user.setBook(book);
		String xml=JaxbUtil.convertToXml(user);
		System.out.println(xml);
	}
	
	@Test
	public void xml2java(){
		String xml="<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>"+
					"<user>"+
					    "<id>1</id>"+
					    "<name>张三</name>"+
					    "<age>22</age>"+
					    "<book id=\"2\">"+
					        "<author>李四</author>"+
					        "<price>10.0</price>"+
					        "<calendar>2014-07-14T20:04:02.200+08:00</calendar>"+
					    "</book>"+
					"</user>";
		User user=JaxbUtil.converyToJavaBean(xml, User.class);
		System.out.println(user);
	}
}
