package com.oscar.appmecstore.view.ui.fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.core.os.bundleOf
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.oscar.appmecstore.R
import com.oscar.appmecstore.databinding.FragmentOrderBinding
import com.oscar.appmecstore.model.Products
import com.oscar.appmecstore.view.adapter.ProductsAdapter
import com.oscar.appmecstore.view.adapter.ProductsListener
import com.oscar.appmecstore.view.ui.activities.MainActivity
import com.oscar.appmecstore.viewmodel.OrderViewModel


class OrderFragment : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_order)
        val boton1=findViewById<Button>(R.id.btBuyProduct)
        boton1.setOnClickListener {
            val intento1 = Intent(this, MainActivity::class.java)
            startActivity(intento1)
        }
    }
}