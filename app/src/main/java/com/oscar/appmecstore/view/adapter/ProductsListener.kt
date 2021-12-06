package com.oscar.appmecstore.view.adapter

import com.oscar.appmecstore.model.Products

interface ProductsListener {
    fun OnProductsClick(product: Products, position: Int)
}