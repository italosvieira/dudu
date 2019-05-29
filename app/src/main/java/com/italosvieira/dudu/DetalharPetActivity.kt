package com.italosvieira.dudu

import android.content.Intent
import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v4.app.Fragment
import android.view.MenuItem
import android.view.View

class DetalharPetActivity : BaseActivity(), BottomNavigationView.OnNavigationItemSelectedListener {

    private var navigationView: BottomNavigationView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalhar_pet)
        navigationView = findViewById(R.id.navigationView)
        navigationView?.setOnNavigationItemSelectedListener(this)

        when (intent.getStringExtra("fragment")) {
            null -> {
                navigationView?.let { it.selectedItemId = R.id.bottom_navigation_menu_detalhes_pet }
                navigationView?.menu?.findItem(R.id.bottom_navigation_menu_detalhes_pet)?.let { this.onNavigationItemSelected(it) }
            }

            "1" -> {
                navigationView?.let { it.selectedItemId = R.id.bottom_navigation_menu_medicamentos }
                navigationView?.menu?.findItem(R.id.bottom_navigation_menu_medicamentos)?.let { this.onNavigationItemSelected(it) }
            }

            "2" -> {
                navigationView?.let { it.selectedItemId = R.id.bottom_navigation_menu_vacinas }
                navigationView?.menu?.findItem(R.id.bottom_navigation_menu_vacinas)?.let { this.onNavigationItemSelected(it) }
            }
        }
    }

    override fun onNavigationItemSelected(menuItem: MenuItem): Boolean {
        when (menuItem.itemId) {
            R.id.meus_animais -> {
                startActivity(Intent(this, ListarPetsActivity::class.java))
                finish()
            }

            R.id.configuracoes -> {
                startActivity(Intent(this, ConfiguracaoActivity::class.java))
                finish()
            }

            R.id.bottom_navigation_menu_detalhes_pet -> {
                openFragment(DetalharFragmentActivity())
            }

            R.id.bottom_navigation_menu_medicamentos -> {
                openFragment(MedicamentoFragmentActivity())
            }

            R.id.bottom_navigation_menu_vacinas -> {
                openFragment(VacinasFragmentActivity())
            }
        }
        return true
    }

    private fun openFragment(fragment: Fragment) {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.container, fragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }

    fun redirecionarCadastroMedicamento(v : View) {
        startActivity(Intent(this, CadastrarMedicamentoActivity::class.java))
        finish()
    }

    fun redirecionarCadastroVacinas(v : View) {
        startActivity(Intent(this, CadastrarVacinaActivity::class.java))
        finish()
    }
}