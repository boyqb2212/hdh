/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hdh;

import java.util.Scanner;

/**
 *
 * @author at160
 */
public class TienTrinh {
    float thoigianthuchien;
    float thoigianxuathien;
    float thoigianchodoi;

    public TienTrinh() {
    }

    public TienTrinh(float thoigianthuchien, float thoigianxuathien) {
        this.thoigianthuchien = thoigianthuchien;
        this.thoigianxuathien = thoigianxuathien;
    }

    public float getThoigianthuchien() {
        return thoigianthuchien;
    }

    public void setThoigianthuchien(float thoigianthuchien) {
        this.thoigianthuchien = thoigianthuchien;
    }

    public float getThoigianxuathien() {
        return thoigianxuathien;
    }

    public void setThoigianxuathien(float thoigianxuathien) {
        this.thoigianxuathien = thoigianxuathien;
    }
    public void Nhap(){
        Scanner Input=new Scanner (System.in);
        System.out.println("Nhap thoi gian thuc hien cua tien trinh");
        this.thoigianthuchien=Input.nextFloat();
        System.out.println("Nhap thoi gian xuat hien cua tien trinh");
        this.thoigianxuathien=Input.nextFloat();
    }

    @Override
    public String toString() {
        return "TienTrinh{" + "thoigianthuchien=" + thoigianthuchien + ", thoigianxuathien=" + thoigianxuathien + ", thoigianchodoi=" + thoigianchodoi + '}';
    }
    
}
