package dk.cpe.data.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import dk.cpe.data.api.HeroesRepositoryImp
import dk.cpe.domain.repository.HeroRepository
import dk.cpe.domain.usecases.GetListOfHeroesUseCase
import dk.cpe.domain.usecases.GetListOfHeroesUseCaseImp

@InstallIn(SingletonComponent::class)
@Module
abstract class UseCaseModule {

    @Binds
    abstract fun bindGetListOfHeroesUseCase(getListOfHeroesUseCaseImp: GetListOfHeroesUseCaseImp): GetListOfHeroesUseCase

    @Binds
    abstract fun bindHeroesRepositoryImp(HeroesRepositoryImp: HeroesRepositoryImp): HeroRepository
}