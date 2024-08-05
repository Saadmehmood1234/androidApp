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
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);

        binding.view1.setLayoutManager(new LinearLayoutManager(MainActivity.this,LinearLayoutManager.HORIZONTAL,false));
        binding.view1.setAdapter(new WorkoutAdapter(getData()));
    }

private ArrayList<Workout> getData(){
        ArrayList<Workout> list=new ArrayList<>();
        list.add(new Workout("Laptop","Running is a great cardiovascular exercise that helps improve overall health and fitness. It boosts your mood and increases stamina.","laptop1",160,"Starting from 530$",getLession_1()));
        list.add(new Workout("Mobile","Stretching helps improve flexibility and range of motion. It is crucial for injury prevention and muscle recovery after workouts.","mobile1",230,"Starting from 100$",getLession_2()));
        list.add(new Workout("Gadgets","Yoga combines physical postures, breathing exercises, and meditation. It enhances mental clarity, reduces stress, and promotes physical well-being.","gadget1",180,"Starting from 10$",getLession_3()));

    return list;

}

private ArrayList<Lessions> getLession_1(){
        ArrayList<Lessions> list=new ArrayList<>();
        list.add(new Lessions("pic_1_1","HBPMvFkpNgE","03:46","Lession 1"));
        list.add(new Lessions("pic_1_2","K6I24WgiiPw","03:41","Lession 2"));
        list.add(new Lessions("pic_1_3","Zc08v4YY0eA","01:57","Lession 3"));
        return list;

}

    private ArrayList<Lessions> getLession_2(){
        ArrayList<Lessions> list=new ArrayList<>();
        list.add(new Lessions("pic_3_1","L3eImBAXT7I","20:23","Lession 1"));
        list.add(new Lessions("pic_3_2","47Exgz07FlU","18:27","Lession 2"));
        list.add(new Lessions("pic_3_3","0mLx8tmaQ-4","32:25","Lession 3"));
        list.add(new Lessions("pic_3_4","w86EalEoFRY","07:52","Lession 4"));
        return list;

    }

    private ArrayList<Lessions> getLession_3(){
        ArrayList<Lessions> list=new ArrayList<>();
        list.add(new Lessions("pic_3_1","v7AYKMP6rOE","22:23","Lession 1"));
        list.add(new Lessions("pic_3_2","Eml2xnolPYE","19:57","Lession 2"));
        list.add(new Lessions("pic_3_3","v7SN-d4qXx0","30:08","Lession 3"));
        list.add(new Lessions("pic_3_4","LqXZ628YNj4","18:09","Lession 4"));
        return list;

    }


}