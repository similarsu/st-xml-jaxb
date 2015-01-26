package cn.st.xml.jaxb.entity;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
@XmlType(name="book",propOrder={"id","author","price","calendar"})
public class Book {
	@XmlElement(name="author",required=true)
	private String author;
	@XmlElement(name="price",required=true,defaultValue="0.0")
	private Float price;
	@XmlElement(name="calendar")
	private Date calendar;
	@XmlAttribute(name="id",required=true)
	private Long id;
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public Float getPrice() {
		return price;
	}
	public void setPrice(Float price) {
		this.price = price;
	}
	public Date getCalendar() {
		return calendar;
	}
	public void setCalendar(Date calendar) {
		this.calendar = calendar;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Book [author=" + author + ", price=" + price + ", calendar="
				+ calendar + ", id=" + id + "]";
	}
	
	
}
