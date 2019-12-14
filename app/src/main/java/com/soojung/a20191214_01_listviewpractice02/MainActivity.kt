package com.soojung.a20191214_01_listviewpractice02

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.soojung.a20191214_01_listviewpractice02.adapters.GameAdapter
import com.soojung.a20191214_01_listviewpractice02.datas.GameData
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {


    var gameAdapter : GameAdapter? = null
    val gameList = ArrayList<GameData>()



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupEvents()
        setValues()

    }


    override fun setupEvents() {

    }

    override fun setValues() {
        addGames()
        gameAdapter = GameAdapter(mContext, R.layout.game_list_item, gameList)
        gameListView.adapter = gameAdapter

    }


    fun addGames() {
        gameList.add(GameData("아스팔트 8 : 에어본","Gameloft"))
        gameList.add(GameData("MineCraft - Pocket Edition","Mojang"))
        gameList.add(GameData("아스팔트 7 : 히트","Gameloft"))
        gameList.add(GameData("팔라독(Paladog)","FazeCat"))
        gameList.add(GameData("Plants Vs Zombies","EA Swiss Sarl"))
        gameList.add(GameData("스왐피 (Swampy)","Disney"))

    }



}
