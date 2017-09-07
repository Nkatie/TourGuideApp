package com.example.mikatekonkatie.tourguideapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {
    RecycleAdapter recycleAdapter;
    RecyclerView recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        recyclerView=(RecyclerView)findViewById(R.id.recycler);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        ArrayList<MalaTouring> contacts= new ArrayList<MalaTouring>();
        MalaTouring contact1 = new MalaTouring();
        contact1.setName("1.Malamulele Township");
        contact1.setDescribe("\n" +
                "Malamulele was borne out of the homeland settlement system imposed by the Apartheid government. The people of Malamulele come from both sides of the Rivhubye and were resettled on the eastern side. Phaphazela used to be called Malonga in remembrance of their former lands. There has also been communities that were moved from what is now the Kruger National Park to settle in Malamulele. About 40,000 people were moved from west of Rivhubye and settled in Malamulele, whereas about 10,000\n" +
                "were moved from Malamulele ");
        contact1.setImage(R.drawable.mall);
        contacts.add(contact1);



        MalaTouring contact2 = new MalaTouring();
        contact2.setName("2.Kruger Nationa Park");
        contact2.setDescribe("\n" +
                "Malamulele Town is surrounded by a number of areas belonging to tihosi (chiefs). \n" +
                "Each chief has a number of villages under his ownership. Each of his matiko (villages).Kruger national Park is located at Matiya village ,many people nation wide visits to see the nature ," +
                "the big five and the other animals and it is separated by limpopo river which separate limpopo and mosambique");
        contact2.setImage(R.drawable.kruger);
        contacts.add(contact2);


        MalaTouring contact3 = new MalaTouring();
        contact3.setName("3.Nandoni Dam");
        contact3.setDescribe("\n" +
                "Malamulele Town is having a resort situated at mitoti village near venda.it is a biggest dam in malamulele ," +
                "where it supplies all villages around malamulele and malamulele township with water and it is a resort where people from far places visits it for fishing and for seeing the dam" +
                "there is a fee entry at the main gate of nandoni dam where you pay before entering the dam and its resort side ");
        contact3.setImage(R.drawable.nandonidam);
        contacts.add(contact3);


        MalaTouring contact4 = new MalaTouring();
        contact4.setName("4.Stadium");
        contact4.setDescribe("Malamulele Town is having its field where sports takes place and big conferences takes place there ," +
                "many villages who host tournerments of sports get a permission to uses the stadium and play and during the schools activities like olympics they uses the stadium to host them ," +
                "and even their games they host them at malamulele stadium");
        contact4.setImage(R.drawable.stadium);
        contacts.add(contact4);



        MalaTouring contact5 = new MalaTouring();
        contact5.setName("5.Children Prison");
        contact5.setDescribe("Malamulele Town is having a younger age prison at da age between 12 years to 18 years. \n" +
                "naughty kids who do not listen and who are staught are taken to the prison to be displined," +
                "and they find a chance gto go to schools and complete their metric and be able to learn more  ");
        contact5.setImage(R.drawable.mavambe);
        contacts.add(contact5);



        MalaTouring contact6 = new MalaTouring();
        contact6.setName("6.Boxing Gyminassium");
        contact6.setDescribe("Malamulele has a boxing field where youth take parts and train to be boxing fighters." +
                "many youth get time to exprience the opportunity of being taken by the Department of SADF where they end up being soldiers and some they end up being champions of boxing fighters," +
                "and end up getting opportunities of going nationwide to fight with other peope out there"+
                "They are being trained by Cacious Baloyi the former boxing fighter ");
        contact6.setImage(R.drawable.boxingfield);
        contacts.add(contact6);



        MalaTouring contact7 = new MalaTouring();
        contact7.setName("7.Radio station");
        contact7.setDescribe("Malamulele Town own a radio station called malafm which is broacasting malamulele daily news and updates." +
                "many people around malamulele find a an easy way to send messages to all their friends and love once messages when ever they are nd malafm is helping them ," +
                "by broadcasting nit through the radio station" );
        contact7.setImage(R.drawable.malafm);
        contacts.add(contact7);



        MalaTouring contact8 = new MalaTouring();
        contact8.setName("8.Limpopo Tree");
        contact8.setDescribe("Malamulele Town own a radio station called malafm which is broacasting malamulele daily news and updates." +
                "many people around malamulele find a an easy way to send messages to all their friends and love once messages when ever they are nd malafm is helping them ," +
                "by broadcasting nit through the radio station" );
        contact8.setImage(R.drawable.limpopotree);
        contacts.add(contact8);

        MalaTouring contact10 = new MalaTouring();
        contact10.setName("10.Traditional dance");
        contact10.setDescribe("At malamulele we have a traditional dance called xibelani also called choza,muchongolo,makhwaya,xincayi_ncayi,mikhinyavedzo and so forth." +
                "Xibelani also called choza is dance by women wearing xibelani and makkhwaya is danced by men wearing tinjhovo ,both xibelani and makhwaya they dance with the music playing," +
                "muchongolo is danced by men wearing tinjhovo and mikhinyavedzo is danced by women  wearing dovani and they dance while they are singing with their mouth and playing drums made by cows skin,");
        contact10.setImage(R.drawable.xibelani);
        contacts.add(contact10);

        recycleAdapter = new  RecycleAdapter(this,contacts);
        recyclerView.setAdapter(recycleAdapter);



    }
}