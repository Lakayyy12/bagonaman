package ic.lakayy.betbet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class AboutPage : AppCompatActivity() {

    private lateinit var webViewA: WebView
    private val URL = "file:///android_asset/bbb.html"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about_page)

        webViewA = findViewById(R.id.webA)
        webViewA.apply {
            loadUrl(URL)
        }
    }
}