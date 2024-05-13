package com.allen.missionprojectil.di

import com.allen.missionprojectil.data.DrinkRepository

object Injection {
    fun provideRepository(): DrinkRepository {
        return DrinkRepository.getInstance()
    }
}