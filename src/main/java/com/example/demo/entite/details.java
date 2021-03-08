package com.example.demo.entite;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Transient;

import java.io.Serializable;
import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

	

@Entity
public class details { 

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private  Integer id  ;	
	private  Date cdate  ;
	private  String namea  ;
	private  String nomC  ;
	private  String album  ;
	private  Date date1  ;
	private  Date date2  ;
	private  float uniteprice  ;
	private  Integer quantite  ;
	private  String plateforme  ;
	private  float netrevenu  ;
	private  float grossrevenu  ;
	private  String devise  ;
	private  String label  ;
	private  String upc  ;
	private  String isrc  ;
	private  String content  ;
	private  String producer	  ;
	private  String category  ;
	private  String type  ;
	private  String country  ;
	private  Date udate  ;
	
	/*@ManyToMany
    private Set<chanson> chanson = new HashSet<>();
    private chanson chanson ;X
	
	@Transient
	private Integer idChanson  = new Integer(0);*/
	
    @ManyToMany
    private List<details> chanson = new ArrayList<>();

    //private Set<chanson> chanson = new HashSet<>();
       
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Date getCdate() {
		return cdate;
	}
	public void setCdate(Date cdate) {
		this.cdate = cdate;
	}
	public String getNamea() {
		return namea;
	}
	public void setNamea(String namea) {
		this.namea = namea;
	}
	 
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	public Date getDate1() {
		return date1;
	}
	public void setDate1(Date date1) {
		this.date1 = date1;
	}
	public Date getDate2() {
		return date2;
	}
	public void setDate2(Date date2) {
		this.date2 = date2;
	} 
	public Integer getQuantite() {
		return quantite;
	}
	public void setQuantite(Integer quantite) {
		this.quantite = quantite;
	}
	public String getPlateforme() {
		return plateforme;
	}
	public void setPlateforme(String plateforme) {
		this.plateforme = plateforme;
	}
	public float getNetrevenu() {
		return netrevenu;
	}
	public void setNetrevenu(float netrevenu) {
		this.netrevenu = netrevenu;
	}
	public float getGrossrevenu() {
		return grossrevenu;
	}
	public void setGrossrevenu(float grossrevenu) {
		this.grossrevenu = grossrevenu;
	}
	public String getDevise() {
		return devise;
	}
	public void setDevise(String devise) {
		this.devise = devise;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public String getUpc() {
		return upc;
	}
	public void setUpc(String upc) {
		this.upc = upc;
	}
	public String getIsrc() {
		return isrc;
	}
	public void setIsrc(String isrc) {
		this.isrc = isrc;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
 
	public float getUniteprice() {
		return uniteprice;
	}
	public void setUniteprice(float uniteprice) {
		this.uniteprice = uniteprice;
	}
	public String getProducer() {
		return producer;
	}
	public void setProducer(String producer) {
		this.producer = producer;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public Date getUdate() {
		return udate;
	}
	public void setUdate(Date udate) {
		this.udate = udate;
	}
	public String getNomC() {
		return nomC;
	}
	public void setNomC(String nomC) {
		this.nomC = nomC;
	}
	/*public chanson getChanson() {
		return chanson;
	}
	public void setChanson(chanson chanson) {
		this.chanson = chanson;
	}	

	public Integer getIdChanson() {
		return this.chanson != null ? this.chanson.getId() : this.id;
	}
	public void setIdChanson(Integer idChanson) {
		this.idChanson = idChanson;
	} 
*/
	public List<details> getChanson() {
		return chanson;
	}
	public void setChanson(List<details> chanson) {
		this.chanson = chanson;
	}
	
	public details() {
		super();
	}
	
	
}
