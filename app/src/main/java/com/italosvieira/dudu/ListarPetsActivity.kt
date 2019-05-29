package com.italosvieira.dudu

import android.content.Intent
import android.os.Bundle
import android.view.View

class ListarPetsActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_pets)
    }

    fun novoPet(v: View) {
        startActivity(Intent(this, CadastrarPetActivity::class.java))
        finish()
    }

    fun detalharPet(v: View) {
        startActivity(Intent(this, DetalharPetActivity::class.java))
        finish()
    }
}