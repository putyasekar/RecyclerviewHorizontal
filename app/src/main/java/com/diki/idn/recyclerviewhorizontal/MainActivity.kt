package com.diki.idn.recyclerviewhorizontal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.diki.idn.recyclerviewhorizontal.adapter.ShoesAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    val shoesBrand: ArrayList<String> = ArrayList() //initialise array's

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        addShoesBrand()

        //to manage the linear
        rv_main.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)

        //access the adapter
        rv_main.adapter = ShoesAdapter(shoesBrand, this)
    }

    private fun addShoesBrand() {
        shoesBrand.add("Nike")
        shoesBrand.add("Balenciaga")
        shoesBrand.add("Onitsuka")
        shoesBrand.add("Vans")
        shoesBrand.add("Adidas")
        shoesBrand.add("Converse")
        shoesBrand.add("Skechers")
        shoesBrand.add("Dior")
        shoesBrand.add("Reebok")
        shoesBrand.add("PUMA")
    }
}