package in.bhuvana.flipacoinjava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class FlipCoinActivity extends AppCompatActivity {

    private static final Random RANDOM= new Random();
    private ImageView coinSide;
    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flip_linear);
        coinSide=(ImageView) findViewById(R.id.imageViewHead);
        btn=(Button) findViewById(R.id.FlipcoinButton);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                flipCoin();
            }
        });
    }

        private void flipCoin() {
        coinSide.setImageResource(RANDOM.nextFloat() > 0.5f ? R.drawable.flowerofcoin : R.drawable.headofcoin);
    }

    }





