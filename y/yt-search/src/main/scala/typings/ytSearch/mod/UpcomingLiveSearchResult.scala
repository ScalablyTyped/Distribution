package typings.ytSearch.mod

import typings.ytSearch.ytSearchStrings.UPCOMING
import typings.ytSearch.ytSearchStrings.live_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpcomingLiveSearchResult
  extends LiveSearchResultBase
     with LiveSearchResult {
  
  var startDate: String = js.native
  
  var startTime: Double = js.native
  
  var status: UPCOMING = js.native
}
object UpcomingLiveSearchResult {
  
  @scala.inline
  def apply(
    author: Author,
    description: String,
    image: String,
    startDate: String,
    startTime: Double,
    status: UPCOMING,
    thumbnail: String,
    title: String,
    `type`: live_,
    url: String,
    videoId: String,
    watching: Double
  ): UpcomingLiveSearchResult = {
    val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], startDate = startDate.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], thumbnail = thumbnail.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], videoId = videoId.asInstanceOf[js.Any], watching = watching.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpcomingLiveSearchResult]
  }
  
  @scala.inline
  implicit class UpcomingLiveSearchResultMutableBuilder[Self <: UpcomingLiveSearchResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStartDate(value: String): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTime(value: Double): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: UPCOMING): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
