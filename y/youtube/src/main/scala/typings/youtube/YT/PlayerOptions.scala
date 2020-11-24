package typings.youtube.YT

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlayerOptions extends js.Object {
  
  /**
    * Handlers for events fired by the player.
    */
  var events: js.UndefOr[Events] = js.native
  
  /**
    * Player height
    */
  var height: js.UndefOr[String | Double] = js.native
  
  /**
    * Points host to correct origin for CORS
    */
  var host: js.UndefOr[String] = js.native
  
  /**
    * Player parameters.
    */
  var playerVars: js.UndefOr[PlayerVars] = js.native
  
  /**
    * ID of the video to load.
    */
  var videoId: js.UndefOr[String] = js.native
  
  /**
    * Player width.
    */
  var width: js.UndefOr[String | Double] = js.native
}
object PlayerOptions {
  
  @scala.inline
  def apply(): PlayerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlayerOptions]
  }
  
  @scala.inline
  implicit class PlayerOptionsOps[Self <: PlayerOptions] (val x: Self) extends AnyVal {
    
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
    def setEvents(value: Events): Self = this.set("events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEvents: Self = this.set("events", js.undefined)
    
    @scala.inline
    def setHeight(value: String | Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHost: Self = this.set("host", js.undefined)
    
    @scala.inline
    def setPlayerVars(value: PlayerVars): Self = this.set("playerVars", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlayerVars: Self = this.set("playerVars", js.undefined)
    
    @scala.inline
    def setVideoId(value: String): Self = this.set("videoId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVideoId: Self = this.set("videoId", js.undefined)
    
    @scala.inline
    def setWidth(value: String | Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
