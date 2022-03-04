/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hdh;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

/**
 *
 * @author at160
 */
public class listTienTrinh {
    ArrayList <TienTrinh> listTT=new ArrayList<>();
    float z=0;
    float tb=0;
    int sotientrinh=0;
    public void DocFile(){
        try{
            File f = new File("input.txt");
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            String str;
            int i = 0;
            while ((str = br.readLine())!=null)
            {   
                if(i == 0){
                    sotientrinh = Integer.parseInt(str);
                    i++;
                }
                else{
                    String obj[] = str.split("-");
                listTT.add( new TienTrinh(Float.parseFloat(obj[0]),Float.parseFloat(obj[1])));
                }

            }
            br.close();
            fr.close();
        }catch(Exception e){
        }
        

    }
    
    public void ThoiGianCho1TT(){
        System.out.println("So tien trinh la: "+sotientrinh);
        for(int i=1;i<listTT.size();i++){
            z= listTT.get(i-1).thoigianthuchien+z;
            listTT.get(i).thoigianchodoi=z-listTT.get(i).thoigianxuathien;
            System.out.println("Thoi gian cho cua TT thu "+(i)+" la: "+listTT.get(i).thoigianchodoi);
        }
    }
    public void ThoiGianChoTBTT(){
        for(int i=1;i<listTT.size();i++){
            tb=listTT.get(i).thoigianchodoi+tb;
        }
        System.out.println("Thoi gian cho doi trung binh cua ca tien trinh la: "+tb/(listTT.size()-1));
    }
    
}
