package com.plcoding.appsearchguide

data class TodoListState(
    val todos: List<Todo> = emptyList(),
    val searchQuery: String = ""
)
