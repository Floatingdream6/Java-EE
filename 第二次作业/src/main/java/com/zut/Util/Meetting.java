package com.zut.Util;

import java.util.List;

/**
 * Created by 韩俊哲
 * on 2019/10/12
 */

public class Meetting {
    private String theme;
    private List<Boss> list;

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public List<Boss> getList() {
        return list;
    }

    public void setList(List<Boss> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "Meetting{" +
                "theme='" + theme + '\'' +
                ", list=" + list +
                '}';
    }
}
