package typings.ytSearch.mod

import typings.ytSearch.ytSearchStrings.UPCOMING
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpcomingLiveSearchResult
  extends StObject
     with LiveSearchResultBase
     with LiveSearchResult {
  
  var startDate: String
  
  var startTime: Double
  
  var status: UPCOMING
}
object UpcomingLiveSearchResult {
  
  inline def apply(
    author: Author,
    description: String,
    image: String,
    startDate: String,
    startTime: Double,
    thumbnail: String,
    title: String,
    url: String,
    videoId: String,
    watching: Double
  ): UpcomingLiveSearchResult = {
    val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], startDate = startDate.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], status = "UPCOMING", thumbnail = thumbnail.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], videoId = videoId.asInstanceOf[js.Any], watching = watching.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("live")
    __obj.asInstanceOf[UpcomingLiveSearchResult]
  }
  
  extension [Self <: UpcomingLiveSearchResult](x: Self) {
    
    inline def setStartDate(value: String): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
    
    inline def setStartTime(value: Double): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: UPCOMING): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
