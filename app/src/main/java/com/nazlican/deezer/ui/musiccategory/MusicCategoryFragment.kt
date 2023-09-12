package com.nazlican.deezer.ui.musiccategory

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import com.nazlican.deezer.R
import com.nazlican.deezer.common.viewBinding
import com.nazlican.deezer.databinding.FragmentMusicCategoryBinding

class MusicCategoryFragment : Fragment(R.layout.fragment_music_category) {

    private val binding by viewBinding(FragmentMusicCategoryBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

}