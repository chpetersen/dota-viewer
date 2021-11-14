package dk.cpe.domain.usecases

import dk.cpe.domain.hero.HeroJSON
import dk.cpe.domain.repository.HeroRepository
import javax.inject.Inject

class GetListOfHeroesUseCaseImp @Inject constructor(
    private val heroRepository: HeroRepository
) : GetListOfHeroesUseCase {
    override suspend fun invoke(): List<HeroJSON> = heroRepository.getListOfHeroes()
}