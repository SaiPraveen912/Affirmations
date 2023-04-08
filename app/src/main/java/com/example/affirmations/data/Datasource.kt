package com.example.affirmations.data

import com.example.affirmations.R
import com.example.affirmations.model.Affirmation

class Datasource {
    fun loadAffirmation(): List<Affirmation> {
        return listOf<Affirmation>(
            Affirmation(R.string.Affirmation1),
            Affirmation(R.string.Affirmation2),
            Affirmation(R.string.Affirmation3),
            Affirmation(R.string.Affirmation4),
            Affirmation(R.string.Affirmation5),
            Affirmation(R.string.Affirmation6),
            Affirmation(R.string.Affirmation7),
            Affirmation(R.string.Affirmation8),
            Affirmation(R.string.Affirmation9),
            Affirmation(R.string.Affirmation10)
        )
    }
}