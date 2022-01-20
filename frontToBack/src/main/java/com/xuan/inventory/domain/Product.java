package com.xuan.inventory.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int pid;
    private String pname;
    private int purchprice;
    private int inventcount;
    private String tag;
    private String pgroup;

    public Product(){
        super();
    }


    public int getPid() {
        return pid;
    }


    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public int getPurchprice() {
        return purchprice;
    }

    public void setPurchprice(int purchprice) {
        this.purchprice = purchprice;
    }

    public int getInventcount() {
        return inventcount;
    }

    public void setInventcount(int inventcount) {
        this.inventcount = inventcount;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getPgroup() {
        return pgroup;
    }

    public void setPgroup(String group) {
        this.pgroup = group;
    }

    @Override
    public String toString() {
        return "Product{" +
                "pid=" + pid +
                ", pname='" + pname + '\'' +
                ", purchprice=" + purchprice +
                ", inventcount=" + inventcount +
                ", tag='" + tag + '\'' +
                ", pgroup='" + pgroup + '\'' +
                '}';
    }
} // end class