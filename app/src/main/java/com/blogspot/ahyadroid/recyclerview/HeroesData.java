package com.blogspot.ahyadroid.recyclerview;

import java.util.ArrayList;

public class HeroesData {

    public static String[][] data = new String[][]{
            {"Ahmad Dahlan", "Salah seorang ulama dan khatib terkemuka di Masjid Besar Kasultanan Yogyakarta pada masa itu.", "https://upload.wikimedia.org/wikipedia/commons/8/87/Ahmad_Dahlan.jpg"},
            {"Ahmad Yani", "Jenderal TNI Anumerta Ahmad Yani (juga dieja Achmad Yani; lahir di Purworejo, Jawa Tengah, 19 Juni 1922.", "https://upload.wikimedia.org/wikipedia/commons/3/3f/Ahmad_Yani.jpg"},
            {"Sutomo", "Sutomo (lahir di Surabaya, Jawa Timur, 3 Oktober 1920 – meninggal di Padang Arafah, Arab Saudi, 7 Oktober 1981 pada umur 61 tahun) lebih dikenal dengan sapaan akrab oleh rakyat sebagai Bung Tomo.", "https://upload.wikimedia.org/wikipedia/commons/e/ed/Bung_Tomo.jpg"},
            {"Gatot Soebroto", "Jenderal TNI (Purn.) Gatot Soebroto (lahir di Sumpiuh, Banyumas, Jawa Tengah, 10 Oktober 1907 – meninggal di Jakarta, 11 Juni 1962 pada umur 54 tahun.", "https://upload.wikimedia.org/wikipedia/commons/b/be/Col_Gatot_Subroto%2C_Kenang-Kenangan_Pada_Panglima_Besar_Letnan_Djenderal_Soedirman%2C_p27.jpg"},
            {"Ki Hadjar Dewantara", "Raden Mas Soewardi Soerjaningrat (EBI: Suwardi Suryaningrat lahir di Pakualaman, 2 Mei 1889 – meninggal di Yogyakarta, 26 April 1959 pada umur 69 tahun.", "https://upload.wikimedia.org/wikipedia/commons/3/3a/Ki_Hadjar_Dewantara_Mimbar_Umum_18_October_1949_p2.jpg"},
            {"Mohammad Hatta", "Dr.(HC) Drs. H. Mohammad Hatta (lahir dengan nama Mohammad Athar, dikenal sebagai Bung Hatta lahir di Fort de Kock (sekarang Bukittinggi, Sumatera Barat), Hindia Belanda, 12 Agustus 1902 – meninggal di Jakarta, 14 Maret 1980 pada umur 77 tahun.", "https://upload.wikimedia.org/wikipedia/commons/thumb/3/3b/VP_Hatta.jpg/330px-VP_Hatta.jpg"},
            {"Soedirman", "Jenderal Besar Raden Soedirman (EYD: Sudirman lahir 24 Januari 1916 – meninggal 29 Januari 1950 pada umur 34 tahun).", "https://upload.wikimedia.org/wikipedia/commons/b/be/Col_Gatot_Subroto%2C_Kenang-Kenangan_Pada_Panglima_Besar_Letnan_Djenderal_Soedirman%2C_p27.jpg"},
            {"Soekarno", "Dr.(H.C.) Ir. H. Soekarno (ER, EYD: Sukarno, nama lahir: Koesno Sosrodihardjo) (lahir di Surabaya, Jawa Timur, 6 Juni 1901 – meninggal di Jakarta, 21 Juni 1970 pada umur 69 tahun).", "https://upload.wikimedia.org/wikipedia/commons/thumb/0/01/Presiden_Sukarno.jpg/330px-Presiden_Sukarno.jpg"},
            {"Soepomo", "Prof. Mr. Dr. Soepomo (Ejaan Soewandi: Supomo; lahir di Sukoharjo, Jawa Tengah, 22 Januari 1903 – meninggal di Jakarta, 12 September 1958 pada umur 55 tahun).", "https://upload.wikimedia.org/wikipedia/commons/c/c3/Supomo_from_President_Website.JPG"},
            {"Tan Malaka", "Tan Malaka atau Ibrahim gelar Datuk Sutan Malaka (lahir di Nagari Pandam Gadang, Suliki, Lima Puluh Kota, Sumatera Barat, 2 Juni 1897 – meninggal di Desa Selopanggung, Kediri, Jawa Timur, 21 Februari 1949 pada umur 51 tahun).", "https://upload.wikimedia.org/wikipedia/commons/thumb/f/f7/TanMalaka_DariPendjara_ed3.jpg/330px-TanMalaka_DariPendjara_ed3.jpg"},
    };
    public static ArrayList<Hero> getListData(){
        ArrayList<Hero> list = new ArrayList<>();
        for (String[] aData : data) {
            Hero hero = new Hero();
            hero.setName(aData[0]);
            hero.setFrom(aData[1]);
            hero.setPhoto(aData[2]);
            list.add(hero);
        }
        return list;
    }

}
