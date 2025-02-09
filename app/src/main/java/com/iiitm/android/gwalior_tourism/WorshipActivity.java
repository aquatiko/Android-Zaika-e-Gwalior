  package com.iiitm.android.gwalior_tourism;

  import android.content.Intent;
  import android.graphics.Color;
  import android.net.Uri;
  import android.os.Bundle;
  import android.support.design.widget.CollapsingToolbarLayout;
  import android.support.v7.app.AppCompatActivity;
  import android.support.v7.widget.CardView;
  import android.view.View;
  import android.widget.ImageView;
  import android.widget.TextView;

  public class WorshipActivity extends AppCompatActivity {
    ImageView imageView,imageView1;
    TextView textView3,textView5,textView35,textView8,textView10;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainworship);
        imageView = (ImageView) findViewById(R.id.imageView);
        imageView1 = (ImageView) findViewById(R.id.map5);
        textView3 = (TextView) findViewById(R.id.textView3);
        textView5 = (TextView) findViewById(R.id.textView5);
       /* textView35 = (TextView)findViewById(R.id.textView35);
        textView8 = (TextView)findViewById(R.id.textView8);
        textView10 = (TextView)findViewById(R.id.textView10);*/

        imageView.setImageResource(getIntent().getIntExtra("imageView",00));
        imageView1.setImageResource(getIntent().getIntExtra("imageView1",00));
        textView3.setText(getIntent().getStringExtra("textView1"));
        textView5.setText(getIntent().getStringExtra("textView2"));
       /* textView35.setText(getIntent().getStringExtra("textView3"));
        textView8.setText(getIntent().getStringExtra("textView4"));
        textView10.setText(getIntent().getStringExtra("textView5"));*/


        final CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) findViewById(R.id.collapsingtoolbar);
        collapsingToolbarLayout.setTitle("Gwalior झरोखा");
        collapsingToolbarLayout.setCollapsedTitleTextColor(Color.BLACK);
        collapsingToolbarLayout.setExpandedTitleColor(getResources().getColor(android.R.color.black));


        CardView cardView = findViewById(R.id.cardview3);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String address;
                // address="City Centre, Opp Tadon Kothi, Gole ka Mandir, Kalpi Road, Gwalior, Madhya Pradesh 474005";
                address = textView5.getText().toString();
                String url = "http://maps.google.com/maps?daddr="+address;
                Intent intent = new Intent(android.content.Intent.ACTION_VIEW,  Uri.parse(url));
                startActivity(intent);
            }
        });

       // hideNavigationBar();

    }

      @Override
      protected void onResume() {
          super.onResume();
       //   hideNavigationBar();
      }



}
