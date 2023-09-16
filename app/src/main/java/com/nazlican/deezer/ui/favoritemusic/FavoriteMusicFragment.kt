package com.nazlican.deezer.ui.favoritemusic

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.nazlican.deezer.R
import com.nazlican.deezer.common.viewBinding
import com.nazlican.deezer.databinding.FragmentFavoriteMusicBinding

class FavoriteMusicFragment : Fragment(R.layout.fragment_favorite_music) {

    private val binding by viewBinding(FragmentFavoriteMusicBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.musicFavoriteToolbar.title = "Favorite Music"
        (activity as AppCompatActivity).setSupportActionBar(binding.musicFavoriteToolbar)
    }

}