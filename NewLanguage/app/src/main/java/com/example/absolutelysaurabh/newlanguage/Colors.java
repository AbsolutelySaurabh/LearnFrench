package com.example.absolutelysaurabh.newlanguage;

import android.media.MediaPlayer;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class Colors extends AppCompatActivity {

    private MediaPlayer player;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors);

        final ArrayList<Word> colors = new ArrayList<Word>();

        colors.add(new Word("black","Noir",R.drawable.color_black,R.raw.song_1));
        colors.add(new Word("brown","Marron",R.drawable.color_brown,R.raw.song_1));
        colors.add(new Word("golden","Dorée",R.drawable.color_dusty_yellow,R.raw.song_1));
        colors.add(new Word("gray","Gris",R.drawable.color_gray,R.raw.song_1));
        colors.add(new Word("green","Vert",R.drawable.color_green,R.raw.song_1));
        colors.add(new Word("red","Rouge",R.drawable.color_red,R.raw.song_1));
        colors.add(new Word("white","Blanc",R.drawable.color_white,R.raw.song_1));
        colors.add(new Word("yellow","Jaune",R.drawable.color_mustard_yellow,R.raw.song_1));


        WordAdapter phrasesAdapter = new WordAdapter(this,colors,R.color.category_color);
        ListView listView = (ListView)findViewById(R.id.list);
        listView.setAdapter(phrasesAdapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {

                Word word = colors.get(position);
                player = MediaPlayer.create(Colors.this, word.getAudioResourceId());
                player.start();
            }
        });
    }
}
