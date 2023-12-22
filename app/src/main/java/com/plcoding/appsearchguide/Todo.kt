package com.plcoding.appsearchguide

import androidx.appsearch.annotation.Document
import androidx.appsearch.annotation.Document.BooleanProperty
import androidx.appsearch.annotation.Document.Id
import androidx.appsearch.annotation.Document.Namespace
import androidx.appsearch.annotation.Document.Score
import androidx.appsearch.annotation.Document.StringProperty
import androidx.appsearch.app.AppSearchSchema

@Document
data class Todo(
    @Namespace
    val namespace: String,
    @Id
    val id: String,
    @Score
    val score: Int,
    @StringProperty(
        indexingType = AppSearchSchema.StringPropertyConfig.INDEXING_TYPE_PREFIXES
    )
    val title: String,
    @StringProperty(
        indexingType = AppSearchSchema.StringPropertyConfig.INDEXING_TYPE_PREFIXES
    )
    val text: String,
    @BooleanProperty
    val isDone: Boolean
)
