package dk.cpe.data.api

import dk.cpe.domain.hero.HeroJSON
import dk.cpe.domain.repository.HeroRepository
import javax.inject.Inject

class HeroesRepositoryImp @Inject constructor(private val heroesApi: HeroesApi) : HeroRepository {

    override suspend fun getListOfHeroes(): List<HeroJSON> = heroesApi.getHeroes()
}