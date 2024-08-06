////package com.example.app3.Activity;
////
////import android.os.Bundle;
////import android.view.WindowManager;
////
////import androidx.appcompat.app.AppCompatActivity;
////import androidx.recyclerview.widget.LinearLayoutManager;
////
////import com.example.app3.Adapter.WorkoutAdapter;
////import com.example.app3.Domain.Lessions;
////import com.example.app3.Domain.Workout;
////import com.example.app3.databinding.ActivityIntroBinding;
////import com.example.app3.databinding.ActivityMainBinding;
////
////import java.util.ArrayList;
////
////public class MainActivity extends AppCompatActivity {
////   ActivityMainBinding binding;
////    @Override
////    protected void onCreate(Bundle savedInstanceState) {
////        super.onCreate(savedInstanceState);
////        binding=ActivityMainBinding.inflate(getLayoutInflater());
////        setContentView(binding.getRoot());
////
////        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
////
////        binding.view1.setLayoutManager(new LinearLayoutManager(MainActivity.this,LinearLayoutManager.HORIZONTAL,false));
////        binding.view1.setAdapter(new WorkoutAdapter(getData()));
////    }
////
////private ArrayList<Workout> getData(){
////        ArrayList<Workout> list=new ArrayList<>();
////        list.add(new Workout("Running","Some content","pic_1",160,"9 min",getLession_1()));
////        list.add(new Workout("Stretching","Some content","pic_2",230,"85 min",getLession_2()));
////        list.add(new Workout("Yoga","Some content","pic_3",180,"65 min",getLession_3()));
////
////    return list;
////
////}
////
////private ArrayList<Lessions> getLession_1(){
////        ArrayList<Lessions> list=new ArrayList<>();
////        list.add(new Lessions("pic_1_1","HBPMvFkpNgE","03:46","Lession 1"));
////        list.add(new Lessions("pic_1_2","K6I24WgiiPw","03:41","Lession 2"));
////        list.add(new Lessions("pic_1_3","Zc08v4YY0eA","01:57","Lession 3"));
////        return list;
////
////}
////
////    private ArrayList<Lessions> getLession_2(){
////        ArrayList<Lessions> list=new ArrayList<>();
////        list.add(new Lessions("pic_3_1","L3eImBAXT7I","20:23","Lession 1"));
////        list.add(new Lessions("pic_3_2","47Exgz07FlU","18:27","Lession 2"));
////        list.add(new Lessions("pic_3_3","0mLx8tmaQ-4","32:25","Lession 3"));
////        list.add(new Lessions("pic_3_4","w86EalEoFRY","07:52","Lession 4"));
////        return list;
////
////    }
////
////    private ArrayList<Lessions> getLession_3(){
////        ArrayList<Lessions> list=new ArrayList<>();
////        list.add(new Lessions("pic_3_1","v7AYKMP6rOE","22:23","Lession 1"));
////        list.add(new Lessions("pic_3_2","Eml2xnolPYE","19:57","Lession 2"));
////        list.add(new Lessions("pic_3_3","v7SN-d4qXx0","30:08","Lession 3"));
////        list.add(new Lessions("pic_3_4","LqXZ628YNj4","18:09","Lession 4"));
////        return list;
////
////    }
////
////
////}
////
////
// package com.example.app3.Activity;
//
//import android.os.Bundle;
//import android.view.WindowManager;
//
//import androidx.appcompat.app.AppCompatActivity;
//import androidx.recyclerview.widget.LinearLayoutManager;
//
//import com.example.app3.Adapter.WorkoutAdapter;
//import com.example.app3.Domain.Lessions;
//import com.example.app3.Domain.Workout;
//import com.example.app3.databinding.ActivityIntroBinding;
//import com.example.app3.databinding.ActivityMainBinding;
//
//import java.util.ArrayList;
//
//public class MainActivity extends AppCompatActivity {
//   ActivityMainBinding binding;
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        binding = ActivityMainBinding.inflate(getLayoutInflater());
//        setContentView(binding.getRoot());
//
//        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
//
//        binding.view1.setLayoutManager(new LinearLayoutManager(MainActivity.this, LinearLayoutManager.HORIZONTAL, false));
//        binding.view1.setAdapter(new WorkoutAdapter(getData()));
//
//    }
//
//private ArrayList<Workout> getData(){
//        ArrayList<Workout> list=new ArrayList<>();
//        list.add(new Workout("Laptop","Running is a great cardiovascular exercise that helps improve overall health and fitness. It boosts your mood and increases stamina.","laptop1",160,"Starting from 530$",getLession_1()));
//        list.add(new Workout("Mobile","Stretching helps improve flexibility and range of motion. It is crucial for injury prevention and muscle recovery after workouts.","mobile1",230,"Starting from 100$",getLession_2()));
//        list.add(new Workout("Gadgets","Yoga combines physical postures, breathing exercises, and meditation. It enhances mental clarity, reduces stress, and promotes physical well-being.","gadget1",180,"Starting from 10$",getLession_3()));
//
//    return list;
//
//}
//
//private ArrayList<Lessions> getLession_1(){
//        ArrayList<Lessions> list=new ArrayList<>();
//        list.add(new Lessions("laptop2","https://www.amazon.in/Dell-Vostro-Metal-i5-1235U-35-56Cms/dp/B0BQJ7WR2R?ref=dlx_great_dg_dcl_B0BQJ7WR2R_dt_sl8_49","₹48,990","Dell 15 Thin & Light Laptop"));
//        list.add(new Lessions("laptop3","https://www.amazon.in/Lenovo-IdeaPad-i5-12450H-35-5cm-83EQ005VIN/dp/B0D6MPVN7B?ref=dlx_great_dg_dcl_B0D6MPVN7B_dt_sl8_49","₹50,490","Lenovo IdeaPad Slim 3"));
//        list.add(new Lessions("laptop4","https://www.amazon.in/ASUS-Vivobook-IntelCore-Fingerprint-X1404ZA-NK321WS/dp/B0CCP9PH92?ref=dlx_great_dg_dcl_B0CCP9PH92_dt_sl8_49","₹33,990","ASUS Vivobook"));
//        return list;
//
//}
//
//    private ArrayList<Lessions> getLession_2(){
//        ArrayList<Lessions> list=new ArrayList<>();
//        list.add(new Lessions("ultra","https://www.amazon.in/Samsung-Galaxy-Ultra-Green-Storage/dp/B0BT9CXXXX/ref=sr_1_5?dib=eyJ2IjoiMSJ9.iWocnFJ1hcsSJC-3RBDi8pAwkDB1HI703uAFcK9s8KgXoatT3xQNde42k-lrsWD7VfGqX6VAwurQF1DR-y2ZzYEnhlQz4AYNiQO_j0v6p6M3rb91qrLUoPMEQ7nKYckDd40Eu_tV0qATONmU6X1sgiy-ER7e1VyOrjAwlTy_ZH77M77whtir2r3O0Q0iGge_9FjD287YxXfyOJM2vPeQbpdpszbvt4HGuXJyMiTAqB6_hqBYCGEPzH7CNwSMlb-22rxJkiY4Go82Ut8Uu4L1PfSiLmaG4-f1RrUucW2MoRw.4E1DoD_M3aEW3XorXrRHSmcb0iDiCOv-V3z4D1hVrjA&dib_tag=se&qid=1722945262&refinements=p_89%3ASamsung&rnid=3837712031&s=electronics&sr=1-5&th=1"," ₹84,999","Samsung Galaxy S23 Ultra"));
//        list.add(new Lessions("oneplus","https://www.amazon.in/OnePlus-Cool-Blue-256GB-Storage/dp/B0CX27M63L/ref=sr_1_20?dib=eyJ2IjoiMSJ9.ygama0C3BZ2IIQEvGQ0Xq4G8H2iIg6AUSe_u129UI5oJCPMzeMmrpZSOhX2in0ZS-B6WwHvs8E_z3fPgkMlPyNmnpyseEqKtAkmS9LbT4hjTYOJkJukOYGyfsHTSrpwcnWQbpJ7o4D8ZU4IRpQDSIewee-aXkbNI0cIAZeUPazUyWZ5-cjzWbOKVGXekLyeOftJr2h1f0D3tBXTV5963hmIc8Uqj-LPBvovtX5plOmCvRhD-K3GzHh0VMiof2CDum5a78yX5fs4F43oJrCT49USHW4FbIC8FUAMbiWBzVuc.3wMmulnm-OVuilpET5r6tT0KThPlYWR-ohQppa3C-8s&dib_tag=se&qid=1722945444&refinements=p_89%3AOnePlus&rnid=3837712031&s=electronics&sr=1-20&th=1"," ₹41,999","OnePlus 12R"));
//        list.add(new Lessions("iphone2","https://www.amazon.in/dp/B0CHX68YG9","₹1,51,700","Apple iPhone 15 Pro Max"));
//        list.add(new Lessions("xiome","https://www.amazon.in/Xiaomi-Storage-Professional-Optics-AMOLED/dp/B0CW3JRLH1/ref=sr_1_9?dib=eyJ2IjoiMSJ9.bkDAz3fXbfFiwQG36tPV_Wuzvl9walXFC3BHjhfxA_cD47RSUqeCFetvHrgDUa52Ud7qehJDC4ZzhEP8Infq2TpdAvjh7D936K5trKvbMxH58vwI4MfqyDwzjeOMM9paBPWqmXUFZ2VlFHcCxhg-X11I7lDcI2WXyxvKi5eyY9hrTDHfvGLTkm2bWaPTnwN-UukzYA7pASDrpjjr0QaEZeuudCq_ZVyJqsx3RQUctvx740HrHU8PLS6NYeFJKC3EVgDyyvthNq6A16aEf0_qlnxwVdF2uDnvN1mwNc-wh3E.5btZ1abAv4z8saujT0q3J5RPuaMDH7pmlUgl9tGC9nM&dib_tag=se&qid=1722945709&refinements=p_89%3AXiaomi&rnid=3837712031&s=electronics&sr=1-9&th=1"," ₹69,999","Xiaomi 14 "));
//        return list;
//
//    }
//
//    private ArrayList<Lessions> getLession_3(){
//        ArrayList<Lessions> list=new ArrayList<>();
//        list.add(new Lessions("headphone3","https://www.amazon.in/Amazon-Basics-Gaming-Headphones-Over-Ear/dp/B0C6TVQ2HZ/ref=sr_1_1?_encoding=UTF8&content-id=amzn1.sym.5596da1f-db97-4dea-a8dd-31000e776f9d&dib=eyJ2IjoiMSJ9.KH7k55O7H4AL6LL_R7kE__oUtxTNOMiVh7LouHt5BKsD_oXd7fOA7IZ-I0Evhb_Imt3E_IJmSsTZnO6VKpHl337umIo-gMpK_i2lZJGkj8V7ihyo7L-yvdCVeWVheS9urm42G1CIyv0E2odoJu8iqT5a_VEiIQcddZY81khbuQsneutBqoWq_mswDl3D1SYiLGvQ2nwuwKKek3i0Lydxkk8m7NJh_hw6yk21bkBYLJA0bRCeHCbzzaXQI78PcljZEvmeO2Dj_D37gx_edyLzjo0opzblKe1nS7ymFeQusps.XUT4zHrnGFJG99nXxJYOchISD7ydpvd1jPYzD3Fas2I&dib_tag=se&keywords=gaming+accessories&pd_rd_r=317f7bb5-6b39-4b65-84fa-ebcc7e4a062d&pd_rd_w=numZw&pd_rd_wg=SLVhd&pf_rd_p=5596da1f-db97-4dea-a8dd-31000e776f9d&pf_rd_r=X02YXQNSZB96SNB3CYGM&qid=1722946120&refinements=p_n_format_browse-bin%3A30678577031&s=computers&sr=1-1","190$","Amazon Basics 7.1 USB Gaming Headphones "));
//        list.add(new Lessions("camera","https://www.amazon.in/Sony-ILCE-7M4K-Full-Frame-Interchangeable-Lens-Mirrorless/dp/B09SB2P8J5?ref=dlx_great_dg_dcl_B09SB2P8J5_dt_sl8_49&th=1"," ₹2,19,990","Sony Alpha ILCE-7M4K "));
//        list.add(new Lessions("keyboard","https://www.amazon.in/dp/B0CFF1XMT4/ref=sspa_dk_detail_2?psc=1&pd_rd_i=B0CFF1XMT4&pd_rd_w=sygfL&content-id=amzn1.sym.9f1cb690-f0b7-44de-b6ff-1bad1e37d3f0&pf_rd_p=9f1cb690-f0b7-44de-b6ff-1bad1e37d3f0&pf_rd_r=FGN00EYRA97Q9H9FM5GJ&pd_rd_wg=EiKSE&pd_rd_r=83416e1f-2dce-4840-9980-02487220a701&sp_csd=d2lkZ2V0TmFtZT1zcF9kZXRhaWxfdGhlbWF0aWM","₹2,399","ASUS Marshmallow Kw100 Keyboard"));
//        list.add(new Lessions("earpod2","https://www.amazon.in/OnePlus-Wireless-Bluetooth-Cancellation-charging/dp/B0D7HZ3KK9/?_encoding=UTF8&pd_rd_w=y1q4V&content-id=amzn1.sym.ec32926d-65f2-4b6d-966a-5229b3e5905e&pf_rd_p=ec32926d-65f2-4b6d-966a-5229b3e5905e&pf_rd_r=X02YXQNSZB96SNB3CYGM&pd_rd_wg=iSFMo&pd_rd_r=42aabed3-f3b2-49d6-a48a-056c2c87a3b5&ref_=pd_hp_d_btf_dealz_rd"," ₹3,298","OnePlus Nord Buds 3 Pro"));
//        return list;
//
//    }
//
//
//}

//package com.example.app3.Activity;
//
//import android.os.Bundle;
//import android.view.WindowManager;
//
//import androidx.appcompat.app.AppCompatActivity;
//import androidx.recyclerview.widget.LinearLayoutManager;
//
//import com.example.app3.Adapter.WorkoutAdapter;
//import com.example.app3.Domain.Lessions;
//import com.example.app3.Domain.Workout;
//import com.example.app3.databinding.ActivityIntroBinding;
//import com.example.app3.databinding.ActivityMainBinding;
//
//import java.util.ArrayList;
//
//public class MainActivity extends AppCompatActivity {
//   ActivityMainBinding binding;
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        binding=ActivityMainBinding.inflate(getLayoutInflater());
//        setContentView(binding.getRoot());
//
//        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
//
//        binding.view1.setLayoutManager(new LinearLayoutManager(MainActivity.this,LinearLayoutManager.HORIZONTAL,false));
//        binding.view1.setAdapter(new WorkoutAdapter(getData()));
//    }
//
//private ArrayList<Workout> getData(){
//        ArrayList<Workout> list=new ArrayList<>();
//        list.add(new Workout("Running","Some content","pic_1",160,"9 min",getLession_1()));
//        list.add(new Workout("Stretching","Some content","pic_2",230,"85 min",getLession_2()));
//        list.add(new Workout("Yoga","Some content","pic_3",180,"65 min",getLession_3()));
//
//    return list;
//
//}
//
//private ArrayList<Lessions> getLession_1(){
//        ArrayList<Lessions> list=new ArrayList<>();
//        list.add(new Lessions("pic_1_1","HBPMvFkpNgE","03:46","Lession 1"));
//        list.add(new Lessions("pic_1_2","K6I24WgiiPw","03:41","Lession 2"));
//        list.add(new Lessions("pic_1_3","Zc08v4YY0eA","01:57","Lession 3"));
//        return list;
//
//}
//
//    private ArrayList<Lessions> getLession_2(){
//        ArrayList<Lessions> list=new ArrayList<>();
//        list.add(new Lessions("pic_3_1","L3eImBAXT7I","20:23","Lession 1"));
//        list.add(new Lessions("pic_3_2","47Exgz07FlU","18:27","Lession 2"));
//        list.add(new Lessions("pic_3_3","0mLx8tmaQ-4","32:25","Lession 3"));
//        list.add(new Lessions("pic_3_4","w86EalEoFRY","07:52","Lession 4"));
//        return list;
//
//    }
//
//    private ArrayList<Lessions> getLession_3(){
//        ArrayList<Lessions> list=new ArrayList<>();
//        list.add(new Lessions("pic_3_1","v7AYKMP6rOE","22:23","Lession 1"));
//        list.add(new Lessions("pic_3_2","Eml2xnolPYE","19:57","Lession 2"));
//        list.add(new Lessions("pic_3_3","v7SN-d4qXx0","30:08","Lession 3"));
//        list.add(new Lessions("pic_3_4","LqXZ628YNj4","18:09","Lession 4"));
//        return list;
//
//    }
//
//
//}
//
//
package com.example.app3.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.app3.Adapter.WorkoutAdapter;
import com.example.app3.Domain.Lessions;
import com.example.app3.Domain.Workout;
import com.example.app3.databinding.ActivityIntroBinding;
import com.example.app3.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    private static final String PREFS_NAME = "MyPrefsFile";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);

        binding.view1.setLayoutManager(new LinearLayoutManager(MainActivity.this, LinearLayoutManager.HORIZONTAL, false));
        binding.view1.setAdapter(new WorkoutAdapter(getData()));
        binding.favourateBtn.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, FavouratePage.class)));
        binding.favoutateTxt.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, FavouratePage.class)));

        binding.cartBtn.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, CartPage.class)));
        binding.cartTxt.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, CartPage.class)));
        binding.profileBtn.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, ProfilePage.class)));
        binding.profilePic.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, ProfilePage.class)));
        binding.profileTxt.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, ProfilePage.class)));
    }

    private ArrayList<Workout> getData(){
        ArrayList<Workout> list=new ArrayList<>();
        list.add(new Workout("Laptop","Discover our extensive range of laptops designed to meet every need. From powerful gaming laptops to sleek ultrabooks, we have the perfect device for you. Enjoy cutting-edge technology, stunning displays, and long battery life","laptop1",4.1,"Starting from 530$","Latest Laptop",getLession_1()));
        list.add(new Workout("Mobile","Explore the latest mobile phones with innovative features and stylish designs. Our collection includes the newest smartphones from top brands, offering advanced cameras, high-speed processors, and vibrant displays","mobile1",4.3,"Starting from 100$","Latest SmartPhones",getLession_2()));
        list.add(new Workout("Gadgets","Enhance your tech experience with our wide selection of accessories. From protective cases and screen protectors to chargers and power banks, we have everything you need. Discover high-quality headphones, portable speakers, and stylish smartwatch bands. ","gadget1",3.9,"Starting from 10$","Latest Accessories",getLession_3()));

        return list;

    }

    private ArrayList<Lessions> getLession_1(){
        ArrayList<Lessions> list=new ArrayList<>();
        list.add(new Lessions("laptop2","Dell-Vostro-Metal-i5-1235U-35-56Cms/dp/B0BQJ7WR2R?ref=dlx_great_dg_dcl_B0BQJ7WR2R_dt_sl8_49","₹48,990","Dell 15 Thin & Light Laptop"));
        list.add(new Lessions("laptop3","Lenovo-IdeaPad-i5-12450H-35-5cm-83EQ005VIN/dp/B0D6MPVN7B?ref=dlx_great_dg_dcl_B0D6MPVN7B_dt_sl8_49","₹50,490","Lenovo IdeaPad Slim 3"));
        list.add(new Lessions("laptop4","ASUS-Vivobook-IntelCore-Fingerprint-X1404ZA-NK321WS/dp/B0CCP9PH92?ref=dlx_great_dg_dcl_B0CCP9PH92_dt_sl8_49","₹33,990","ASUS Vivobook"));
        return list;

    }

    private ArrayList<Lessions> getLession_2(){
        ArrayList<Lessions> list=new ArrayList<>();
        list.add(new Lessions("ultra","https://www.amazon.in/Samsung-Galaxy-Ultra-Green-Storage/dp/B0BT9CXXXX/ref=sr_1_5?dib=eyJ2IjoiMSJ9.iWocnFJ1hcsSJC-3RBDi8pAwkDB1HI703uAFcK9s8KgXoatT3xQNde42k-lrsWD7VfGqX6VAwurQF1DR-y2ZzYEnhlQz4AYNiQO_j0v6p6M3rb91qrLUoPMEQ7nKYckDd40Eu_tV0qATONmU6X1sgiy-ER7e1VyOrjAwlTy_ZH77M77whtir2r3O0Q0iGge_9FjD287YxXfyOJM2vPeQbpdpszbvt4HGuXJyMiTAqB6_hqBYCGEPzH7CNwSMlb-22rxJkiY4Go82Ut8Uu4L1PfSiLmaG4-f1RrUucW2MoRw.4E1DoD_M3aEW3XorXrRHSmcb0iDiCOv-V3z4D1hVrjA&dib_tag=se&qid=1722945262&refinements=p_89%3ASamsung&rnid=3837712031&s=electronics&sr=1-5&th=1"," ₹84,999","Samsung Galaxy S23 Ultra"));
        list.add(new Lessions("oneplus","https://www.amazon.in/OnePlus-Cool-Blue-256GB-Storage/dp/B0CX27M63L/ref=sr_1_20?dib=eyJ2IjoiMSJ9.ygama0C3BZ2IIQEvGQ0Xq4G8H2iIg6AUSe_u129UI5oJCPMzeMmrpZSOhX2in0ZS-B6WwHvs8E_z3fPgkMlPyNmnpyseEqKtAkmS9LbT4hjTYOJkJukOYGyfsHTSrpwcnWQbpJ7o4D8ZU4IRpQDSIewee-aXkbNI0cIAZeUPazUyWZ5-cjzWbOKVGXekLyeOftJr2h1f0D3tBXTV5963hmIc8Uqj-LPBvovtX5plOmCvRhD-K3GzHh0VMiof2CDum5a78yX5fs4F43oJrCT49USHW4FbIC8FUAMbiWBzVuc.3wMmulnm-OVuilpET5r6tT0KThPlYWR-ohQppa3C-8s&dib_tag=se&qid=1722945444&refinements=p_89%3AOnePlus&rnid=3837712031&s=electronics&sr=1-20&th=1"," ₹41,999","OnePlus 12R"));
        list.add(new Lessions("iphone2","https://www.amazon.in/dp/B0CHX68YG9","₹1,51,700","Apple iPhone 15 Pro Max"));
        list.add(new Lessions("xiome","https://www.amazon.in/Xiaomi-Storage-Professional-Optics-AMOLED/dp/B0CW3JRLH1/ref=sr_1_9?dib=eyJ2IjoiMSJ9.bkDAz3fXbfFiwQG36tPV_Wuzvl9walXFC3BHjhfxA_cD47RSUqeCFetvHrgDUa52Ud7qehJDC4ZzhEP8Infq2TpdAvjh7D936K5trKvbMxH58vwI4MfqyDwzjeOMM9paBPWqmXUFZ2VlFHcCxhg-X11I7lDcI2WXyxvKi5eyY9hrTDHfvGLTkm2bWaPTnwN-UukzYA7pASDrpjjr0QaEZeuudCq_ZVyJqsx3RQUctvx740HrHU8PLS6NYeFJKC3EVgDyyvthNq6A16aEf0_qlnxwVdF2uDnvN1mwNc-wh3E.5btZ1abAv4z8saujT0q3J5RPuaMDH7pmlUgl9tGC9nM&dib_tag=se&qid=1722945709&refinements=p_89%3AXiaomi&rnid=3837712031&s=electronics&sr=1-9&th=1"," ₹69,999","Xiaomi 14 "));
        return list;

    }

    private ArrayList<Lessions> getLession_3(){
        ArrayList<Lessions> list=new ArrayList<>();
        list.add(new Lessions("headphone3","https://www.amazon.in/Amazon-Basics-Gaming-Headphones-Over-Ear/dp/B0C6TVQ2HZ/ref=sr_1_1?_encoding=UTF8&content-id=amzn1.sym.5596da1f-db97-4dea-a8dd-31000e776f9d&dib=eyJ2IjoiMSJ9.KH7k55O7H4AL6LL_R7kE__oUtxTNOMiVh7LouHt5BKsD_oXd7fOA7IZ-I0Evhb_Imt3E_IJmSsTZnO6VKpHl337umIo-gMpK_i2lZJGkj8V7ihyo7L-yvdCVeWVheS9urm42G1CIyv0E2odoJu8iqT5a_VEiIQcddZY81khbuQsneutBqoWq_mswDl3D1SYiLGvQ2nwuwKKek3i0Lydxkk8m7NJh_hw6yk21bkBYLJA0bRCeHCbzzaXQI78PcljZEvmeO2Dj_D37gx_edyLzjo0opzblKe1nS7ymFeQusps.XUT4zHrnGFJG99nXxJYOchISD7ydpvd1jPYzD3Fas2I&dib_tag=se&keywords=gaming+accessories&pd_rd_r=317f7bb5-6b39-4b65-84fa-ebcc7e4a062d&pd_rd_w=numZw&pd_rd_wg=SLVhd&pf_rd_p=5596da1f-db97-4dea-a8dd-31000e776f9d&pf_rd_r=X02YXQNSZB96SNB3CYGM&qid=1722946120&refinements=p_n_format_browse-bin%3A30678577031&s=computers&sr=1-1","190$","Amazon Basics 7.1 \nUSB Gaming Headphones "));
        list.add(new Lessions("camera","https://www.amazon.in/Sony-ILCE-7M4K-Full-Frame-Interchangeable-Lens-Mirrorless/dp/B09SB2P8J5?ref=dlx_great_dg_dcl_B09SB2P8J5_dt_sl8_49&th=1"," ₹2,19,990","Sony Alpha ILCE-7M4K "));
        list.add(new Lessions("keyboard","https://www.amazon.in/dp/B0CFF1XMT4/ref=sspa_dk_detail_2?psc=1&pd_rd_i=B0CFF1XMT4&pd_rd_w=sygfL&content-id=amzn1.sym.9f1cb690-f0b7-44de-b6ff-1bad1e37d3f0&pf_rd_p=9f1cb690-f0b7-44de-b6ff-1bad1e37d3f0&pf_rd_r=FGN00EYRA97Q9H9FM5GJ&pd_rd_wg=EiKSE&pd_rd_r=83416e1f-2dce-4840-9980-02487220a701&sp_csd=d2lkZ2V0TmFtZT1zcF9kZXRhaWxfdGhlbWF0aWM","₹2,399","ASUS Marshmallow\n Kw100 Keyboard"));
        list.add(new Lessions("earpod2","https://www.amazon.in/OnePlus-Wireless-Bluetooth-Cancellation-charging/dp/B0D7HZ3KK9/?_encoding=UTF8&pd_rd_w=y1q4V&content-id=amzn1.sym.ec32926d-65f2-4b6d-966a-5229b3e5905e&pf_rd_p=ec32926d-65f2-4b6d-966a-5229b3e5905e&pf_rd_r=X02YXQNSZB96SNB3CYGM&pd_rd_wg=iSFMo&pd_rd_r=42aabed3-f3b2-49d6-a48a-056c2c87a3b5&ref_=pd_hp_d_btf_dealz_rd"," ₹3,298","OnePlus Nord Buds 3 Pro"));
        return list;

    }


}