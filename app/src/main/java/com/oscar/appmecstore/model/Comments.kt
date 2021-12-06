package com.oscar.appmecstore.model

import java.io.Serializable

class Comments: Serializable {
    lateinit var user: String
    lateinit var score: String
    lateinit var comment: String
}