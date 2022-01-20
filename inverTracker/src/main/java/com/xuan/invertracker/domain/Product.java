package com.xuan.invertracker.domain;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long pid;
    private String pname;
    private int purchasePrice;
    private int inventoryCount;
    private String tag;
    private String group;

    public Product(){
        super();
    }

    public Product(Long pid, String pname, int purchasePrice, int inventoryCount, String tag, String group) {
        this.pid = pid;
        this.pname = pname;
        this.purchasePrice = purchasePrice;
        this.inventoryCount = inventoryCount;
        this.tag = tag;
        this.group = group;
    }


    public Long getPid() {
        return pid;
    }

    public void setPid(Long pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public int getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(int purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public int getInventoryCount() {
        return inventoryCount;
    }

    public void setInventoryCount(int inventoryCount) {
        this.inventoryCount = inventoryCount;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "Product{" +
                "pid=" + pid +
                ", pname='" + pname + '\'' +
                ", purchasePrice=" + purchasePrice +
                ", inventoryCount=" + inventoryCount +
                ", tag='" + tag + '\'' +
                ", group='" + group + '\'' +
                '}';
    }
} // end class
