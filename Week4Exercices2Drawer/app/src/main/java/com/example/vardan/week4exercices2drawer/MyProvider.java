package com.example.vardan.week4exercices2drawer;

import android.content.Context;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyProvider {
    static List<ListModel> list = new ArrayList<>();
    public static int position;

    public static List<ListModel> getUsersList(Context context) {
        if (!list.isEmpty()) {
            list.clear();
        }


        list.add(new ListModel("Nike Hypervenom Bronze", new String[]{"http://www.bikeanalysis.com/images/pic/FHu4fwthdvM7_3349.jpg", "https://cdn3.volusion.com/goz35.avhz4/v/vspfiles/photos/SIYNI749920-903-4.jpg?1456231556", "https://cdn3.volusion.com/goz35.avhz4/v/vspfiles/photos/SIYNI749920-903-5.jpg?1456231556"}, context.getString(R.string.hypervenom), "rtsp://r1---sn-4g5ednly.googlevideo.com/Cj0LENy73wIaNAnRvRCtk-jhDhMYDSANFC3lYFtbMOCoAUIASARg37D6qvOspolbigELRWtEZEJxaG1FaHMM/B39F2D3FB073F749A3329B4E520C55D2B4EE5553.8EB393F80C06F6C2CDDF28DA77CA2596E4F088FB/yt6/1/video.3gp", 3, "shoes", false, false));
        list.add(new ListModel("Nike Lunar", new String[]{"https://cdn3.volusion.com/goz35.avhz4/v/vspfiles/photos/SI-NI643273-070-2.jpg?1456231556", "https://cdn3.volusion.com/goz35.avhz4/v/vspfiles/photos/SI-NI643273-070-4.jpg?1456231556", "https://cdn3.volusion.com/goz35.avhz4/v/vspfiles/photos/SI-NI643273-070-6.jpg?1456231556"}, context.getString(R.string.lunar), "rtsp://r3---sn-4g5ednsy.googlevideo.com/Cj0LENy73wIaNAnZ_e6M2VLKThMYDSANFC0QZVtbMOCoAUIASARg37D6qvOspolbigELRWtEZEJxaG1FaHMM/87FC8E3467C5EED1EFF531F72044904AE3002CAA.C810A67F64C171FC7391E7209E08AA7BAC4869C9/yt6/1/video.3gp", 2, "shoes", false, false));
        list.add(new ListModel("Nike Lunar Gato", new String[]{"https://images.solecollector.com/complex/image/upload/xutuojfmcvdm6h63jzlz.jpg", "http://www.ugeavisen.net/i.php?https://images.solecollector.com/complex/image/upload/ypwjledwexwjwwvg7yc4.jpg", "http://giayfutsal.com.vn/public/images/product/1257624-%C4%91%E1%BB%8F.jpg"}, context.getString(R.string.lunar_gato), "rtsp://r4---sn-4g5edney.googlevideo.com/Cj0LENy73wIaNAnzMWAWW3745xMYDSANFC3PZFtbMOCoAUIASARg37D6qvOspolbigELRWtEZEJxaG1FaHMM/BE17517072E668E0C6AE906BF3AD6D1583AF056E.249FC0CD402F575163112EB12CE57FA14DE5A2F4/yt6/1/video.3gp", 2, "shoes", false, false));
        list.add(new ListModel("Audi Electric Bike", new String[]{"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSLlEk05JQJpZCYrFXMf4-PhD16bGBFuJYVtQzfJ6YA2nu1dAuN", "https://www.extremetech.com/wp-content/uploads/2012/05/audi-e-bike-640x353.jpg", "https://www.mountainbike-magazin.de/sixcms/media.php/6/UB-Pedelec-Prototyp-Audi-Woerthersee-1.jpg"}, context.getString(R.string.audi), "rtsp://r2---sn-4g5e6nzl.googlevideo.com/Cj0LENy73wIaNAk1ztcYT0p99xMYDSANFC2pZVtbMOCoAUIASARg37D6qvOspolbigELRWtEZEJxaG1FaHMM/5C40B486BF618B5E6EE55B597B4D56B102C456FA.A7AF73FE302004AAA7EABD05B1FEA0C52A5DC1F1/yt6/1/video.3gp", 2, "bicycles", false, false));
        list.add(new ListModel("Swatch Sutr400 Red", new String[]{"https://images-na.ssl-images-amazon.com/images/I/81PFzjjg3jL._UY445_.jpg", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQrOU9xXhAL62s17VXbu_BiAUWg1UwQezt4kJZlFhdXkGqBAGZT", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQnI1poehIhAMhzAnxHJUAI93kU1HDw2LzmrFaZO-u-uMnZ6C_3"}, context.getString(R.string.swatch), "rtsp://r2---sn-4g5e6ns6.googlevideo.com/Cj0LENy73wIaNAnO4F85pLvA4hMYDSANFC2wZFtbMOCoAUIASARg37D6qvOspolbigELRWtEZEJxaG1FaHMM/A20D5ECDFEA1D7274179ACE22FDEEEFD77D9CDAD.BCF575D8732EF51D9C4D9F938FE85EC1207B18F7/yt6/1/video.3gp", 2, "watches", false, false));
        list.add(new ListModel("Nike Rain Jacket Red", new String[]{"http://www.brandmemarketing.co.uk/images/brandmemarketing.co.uk/nike-jacket-blue-force-reflective-silver-bright-crimson-drifit-shield-light-mens-running-clothing-12GM.jpg", "http://www.deverevideo.co.nz/images/cHpAxHeDWm/nike-mens-blue-force-bright-crimson-clothing-shield-light-29CG.jpg", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSgSWHPF7mZOBkEVreTsUx7FsDTmqvqAWNJkUVykmtGhE74x989nQ"}, context.getString(R.string.jacket_red), "rtsp://r5---sn-4g5ednsr.googlevideo.com/Cj0LENy73wIaNAmXYZdYSq6VrBMYDSANFC2PZFtbMOCoAUIASARg37D6qvOspolbigELRWtEZEJxaG1FaHMM/49CEA32A8999ACE921C859D10AE0C9D2D15B0470.8ADE5149C855D6436D7FBE41A0A70618B73298E4/yt6/1/video.3gp", 2, "jackets", false, false));
        list.add(new ListModel("Rolex Milgauss Skull Art", new String[]{"http://www.bespokeluxuryconcept.com/386-thickbox_default/rolex-milgauss-skull-art-poa.jpg", "http://www.bespokeluxuryconcept.com/img/blockslideshow/6.jpg", "https://i1.adis.ws/i/forzieri/rx580015-014-2x-t?$nlpv$"}, context.getString(R.string.rolex), "rtsp://r3---sn-4g5ednle.googlevideo.com/Cj0LENy73wIaNAmfepBDsyjOmhMYDSANFC1qZFtbMOCoAUIASARg37D6qvOspolbigELRWtEZEJxaG1FaHMM/6F9404E833709FC8667ED58097E1C5117FFE4211.CD9FBA54A81D65601AC147AFF52ABFBFABE0C67C/yt6/1/video.3gp", 2, "watches", false, false));
        list.add(new ListModel("Hummer Rally Foldable Hummer Mountain Bike", new String[]{"https://cf3.s3.souqcdn.com/item/2016/11/02/11/80/00/76/item_XL_11800076_17232482.jpg", "https://cf1.s3.souqcdn.com/item/2016/07/14/11/10/33/56/item_XL_11103356_15306995.jpg", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTsshoL_Trujv3FvKdT6FR0PvoEGZLTKCkMjFdglXaYXoAPGGWg1A"}, context.getString(R.string.hummer_bicycle), "rtsp://r3---sn-4g5e6nz7.googlevideo.com/Cj0LENy73wIaNAl9FSvwKa2IlBMYDSANFC1iY1tbMOCoAUIASARg37D6qvOspolbigELRWtEZEJxaG1FaHMM/B8EAA3165011D3C944A1931A953D496170D799EF.501729F42C25D4D5D3863689A8028B0D19AA694C/yt6/1/video.3gp", 2, "bicycles", false, false));
        list.add(new ListModel("Nike hiper", new String[]{"https://i.ebayimg.com/images/g/z8QAAOSwESNZ8ggR/s-l300.jpg", "https://static.webshopapp.com/shops/176120/files/087541202/790x592x2/nike-mens-sportswear-tech-knit-windrunner-jacket-c.jpg", "https://static.webshopapp.com/shops/176120/files/087541205/790x592x2/nike-mens-sportswear-tech-knit-windrunner-jacket-c.jpg"}, context.getString(R.string.runner_jacket), "rtsp://r4---sn-4g5e6nsr.googlevideo.com/Cj0LENy73wIaNAlFpdq7C9x6rRMYDSANFC0oZFtbMOCoAUIASARg37D6qvOspolbigELRWtEZEJxaG1FaHMM/A20A8C90AD310A3DBCE06793AA72DF2431919939.02FECED578F42967110F4493CD60988A79416F7D/yt6/1/video.3gp", 2, "jackets", false, false));
        list.add(new ListModel("Nike Tech Knit Windrunner ", new String[]{"https://http2.mlstatic.com/nike-elastico-superfly-ic-D_NQ_NP_612615-MLM25287033236_012017-F.jpg", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQH0C5I8iKbmKjRg7Gkwmz3e2FMkrN36-9MvrDZi6r8ZwQaTB0C", "http://cdn3.volusion.com/goz35.avhz4/v/vspfiles/photos/SI-NI641597-001-8.jpg?1456231556"}, context.getString(R.string.hyper_jacket), "rtsp://r5---sn-4g5ednly.googlevideo.com/Cj0LENy73wIaNAlWO6GTfg9EGRMYDSANFC1KZFtbMOCoAUIASARg37D6qvOspolbigELRWtEZEJxaG1FaHMM/13E27F0887EA84629F5828FCE3697C1173A4DCAE.C4EA0ED7F30B9E281F67F9C37A775ABABFE82444/yt6/1/video.3gp", 2, "jackets", false, false));
        Collections.shuffle(MyProvider.list);
        return list;
    }


    public static List<ListModel> getCartList() {
        List<ListModel> cartList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getToBasket()) {
                cartList.add(list.get(i));
            }
        }
        return cartList;
    }

    public static List<ListModel> favoriteList() {
        List<ListModel> favoriteList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getLiked()) {
                favoriteList.add(list.get(i));
            }
        }
        return favoriteList;
    }

    public static List<ListModel> getCategoryList(String category) {
        List<ListModel> categoryList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getCategory().equals(category)) {
                categoryList.add(list.get(i));
            }
        }
        return categoryList;
    }


    public static ListModel getUserPosition() {
        return list.get(position);
    }

}





