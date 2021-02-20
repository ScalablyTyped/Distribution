package typings.ytSearch.mod

import typings.ytSearch.ytSearchStrings.LIVE
import typings.ytSearch.ytSearchStrings.live_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LiveLiveSearchResult
  extends LiveSearchResultBase
     with LiveSearchResult {
  
  var status: LIVE = js.native
}
object LiveLiveSearchResult {
  
  @scala.inline
  def apply(
    author: Author,
    description: String,
    image: String,
    status: LIVE,
    thumbnail: String,
    title: String,
    `type`: live_,
    url: String,
    videoId: String,
    watching: Double
  ): LiveLiveSearchResult = {
    val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], thumbnail = thumbnail.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], videoId = videoId.asInstanceOf[js.Any], watching = watching.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LiveLiveSearchResult]
  }
  
  @scala.inline
  implicit class LiveLiveSearchResultMutableBuilder[Self <: LiveLiveSearchResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStatus(value: LIVE): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
