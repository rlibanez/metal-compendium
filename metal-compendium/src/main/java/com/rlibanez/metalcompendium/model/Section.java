package com.rlibanez.metalcompendium.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "section")
public class Section {
	@Id
	private String name;
	private float G;
	private float h;
	private float b;
	private float tw;
	private float tf;
	private float r1;
	private float r2;
	private float A;
	private float hi;
	private float d;
	private String dmax;
	private Integer emin;
	private Integer emax;
	private Integer pmin;
	private Integer pmax;
	private float AL;
	private float AG;
	private float Iy;
	private float Wely;
	private float Wply;
	private float iyc;
	private float Avz;
	private float Iz;
	private float Welz;
	private float Wplz;
	private float izc;
	private float ss;
	private float It;
	private float Iw;
	private float ys;
	private float ym;
	private boolean yS235;
	private boolean yS355;
	private boolean yS460;
	private boolean xS235;
	private boolean xS355;
	private boolean xS460;
	private boolean EN1002522004;
	private boolean EN1002542004;
	private boolean EN102252001;

	public Section() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getG() {
		return G;
	}

	public void setG(float g) {
		G = g;
	}

	public float getH() {
		return h;
	}

	public void setH(float h) {
		this.h = h;
	}

	public float getB() {
		return b;
	}

	public void setB(float b) {
		this.b = b;
	}

	public float getTw() {
		return tw;
	}

	public void setTw(float tw) {
		this.tw = tw;
	}

	public float getTf() {
		return tf;
	}

	public void setTf(float tf) {
		this.tf = tf;
	}

	public float getR1() {
		return r1;
	}

	public void setR1(float r1) {
		this.r1 = r1;
	}

	public float getR2() {
		return r2;
	}

	public void setR2(float r2) {
		this.r2 = r2;
	}

	public float getA() {
		return A;
	}

	public void setA(float a) {
		A = a;
	}

	public float getHi() {
		return hi;
	}

	public void setHi(float hi) {
		this.hi = hi;
	}

	public float getD() {
		return d;
	}

	public void setD(float d) {
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

	public float getAL() {
		return AL;
	}

	public void setAL(float aL) {
		AL = aL;
	}

	public float getAG() {
		return AG;
	}

	public void setAG(float aG) {
		AG = aG;
	}

	public float getIy() {
		return Iy;
	}

	public void setIy(float iy) {
		Iy = iy;
	}

	public float getWely() {
		return Wely;
	}

	public void setWely(float wely) {
		Wely = wely;
	}

	public float getWply() {
		return Wply;
	}

	public void setWply(float wply) {
		Wply = wply;
	}

	public float getIyc() {
		return iyc;
	}

	public void setIyc(float iyc) {
		this.iyc = iyc;
	}

	public float getAvz() {
		return Avz;
	}

	public void setAvz(float avz) {
		Avz = avz;
	}

	public float getIz() {
		return Iz;
	}

	public void setIz(float iz) {
		Iz = iz;
	}

	public float getWelz() {
		return Welz;
	}

	public void setWelz(float welz) {
		Welz = welz;
	}

	public float getWplz() {
		return Wplz;
	}

	public void setWplz(float wplz) {
		Wplz = wplz;
	}

	public float getIzc() {
		return izc;
	}

	public void setIzc(float izc) {
		this.izc = izc;
	}

	public float getSs() {
		return ss;
	}

	public void setSs(float ss) {
		this.ss = ss;
	}

	public float getIt() {
		return It;
	}

	public void setIt(float it) {
		It = it;
	}

	public float getIw() {
		return Iw;
	}

	public void setIw(float iw) {
		Iw = iw;
	}

	public float getYs() {
		return ys;
	}

	public void setYs(float ys) {
		this.ys = ys;
	}

	public float getYm() {
		return ym;
	}

	public void setYm(float ym) {
		this.ym = ym;
	}

	public boolean isyS235() {
		return yS235;
	}

	public void setyS235(boolean yS235) {
		this.yS235 = yS235;
	}

	public boolean isyS355() {
		return yS355;
	}

	public void setyS355(boolean yS355) {
		this.yS355 = yS355;
	}

	public boolean isyS460() {
		return yS460;
	}

	public void setyS460(boolean yS460) {
		this.yS460 = yS460;
	}

	public boolean isxS235() {
		return xS235;
	}

	public void setxS235(boolean xS235) {
		this.xS235 = xS235;
	}

	public boolean isxS355() {
		return xS355;
	}

	public void setxS355(boolean xS355) {
		this.xS355 = xS355;
	}

	public boolean isxS460() {
		return xS460;
	}

	public void setxS460(boolean xS460) {
		this.xS460 = xS460;
	}

	public boolean isEN1002522004() {
		return EN1002522004;
	}

	public void setEN1002522004(boolean eN1002522004) {
		EN1002522004 = eN1002522004;
	}

	public boolean isEN1002542004() {
		return EN1002542004;
	}

	public void setEN1002542004(boolean eN1002542004) {
		EN1002542004 = eN1002542004;
	}

	public boolean isEN102252001() {
		return EN102252001;
	}

	public void setEN102252001(boolean eN102252001) {
		EN102252001 = eN102252001;
	}

}
