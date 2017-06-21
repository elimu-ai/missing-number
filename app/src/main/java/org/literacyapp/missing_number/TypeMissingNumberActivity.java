package org.literacyapp.missing_number;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import org.literacyapp.contentprovider.ContentProvider;
import org.literacyapp.contentprovider.model.content.Number;

import java.util.List;

public class TypeMissingNumberActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.i(getClass().getName(), "onCreate");
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_type_missing_number);

        List<Number> unlockedNumbers = ContentProvider.getUnlockedNumbers();
        Log.i(getClass().getName(), "unlockedNumbers: " + unlockedNumbers);

        MediaPlayer mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.activity_instruction_number_typing);
        mediaPlayer.start();
    }
}
