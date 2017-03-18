package com.example.absolutelysaurabh.newlanguage;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class Numbers extends AppCompatActivity {

    private MediaPlayer player;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        final ArrayList<Word> numbers = new ArrayList<Word>();

        numbers.add(new Word("One","un",R.drawable.number_one, R.raw.song_1));
        numbers.add(new Word("Two","deux",R.drawable.number_two,R.raw.song_1));
        numbers.add(new Word("Three","trois",R.drawable.number_three,R.raw.song_1));
        numbers.add(new Word("Four","quatre",R.drawable.number_four,R.raw.song_1));
        numbers.add(new Word("Five","cinq",R.drawable.number_five,R.raw.song_1));
        numbers.add(new Word("Six","six",R.drawable.number_six,R.raw.song_1));
        numbers.add(new Word("Seven","sept",R.drawable.number_seven,R.raw.song_1));
        numbers.add(new Word("Eight","huit",R.drawable.number_eight,R.raw.song_1));
        numbers.add(new Word("Nine","deux",R.drawable.number_nine,R.raw.song_1));
        numbers.add(new Word("Ten","trois",R.drawable.number_ten,R.raw.song_1));
//        numbers.add(new Word("Four","quatre"));
//        numbers.add(new Word("Five","cinq"));
//        numbers.add(new Word("Six","six"));
//        numbers.add(new Word("Seven","sept"));
//        numbers.add(new Word("Eight","huit"));

        WordAdapter itemsAdapter = new WordAdapter(this,numbers,R.color.category_numbers);
        ListView listView = (ListView) findViewById(R.id.list_numbers);
        listView.setAdapter(itemsAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Word word = numbers.get(position);
                player = MediaPlayer.create(Numbers.this, word.getAudioResourceId());
                player.start();
            }
        });

    }
}
