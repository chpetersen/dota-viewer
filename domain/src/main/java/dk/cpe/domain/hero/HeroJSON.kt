package dk.cpe.domain.hero

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class HeroJSON(
    @Json(name = "id") val id: Long,
    @Json(name = "name") val name: String,
    @Json(name = "localized_name") val localizedName: String,
    @Json(name = "primary_attr") val primaryAttribute: String,
    @Json(name = "attack_type") val attackType: String,
    @Json(name = "roles") val roles: List<String>
)