package com.example.sinni.bbbb;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
    TextView voc,spel,mean ;
    ImageView last,next;
    int w = 0,position;

    String[] vocabulary = {"腳踏車","走路","計程車","地鐵","車站","火車","飛機","飛機場","公車","車","馬路","十字路口","地圖","地址","市","國","汽車","輛","船","停車場","搭","起飛","出","出來","進","進去","回去","路口","紅綠燈","左","右","外","裡","下 ","上 ","這邊","出發","離開","向","經過","停","出口","公里","方向","出現","交通","救護車"};
    String[] spell ={"jiǎo tà chē ","zǒu lù ","jì chéng chē","dì tiě ","chē zhàn ","huǒ chē ","fēi jī ","jī chǎng ","gōng chē ","chē ","mǎ lù ","shí zì lù kǒu ","dì tú ","dì zhǐ ","shì ","guó ","qì chē ","liàng ","chuán","tíng chē chǎng ","dā ","qǐ fēi ","chū ","chū lái ","jìn ","jìn qù ","huí qù ","lù kǒu ","hóng lǜ dēng ","zuǒ ","yòu ","wài ","lǐ ","xià  ","shàng  ","zhè biān ","chū fā ","lí kāi ","xiàng ","jīng guò ","tíng ","chū kǒu ","gōng lǐ ","fāng xiàng ","chū xiàn ","jiāo tōng ","jiù hù chē "};
    String[] english ={"Bicycle","walk","taxi","subway","station","train","aircraft","Airport","bus","Car","road","crossroads","map","address","city","country","car","Vehicle","Boat","PARKING LOT","take","take off","Out","come out","Progress","Go inside","go back","intersection","traffic light","left","right","outer","in","Lower","On","Here","set off","go away","to","after","stop","Export","Km","direction","appear","traffic","ambulance"};
    String[] malaysia ={"basikal","berjalan kaki","teksi","kereta api bawah tanah","Stesen Kereta","Keretapi","pesawat","Lapangan Terbang","bas","kereta","jalanraya","Syarikat Crossroads","peta","alamat","bandar yang","negara","kereta","kenderaan","kapal","tempat letak kereta","mengambil","Tanggalkan","daripada","Keluarlah","Masukkan","pergi","Kembali","Intersection","lampu isyarat","kiri","Right","luar","dalam","lebih rendah","pada","sebelah ini","Berlepas","Tinggalkan","untuk","melalui","Hentikan","keluar","kilometer","arah","hadir","Lalulintas","ambulans yang"};
    String[] thai ={"รถจักรยาน","เวลาเดิน","รถแท็กซี่","รถไฟใต้ดิน","สถานี","รถไฟ","เครื่องบิน","สนามบิน","รถบัส","รถ","ถนน","สี่แยก","แผนที่","ที่อยู่","เมือง","ประเทศ","รถ","ยานพาหนะ","เรือ / เรือ","ลานจอดรถ","เอา","เวิก","ออก","ออกมา","เข้าสู่","ไป","กลับไป","การตัด","สัญญาณไฟจราจร","ซ้าย","ขวา","ด้านนอก","ใน","ลดลง","บน","ด้านนี้","การออกเดินทาง","ออกจาก","ไปยัง","ตลอด","หยุด","ทางออก","กิโลเมตร","ทิศทาง","ปรากฏ","การจราจร","รถพยาบาล"};
    String[] indonesia ={"sepeda","berjalan","taksi","kereta api bawah tanah","stasiun","kereta api","pesawat terbang","bandara","bis","mobil","jalan","persimpangan","peta","alamat","kota","negara","mobil","kendaraan","kapal","Parkir","mengambil","mencopot","di luar","keluar","masuk","pergi","kembali","persimpangan","lampu lalu lintas","kiri","benar","luar","di","menurunkan","di","sisi ini","keberangkatan","meninggalkan","untuk","melalui","berhenti","keluar","kilometer","arah","muncul","lalu lintas","ambulans yang"};
    String[] vietnam ={"xe đạp","đi bộ","xe tắc xi","xe điện ngầm","trạm","xe lửa","phi cơ","sân bay","xe buýt","xe hơi","đường","ngã tư","bản đồ","địa chỉ","thành phố","nước","xe hơi","Phương tiện đi lại","Thuyền / thuyền","bãi đậu xe","lấy","cởi","ngoài","đi ra","vào","đi","trở lại","Intersection","đèn giao thông","trái","đúng","Outer","trong","Hạ","trên","bên này","khởi hành","rời khỏi","đến","xuyên qua","dừng lại","Lối ra","cây số","phương hướng","xuất hiện","giao thông","xe cứu thương"};
    String[] philippines ={"bisikleta","lakad ang","na taxi","ng subway","himpilan","tren","mga sasakyang panghimpapawid","paliparan","Bus na","kotse","daan","sangang-daan","mapa","address","lungsod","bansa","kotse","Vehicles","Boat / bangka","paradahan","kumuha","mag-alis","sa","lumabas","magpasok","pumunta","balikan","interseksyon","semaporo","kaliwa","karapatan","panlabas","sa","ibaba","sa","side na ito","alis","mag-iwan","upang","sa pamamagitan ng","itigil","lumabas","kilometro","direksiyon","lumitaw","trapiko","ambulansya"
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        setTitle("Learn");
        findView();
        Bundle bundle = this.getIntent().getExtras();


        position =bundle.getInt("position");
        //要接從第一頁接的數字
       // tv2.setText(s+","+Integer.toString(a));
        voc.setText(vocabulary[w]);
        spel.setText(spell[w]);
        chooselang(position);
        last.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(w<=0){
                    Toast.makeText(Main2Activity.this, "已是第一張" , Toast.LENGTH_SHORT).show();
                }else{
                    w = w +1;
                    chooselang(position);
                }
            }
        });
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(w>=vocabulary.length){
                    Toast.makeText(Main2Activity.this, "已是最後一張" , Toast.LENGTH_SHORT).show();
                }else{
                    w = w +1;
                    chooselang(position);
                }
            }
        });

    }

    public void findView() {
        voc = (TextView) findViewById(R.id.voc);
        spel = (TextView) findViewById(R.id.spel);
        mean = (TextView) findViewById(R.id.mean);
        last = (ImageView) findViewById(R.id.last);
        next = (ImageView) findViewById(R.id.next);
    }
    public void chooselang(int p) {
            voc.setText(vocabulary[w]);
            spel.setText(spell[w]);
        switch (p){
            case 0 : mean.setText(english[w]);break;
            case 1 : mean.setText(malaysia[w]);break;
            case 2 : mean.setText(thai[w]);break;
            case 3 : mean.setText(indonesia[w]);break;
            case 4 : mean.setText(vietnam[w]);break;
            case 5 : mean.setText(philippines[w]);break;
        }
    }

}
