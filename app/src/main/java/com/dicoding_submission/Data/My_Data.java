package com.dicoding_submission.Data;

import com.dicoding_submission.Model.Model_Data;

import java.util.ArrayList;

public class My_Data {
    public static String[][] data = new String[][]{
            {"Kinanti Kusumawardani","Android Development","4.5","https://www.dicoding.com/images/original/commons/kintan.jpg","30"},
            {"Cahyana Ahmadjayadi","Website Design","5.0","https://www.dicoding.com/images/original/commons/cahyana_ahmadjayadi.jpg","50"},
            {"Alfian Yusuf Abdullah","Android & IOS Development","3.0","https://www.dicoding.com/images/original/commons/alfian.jpg","40"},
            {"Habibi Mustafa","Website Design","4.0","https://www.dicoding.com/images/original/commons/habibi.jpg","30"},
            {"Ziya El Arief","Illustrator","4.5","https://www.dicoding.com/images/original/commons/ziya.jpg","50"},
            {"Adrianus Yoza","Desktop App","5.0","https://www.dicoding.com/images/original/commons/yoza.jpg","60"},
            {"Ash-Shiddiqul A. Hidayat","Video Editing","3.0","https://www.dicoding.com/images/original/commons/diqo.jpg","70"},
            {"Ahmad Immadudin","Website Design","5.0","https://www.dicoding.com/images/original/commons/ahmad.jpg","80"},
            {"Narenda Wicaksono","Website Developer","3.5","https://www.dicoding.com/images/original/commons/naren.jpg","55"}
    };

    public  static ArrayList<Model_Data> getlistdata(){
        ArrayList<Model_Data> list = new ArrayList<>();
        for (String[] aData:data){
            Model_Data hero = new Model_Data();
            hero.setNama(aData[0]);
            hero.setSkill(aData[1]);
            hero.setRating(aData[2]);
            hero.setFoto(aData[3]);
            hero.setGaji(aData[4]);
            list.add(hero);
        }
        return list;
    }
}