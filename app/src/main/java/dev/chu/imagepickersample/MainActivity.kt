package dev.chu.imagepickersample

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var imagePicker: ImagePicker

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imagePicker = ImagePicker(this) { uri ->
            findViewById<ImageView>(R.id.imageView).setImageURI(uri)
        }

        findViewById<Button>(R.id.setImageButton).setOnClickListener {
            imagePicker.show()
        }
    }
}