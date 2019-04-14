package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.TextureView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    private Button buttonTop;
    private Button buttonBottom;
    private TextView storyTextView;
    final int NULL = 0;
    int mIndex;

    private StoryLine[] mSequence = new StoryLine[]{
            new StoryLine(R.string.T1_Story, R.string.T1_Ans1, R.string.T1_Ans2, 21),
            new StoryLine(R.string.T2_Story, R.string.T2_Ans1, R.string.T2_Ans2, 23),
            new StoryLine(R.string.T3_Story, R.string.T3_Ans1, R.string.T3_Ans2, 54),
            new StoryLine(R.string.T4_End, NULL, NULL, NULL),
            new StoryLine(R.string.T5_End, NULL, NULL, NULL),
            new StoryLine(R.string.T6_End, NULL, NULL, NULL)

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
          buttonTop = (Button) findViewById(R.id.buttonTop);
          buttonBottom = (Button) findViewById(R.id.buttonBottom);
          storyTextView =(TextView) findViewById(R.id.storyTextView);
          storyTextView.setText(mSequence[mIndex].getStoryId());

        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        buttonTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkAnswer(true);

            }
        });
        buttonBottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkAnswer(false);

            }
        });


        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:


    }
    public void checkAnswer(boolean userSelection){

        if(userSelection){
            mIndex = mSequence[mIndex].getNext() % 10;

         if(mIndex >= 3){
             storyTextView.setText(mSequence[mIndex].getStoryId());
             buttonTop.setVisibility(View.GONE);
             buttonBottom.setVisibility(View.GONE);
         }else {
             storyTextView.setText(mSequence[mIndex].getStoryId());
             buttonTop.setText(mSequence[mIndex].getLeftAns());
             buttonBottom.setText(mSequence[mIndex].getRightAns());
         }
        }else{
            mIndex = mSequence[mIndex].getNext() / 10;
            if(mIndex >= 3){
                storyTextView.setText(mSequence[mIndex].getStoryId());
                buttonTop.setVisibility(View.GONE);
                buttonBottom.setVisibility(View.GONE);
            }else {
                storyTextView.setText(mSequence[mIndex].getStoryId());
                buttonTop.setText(mSequence[mIndex].getLeftAns());
                buttonBottom.setText(mSequence[mIndex].getRightAns());
            }
        }
    }

}
