package ic.lakayy.betbet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private var exit = 0
    private var btn1: Button? = null
    private var btn2: Button? = null
    private var btn3: Button? = null
    private var review : Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        review = findViewById(R.id.review)
        review?.setOnClickListener {
            val intent = Intent(this, WelcomePage::class.java)
            startActivity(intent)
        }

        btn1 = findViewById(R.id.btn1)
        btn1?.setOnClickListener {
            val intent = Intent(this, AboutPage::class.java)
            startActivity(intent)
        }

        btn2 = findViewById(R.id.btn2)
        btn2?.setOnClickListener {
            val intent = Intent(this, InfoPage::class.java)
            startActivity(intent)
        }

        btn3 = findViewById(R.id.btn3)
        btn3?.setOnClickListener {
            val intent = Intent(this, Dices::class.java)
            startActivity(intent)
        }
    }

    override fun onBackPressed() {
        if (exit == 0) {
            exit = 1
            Toast.makeText(this, "CLICK AGAIN TO EXIT", Toast.LENGTH_SHORT).show()
        } else {
            super.finishAffinity()
        }
    }
}