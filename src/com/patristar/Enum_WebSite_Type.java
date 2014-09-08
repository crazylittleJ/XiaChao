package com.patristar;

public enum Enum_WebSite_Type {
	 MAIN("首頁", "http://www.xiachao.org.tw/",1), CAMP("交流","http://chinatide.net/Camp/", 2),DEGREE ("就學","http://chinatide.net/Camp/" ,3), 
	 BENPOST("犇報","http://ben.chinatide.net/", 4);
     // 成員變數
     private String name;
     private String website;
     private int index;

     // 建構式
     private Enum_WebSite_Type(String name,String website, int index) {
         this.name = name;
         this.website = website;
         this.index = index;
     }

     // 普通方法
     public static String getName(int index) {
         for (Enum_WebSite_Type e : Enum_WebSite_Type.values()) {
             if (e.getIndex() == index) {
                 return e.name;
             }
         }
         return null;
     }

     // get set 方法
     public String getName() {
         return name;
     }

     public void setName(String name) {
         this.name = name;
     }

     public int getIndex() {
         return index;
     }

     public void setIndex(int index) {
         this.index = index;
     }

}
