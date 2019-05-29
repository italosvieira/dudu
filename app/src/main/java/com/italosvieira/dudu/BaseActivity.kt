package com.italosvieira.dudu

import android.content.Intent
import android.support.annotation.LayoutRes
import android.support.design.widget.NavigationView
import android.support.v4.view.GravityCompat
import android.support.v4.widget.DrawerLayout
import android.support.v7.app.AppCompatActivity
import android.view.MenuItem


open class BaseActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    private var fullLayout: DrawerLayout? = null

    override fun setContentView(@LayoutRes layoutResID: Int) {
        fullLayout = layoutInflater.inflate(R.layout.activity_base, null) as DrawerLayout
        layoutInflater.inflate(layoutResID, fullLayout!!.findViewById(R.id.activity_content), true)
        super.setContentView(fullLayout)
    }

    override fun onNavigationItemSelected(menuItem: MenuItem): Boolean {
        fullLayout!!.closeDrawer(GravityCompat.START)

        when (menuItem.itemId) {
            R.id.meus_animais -> {
                startActivity(Intent(this, ListarPetsActivity::class.java))
                finish()
            }

            R.id.configuracoes -> {
                startActivity(Intent(this, ConfiguracaoActivity::class.java))
                finish()
            }
        }

        return onOptionsItemSelected(menuItem)
    }
}