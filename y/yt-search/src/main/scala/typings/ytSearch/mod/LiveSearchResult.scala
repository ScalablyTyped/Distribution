package typings.ytSearch.mod

import typings.ytSearch.ytSearchStrings.LIVE
import typings.ytSearch.ytSearchStrings.UPCOMING
import typings.ytSearch.ytSearchStrings.live_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.ytSearch.mod.UpcomingLiveSearchResult
  - typings.ytSearch.mod.LiveLiveSearchResult
*/
trait LiveSearchResult extends js.Object
object LiveSearchResult {
  
  @scala.inline
  def UpcomingLiveSearchResult(
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
  ): LiveSearchResult = {
    val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], startDate = startDate.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], thumbnail = thumbnail.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], videoId = videoId.asInstanceOf[js.Any], watching = watching.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LiveSearchResult]
  }
  
  @scala.inline
  def LiveLiveSearchResult(
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
  ): LiveSearchResult = {
    val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], thumbnail = thumbnail.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], videoId = videoId.asInstanceOf[js.Any], watching = watching.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LiveSearchResult]
  }
}
