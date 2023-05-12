package com.devsuperior.dslist.projections;

public interface GameMinProjection {

	//para a consulta personalisada
	Long getId();
	String getTitle();
	Integer getYear();
	String getImgUrl();
	String getShortDescription();
	Integer getPosition();
}
