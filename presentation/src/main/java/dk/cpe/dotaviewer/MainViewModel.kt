package dk.cpe.dotaviewer

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import dk.cpe.domain.usecases.GetListOfHeroesUseCase
import dk.cpe.domain.usecases.GetListOfHeroesUseCaseImp
import kotlinx.coroutines.launch
import javax.inject.Inject

private const val TAG = "MainViewModel"

@HiltViewModel
class MainViewModel @Inject constructor(
    val getListOfHeroesUseCases: GetListOfHeroesUseCase
) : ViewModel() {

    fun getHeroes() {
        viewModelScope.launch {
            val listOfHeroesUseCases = getListOfHeroesUseCases.invoke()
            Log.i(TAG, listOfHeroesUseCases.toString())
        }
    }

}