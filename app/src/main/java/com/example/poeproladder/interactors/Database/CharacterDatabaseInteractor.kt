package com.example.poeproladder.interactors.Database

import com.example.poeproladder.database.CharacterDb
import com.example.poeproladder.database.CharacterItemsDb
import com.example.poeproladder.network.CharacterWindowCharacterJson
import com.example.poeproladder.network.CharacterWindowItemsJson
import io.reactivex.Completable
import io.reactivex.Maybe
import io.reactivex.Observable
import io.reactivex.Single

interface CharacterDatabaseInteractor {
    fun saveCharacters(characters: List<CharacterWindowCharacterJson>, accountName: String)
    fun saveCharacter(character: CharacterDb)
    fun getAccountCharacters(accountName: String): Maybe<List<CharacterDb>>
    fun getRecentCharacters(): Maybe<List<CharacterDb>>
    fun saveItems(items: CharacterWindowItemsJson, characterName: String)
    fun getItemsByName(characterName: String): Single<CharacterItemsDb>
    fun getCharacterItemsObservable(): Observable<CharacterItemsDb>
    fun observableOnNext(items: CharacterItemsDb)
}