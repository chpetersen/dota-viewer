package dk.cpe.domain.usecases

import dk.cpe.domain.hero.HeroJSON

interface GetListOfHeroesUseCase {
    suspend fun invoke(): List<HeroJSON>
}