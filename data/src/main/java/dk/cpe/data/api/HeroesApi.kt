package dk.cpe.data.api

import dk.cpe.domain.hero.HeroJSON
import retrofit2.http.GET

interface HeroesApi {

    @GET("heroes")
    suspend fun getHeroes(): List<HeroJSON>

}