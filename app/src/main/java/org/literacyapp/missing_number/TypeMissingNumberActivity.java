package org.literacyapp.missing_number;

import android.media.MediaPlayer;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.util.Log;

import ai.elimu.model.v2.gson.content.NumberGson;

import java.util.ArrayList;
import java.util.List;

public class TypeMissingNumberActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.i(getClass().getName(), "onCreate");
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_type_missing_number);

        // TODO: fetch via ContentProviderUtil once Number support is added
        List<NumberGson> unlockedNumbers = new ArrayList<>();
        Log.i(getClass().getName(), "unlockedNumbers: " + unlockedNumbers);

        MediaPlayer mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.activity_instruction_number_typing);
        mediaPlayer.start();
    }
}
