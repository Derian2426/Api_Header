package com.example.api_header

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import com.google.gson.Gson
import kotlin.math.log


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun call_API(view: View){

        val txt=findViewById<TextView>(R.id.txt_respuesta)
        val txt_metal=findViewById<TextView>(R.id.txtMetal)
        val txt_multiline=findViewById<TextView>(R.id.txt_Multiline)
        val url = "https://www.goldapi.io/api/XAU/USD"

        val cola = Volley.newRequestQueue(this)
        val stringRequest = object: StringRequest(
            Request.Method.GET, url,
            Response.Listener<String> { response ->
                val json=Gson()
                val metal:Metal=json.fromJson(response,Metal::class.java)
                txt.text= "${metal.metal}"+" "+"${metal.currency}"+" "+"${metal.price}\n"+
                        "Precio en gramos de 24k :${metal.currency}"+" "+"${metal.price_gram_24k}\n"+
                        "Precio en gramos de 22k :${metal.currency}"+" "+"${metal.price_gram_22k}\n"+
                        "Precio en gramos de 21k :${metal.currency}"+" "+"${metal.price_gram_21k}\n"+
                        "Precio en gramos de 20k :${metal.currency}"+" "+"${metal.price_gram_20k}\n"+
                        "Precio en gramos de 18k :${metal.currency}"+" "+"${metal.price_gram_18k}\n"
                txt_metal.text="${metal.metal}"
                txt_multiline.text=txt.text
            },
            Response.ErrorListener { txt.text="Ocurrio un error" })
        {
            override fun getHeaders(): MutableMap<String, String> {
                val headers = HashMap<String, String>()
                headers["x-access-token"] = "goldapi-jicyctl4x01ott-io"
                return headers
            }
        }

        cola.add(stringRequest)
    }
}