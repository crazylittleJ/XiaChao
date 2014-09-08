package com.patristar;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Activity3 extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.layout3);
		
		String myURL = "http://degree.chinatide.net/";         
        WebView myBrowser=(WebView)findViewById(R.id.mybrowser3);  
  
        WebSettings websettings = myBrowser.getSettings();  
        websettings.setSupportZoom(true);  
        websettings.setBuiltInZoomControls(true);   
        websettings.setJavaScriptEnabled(true);  
         
        myBrowser.setWebViewClient(new WebViewClient());  
  
        myBrowser.loadUrl(myURL);  
	}
	

}
