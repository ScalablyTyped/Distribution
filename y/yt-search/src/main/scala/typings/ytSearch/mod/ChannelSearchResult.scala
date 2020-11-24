package typings.ytSearch.mod

import typings.ytSearch.ytSearchStrings.channel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChannelSearchResult extends js.Object {
  
  var image: String = js.native
  
  var name: String = js.native
  
  var subCount: Double = js.native
  
  var subCountLabel: String = js.native
  
  var thumbnail: String = js.native
  
  var title: String = js.native
  
  var `type`: channel = js.native
  
  var url: String = js.native
  
  var videoCount: Double = js.native
  
  var videoCountLabel: String = js.native
}
object ChannelSearchResult {
  
  @scala.inline
  def apply(
    image: String,
    name: String,
    subCount: Double,
    subCountLabel: String,
    thumbnail: String,
    title: String,
    `type`: channel,
    url: String,
    videoCount: Double,
    videoCountLabel: String
  ): ChannelSearchResult = {
    val __obj = js.Dynamic.literal(image = image.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], subCount = subCount.asInstanceOf[js.Any], subCountLabel = subCountLabel.asInstanceOf[js.Any], thumbnail = thumbnail.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], videoCount = videoCount.asInstanceOf[js.Any], videoCountLabel = videoCountLabel.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelSearchResult]
  }
  
  @scala.inline
  implicit class ChannelSearchResultOps[Self <: ChannelSearchResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setImage(value: String): Self = this.set("image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubCount(value: Double): Self = this.set("subCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubCountLabel(value: String): Self = this.set("subCountLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbnail(value: String): Self = this.set("thumbnail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: channel): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideoCount(value: Double): Self = this.set("videoCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideoCountLabel(value: String): Self = this.set("videoCountLabel", value.asInstanceOf[js.Any])
  }
}
