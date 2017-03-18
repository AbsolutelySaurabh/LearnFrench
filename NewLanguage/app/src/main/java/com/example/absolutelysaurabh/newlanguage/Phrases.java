package com.example.absolutelysaurabh.newlanguage;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class Phrases extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phrases2);


        ArrayList<Word> phrases = new ArrayList<Word>();

        phrases.add(new Word("Zero","zéro"));
        phrases.add(new Word("One","un"));
        phrases.add(new Word("Two","deux"));
        phrases.add(new Word("Three","trois"));
        phrases.add(new Word("Four","quatre"));
        phrases.add(new Word("Five","cinq"));
        phrases.add(new Word("Six","six"));
        phrases.add(new Word("Seven","sept"));
        phrases.add(new Word("Eight","huit"));
        phrases.add(new Word("Two","deux"));
        phrases.add(new Word("Three","trois"));
        phrases.add(new Word("Four","quatre"));
        phrases.add(new Word("Five","cinq"));
        phrases.add(new Word("Six","six"));
        phrases.add(new Word("Seven","sept"));

        WordAdapter phrasesAdapter = new WordAdapter(this,phrases,R.color.category_phrases);
        ListView listView = (ListView)findViewById(R.id.list_phrases);
        listView.setAdapter(phrasesAdapter);



    }

}
