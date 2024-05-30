package com.rlibanez.metalcompendium.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "section")
public class Section {
	@Id
	private String name;
	private Float G;
	private Float h;
	private Float b;
	private Float tw;
	private Float tf;
	private Float r1;
	private Float r2;
	private Float A;
	private Float hi;
	private Float d;
	private String dmax;
	private Integer emin;
	private Integer emax;
	private Integer pmin;
	private Integer pmax;
	private Float AL;
	private Float AG;
	private Float Iy;
	private Float Wely;
	private Float Wply;
	private Float iyc;
	private Float Avz;
	private Float Iz;
	private Float Welz;
	private Float Wplz;
	private Float izc;
	private Float ss;
	private Float It;
	private Float Iw;
	private Float ys;
	private Float ym;
	private Boolean yS235;
	private Boolean yS355;
	private Boolean yS460;
	private Boolean xS235;
	private Boolean xS355;
	private Boolean xS460;
	private Boolean EN1002522004;
	private Boolean EN1002542004;
	private Boolean EN102252001;

	public Section() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Float getG() {
		return G;
	}

	public void setG(Float g) {
		G = g;
	}

	public Float getH() {
		return h;
	}

	public void setH(Float h) {
		this.h = h;
	}

	public Float getB() {
		return b;
	}

	public void setB(Float b) {
		this.b = b;
	}

	public Float getTw() {
		return tw;
	}

	public void setTw(Float tw) {
		this.tw = tw;
	}

	public Float getTf() {
		return tf;
	}

	public void setTf(Float tf) {
		this.tf = tf;
	}

	public Float getR1() {
		return r1;
	}

	public void setR1(Float r1) {
		this.r1 = r1;
	}

	public Float getR2() {
		return r2;
	}

	public void setR2(Float r2) {
		this.r2 = r2;
	}

	public Float getA() {
		return A;
	}

	public void setA(Float a) {
		A = a;
	}

	public Float getHi() {
		return hi;
	}

	public void setHi(Float hi) {
		this.hi = hi;
	}

	public Float getD() {
		return d;
	}

	public void setD(Float d) {
		this.d = d;
	}

	public String getDmax() {
		return dmax;
	}

	public void setDmax(String dmax) {
		this.dmax = dmax;
	}

	public Integer getEmin() {
		return emin;
	}

	public void setEmin(Integer emin) {
		this.emin = emin;
	}

	public Integer getEmax() {
		return emax;
	}

	public void setEmax(Integer emax) {
		this.emax = emax;
	}

	public Integer getPmin() {
		return pmin;
	}

	public void setPmin(Integer pmin) {
		this.pmin = pmin;
	}

	public Integer getPmax() {
		return pmax;
	}

	public void setPmax(Integer pmax) {
		this.pmax = pmax;
	}

	public Float getAL() {
		return AL;
	}

	public void setAL(Float aL) {
		AL = aL;
	}

	public Float getAG() {
		return AG;
	}

	public void setAG(Float aG) {
		AG = aG;
	}

	public Float getIy() {
		return Iy;
	}

	public void setIy(Float iy) {
		Iy = iy;
	}

	public Float getWely() {
		return Wely;
	}

	public void setWely(Float wely) {
		Wely = wely;
	}

	public Float getWply() {
		return Wply;
	}

	public void setWply(Float wply) {
		Wply = wply;
	}

	public Float getIyc() {
		return iyc;
	}

	public void setIyc(Float iyc) {
		this.iyc = iyc;
	}

	public Float getAvz() {
		return Avz;
	}

	public void setAvz(Float avz) {
		Avz = avz;
	}

	public Float getIz() {
		return Iz;
	}

	public void setIz(Float iz) {
		Iz = iz;
	}

	public Float getWelz() {
		return Welz;
	}

	public void setWelz(Float welz) {
		Welz = welz;
	}

	public Float getWplz() {
		return Wplz;
	}

	public void setWplz(Float wplz) {
		Wplz = wplz;
	}

	public Float getIzc() {
		return izc;
	}

	public void setIzc(Float izc) {
		this.izc = izc;
	}

	public Float getSs() {
		return ss;
	}

	public void setSs(Float ss) {
		this.ss = ss;
	}

	public Float getIt() {
		return It;
	}

	public void setIt(Float it) {
		It = it;
	}

	public Float getIw() {
		return Iw;
	}

	public void setIw(Float iw) {
		Iw = iw;
	}

	public Float getYs() {
		return ys;
	}

	public void setYs(Float ys) {
		this.ys = ys;
	}

	public Float getYm() {
		return ym;
	}

	public void setYm(Float ym) {
		this.ym = ym;
	}

	public Boolean getyS235() {
		return yS235;
	}

	public void setyS235(Boolean yS235) {
		this.yS235 = yS235;
	}

	public Boolean getyS355() {
		return yS355;
	}

	public void setyS355(Boolean yS355) {
		this.yS355 = yS355;
	}

	public Boolean getyS460() {
		return yS460;
	}

	public void setyS460(Boolean yS460) {
		this.yS460 = yS460;
	}

	public Boolean getxS235() {
		return xS235;
	}

	public void setxS235(Boolean xS235) {
		this.xS235 = xS235;
	}

	public Boolean getxS355() {
		return xS355;
	}

	public void setxS355(Boolean xS355) {
		this.xS355 = xS355;
	}

	public Boolean getxS460() {
		return xS460;
	}

	public void setxS460(Boolean xS460) {
		this.xS460 = xS460;
	}

	public Boolean getEN1002522004() {
		return EN1002522004;
	}

	public void setEN1002522004(Boolean eN1002522004) {
		EN1002522004 = eN1002522004;
	}

	public Boolean getEN1002542004() {
		return EN1002542004;
	}

	public void setEN1002542004(Boolean eN1002542004) {
		EN1002542004 = eN1002542004;
	}

	public Boolean getEN102252001() {
		return EN102252001;
	}

	public void setEN102252001(Boolean eN102252001) {
		EN102252001 = eN102252001;
	}

}
