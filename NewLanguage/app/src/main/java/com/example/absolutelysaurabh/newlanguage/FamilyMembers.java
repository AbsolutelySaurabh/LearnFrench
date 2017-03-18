package com.example.absolutelysaurabh.newlanguage;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyMembers extends AppCompatActivity {

    private MediaPlayer player;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family_members);
        //need to declare final phrases arraylist to use mediaplayer class;
        final ArrayList<Word> family_members = new ArrayList<Word>();

        family_members.add(new Word("father","Père",R.drawable.family_father,R.raw.song_1));
        family_members.add(new Word("mother","Mère",R.drawable.family_mother,R.raw.song_1));
        family_members.add(new Word("son","Fils",R.drawable.family_son,R.raw.song_1));
        family_members.add(new Word("daughter","Fille",R.drawable.family_daughter,R.raw.song_1));
        family_members.add(new Word("sister","Sœur",R.drawable.family_younger_sister,R.raw.song_1));
        family_members.add(new Word("brother","Frère",R.drawable.family_younger_brother,R.raw.song_1));
        family_members.add(new Word("brother-in-law","Beau-frère",R.drawable.family_older_brother,R.raw.song_1));
        family_members.add(new Word("sister-in-law","Belle-sœur",R.drawable.family_older_sister,R.raw.song_1));
        family_members.add(new Word("gradmother","Grand-mère ",R.drawable.family_grandmother,R.raw.song_1));
        family_members.add(new Word("grandfather","Grand-père ",R.drawable.family_grandfather,R.raw.song_1));

        WordAdapter phrasesAdapter = new WordAdapter(this,family_members,R.color.category_familymembers);
        ListView listView = (ListView)findViewById(R.id.list);
        listView.setAdapter(phrasesAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {

                Word word = family_members.get(position);
                player = MediaPlayer.create(FamilyMembers.this, word.getAudioResourceId());
                player.start();
            }
        });
    }
}
