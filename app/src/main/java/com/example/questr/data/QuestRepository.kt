package com.example.questr.data

import androidx.lifecycle.LiveData

class QuestRepository(val questsDao : QuestsDao) {

    val getAllQuests : LiveData<List<Quests>> = questsDao.getAllQuests()
    val getByDate : LiveData<List<Quests>> = questsDao.getByDate()
    val getByAlphabet : LiveData<List<Quests>> = questsDao.getByAlphabet()
    val getByReverseAlphabet : LiveData<List<Quests>> = questsDao.getByReverseAlphabet()

    fun addQuest(quests : Quests) {
        questsDao.addQuest(quests)
    }

    fun updateQuest(quests : Quests) {
        questsDao.updateQuest(quests)
    }

    fun deleteQuest(quests : Quests) {
        questsDao.deleteQuest(quests)
    }
}