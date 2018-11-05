package br.com.gsoares.ceepws.repository

import br.com.gsoares.ceepws.model.Note
import org.springframework.data.repository.CrudRepository

interface NoteRepository : CrudRepository<Note, Long> {
    fun findByTitle(title: String): Note
}