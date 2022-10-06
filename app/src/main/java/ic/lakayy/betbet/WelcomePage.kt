package ic.lakayy.betbet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class WelcomePage : AppCompatActivity() {

    private lateinit var webW: WebView
    private val URL = "https://www.premiumbookmakers.com/review-12bet"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome_page)

        webW = findViewById(R.id.webW)
        webW.apply {
            loadUrl(URL)
        }
    }
}