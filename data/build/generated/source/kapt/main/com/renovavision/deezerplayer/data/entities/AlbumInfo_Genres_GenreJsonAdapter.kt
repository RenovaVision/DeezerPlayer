// Code generated by moshi-kotlin-codegen. Do not edit.
package com.renovavision.deezerplayer.data.entities

import com.squareup.moshi.JsonAdapter
import com.squareup.moshi.JsonReader
import com.squareup.moshi.JsonWriter
import com.squareup.moshi.Moshi
import com.squareup.moshi.internal.Util
import java.lang.NullPointerException
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.collections.emptySet
import kotlin.text.buildString

@Suppress("DEPRECATION", "unused", "ClassName", "REDUNDANT_PROJECTION")
class AlbumInfo_Genres_GenreJsonAdapter(
  moshi: Moshi
) : JsonAdapter<AlbumInfo.Genres.Genre>() {
  private val options: JsonReader.Options = JsonReader.Options.of("id", "name", "picture", "type")

  private val intAdapter: JsonAdapter<Int> = moshi.adapter(Int::class.java, emptySet(), "id")

  private val stringAdapter: JsonAdapter<String> = moshi.adapter(String::class.java, emptySet(),
      "name")

  private val nullableStringAdapter: JsonAdapter<String?> = moshi.adapter(String::class.java,
      emptySet(), "picture")

  override fun toString(): String = buildString(44) {
      append("GeneratedJsonAdapter(").append("AlbumInfo.Genres.Genre").append(')') }

  override fun fromJson(reader: JsonReader): AlbumInfo.Genres.Genre {
    var id: Int? = null
    var name: String? = null
    var picture: String? = null
    var type: String? = null
    reader.beginObject()
    while (reader.hasNext()) {
      when (reader.selectName(options)) {
        0 -> id = intAdapter.fromJson(reader) ?: throw Util.unexpectedNull("id", "id", reader)
        1 -> name = stringAdapter.fromJson(reader) ?: throw Util.unexpectedNull("name", "name",
            reader)
        2 -> picture = nullableStringAdapter.fromJson(reader)
        3 -> type = stringAdapter.fromJson(reader) ?: throw Util.unexpectedNull("type", "type",
            reader)
        -1 -> {
          // Unknown name, skip it.
          reader.skipName()
          reader.skipValue()
        }
      }
    }
    reader.endObject()
    return AlbumInfo.Genres.Genre(
        id = id ?: throw Util.missingProperty("id", "id", reader),
        name = name ?: throw Util.missingProperty("name", "name", reader),
        picture = picture,
        type = type ?: throw Util.missingProperty("type", "type", reader)
    )
  }

  override fun toJson(writer: JsonWriter, value: AlbumInfo.Genres.Genre?) {
    if (value == null) {
      throw NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.")
    }
    writer.beginObject()
    writer.name("id")
    intAdapter.toJson(writer, value.id)
    writer.name("name")
    stringAdapter.toJson(writer, value.name)
    writer.name("picture")
    nullableStringAdapter.toJson(writer, value.picture)
    writer.name("type")
    stringAdapter.toJson(writer, value.type)
    writer.endObject()
  }
}
