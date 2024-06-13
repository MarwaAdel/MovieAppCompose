package com.marwaadel.moviesapp.details.peresntation

import com.marwaadel.moviesapp.movieList.domain.model.Movie


data class DetailsState(
    val isLoading: Boolean = false,
    val movie: Movie? = null
)
