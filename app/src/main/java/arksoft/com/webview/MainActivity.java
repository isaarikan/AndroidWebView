package arksoft.com.webview;

import android.app.Activity;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

public class MainActivity extends Activity {
    WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        webView=(WebView)findViewById(R.id.webView);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("https://gelecegiyazanlar.turkcell.com.tr/gelecegiyazankadinlar");

        final ProgressDialog progressDialog=ProgressDialog.show(MainActivity.this,"Geleceği Yazanlar","Yükleniyor");

        webView.setWebViewClient(new WebViewClient(){

            //Sayfa yüklenmesi bittiğinde diyalogu kapatıyoruz
            @Override
            public void onPageFinished(WebView view, String url) {
               progressDialog.dismiss();
            }

            //Hata alındığında kullanıcıya mesaj dönderip ve diyalogu kapatıyoruz
            @Override
            public void onReceivedError(WebView view, WebResourceRequest request, WebResourceError error) {
                Toast.makeText(MainActivity.this, "Bir Hata Oluştu", Toast.LENGTH_SHORT).show();
                progressDialog.dismiss();
            }
        });
    }
}
