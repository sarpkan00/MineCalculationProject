package hesaplamalar;

import javax.swing.*;
import java.awt.*;

public class KayaForm extends JFrame{
    private JPanel wrapper;
    private JLabel noktaYukulbl;
    private JTextField noktaYukuGiris;
    private JButton noktaYukubtn;
    private JLabel kayaKalitelbl;
    private JTextField XTxt;
    private JButton kaliteBelirteciBtn;
    private JTextField LTxt;
    private JTextField sureksizlikUzugunluguGirisTxt;
    private JButton sureksizlikUzunluguBtn;
    private JLabel sureksizlikUzunluguLbl;
    private JLabel yerAltiSuyuLbl;
    private JTextField yerAltiSuyuGirisTxt;
    private JButton yerAltiSuyuBtn;
    private JComboBox sureksizlikDurumuCmb;
    private JButton sureksizlikDurumuBtn;
    private JLabel kayaSureksizlikDurumuLbl;
    private JLabel eklemKonumLbl;
    private JComboBox kaziBolgeCmb;
    private JLabel eklemKonumKaziLbl;
    private JComboBox kaziDurumCmb;
    private JButton eklemKonumHesapBtn;
    private JLabel eklemKonumSonucLbl;
    private JButton RmrBtn;
    private JLabel RmrSonucDortLbl;
    private JLabel noktaYukuSonuc;
    private JLabel kaliteSonuc;
    private JLabel sureksizlikSonuc;
    private JLabel yerAltiSuyuSonuc;
    private JLabel sureksizlikDurumuSonuc;
    private JLabel RmrSonucBirLbl;
    private JLabel RmrSonucİkiLbl;
    private JLabel RmrSonucUcLbl;
    private JButton kayaHesapBtn;
    private JLabel uyariLbl;
    private JLabel uyariLbl1;
    private JLabel isimlbl1;
    private JLabel numaralbl1;
    private JLabel isimlbl2;
    private JLabel numaralbl2;
    KayaHesaplari kayaHesaplari = new KayaHesaplari();

    public KayaForm(){
        this.add(wrapper);
        setSize(1200,780);
        setTitle("Kaya Hesaplama");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        int x = (Toolkit.getDefaultToolkit().getScreenSize().width - getSize().width) / 2 ;
        int y = (Toolkit.getDefaultToolkit().getScreenSize().height - getSize().height) / 2;
        setLocation(x,y);
        setVisible(true);



        noktaYukubtn.addActionListener(e -> {
            int a = Integer.parseInt(noktaYukuGiris.getText());
            noktaYukuSonuc.setText("Nokta Yükü İndisi : " + Integer.toString(kayaHesaplari.noktaYuku(a)));
        });

        kaliteBelirteciBtn.addActionListener(e -> {
            double X = Double.parseDouble(XTxt.getText());
            double L = Double.parseDouble(LTxt.getText());

            kaliteSonuc.setText("RQD Değeri : " + Double.toString(kayaHesaplari.kaliteBelirtici(X,L)));
        });

        sureksizlikUzunluguBtn.addActionListener(e -> {
            double sureksizlikUzunlugu = Double.parseDouble(sureksizlikUzugunluguGirisTxt.getText());

            sureksizlikSonuc.setText("Süreksizlik Uzunluğu : " + kayaHesaplari.sureksizlikUzunlugu(sureksizlikUzunlugu));
        });


        yerAltiSuyuBtn.addActionListener(e -> {
            double yerAltiSuyu = Double.parseDouble(yerAltiSuyuGirisTxt.getText());

            yerAltiSuyuSonuc.setText("Yer Altı Suyu Durumu : " + kayaHesaplari.yerAltiSuyu(yerAltiSuyu));
        });

        sureksizlikDurumuBtn.addActionListener(e -> {
            String check = Integer.toString(sureksizlikDurumuCmb.getSelectedIndex());

            if(check.equals("0")){
                kayaHesaplari.sureksizlikDurumu = 30;
                sureksizlikDurumuSonuc.setText("Süreksizlik Durumu : " + Integer.toString(kayaHesaplari.sureksizlikDurumu));
            }
            if(check.equals("1")){
                kayaHesaplari.sureksizlikDurumu = 25;
                sureksizlikDurumuSonuc.setText("Süreksizlik Durumu : " + Integer.toString(kayaHesaplari.sureksizlikDurumu));
            }

            if(check.equals("2")){
                kayaHesaplari.sureksizlikDurumu = 20;
                sureksizlikDurumuSonuc.setText("Süreksizlik Durumu : " + Integer.toString(kayaHesaplari.sureksizlikDurumu));
            }
            if(check.equals("3")){
                kayaHesaplari.sureksizlikDurumu = 10;
                sureksizlikDurumuSonuc.setText("Süreksizlik Durumu : " + Integer.toString(kayaHesaplari.sureksizlikDurumu));
            }

            if(check.equals("4")){
                kayaHesaplari.sureksizlikDurumu = 0;
                sureksizlikDurumuSonuc.setText("Süreksizlik Durumu : " + Integer.toString(kayaHesaplari.sureksizlikDurumu));
            }

        });

        eklemKonumHesapBtn.addActionListener(e -> {
            //EKLEM KONUM
            //TÜNEL
            String checkKaziSekli = Integer.toString(kaziBolgeCmb.getSelectedIndex());
            String checkKaziDurumu = Integer.toString(kaziDurumCmb.getSelectedIndex());

            if(checkKaziSekli.equals("0") && checkKaziDurumu.equals("0")){
                kayaHesaplari.eklemKonum = 0;
                eklemKonumSonucLbl.setText("Sayısal Değeri : " + Integer.toString(kayaHesaplari.eklemKonum));
            }
            if(checkKaziSekli.equals("0") && checkKaziDurumu.equals("1")){
                kayaHesaplari.eklemKonum = -2;
                eklemKonumSonucLbl.setText("Sayısal Değeri : " + Integer.toString(kayaHesaplari.eklemKonum));
            }
            if(checkKaziSekli.equals("0") && checkKaziDurumu.equals("2")){
                kayaHesaplari.eklemKonum = -5;
                eklemKonumSonucLbl.setText("Sayısal Değeri : " + Integer.toString(kayaHesaplari.eklemKonum));
            }
            if(checkKaziSekli.equals("0") && checkKaziDurumu.equals("3")){
                kayaHesaplari.eklemKonum = -10;
                eklemKonumSonucLbl.setText("Sayısal Değeri : " + Integer.toString(kayaHesaplari.eklemKonum));
            }
            if(checkKaziSekli.equals("0") && checkKaziDurumu.equals("4")){
                kayaHesaplari.eklemKonum = -12;
                eklemKonumSonucLbl.setText("Sayısal Değeri : " + Integer.toString(kayaHesaplari.eklemKonum));
            }

            //TEMEL
            if(checkKaziSekli.equals("1") && checkKaziDurumu.equals("0")){
                kayaHesaplari.eklemKonum = 0;
                eklemKonumSonucLbl.setText("Sayısal Değeri : " + Integer.toString(kayaHesaplari.eklemKonum));
            }
            if(checkKaziSekli.equals("1") && checkKaziDurumu.equals("1")){
                kayaHesaplari.eklemKonum = -2;
                eklemKonumSonucLbl.setText("Sayısal Değeri : " + Integer.toString(kayaHesaplari.eklemKonum));
            }
            if(checkKaziSekli.equals("1") && checkKaziDurumu.equals("2")){
                kayaHesaplari.eklemKonum = -7;
                eklemKonumSonucLbl.setText("Sayısal Değeri : " + Integer.toString(kayaHesaplari.eklemKonum));
            }
            if(checkKaziSekli.equals("1") && checkKaziDurumu.equals("3")){
                kayaHesaplari.eklemKonum = -15;
                eklemKonumSonucLbl.setText("Sayısal Değeri : " + Integer.toString(kayaHesaplari.eklemKonum));
            }
            if(checkKaziSekli.equals("1") && checkKaziDurumu.equals("4")){
                kayaHesaplari.eklemKonum = -25;
                eklemKonumSonucLbl.setText("Sayısal Değeri : " + Integer.toString(kayaHesaplari.eklemKonum));
            }

            //ŞEV
            if(checkKaziSekli.equals("2") && checkKaziDurumu.equals("0")){
                kayaHesaplari.eklemKonum = 0;
                eklemKonumSonucLbl.setText("Sayısal Değeri : " + Integer.toString(kayaHesaplari.eklemKonum));
            }
            if(checkKaziSekli.equals("2") && checkKaziDurumu.equals("1")){
                kayaHesaplari.eklemKonum = -5;
                eklemKonumSonucLbl.setText("Sayısal Değeri : " + Integer.toString(kayaHesaplari.eklemKonum));
            }
            if(checkKaziSekli.equals("2") && checkKaziDurumu.equals("2")){
                kayaHesaplari.eklemKonum = -25;
                eklemKonumSonucLbl.setText("Sayısal Değeri : " + Integer.toString(kayaHesaplari.eklemKonum));
            }
            if(checkKaziSekli.equals("2") && checkKaziDurumu.equals("3")){
                kayaHesaplari.eklemKonum = -50;
                eklemKonumSonucLbl.setText("Sayısal Değeri : " + Integer.toString(kayaHesaplari.eklemKonum));
            }
            if(checkKaziSekli.equals("2") && checkKaziDurumu.equals("4")){
                kayaHesaplari.eklemKonum = -60;
                eklemKonumSonucLbl.setText("Sayısal Değeri : " + Integer.toString(kayaHesaplari.eklemKonum));
            }


        });
        RmrBtn.addActionListener(e -> {
            //nokta yükü
            int a = Integer.parseInt(noktaYukuGiris.getText());
            noktaYukuSonuc.setText("Nokta Yükü İndisi : " + Integer.toString(kayaHesaplari.noktaYuku(a)));

            //RQD HESAP
            double X = Double.parseDouble(XTxt.getText());
            double L = Double.parseDouble(LTxt.getText());

            kaliteSonuc.setText("RQD Değeri : " + Double.toString(kayaHesaplari.kaliteBelirtici(X,L)));

            //SÜREKSİZLİK UZUNLUĞU
            double sureksizlikUzunlugu = Double.parseDouble(sureksizlikUzugunluguGirisTxt.getText());

            sureksizlikSonuc.setText("Süreksizlik Uzunluğu : " + kayaHesaplari.sureksizlikUzunlugu(sureksizlikUzunlugu));

            //YERALTI SUYU
            double yerAltiSuyu = Double.parseDouble(yerAltiSuyuGirisTxt.getText());

            yerAltiSuyuSonuc.setText("Yer Altı Suyu Durumu : " + kayaHesaplari.yerAltiSuyu(yerAltiSuyu));

            //SÜREKSİZLİK DURUMU
            String check = Integer.toString(sureksizlikDurumuCmb.getSelectedIndex());

            if(check.equals("0")){
                kayaHesaplari.sureksizlikDurumu = 30;
                sureksizlikDurumuSonuc.setText("Süreksizlik Durumu : " + Integer.toString(kayaHesaplari.sureksizlikDurumu));
            }
            if(check.equals("1")){
                kayaHesaplari.sureksizlikDurumu = 25;
                sureksizlikDurumuSonuc.setText("Süreksizlik Durumu : " + Integer.toString(kayaHesaplari.sureksizlikDurumu));
            }

            if(check.equals("2")){
                kayaHesaplari.sureksizlikDurumu = 20;
                sureksizlikDurumuSonuc.setText("Süreksizlik Durumu : " + Integer.toString(kayaHesaplari.sureksizlikDurumu));
            }
            if(check.equals("3")){
                kayaHesaplari.sureksizlikDurumu = 10;
                sureksizlikDurumuSonuc.setText("Süreksizlik Durumu : " + Integer.toString(kayaHesaplari.sureksizlikDurumu));
            }

            if(check.equals("4")){
                kayaHesaplari.sureksizlikDurumu = 0;
                sureksizlikDurumuSonuc.setText("Süreksizlik Durumu : " + Integer.toString(kayaHesaplari.sureksizlikDurumu));
            }

            //EKLEM KONUM
            //TÜNEL
            String checkKaziSekli = Integer.toString(kaziBolgeCmb.getSelectedIndex());
            String checkKaziDurumu = Integer.toString(kaziDurumCmb.getSelectedIndex());

            if(checkKaziSekli.equals("0") && checkKaziDurumu.equals("0")){
                kayaHesaplari.eklemKonum = 0;
                eklemKonumSonucLbl.setText("Sayısal Değeri : " + Integer.toString(kayaHesaplari.eklemKonum));
            }
            if(checkKaziSekli.equals("0") && checkKaziDurumu.equals("1")){
                kayaHesaplari.eklemKonum = -2;
                eklemKonumSonucLbl.setText("Sayısal Değeri : " + Integer.toString(kayaHesaplari.eklemKonum));
            }
            if(checkKaziSekli.equals("0") && checkKaziDurumu.equals("2")){
                kayaHesaplari.eklemKonum = -5;
                eklemKonumSonucLbl.setText("Sayısal Değeri : " + Integer.toString(kayaHesaplari.eklemKonum));
            }
            if(checkKaziSekli.equals("0") && checkKaziDurumu.equals("3")){
                kayaHesaplari.eklemKonum = -10;
                eklemKonumSonucLbl.setText("Sayısal Değeri : " + Integer.toString(kayaHesaplari.eklemKonum));
            }
            if(checkKaziSekli.equals("0") && checkKaziDurumu.equals("4")){
                kayaHesaplari.eklemKonum = -12;
                eklemKonumSonucLbl.setText("Sayısal Değeri : " + Integer.toString(kayaHesaplari.eklemKonum));
            }

            //TEMEL
            if(checkKaziSekli.equals("1") && checkKaziDurumu.equals("0")){
                kayaHesaplari.eklemKonum = 0;
                eklemKonumSonucLbl.setText("Sayısal Değeri : " + Integer.toString(kayaHesaplari.eklemKonum));
            }
            if(checkKaziSekli.equals("1") && checkKaziDurumu.equals("1")){
                kayaHesaplari.eklemKonum = -2;
                eklemKonumSonucLbl.setText("Sayısal Değeri : " + Integer.toString(kayaHesaplari.eklemKonum));
            }
            if(checkKaziSekli.equals("1") && checkKaziDurumu.equals("2")){
                kayaHesaplari.eklemKonum = -7;
                eklemKonumSonucLbl.setText("Sayısal Değeri : " + Integer.toString(kayaHesaplari.eklemKonum));
            }
            if(checkKaziSekli.equals("1") && checkKaziDurumu.equals("3")){
                kayaHesaplari.eklemKonum = -15;
                eklemKonumSonucLbl.setText("Sayısal Değeri : " + Integer.toString(kayaHesaplari.eklemKonum));
            }
            if(checkKaziSekli.equals("1") && checkKaziDurumu.equals("4")){
                kayaHesaplari.eklemKonum = -25;
                eklemKonumSonucLbl.setText("Sayısal Değeri : " + Integer.toString(kayaHesaplari.eklemKonum));
            }

            //ŞEV
            if(checkKaziSekli.equals("2") && checkKaziDurumu.equals("0")){
                kayaHesaplari.eklemKonum = 0;
                eklemKonumSonucLbl.setText("Sayısal Değeri : " + Integer.toString(kayaHesaplari.eklemKonum));
            }
            if(checkKaziSekli.equals("2") && checkKaziDurumu.equals("1")){
                kayaHesaplari.eklemKonum = -5;
                eklemKonumSonucLbl.setText("Sayısal Değeri : " + Integer.toString(kayaHesaplari.eklemKonum));
            }
            if(checkKaziSekli.equals("2") && checkKaziDurumu.equals("2")){
                kayaHesaplari.eklemKonum = -25;
                eklemKonumSonucLbl.setText("Sayısal Değeri : " + Integer.toString(kayaHesaplari.eklemKonum));
            }
            if(checkKaziSekli.equals("2") && checkKaziDurumu.equals("3")){
                kayaHesaplari.eklemKonum = -50;
                eklemKonumSonucLbl.setText("Sayısal Değeri : " + Integer.toString(kayaHesaplari.eklemKonum));
            }
            if(checkKaziSekli.equals("2") && checkKaziDurumu.equals("4")){
                kayaHesaplari.eklemKonum = -60;
                eklemKonumSonucLbl.setText("Sayısal Değeri : " + Integer.toString(kayaHesaplari.eklemKonum));
            }


            RmrSonucDortLbl.setText("RMR Değeri : " + kayaHesaplari.toplamDurum(kayaHesaplari.RMR));

            if(kayaHesaplari.RMR <= 20){

                String sonuc = "RMR Değeri : " + Double.toString(kayaHesaplari.RMR) + "\nKayanın Durumu Hiç Uygun Değil\n" +
                        "Ortalama Tahkimatsız Göçmeden Durma Zamanı : 0.1 metre Açıklık İçin 30 Dakika\n" +
                        "Kaya Kütlesi Kohezyonu : < 100kPa\n" +
                        "Kaya Kütlesinin Sürtünme Açısı : < 25 derece\n";
                    JOptionPane.showMessageDialog(null,sonuc,"Sonuç",JOptionPane.INFORMATION_MESSAGE);



            }
            if(kayaHesaplari.RMR >20 && kayaHesaplari.RMR <= 40){

                String sonuc = "RMR Değeri : " + Double.toString(kayaHesaplari.RMR) + "\nKayanın Durumu Uygun Değil\n" +
                        "Ortalama Tahkimatsız Göçmeden Durma Zamanı : 2.5 metre Açıklık İçin 10 Saat\n" +
                        "Kaya Kütlesi Kohezyonu : 100-200kPa\n" +
                        "Kaya Kütlesinin Sürtünme Açısı : 15-25 derece\n";
                JOptionPane.showMessageDialog(null,sonuc,"Sonuç",JOptionPane.INFORMATION_MESSAGE);


            }
            if(kayaHesaplari.RMR > 40 && kayaHesaplari.RMR <= 60){

                String sonuc = "RMR Değeri : " + Double.toString(kayaHesaplari.RMR) + "\nKayanın Durumu Vasat\n" +
                        "Ortalama Tahkimatsız Göçmeden Durma Zamanı : 5 metre Açıklık İçin 1 Hafta\n" +
                        "Kaya Kütlesi Kohezyonu : 250-300kPa\n" +
                        "Kaya Kütlesinin Sürtünme Açısı : 25 derece\n";
                JOptionPane.showMessageDialog(null,sonuc,"Sonuç",JOptionPane.INFORMATION_MESSAGE);
            }
            if(kayaHesaplari.RMR > 60 && kayaHesaplari.RMR <= 80){

                String sonuc = "RMR Değeri : " + Double.toString(kayaHesaplari.RMR) + "\nKayanın Durumu İyi\n" +
                        "Ortalama Tahkimatsız Göçmeden Durma Zamanı : 8 metre Açıklık İçin 6 Ay\n" +
                        "Kaya Kütlesi Kohezyonu : 300-400kPa\n" +
                        "Kaya Kütlesinin Sürtünme Açısı : 35-45 derece\n";
                JOptionPane.showMessageDialog(null,sonuc,"Sonuç",JOptionPane.INFORMATION_MESSAGE);

            }
            if(kayaHesaplari.RMR > 80 && kayaHesaplari.RMR <= 100){

                String sonuc = "RMR Değeri : " + Double.toString(kayaHesaplari.RMR) + "\nKayanın Durumu Çok İyi\n" +
                        "Ortalama Tahkimatsız Göçmeden Durma Zamanı : 15 metre Açıklık İçin 10 Sene\n" +
                        "Kaya Kütlesi Kohezyonu : > 400kPa\n" +
                        "Kaya Kütlesinin Sürtünme Açısı : < 45 derece\n";
                JOptionPane.showMessageDialog(null,sonuc,"Sonuç",JOptionPane.INFORMATION_MESSAGE);

            }
        });
        kayaHesapBtn.addActionListener(e -> {
            KayaQHesabiForm kayaQHesabi = new KayaQHesabiForm();
            dispose();
        });
    }
}
