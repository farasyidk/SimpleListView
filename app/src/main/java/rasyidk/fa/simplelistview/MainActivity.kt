package rasyidk.fa.simplelistview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //data array yg akan ditampilkan
        var bulanArray = arrayOf("Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli", "Agustus",
                "September", "Oktober", "November", "Desember")

        //adapter bawaan android kotlin
        var bulanAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, bulanArray)

        listview.adapter = bulanAdapter
    }
}
