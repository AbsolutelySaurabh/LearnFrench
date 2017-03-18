package com.example.absolutelysaurabh.newlanguage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Grocery extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grocery);

        ArrayList<Word> phrases = new ArrayList<Word>();

        phrases.add(new Word("supermarket","le supermarché"));
        phrases.add(new Word("bakery","la boulangerie"));
        phrases.add(new Word("drugstore","la droguerie"));
        phrases.add(new Word("groceries","les provisions"));
        phrases.add(new Word("vegetables","les légumes"));
        phrases.add(new Word("cereals","les céréales"));
        phrases.add(new Word("meat","la viande"));
        phrases.add(new Word("beer","la bière"));
        phrases.add(new Word("coffee","le café"));
        phrases.add(new Word("sausages","les saucisses"));
        phrases.add(new Word("milk","le lait"));
        phrases.add(new Word("butter","le beurre"));
        phrases.add(new Word("buttermilk","le babeurre"));
        phrases.add(new Word("ice cream","la glace"));
        phrases.add(new Word("cheese","le fromage"));

        WordAdapter phrasesAdapter = new WordAdapter(this,phrases,R.color.category_grocery);
        ListView listView = (ListView)findViewById(R.id.list);
        listView.setAdapter(phrasesAdapter);
    }
}
