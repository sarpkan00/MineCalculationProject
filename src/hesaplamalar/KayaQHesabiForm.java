package hesaplamalar;

import javax.swing.*;
import java.awt.*;

public class KayaQHesabiForm extends JFrame {

    KayaHesaplari kayaHesaplari = new KayaHesaplari();

    private JPanel wrapper;
    private JLabel kayaYukuYuksekligiLbl;
    private JTextField kayaYukuYukseligiTxt;
    private JButton kayaYukuYuksekligiBtn;
    private JLabel kayaYukuYuksekligiSonuc;
    private JTextField BiricimHacimTxt;
    private JButton birimHacimBtn;
    private JLabel kayaBirimHacimLbl;
    private JLabel birimHacimSonucLbl;
    private JTextField alanDeformasyonTxt;
    private JButton alanDeformasyonBtn;
    private JLabel alanDeformasyonuLbl;
    private JLabel alanDeformasyonSonuc;
    private JButton geriBtn;

    public KayaQHesabiForm(){
        this.add(wrapper);
        setSize(950,650);
        setTitle("Kaya Hesaplama");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        int x = (Toolkit.getDefaultToolkit().getScreenSize().width - getSize().width) / 2 ;
        int y = (Toolkit.getDefaultToolkit().getScreenSize().height - getSize().height) / 2;
        setLocation(x,y);
        setVisible(true);


        kayaYukuYuksekligiBtn.addActionListener(e -> {
            double a = Double.parseDouble(kayaYukuYukseligiTxt.getText());
            kayaYukuYuksekligiSonuc.setText("Kaya Yükü Yüksekliği : " + kayaHesaplari.kayaYukuYuksekligi(a));
        });

        birimHacimBtn.addActionListener(e -> {
                double a = Double.parseDouble((BiricimHacimTxt.getText()));

                birimHacimSonucLbl.setText("Kaya Basıncı : " + kayaHesaplari.kayaBasinci(a));
        });

        alanDeformasyonBtn.addActionListener(e -> {
            double a = Double.parseDouble(alanDeformasyonTxt.getText());

            alanDeformasyonSonuc.setText("Kayanın Alan Deformasyonu : " + kayaHesaplari.alanDeformasyon(a));
        });

        geriBtn.addActionListener(e -> {
            KayaForm kaya = new KayaForm();
            dispose();
        });
    }
}
