package hesaplamalar;

import java.util.Scanner;

public class KayaHesaplari {

    Scanner scanner = new Scanner(System.in);

    public int noktaYuku;
    public double RQD;
    public double sureksizlikUzunlugu;
    public double yerAltiSuyu;
    public int sureksizlikDurumu;
    public int eklemKonum;
    public double RMR;
    public double h;
    public double P;
    public double E;

    public int noktaYuku(int noktaYuku) {


        if (noktaYuku > 10) {
            noktaYuku = 15;

        } else if (noktaYuku > 4 && noktaYuku <= 10) {
            noktaYuku = 12;

        } else if (noktaYuku > 2 && noktaYuku <= 4) {
            noktaYuku = 7;

        } else if (noktaYuku > 1 && noktaYuku <= 2) {
            noktaYuku = 4;
        }
        this.noktaYuku = noktaYuku;
        return this.noktaYuku;
    }

    public double kaliteBelirtici(double x, double L) {
        this.RQD = (x / L) * 100;

        if (RQD > 90 && RQD <= 100) {
            RQD = 20;

        } else if (RQD > 75 && RQD <= 90) {
            RQD = 17;

        } else if (RQD > 50 && RQD <= 75) {
            RQD = 13;


        } else if (RQD > 25 && RQD <= 50) {
            RQD = 8;


        } else if (RQD < 25) {
            RQD = 3;

        }

        return RQD;
    }

    public double sureksizlikUzunlugu(double sureksizlikUzunlugu) {
        //mm cinsine çevir


        if (sureksizlikUzunlugu > 2000) {
            sureksizlikUzunlugu = 20;

        } else if (sureksizlikUzunlugu > 600 && sureksizlikUzunlugu <= 2000) {
            sureksizlikUzunlugu = 17;

        } else if (sureksizlikUzunlugu > 200 && sureksizlikUzunlugu <= 600) {
            sureksizlikUzunlugu = 10;

        } else if (sureksizlikUzunlugu > 60 && sureksizlikUzunlugu <= 200) {
            sureksizlikUzunlugu = 8;

        } else if (sureksizlikUzunlugu < 60) {
            sureksizlikUzunlugu = 5;

        }
        this.sureksizlikUzunlugu = sureksizlikUzunlugu;

        return this.sureksizlikUzunlugu;

    }

    public int sureksizlikDurumu() {

        System.out.println("Süreksizlik Durumu için Seçim yapınız : ");
        String secenek = "1. Çok pürüzlü yüzeyler, süreksiz bitişik sert eklem yüzeyi\n"
                + "2.Az pürüzlü yüzeyler Açıklık <1mm. Sert eklem yüzeyi\n"
                + "3.Az pürüzlü yüzeyler Açıklık <1mm. Yumuşak eklem yüzeyin\n"
                + "4.Parlak yüzeyler veya 5mm. den az kalınlıkta dolgu malzemesi veya açıklık 1-5 mm sürekli\n"
                + "5.5 mm den daha kalın yumuşak dolgu maddesi veya <5mm. sürekli\n";

        System.out.println(secenek);
        String secim = scanner.nextLine();

        if (secim.equals("1")) {
            sureksizlikDurumu = 30;

        } else if (secim.equals("2")) {
            sureksizlikDurumu = 25;

        } else if (secim.equals("3")) {
            sureksizlikDurumu = 20;

        } else if (secim.equals("4")) {
            sureksizlikDurumu = 10;

        } else if (secim.equals("5")) {
            sureksizlikDurumu = 0;

        }

        return sureksizlikDurumu;
    }

    public double yerAltiSuyu(double yerAltiSuyu) {
        //lt/dakika cinsi

        if (yerAltiSuyu == 0) {
            yerAltiSuyu = 15;

        } else if (yerAltiSuyu > 0 && yerAltiSuyu <= 10) {
            yerAltiSuyu = 10;

        } else if (yerAltiSuyu > 10 && yerAltiSuyu <= 25) {
            yerAltiSuyu = 7;


        } else if (yerAltiSuyu > 25 && yerAltiSuyu <= 125) {
            yerAltiSuyu = 4;

        } else if (yerAltiSuyu > 125) {
            yerAltiSuyu = 0;

        }

        this.yerAltiSuyu = yerAltiSuyu;

        return this.yerAltiSuyu;
    }


    public int eklemKonum(){
        System.out.println("Kazım Yapılacak Bölge Türünü Seçiniz : ");
        String secenek = "1. Tünel\n"
                + "2.Temel\n"
                + "3.Şev";
        System.out.println(secenek);
        secenek =  scanner.nextLine();


        System.out.println("Kazım Yapılacak Bölgenin Durumunu Seçiniz : \n"
                + "(Topraktan Alınan Örneğe Göre Giriş Yapınız)");
        String secenek2 = "1.Çok Uygun\n"
                +"2.Uygun\n"
                +"3.Vasat\n"
                + "4.Uygun Değil\n"
                + "5.Hiç Uygun Değil\n";
        System.out.println(secenek2);
        secenek2 = scanner.nextLine();

        //TÜNEL
        if(secenek.equals("1") && secenek2.equals("1")){
            eklemKonum = 0;
            System.out.println("Sayısal Değeri : " + eklemKonum);
        }
        if(secenek.equals("1") && secenek2.equals("2")){
            eklemKonum = -2;
            System.out.println("Sayısal Değeri : " + eklemKonum);
        }
        if(secenek.equals("1") && secenek2.equals("3")){
            eklemKonum = -5;
            System.out.println("Sayısal Değeri : " + eklemKonum);
        }
        if(secenek.equals("1") && secenek2.equals("4")){
            eklemKonum = -10;
            System.out.println("Sayısal Değeri : " + eklemKonum);
        }
        if(secenek.equals("1") && secenek2.equals("5")){
            eklemKonum = -12;
            System.out.println("Sayısal Değeri : " + eklemKonum);
        }

        //TEMEL
        if(secenek.equals("2") && secenek2.equals("1")){
            eklemKonum = 0;
            System.out.println("Sayısal Değeri : " + eklemKonum);
        }
        if(secenek.equals("2") && secenek2.equals("2")){
            eklemKonum = -2;
            System.out.println("Sayısal Değeri : " + eklemKonum);
        }
        if(secenek.equals("2") && secenek2.equals("3")){
            eklemKonum = -7;
            System.out.println("Sayısal Değeri : " + eklemKonum);
        }
        if(secenek.equals("2") && secenek2.equals("4")){
            eklemKonum = -15;
            System.out.println("Sayısal Değeri : " + eklemKonum);
        }
        if(secenek.equals("2") && secenek2.equals("5")){
            eklemKonum = -25;
            System.out.println("Sayısal Değeri : " + eklemKonum);
        }

        //ŞEVLER
        if(secenek.equals("3") && secenek2.equals("1")){
            eklemKonum = 0;
            System.out.println("Sayısal Değeri : " + eklemKonum);
        }
        if(secenek.equals("3") && secenek2.equals("2")){
            eklemKonum = -5;
            System.out.println("Sayısal Değeri : " + eklemKonum);
        }
        if(secenek.equals("3") && secenek2.equals("3")){
            eklemKonum = -25;
            System.out.println("Sayısal Değeri : " + eklemKonum);
        }
        if(secenek.equals("3") && secenek2.equals("4")){
            eklemKonum = -50;
            System.out.println("Sayısal Değeri : " + eklemKonum);
        }
        if(secenek.equals("3") && secenek2.equals("5")){
            eklemKonum = -60;
            System.out.println("Sayısal Değeri : " + eklemKonum);
        }

        return eklemKonum;
    }

    public double toplamDurum(double RMR) {
        RMR = noktaYuku + RQD + sureksizlikUzunlugu + yerAltiSuyu + sureksizlikDurumu + eklemKonum;

        System.out.println("Kaya Birimin RMR Değeri : " + RMR);

        if(RMR <=20){

        }
        if(RMR > 20 && RMR <= 40){

        }
        if(RMR > 40 && RMR <= 60){

        }
        if(RMR > 60 && RMR <= 80){

        }
        if(RMR > 80 && RMR <= 100 ){

        }

        this.RMR = RMR;

        return this.RMR;
    }

    public void kaziSekli(){

        if(RMR == 0 && RMR<=20){
            System.out.println("Kazı Şekli : Birçok basamak halinde. 0.5-1.5m ilerle. Tahkimatı kazı ile birlikte yürüt. Patlatmadan sonra derhal püskürme beton uygula.");
            System.out.println("Uygulanacak Tahkimat : Sistematik kaya cıvatası, 5-6m uzunlukta, tavan ve yan duvarlarda 1-1.5m aralıklı, tavanda çelik hasır.\n"
                    + "Tavanda 150-200mm, yan duvarlarda 150mm ve aynada 50mm kalınlıkta, orta veya ağır bağ, 0.75m aralıkta, çelik kamalarla, taban Çevrili" );
        }
        if(RMR > 21 && RMR<=40){
            System.out.println("Kazı Şekli : İki basamak halinde ilerleme Üst basamak 1-1.5m ilerleme Tahkimatı olabildiğince kazı ile birlikte yürüt. Tahkimatı aynadan 10m içinde tamamla.");
            System.out.println("Uygulanacak Tahkimat : Sistematik kaya cıvatası, 4-5m uzunlukta, tavan ve yan duvarlarda 1-1.5m aralıklı çelik hasır ile birlikte uygula.\n"
                    + "Tavanda 100-150mm, yan duvarlarda 100mm kalınlıkta.\n"
                    + "Gerektiğinde 1.5m aralıklı hafif bağ.");
        }
        if(RMR >41 && RMR<=60){
            System.out.println("Kazı Şekli : İki basamak halinde ilerleme. Üst basamakta 1.5-3m ilerleme Her patlatmadan sonra tahkimata başla. Tahkimatı aynadan 10m içinde tamamla.\n");
            System.out.println("Uygulanacak Tahkimat : Sistematik kaya cıvatası, 4m uzunlukta, tavan ve yan duvarlarda 1.5-2m aralıklı, tavanda çelik hasır.\n"
                    + "Tavanda 50-100mm, yan duvarlarda 30mm Püskürtme Beton Uygula.\n"
                    + "Çelik Bağ Gerekmez");
        }
        if(RMR > 61 && RMR<=80){
            System.out.println("Kazı Şekli : Tam ayna, 1-1.5m ilerleme, tahkimatı aynadan 20m içinde tamamla.");
            System.out.println("Uygulanacak Tahkimat : Tavanda bölgesel kaya cıvatası, 3m uzunlukta, 2.5m aralıklı, gerektiğinde çelik birlikte.\n"
                    + "Tavanda gerekli yerlerde, 50mm kalınlığında Püskürtme Beton Uygula.\n"
                    + "Çelik Bağ Gerekmez.");
        }

        if(RMR > 81 && RMR <= 100){
            System.out.println("Kazı Şekli : Tam ayna, 3m ilerleme");
            System.out.println("Uygulanacak Tahkimat : Uygun Olmayan Yerler Haricinde Tahkimat Gerektirmez.");
        }

    }

    public double kayaYukuYuksekligi(double RMR){

        h = (100 - RMR)/100;


        return this.h;
    }

    public double kayaBasinci(double y){

        P = y*this.h;



        return P;
    }

    public double alanDeformasyon(double RMR){
        if(RMR > 50 ){
            E = (2*RMR)-100;

        }
        else if(RMR <=50){
            E = Math.pow(100,RMR-(10/40));

        }

        return E;
    }
}
