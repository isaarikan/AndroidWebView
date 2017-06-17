package arksoft.com.webview;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by isaarikan on 17.06.2017.
 */

public class AnaSinif extends AppCompatActivity{
Button btn;
    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ilkaktivite);
        btn=(Button)findViewById(R.id.button);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(AnaSinif.this,MainActivity.class);
                startActivity(intent);
            }
        });


    }

}
