package com.pras.bareksatest.model.local.entity

import android.os.Parcelable
import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.parcelize.Parcelize

@Entity(tableName = "dataentity")
@Parcelize
data class DataEntity(
    @PrimaryKey
    @NonNull
    @ColumnInfo(name = "name")
    var name: String,

    @ColumnInfo(name = "jenis")
    var jenis: String,

    @ColumnInfo(name = "imbalHasil")
    var imbalHasil: String,

    @ColumnInfo(name = "danaKelolaan")
    var danaKelolaan: String,

    @ColumnI