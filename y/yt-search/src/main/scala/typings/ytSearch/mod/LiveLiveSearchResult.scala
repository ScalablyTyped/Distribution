package typings.ytSearch.mod

import typings.ytSearch.ytSearchStrings.LIVE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LiveLiveSearchResult
  extends StObject
     with LiveSearchResultBase
     with LiveSearchResult {
  
  var status: LIVE
}
object LiveLiveSearchResult {
  
  inline def apply(
    author: Author,
    description: String,
    image: String,
    thumbnail: String,
    title: String,
    url: String,
    videoId: String,
    watching: Double
  ): LiveLiveSearchResult = {
    val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], status = "LIVE", thumbnail = thumbnail.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], videoId = videoId.asInstanceOf[js.Any], watching = watching.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("live")
    __obj.asInstanceOf[LiveLiveSearchResult]
  }
  
  extension [Self <: LiveLiveSearchResult](x: Self) {
    
    inline def setStatus(value: LIVE): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
