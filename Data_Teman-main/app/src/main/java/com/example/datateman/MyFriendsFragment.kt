package com.example.datateman

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.Nullable
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.fragment_my_friend.*

class MyFriendsFragment : Fragment() {
    lateinit var listTeman: ArrayList<MyFriends>

    private fun simulasiDataTeman() {
        listTeman = ArrayList()
        listTeman.add(
                MyFriends("komang", "Laki-laki", "komang@gmail.com", "082100899267", "luwuk")
        )
        listTeman.add(
                MyFriends("indra", "Laki-laki", "indra@gmail.com", "081299677782", "SPC")
        )
        listTeman.add(
                MyFriends("aldin", "Laki-laki", "aldin@gmail.com", "082288756786", "SPC")
        )
        listTeman.add(
                MyFriends("nova", "Laki-laki", "nova@gmail.com", "082266758383", "SPE")
        )
        listTeman.add(
                MyFriends("iwud", "Laki-laki", "iwud@gmail.com", "081289382001", "SPE")
        )
    }

    private fun tampilTeman() {
        rv_listMyFriends.layoutManager = LinearLayoutManager(activity)
        rv_listMyFriends.adapter = MyFriendsAdapter(activity!!, listTeman)
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_my_friend, container, false)
    }

    override fun onViewCreated(view: View, @Nullable savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
    }

    private fun initView() {
        simulasiDataTeman()
        tampilTeman()
    }

    override fun onDestroy() {
        super.onDestroy()
        this.clearFindViewByIdCache()
    }
}