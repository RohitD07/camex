package cam.com.camex.pojos;

import java.util.ArrayList;

public class CamItem {
String title;
String description;
String img;
String imgUrl;
String val1;
String val2;
String val3;
int colCnt;
ArrayList<CamItem> subitemList;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getVal1() {
        return val1;
    }

    public void setVal1(String val1) {
        this.val1 = val1;
    }

    public String getVal2() {
        return val2;
    }

    public void setVal2(String val2) {
        this.val2 = val2;
    }

    public String getVal3() {
        return val3;
    }

    public void setVal3(String val3) {
        this.val3 = val3;
    }

    public int getColCnt() {
        return colCnt;
    }

    public void setColCnt(int colCnt) {
        this.colCnt = colCnt;
    }

    public ArrayList<CamItem> getSubitemList() {
        return subitemList;
    }

    public void setSubitemList(ArrayList<CamItem> subitemList) {
        this.subitemList = subitemList;
    }
}
