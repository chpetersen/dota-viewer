package dk.cpe.domain.repository

import dk.cpe.domain.hero.HeroJSON

interface HeroRepository {

    suspend fun getListOfHeroes(): List<HeroJSON>

}